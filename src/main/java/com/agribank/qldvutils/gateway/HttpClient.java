package com.agribank.qldvutils.gateway;

import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

@Service
public class HttpClient {
    private static final Logger log = LoggerFactory.getLogger(HttpClient.class);

    private final RestTemplate restTemplate;

    public HttpClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private void disableCertificateValidation() throws NoSuchAlgorithmException, KeyManagementException {
        TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }

                    public void checkClientTrusted(
                            java.security.cert.X509Certificate[] certs, String authType) {
                    }

                    public void checkServerTrusted(
                            java.security.cert.X509Certificate[] certs, String authType) {
                    }
                }
        };

        SSLContext sc = SSLContext.getInstance("TLS");
        sc.init(null, trustAllCerts, new java.security.SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        HttpsURLConnection.setDefaultHostnameVerifier((hostname, session) -> true);
    }

    public <T> T get(String url, Map<String, String> headerRequests, ParameterizedTypeReference<T> responseType) {
        return doGet(url, null, headerRequests, responseType);
    }

    public <T> T get(String url, Map<String, String> queryParams, Map<String, String> headerRequests, ParameterizedTypeReference<T> responseType) {
        return doGet(url, queryParams, headerRequests, responseType);
    }

    private <T> T doGet(String url, Map<String, String> queryParams, Map<String, String> headerRequests, ParameterizedTypeReference<T> responseType) {
        try {
            HttpHeaders headers = createHeaders(headerRequests);
            disableCertificateValidation();
            UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url);
            addQueryParams(builder, queryParams);
            HttpEntity<Void> request = new HttpEntity<>(headers);
            ResponseEntity<T> response = restTemplate.exchange(builder.build().toUri(), HttpMethod.GET, request, responseType);
            return handleResponse(response);
        } catch (Exception e) {
            log.error("HttpClientService get response {} {} {}", url, headerRequests, e.getMessage());
            return null;
        }
    }

    public <T> T post(String url, Map<String, String> headerRequests, Object data, MediaType mediaType, ParameterizedTypeReference<T> responseType) {
        try {
            HttpHeaders headers = createHeaders(headerRequests);
            disableCertificateValidation();
            headers.setContentType(mediaType);
            HttpEntity<Object> request = new HttpEntity<>(data, headers);
            ResponseEntity<T> response = restTemplate.exchange(url, HttpMethod.POST, request, responseType);
            return handleResponse(response);
        } catch (Exception e) {
            log.error("HttpClientService post Exception {} {}", url, e.getMessage(), e);
            return null;
        }
    }

    public <T> T postWithoutExceptionHandler(String url, Map<String, String> headerRequests, Object data, MediaType mediaType, ParameterizedTypeReference<T> responseType) throws NoSuchAlgorithmException, KeyManagementException {
        HttpHeaders headers = createHeaders(headerRequests);
        disableCertificateValidation();
        headers.setContentType(mediaType);
        HttpEntity<Object> request = new HttpEntity<>(data, headers);
        ResponseEntity<T> response = restTemplate.exchange(url, HttpMethod.POST, request, responseType);
        return handleResponse(response);
    }

    @SneakyThrows
    public <T> T put(String url, Map<String, String> headerRequests, Object data, MediaType mediaType, ParameterizedTypeReference<T> responseType) {
        HttpHeaders headers = createHeaders(headerRequests);
        disableCertificateValidation();
        headers.setContentType(mediaType);
        HttpEntity<Object> request = new HttpEntity<>(data, headers);
        ResponseEntity<T> response = restTemplate.exchange(url, HttpMethod.PUT, request, responseType);
        return handleResponse(response);
    }

    public <T> T delete(String url, Map<String, String> headerRequests, Object data, MediaType mediaType, ParameterizedTypeReference<T> responseType) throws NoSuchAlgorithmException, KeyManagementException {
        HttpHeaders headers = createHeaders(headerRequests);
        disableCertificateValidation();
        headers.setContentType(mediaType);
        HttpEntity<Object> request = new HttpEntity<>(data, headers);
        ResponseEntity<T> response = restTemplate.exchange(url, HttpMethod.DELETE, request, responseType);
        return handleResponse(response);
    }

    private HttpHeaders createHeaders(Map<String, String> headerRequests) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.ALL));

        if(Objects.nonNull(headerRequests)){
            for(var entry : headerRequests.entrySet()){
                headers.add(entry.getKey(), entry.getValue());
            }
        }

        return headers;
    }

    private void addQueryParams(UriComponentsBuilder builder, Map<String, String> queryParams) {
        if (!CollectionUtils.isEmpty(queryParams)) {
            queryParams.forEach(builder::queryParam);
        }
    }

    private <T> T handleResponse(ResponseEntity<T> response) {
        if (response.getStatusCode() != HttpStatus.OK) {
            log.warn("HttpClientService response {} {}", response.getStatusCode());
            return null;
        } else {
            return response.getBody();
        }
    }
}