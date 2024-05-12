package br.eti.valerio.mseventosrestspringkafka.application.ports.out;

import br.eti.valerio.mseventosrestspringkafka.adapter.input.dto.ReservaDTO;
import br.eti.valerio.mseventosrestspringkafka.coredomain.entity.Reserva;

public interface ReservaPort {
    Reserva salvarReserva(Reserva reserva);

    ReservaDTO buscarReserva(String id);
}
