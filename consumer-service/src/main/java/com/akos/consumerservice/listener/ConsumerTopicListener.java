package com.akos.consumerservice.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerTopicListener {

    @KafkaListener(topics="test.topic")
    public void handle(String message) {
        System.out.println("Consumer got message: "+message+ " ,test.topic");
    }
}
