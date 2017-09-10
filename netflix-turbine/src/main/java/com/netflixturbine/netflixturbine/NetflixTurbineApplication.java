package com.netflixturbine.netflixturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class NetflixTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixTurbineApplication.class, args);
	}
}
