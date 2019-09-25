package com.gl.springcloud.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConfigclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigclientApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner init() {
		return args -> {
			System.out.println("Client code running..");
			String url = "http://localhost:8080/msg";
			RestTemplate template = new RestTemplate();
			String response = template.getForObject(url, String.class);
			System.out.println("response: " + response);
		};
	}

}


@RefreshScope
@RestController
class MessageRestController {
 
    @Value("${msg:Hello world - Config Server is not working..pelase check}")
    private String msg;
 
    @RequestMapping("/msg")
    String getMsg() {
        return this.msg;
    }
}