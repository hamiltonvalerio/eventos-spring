package br.eti.valerio.mseventosrestspringkafka.adapter.output.kafka.producer;

public interface ReservaProducer {
    void sendReserva(Long id);
}
