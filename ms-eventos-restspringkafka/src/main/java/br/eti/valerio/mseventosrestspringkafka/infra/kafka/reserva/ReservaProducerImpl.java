package br.eti.valerio.mseventosrestspringkafka.infra.kafka.reserva;

import br.eti.valerio.mseventosrestspringkafka.application.ports.in.ReservaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ReservaProducerImpl implements ReservaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public ReservaProducerImpl(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void sendReserva(Long id) {
        kafkaTemplate.send("reserva-kafka-topic", id.toString());
    }
}
