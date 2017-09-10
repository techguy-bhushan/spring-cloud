package com.weatherapp.weatherapp.api;

import com.weatherapp.weatherapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherAppApi {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/cuurent/weather")
    public String getWeather() {
        return String.format("The current weather service is: %s", weatherService.getWeather());

    }

}
