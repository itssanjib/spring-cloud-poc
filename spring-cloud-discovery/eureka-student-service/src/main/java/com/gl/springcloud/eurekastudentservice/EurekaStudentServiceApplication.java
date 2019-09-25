package com.gl.springcloud.eurekastudentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaStudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaStudentServiceApplication.class, args);
	}

}
