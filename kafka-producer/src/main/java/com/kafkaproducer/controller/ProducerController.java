package com.kafkaproducer.controller;

import com.kafkaproducer.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/produce")
public class ProducerController {
    @Autowired
    private KafkaService kafkaService;

    @GetMapping("{msg}")
    public ResponseEntity<?> produceMessage(@PathVariable String msg){
        kafkaService.produceMessage(msg);
        return new ResponseEntity<>(Map.of("message produced",msg), HttpStatus.OK);
    }
}
