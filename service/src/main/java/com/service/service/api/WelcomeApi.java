package com.service.service.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeApi {
    private static final Logger logger = LoggerFactory.getLogger(WelcomeApi.class);
    @Value("${service.instance.name}")
    private String instanceName;

    @RequestMapping("/")
    public String message() {
        String result = String.format("Hello from instance: %s", instanceName);
        return result;
    }
}
