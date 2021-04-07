package com.consumer.demo.domain;

import org.springframework.data.annotation.Id;

public class Topic {
    @Id
    private String id;
    private String fileName;
    private String record;

    public Topic() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }
}
