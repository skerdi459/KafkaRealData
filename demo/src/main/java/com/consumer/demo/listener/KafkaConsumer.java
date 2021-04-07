package com.consumer.demo.listener;

import com.consumer.demo.domain.Topic;
import com.consumer.demo.domain.TopicController;
import com.consumer.demo.domain.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KafkaConsumer {

    @Autowired
    private TopicService recordService;
    @Autowired
    private TopicController controller;

    @KafkaListener(topics = "test2", group  = "group_id")
    public void consumeFile1(String message) {
        System.out.println("Consumed message: " + message);
         String data = message.replace("\"", "");
        recordService.createRecord1(data);
        List<Topic> topic=recordService.getAllData();
        controller.messagingTemplate.convertAndSend("/topic/data/all",topic);

    }
    @KafkaListener(topics = "test5", group  = "group_id")
    public void consumeFile2(String message) {
        String data = message.replace("\"", "");

        System.out.println("Consumed message: " + message);
        recordService.createRecord2(data);
        List<Topic> topic=recordService.getAllData();
        controller.messagingTemplate.convertAndSend("/topic/data/all",topic);
    }


}
