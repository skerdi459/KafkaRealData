package com.consumer.demo.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TopicRepository extends MongoRepository<Topic,String> {
    List<Topic> findAllByFileName(String fileName);
}
