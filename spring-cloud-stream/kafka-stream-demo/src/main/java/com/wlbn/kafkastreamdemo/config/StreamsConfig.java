package com.wlbn.kafkastreamdemo.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.wlbn.kafkastreamdemo.streams.MessageStreams;

@EnableBinding(MessageStreams.class)
public class StreamsConfig {

}
