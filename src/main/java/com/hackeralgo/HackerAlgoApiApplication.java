package com.hackeralgo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.hackeralgo.controller", "com.hackeralgo.service", "com.hackeralgo.repository", "com.hackeralgo.config"})
@SpringBootApplication
public class HackerAlgoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackerAlgoApiApplication.class, args);
	}

}
