package com.stock.screener.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ContextBeans {

    @Bean
    public RestTemplate createRestTemplate() {
        return new RestTemplate();
    }

}
