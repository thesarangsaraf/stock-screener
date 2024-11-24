package com.stock.screener.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.HashMap;

@Service
public class RestClient {

    @Autowired
    private RestTemplate restTemplate;

    public <T> T get(URI uri, Class<T> responseType) {
        ResponseEntity<T> entity = restTemplate.getForEntity(uri, responseType);
        if (!entity.hasBody()) {
            return null;
        }
        return entity.getBody();
    }

    public <T> T post(URI uri, HashMap<String, String> payload, Class<T> responseType) {
        ResponseEntity<T> entity = restTemplate.postForEntity(uri, payload, responseType);
        if (!entity.hasBody()) {
            return null;
        }
        return entity.getBody();
    }
}
