package com.training.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@SpringBootApplication
@EnableDiscoveryClient	
@RestController
public class EurekaClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient1Application.class, args);
	}
	
	@GetMapping("/")
	public String getDepartmentServer() {
		return "Department Service is called";
	}
	
	@GetMapping("/hello")
	public String getMessage() {
		return "Message from clienmt server /hello";
	}
	
	
}
