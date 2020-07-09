package com.cristi.simple.spring.simplespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class SimpleSpringApplication {
	public static void main(String[] args) {

		ConfigurableApplicationContext springContext = SpringApplication.run(SimpleSpringApplication.class, args);
	}
}
