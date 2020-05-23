package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.app.Motar;

@SpringBootApplication
public class App{
 public static void main(String[] args) {
	
	 ApplicationContext ctx = SpringApplication.run(App.class,args);
	 Motar motar=  ctx.getBean("motar", Motar.class);
 System.out.println(motar);
}
 
}
