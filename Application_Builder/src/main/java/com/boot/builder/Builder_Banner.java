package com.boot.builder;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Builder_Banner {
public static void main(String[] args) {
	ApplicationContext ctx=new SpringApplicationBuilder().bannerMode(Banner.Mode.OFF).sources(Builder_Banner.class)
			.run(args);
	System.out.println("Bannwer MOde off");
}
}
