package com.bmanzano.managerServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ManagerServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagerServicesApplication.class, args);
	}

}
