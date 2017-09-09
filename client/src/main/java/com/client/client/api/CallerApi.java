package com.client.client.api;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CallerApi {
    private static final Logger logger = LoggerFactory.getLogger(CallerApi.class);
    @Autowired
    private EurekaClient client;

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    @RequestMapping("/")
    public String call() {
        RestTemplate restTemplate = restTemplateBuilder.build();
        InstanceInfo instanceInfo =client.getNextServerFromEureka("service", false);
        String url = instanceInfo.getHomePageUrl();
        logger.info("instance url : %s", url );
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        String result = responseEntity.getBody();
        logger.info("api result : %s", url );
        return result;
    }
}
