package com.wlbn.kafkastreamdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wlbn.kafkastreamdemo.model.MyMessage;
import com.wlbn.kafkastreamdemo.service.KafkaSenderService;

@RestController
public class KafkaTestController {

	//@Autowired
	private final KafkaSenderService kafkaSenderService;
	
	@Autowired
    public KafkaTestController(KafkaSenderService kafkaSenderService) {

        this.kafkaSenderService = kafkaSenderService;

    }

	@PostMapping("/sendmsg")
	public void postMessageToKafka(@RequestBody String msg) {

		MyMessage myMsg = MyMessage.builder().message(msg).timestamp(System.currentTimeMillis()).build();
		kafkaSenderService.sendGreeting(myMsg);

	}
}
