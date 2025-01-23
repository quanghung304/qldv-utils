package com.agribank.qldvutils.gateway;

import com.agribank.qldvutils.request.service.CheckDataRequest;
import com.agribank.qldvutils.response.CheckDataResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SystemGateway {
    @Value("${qldv.system.url}")
    public String systemUrl;

    @Autowired
    public HttpClient httpClient;

    public CheckDataResponse checkData(CheckDataRequest request, String token) {
        String url = systemUrl + "/check";
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer " + token);

        CheckDataResponse response = httpClient.post(url, headers, request, null, new ParameterizedTypeReference<>() {});
        return Objects.nonNull(response) ? response : null;
    }
}
