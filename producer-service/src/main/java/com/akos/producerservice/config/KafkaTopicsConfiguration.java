package com.akos.producerservice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicsConfiguration {
    @Bean
    public NewTopic topic1() {
        return new NewTopic("test", 1, (short) 1);
    }
}
