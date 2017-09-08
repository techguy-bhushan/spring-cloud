package com.service.service.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Welcome {
    @Value("${service.instance.name}")
    private String instanceName;

    @RequestMapping("/")
    public String message() {
        return "Hello from "+instanceName;
    }
}
