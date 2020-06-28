package com.example.springbootelk.web;

//import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class TestKafkaProducerController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

//    @Autowired
//    private KafkaTemplate<String, Object> kafkaTemplate;
//
//
//    @RequestMapping(value = "send",method = RequestMethod.POST)
//    public String send(String msg){
//        kafkaTemplate.send("topic-test1", msg); //使用kafka模板发送信息
//        return "success";
//    }

//    @KafkaListener(topics = "topic-test1")
//    public void receive(ConsumerRecord<String, Object> consumer) {
//        logger.info("消息已消费：topic为[{}]-key为[{}]-value为[{}]", consumer.topic(), consumer.key(), consumer.value());
//    }
}
