package com.ribbonservice.ribbonservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/")
    public String call() {
        return String.format("Request is processed at port %s", port);
    }
}
