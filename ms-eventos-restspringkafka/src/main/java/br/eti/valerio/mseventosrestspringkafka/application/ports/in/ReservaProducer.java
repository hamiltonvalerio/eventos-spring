package br.eti.valerio.mseventosrestspringkafka.application.ports.in;

public interface ReservaProducer {
    void sendReserva(Long id);
}
