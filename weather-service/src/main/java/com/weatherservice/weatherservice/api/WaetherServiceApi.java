package com.weatherservice.weatherservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
public class WaetherServiceApi {

    private final String[] weather = new String[] {"sunny", "cloudly", "rainy", "windy"};

    @GetMapping("/")
    public String getWeather() {
        int random = ThreadLocalRandom.current().nextInt(0, 4);
        return weather[random];
    }
}
