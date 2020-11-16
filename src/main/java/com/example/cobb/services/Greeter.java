package com.example.cobb.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class Greeter {
    private static final Logger logger = LoggerFactory.getLogger(Greeter.class);
    
    @KafkaListener(topics = "user")
    public void consume(String message) {
        logger.info(String.format("**************** Greeter sending the message now -> %s", message));
    }

    public String hello() {
        return "";
    }
}
