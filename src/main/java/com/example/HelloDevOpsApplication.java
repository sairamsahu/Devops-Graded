package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloDevOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloDevOpsApplication.class, args);
		System.out.println("Hello DEV-ops");
	}

}
