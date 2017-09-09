package com.ribbonapp.ribbonapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AppApi {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping
    public String getPortInfo() {
        return restTemplate.getForEntity("http://ribbon-service", String.class).getBody();
    }
}
