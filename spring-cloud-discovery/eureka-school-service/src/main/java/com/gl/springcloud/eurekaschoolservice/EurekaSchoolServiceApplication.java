package com.gl.springcloud.eurekaschoolservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaSchoolServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSchoolServiceApplication.class, args);
	}

}
