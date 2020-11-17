package com.example.cobb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.cobb")
public class CobbApplication {

	public static void main(String[] args) {
		SpringApplication.run(CobbApplication.class, args);
	}
}
