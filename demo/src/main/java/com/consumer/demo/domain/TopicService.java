package com.consumer.demo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public void createRecord1(String msg){
        Topic record=new Topic();
        record.setFileName("File1");
        record.setRecord(msg);
        topicRepository.save(record);
    }

    public void createRecord2(String msg){
        Topic record=new Topic();
        record.setFileName("File2");
        record.setRecord(msg);
        topicRepository.save(record);
    }

    public List<Topic> getAllByFileName(String filename){
        return  topicRepository.findAllByFileName(filename);
    }

    public List<Topic> getAllData() {
        return  topicRepository.findAll();
    }
}
