package com.agribank.qldvutils.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class DatabaseGateway {
    @Value("${qldv.database.url}")
    public String databaseUrl;
    @Value("${qldv.database.api_key}")
    private String xApiKey;

    @Autowired
    public HttpClient httpClient;

    public HashMap<String, String> buildHeader(){
        HashMap<String, String> headers = new HashMap<>();
        headers.put("x-api-key", xApiKey);
        return headers;
    }
}
