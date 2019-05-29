package com.akos.producerservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("producer")
public class ProducerController {

    KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public ProducerController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping
    public String get(){
        kafkaTemplate.send("test.topic", "Hello from ProducerController! (test.topic)");
        kafkaTemplate.send("test.topic2", "Hello from ProducerController! (test.topic2)");
        return "Producer";
    }
}
