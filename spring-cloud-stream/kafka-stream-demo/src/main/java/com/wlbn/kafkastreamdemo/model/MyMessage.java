package com.wlbn.kafkastreamdemo.model;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class MyMessage {

    private long timestamp;
    private String message;
}
