package com.testgetwayservice2.testgetwayservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestGetwayService2Application {

	public static void main(String[] args) {
		SpringApplication.run(TestGetwayService2Application.class, args);
	}
}
