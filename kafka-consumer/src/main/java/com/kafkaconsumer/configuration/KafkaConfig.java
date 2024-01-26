package com.kafkaconsumer.configuration;

import com.kafkaconsumer.constants.AppConstant;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {
    @KafkaListener(topics = AppConstant.topic_name, groupId = AppConstant.group_id)
    public void consumeMessages(String msg){
        System.out.println(msg);
    }
}
