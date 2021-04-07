package com.kafka.producer.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
    @Autowired
    private Producer myService;

    @Override
    public void run(String...args) throws Exception {
        myService.send();
        myService.sendTopic2();

    }
}