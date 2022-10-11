package com.example.thirdparty.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExternalThirdPartyApplication {

	//http://localhost:8080/api/v1/swagger-ui/index.html
	public static void main(String[] args) {
		SpringApplication.run(ExternalThirdPartyApplication.class, args);
	}

}
