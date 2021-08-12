package com.dinesh.DepartmentService.util;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BeanInitialize {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

