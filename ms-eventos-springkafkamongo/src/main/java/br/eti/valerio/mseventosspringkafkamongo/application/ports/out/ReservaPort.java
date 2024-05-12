package br.eti.valerio.mseventosspringkafkamongo.application.ports.out;

import br.eti.valerio.mseventosspringkafkamongo.coredomain.entity.Reserva;

public interface ReservaPort {
    Reserva salvarReserva(Reserva reserva);

    Reserva buscarReserva(String id);
}
