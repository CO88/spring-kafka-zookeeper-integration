package com.example.cobb.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProducerClass {
    private static final Logger logger = LoggerFactory.getLogger(ProducerClass.class);
    private static final String TOPIC = "user";

    @Autowired
    private KafkaTemplate KafkaTemplate;

    public void sendMessage(String message) {
        logger.info(String.format("**************** Producer sending the message now -> %s", message));
        this.KafkaTemplate.send(TOPIC, message);
    }
}
