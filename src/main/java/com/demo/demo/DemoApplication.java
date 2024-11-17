package com.demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Start Spring boot Project");
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("End Spring boot Project");
	}

}
