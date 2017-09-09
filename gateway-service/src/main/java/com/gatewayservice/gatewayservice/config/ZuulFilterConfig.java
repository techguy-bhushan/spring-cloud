package com.gatewayservice.gatewayservice.config;


import com.gatewayservice.gatewayservice.filter.AddReqestHeaderFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZuulFilterConfig {
    @Bean
    public AddReqestHeaderFilter addReqestHeaderFilter() {
        return new AddReqestHeaderFilter();
    }
}
