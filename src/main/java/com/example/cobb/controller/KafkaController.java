package com.example.cobb.controller;

import com.example.cobb.transporters.Producer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    
    private final Producer producer;

    public KafkaController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/publish")
    public String sendMessage(
        @RequestParam("message") String message,
        @RequestParam("topic") String topic) {
        this.producer.sendMessage(topic, message);
        return "Published successfully";
    }
}
