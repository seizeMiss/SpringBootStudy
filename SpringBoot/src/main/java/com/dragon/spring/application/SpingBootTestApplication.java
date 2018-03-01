package com.dragon.spring.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.dragon.spring")
public class SpingBootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingBootTestApplication.class, args);
	}
}
