package com.goodbyeService.E2_goodbyeService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class E2GoodbyeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(E2GoodbyeServiceApplication.class, args);
	}
	
	@RequestMapping
	public String goodBye() {
		return "Goodbye Service";
	}

}
