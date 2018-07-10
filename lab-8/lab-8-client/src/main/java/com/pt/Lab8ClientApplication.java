package com.pt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication (exclude = {SecurityAutoConfiguration.class})
public class Lab8ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab8ClientApplication.class, args);
	}
}
