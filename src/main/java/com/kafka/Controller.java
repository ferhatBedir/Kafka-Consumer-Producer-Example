package com.kafka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class Controller {

    private final Producer producer;

    @Autowired
    public Controller(Producer producer) {
        this.producer = producer;
    }

    @GetMapping("/test1")
    public void topic_TEST1(@RequestParam(value = "message") String message) {
        producer.sendMessage("test1", message);
    }

    @GetMapping("/test2")
    public void topic_TEST2(@RequestParam(value = "message") String message) {
        producer.sendMessage("test2", message);
    }
}
