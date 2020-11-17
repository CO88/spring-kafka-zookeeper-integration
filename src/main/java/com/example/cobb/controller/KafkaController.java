package com.example.cobb.controller;

import com.example.cobb.services.ProducerClass;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    
    private final ProducerClass producer;

    public KafkaController(ProducerClass producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/publish")
    public String sendMessage(@RequestParam("message") String message) {
        this.producer.sendMessage(message);
        return "Published successfully";
    }

    // @Bean
    // public NewTopic advicTopic() {
    //     return new NewTopic("user", 3, (short) 1);
    // }
}
