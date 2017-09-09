package com.testgetwayservice.testgetwayservice.apis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

    private static final Logger logger = LoggerFactory.getLogger(TestApi.class);
    @RequestMapping("/")
    public String test(@RequestHeader("x-filter") String filter) {
        return "Test Service:"+filter;

    }
}
