package br.eti.valerio.mseventosspringkafkamongo.adapter.output.kafka.consumer;

public interface ReservaConsumer {
    void consumeReserva(String reservaId);
}
