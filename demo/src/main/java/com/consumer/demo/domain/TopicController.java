package com.consumer.demo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TopicController {

    @Autowired
    private  TopicService topicService;

    public final SimpMessagingTemplate messagingTemplate;

    public TopicController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }


    @SubscribeMapping("/data/all")
    public List<Topic> getAllData(){
        return topicService.getAllData();
    }


//    @MessageMapping("/filename/{fileName}")
//    @SendTo("/topic/data/all")
//    public List<Topic> userList(@DestinationVariable("fileName")String fileName){
//        return topicService.getAllByFileName(fileName);
    }
}
