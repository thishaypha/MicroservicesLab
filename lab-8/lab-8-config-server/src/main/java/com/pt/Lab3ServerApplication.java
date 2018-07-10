package com.pt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication (exclude = {SecurityAutoConfiguration.class})
public class Lab3ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab3ServerApplication.class, args);
	}
}
