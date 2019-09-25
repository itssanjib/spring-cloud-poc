package com.wlbn.kafkastreamdemo.streams;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface MessageStreams {

	String INPUT = "in-msg";

	String OUTPUT = "out-msg";

	@Input(INPUT)
	SubscribableChannel inboundMessage();

	@Output(OUTPUT)
	MessageChannel outboundMessage();
}
