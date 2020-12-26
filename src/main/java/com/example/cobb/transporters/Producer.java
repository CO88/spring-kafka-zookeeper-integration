package com.example.cobb.transporters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    private static final Logger logger = LoggerFactory.getLogger(Producer.class);

    @Autowired
    private KafkaTemplate<String, String> KafkaTemplate;

    public void sendMessage(String topic, String message) {
        logger.info(String.format("**************** Producer sending the message now -> %s", message));
        this.KafkaTemplate.send(topic, message);
    }
}
