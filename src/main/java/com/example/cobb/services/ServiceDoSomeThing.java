package com.example.cobb.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ServiceDoSomeThing {
    private static final Logger logger = LoggerFactory.getLogger(ServiceDoSomeThing.class);

    @KafkaListener(topics = "dosome")
    public void consume(String message) {
        logger.info(String.format("**************** Greeter sending the message now -> %s", message));
    }
}
