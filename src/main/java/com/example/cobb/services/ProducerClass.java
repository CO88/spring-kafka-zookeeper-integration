package com.example.cobb.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerClass {
    private static final Logger logger = LoggerFactory.getLogger(ProducerClass.class);

    @Autowired
    private KafkaTemplate<String, String> KafkaTemplate;

    public void sendMessage(String topic, String message) {
        logger.info(String.format("**************** Producer sending the message now -> %s", message));
        this.KafkaTemplate.send(topic, message);
    }
}
