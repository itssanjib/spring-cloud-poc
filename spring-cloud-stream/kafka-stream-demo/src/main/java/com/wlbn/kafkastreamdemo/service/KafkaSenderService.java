package com.wlbn.kafkastreamdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.wlbn.kafkastreamdemo.model.MyMessage;
import com.wlbn.kafkastreamdemo.streams.MessageStreams;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaSenderService {

	private final MessageStreams msgStreams;

	@Autowired
	public KafkaSenderService(MessageStreams msgStreams) {

        this.msgStreams = msgStreams;

    }

	public void sendGreeting(final MyMessage myMessage) {

		log.info("Sending message {}", myMessage);

		MessageChannel messageChannel = msgStreams.outboundMessage();

		messageChannel.send(MessageBuilder

				.withPayload(myMessage)

				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)

				.build());

	}
}
