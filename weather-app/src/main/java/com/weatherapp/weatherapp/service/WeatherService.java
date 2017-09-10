package com.weatherapp.weatherapp.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "failBack")
    public String getWeather() {
        return restTemplate.getForEntity("http://localhost:5050/", String.class).getBody();

    }

    public String failBack() {
        return "fail";
    }
}
