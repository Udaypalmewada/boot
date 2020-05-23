package com.boot.config.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppExitTest {
public static void main(String[] args) {
	int status=0;
	 status=SpringApplication.exit(SpringApplication.run(AppExitTest.class, args));
	System.out.println("App is Exit :"+status);
}
}
