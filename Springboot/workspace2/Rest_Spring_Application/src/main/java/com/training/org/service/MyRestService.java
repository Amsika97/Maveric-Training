package com.training.org.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.training.org.model.User;

@Service
@RestController
public class MyRestService {
	@Autowired
	private RestTemplate myRestTemplate;
	@Value("${myrest.url}")
	private String restUrl;
	@CrossOrigin(origins = "http://localhost:2020")
	@GetMapping("/records")
	public User[] getUsers() {
		var users = myRestTemplate.getForObject(restUrl, User[].class);
		return users;
	}

}
