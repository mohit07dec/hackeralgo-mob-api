package com.hackeralgo;

import com.hackeralgo.config.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.hackeralgo.controller", "com.hackeralgo.service", "com.hackeralgo.repository", "com.hackeralgo.config"})
@EnableConfigurationProperties({
		FileStorageProperties.class
})
@SpringBootApplication
public class HackerAlgoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackerAlgoApiApplication.class, args);
	}

}
