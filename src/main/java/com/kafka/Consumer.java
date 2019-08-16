package com.kafka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Consumer {

    @KafkaListener(topics = "test1")
    public void consume_TEST1(String message,
                              @Header(KafkaHeaders.OFFSET) Long offSet,
                              @Header(KafkaHeaders.RECEIVED_PARTITION_ID) Long partitionId,
                              @Header(KafkaHeaders.RECEIVED_TOPIC) String topic) {
        System.out.println("Topic " + topic + " --> " + message + " Offset : " + offSet + " PartitionId : " + partitionId);
    }

    @KafkaListener(topics = "test2")
    public void consume_TEST2(String message,
                              @Header(KafkaHeaders.OFFSET) Long offSet,
                              @Header(KafkaHeaders.RECEIVED_PARTITION_ID) Long partitionId,
                              @Header(KafkaHeaders.RECEIVED_TOPIC) String topic) {
        System.out.println("Topic " + topic + " --> " + message + " Offset : " + offSet + " PartitionId : " + partitionId);
    }

}
