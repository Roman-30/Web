package com.example.Web;

import com.example.Web.mongo.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication {

	private UserRepository controller;

	public WebApplication(UserRepository controller) {
		this.controller = controller;
	}

	public static void main(String[] args) {

		SpringApplication.run(WebApplication.class, args);


	}



}
