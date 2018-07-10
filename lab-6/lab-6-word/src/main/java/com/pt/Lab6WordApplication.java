package com.pt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab6WordApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab6WordApplication.class, args);
	}
}