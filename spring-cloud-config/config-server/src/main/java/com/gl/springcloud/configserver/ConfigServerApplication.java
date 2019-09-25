package com.gl.springcloud.configserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class ConfigServerApplication {
	
	@Value("${cred:xyz}")
	private String cred;

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner init() {
		return args -> {
			System.out.println("cred:" + cred);
		};
	}

}
