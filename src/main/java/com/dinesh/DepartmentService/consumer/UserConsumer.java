package com.dinesh.DepartmentService.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import static org.slf4j.LoggerFactory.*;

@EnableKafka
@Component
public class UserConsumer {
    private static final org.slf4j.Logger log = getLogger(UserConsumer.class);
    private final String KAFKA_USER_TOPIC = "quickstart-events";

    @KafkaListener(topics = {KAFKA_USER_TOPIC}, groupId = "group_id")
    private void consumeUser(ConsumerRecord record) {

        log.info(String.format("MESSAGE FROM: %s, SENT_AT: %s, MESSAGE: %s",record.topic(),record.timestamp(), record.value()));
    }
}
