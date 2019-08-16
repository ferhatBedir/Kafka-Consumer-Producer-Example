# Kafka-Consumer-Producer-Example
Kafka basic consumer - producer example 

<h2>Overview</h2>

 * In this application, we will create consumer, producer, topic and test with kafka.

 * This is a simple kafka example.

<h2>How to run the application?</h2>
 
  * You must have kafka on the computer. If you dont have kafka on computer follow these steps.
  
    1. You download apache kafka and extract from zip file.
    2. Open terminal and go to kafka folder path.
    3. Start Zookeeper for 'sh bin/zookeeper-server-start.sh config/zookeeper.properties'
    4. Start Apache Kafka Server for 'sh bin/kafka-server-start.sh config/server.properties'
    Important : kafka run default on 9092 port.
    
    
     <a href="https://www.tutorialkart.com/apache-kafka/install-apache-kafka-on-mac/"> For Detail </a>
     
     <a href="https://www.apache.org/dyn/closer.cgi?path=/kafka/2.3.0/kafka_2.12-2.3.0.tgz"> Download Link </a>
     
  
  * The application.yml file is below. If your setting are different, change from the application.yml file.
  
        server:
        
          port: 8088
          
        spring:
        
          kafka:
          
            consumer:
            
              bootstrap-servers: localhost:9092
              
              group-id: group_id
              
              auto-offset-reset: earliest
              
              key-deserializer: org.apache.kafka.common.serialization.StringDeserializer
              
              value-deserializer: org.apache.kafka.common.serialization.StringDeserializer
              
            producer:
            
              bootstrap-servers: localhost:9092
              
              key-serializer: org.apache.kafka.common.serialization.StringSerializer
              
              value-serializer: org.apache.kafka.common.serialization.StringSerializer
              
              
 * For example : 
      
     Send Get Request;
     
     Address : http://localhost:8088/kafka/test1?message=yourMessage or http://localhost:8088/kafka/test2?message=yourMessage
              
              
 <h2>Used Technologies</h2>
 
 * Java 8
 
 * Spring Boot
 
 * Kafka
 
 * Gradle            
              
              
              
              
              
              
              
              


