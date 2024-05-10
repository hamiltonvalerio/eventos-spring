package br.eti.valerio.mseventosrestspringtokafka.application.ports.out;

import br.eti.valerio.mseventosrestspringtokafka.coredomain.entity.Reserva;

public interface ReservaPort {
    Reserva salvarReserva(Reserva reserva);
}
