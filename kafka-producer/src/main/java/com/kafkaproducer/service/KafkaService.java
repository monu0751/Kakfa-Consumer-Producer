package com.kafkaproducer.service;

import com.kafkaproducer.constants.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private Logger logger = LoggerFactory.getLogger(KafkaService.class);

    public void produceMessage(String msg){
        kafkaTemplate.send(Constants.topic_name, msg);
        this.logger.info("produced messaged logged");
    }
}
