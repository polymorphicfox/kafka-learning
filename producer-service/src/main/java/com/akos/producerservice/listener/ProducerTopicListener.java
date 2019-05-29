package com.akos.producerservice.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ProducerTopicListener {

    @KafkaListener(topics="test.topic2")
    public void handle(String message) {
        System.out.println("Producer got message: "+message+ " ,test.topic2");
    }
}
