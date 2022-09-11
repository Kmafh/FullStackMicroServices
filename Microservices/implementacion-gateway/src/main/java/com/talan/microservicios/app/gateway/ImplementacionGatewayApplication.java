package com.talan.microservicios.app.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ImplementacionGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImplementacionGatewayApplication.class, args);
	}

}
