package com.sipecom.eureka_central.EurekaCentral;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaCentralApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaCentralApplication.class, args);
	}

}
