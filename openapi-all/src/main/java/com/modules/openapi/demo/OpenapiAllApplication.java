package com.modules.openapi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.modules.openapi"})
public class OpenapiAllApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenapiAllApplication.class, args);
	}

}
