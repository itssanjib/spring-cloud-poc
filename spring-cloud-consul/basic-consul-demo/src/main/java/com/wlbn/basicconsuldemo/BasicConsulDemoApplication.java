package com.wlbn.basicconsuldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class BasicConsulDemoApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello Consul";
	}

	public static void main(String[] args) {
		SpringApplication.run(BasicConsulDemoApplication.class, args);
	}

}
