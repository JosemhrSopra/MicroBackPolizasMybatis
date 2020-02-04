package com.aseguradora.microbackpolizas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroBackPolizasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroBackPolizasApplication.class, args);
	}

}
