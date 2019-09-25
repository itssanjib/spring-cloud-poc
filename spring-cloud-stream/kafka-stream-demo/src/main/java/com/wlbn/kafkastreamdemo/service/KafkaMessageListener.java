package com.wlbn.kafkastreamdemo.service;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.wlbn.kafkastreamdemo.model.MyMessage;
import com.wlbn.kafkastreamdemo.streams.MessageStreams;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class KafkaMessageListener {

    @StreamListener(MessageStreams.INPUT)
    public void handleGreetings(@Payload MyMessage message) {

        log.info("Received message: {}", message);

    }
}
