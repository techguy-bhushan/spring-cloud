package com.testgetwayservice2.testgetwayservice2.apis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2Api {
    private static final Logger logger = LoggerFactory.getLogger(Test2Api.class);
    @RequestMapping("/")
    public String test(@RequestHeader("x-filter") String filter) {
        return "Test2 Service:"+filter;

    }
}
