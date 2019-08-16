package com.kafka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "test1")
    public void consume_TEST1(String message) {
        System.out.println("Listener Test1 --> " + message);
    }

    @KafkaListener(topics = "test2")
    public void consume_TEST2(String message) {
        System.out.println("Listener Test2 --> " + message);
    }

}
