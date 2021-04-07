package com.kafka.producer.producer;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


@Service
public class Producer extends Thread{


    @Autowired
    private ProducerFactory<String, String> producerFactory;
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "test2";
    private static final String TOPIC2 = "test5";



    public String send() throws FileNotFoundException, InterruptedException {
        boolean reader=true;
        File read = new File("log.txt");
        Scanner scan = new Scanner(read);
        while(reader) {
            try {

                String data = scan.nextLine();
                System.out.println(data);

                //create the producer record
                ProducerRecord<String, String> record = new ProducerRecord<String, String>(TOPIC, data);

                //send data
                kafkaTemplate.send(record);
                sleep(2000);
                System.out.println("jam ketu");
            }
            catch (Exception e){
                reader=false;
                System.out.println("MBAROI KOHA");
            }
        }

        //flush and close
        kafkaTemplate.flush();
        kafkaTemplate.destroy();


        return "Published successfully on topic 1";
    }

    public String sendTopic2() throws FileNotFoundException, InterruptedException {
        boolean reader=true;
        File read2 = new File("log2.txt");
        Scanner scan2 = new Scanner(read2);
        while(reader) {
            try {
                String data2 = scan2.nextLine();
                System.out.println(data2);

                //create the producer record
                ProducerRecord<String, String> record2 = new ProducerRecord<String, String>(TOPIC2, data2);

                //send data
                kafkaTemplate.send(record2);
                sleep(2000);
                System.out.println("jam ketu");
            }
            catch(Exception e){

                reader=false;
                System.out.println("MBAROI KOHA");
            }
        }

        //flush and close
        kafkaTemplate.flush();
        kafkaTemplate.destroy();


        return "Published successfully on topic 2";
    }





}
