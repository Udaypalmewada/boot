package com.boot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.boot.web.entity")
public class FirstWbAppBootApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(FirstWbAppBootApplication.class, args);
	}

}
