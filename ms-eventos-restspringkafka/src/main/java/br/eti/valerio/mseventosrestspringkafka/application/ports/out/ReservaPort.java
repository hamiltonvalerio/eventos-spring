package br.eti.valerio.mseventosrestspringkafka.application.ports.out;

import br.eti.valerio.mseventosrestspringkafka.coredomain.entity.Reserva;

public interface ReservaPort {
    Reserva salvarReserva(Reserva reserva);
}
