package br.eti.valerio.mseventosspringkafkamongo.infra.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicosConfig {

    @Bean
    public NewTopic topicExample() {
        return TopicBuilder.name("reserva-kafka-topic")
                .partitions(2)
                .replicas(1)
                .build();
    }
}
