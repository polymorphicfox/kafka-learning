package com.akos.kafkalearning.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TestTopicListener {

    @KafkaListener(topics="test4")
    public void handle(String message) {
        System.out.println(message);
    }
}
