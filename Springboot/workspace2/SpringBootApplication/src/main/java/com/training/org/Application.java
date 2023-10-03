package com.training.org;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@SpringBootApplication
public class Application {
	
	@Value("${spring.application.name}")
	private String name;

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
	}

	@RequestMapping(value = "/appname")
	public String name() {
		System.out.println("NAme is called");
		return "Application Name:- "+name;
	}
	}


