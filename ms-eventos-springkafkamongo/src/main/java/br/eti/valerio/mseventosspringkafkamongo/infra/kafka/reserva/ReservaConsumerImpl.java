package br.eti.valerio.mseventosspringkafkamongo.infra.kafka.reserva;

import br.eti.valerio.mseventosspringkafkamongo.adapter.output.kafka.consumer.ReservaConsumer;
import br.eti.valerio.mseventosspringkafkamongo.adapter.output.mongo.ReservaRepository;
import br.eti.valerio.mseventosspringkafkamongo.coredomain.entity.Reserva;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReservaConsumerImpl implements ReservaConsumer {

    private final ReservaRepository reservaRepository;

    private static final String RESERVADO = "RESERVADO";

    public ReservaConsumerImpl(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    @Override
    @KafkaListener(topics = "reserva-kafka-topic", groupId = "group-id-reserva")
    public void consumeReserva(String reservaId) {
        System.out.println("Consumindo reserva: " + reservaId);
        Reserva reserva = reservaRepository.findById(Long.valueOf(reservaId)).orElse(null);
        if(reserva != null) {
            reserva.setStatus(RESERVADO);
            reservaRepository.save(reserva);
        }
    }
}
