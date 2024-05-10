package br.eti.valerio.mseventosrestspringkafka.application.ports.in;

import br.eti.valerio.mseventosrestspringkafka.adapter.input.dto.ReservaDTO;

public interface ReservaUseCasePort {
    ReservaDTO salvarReserva(ReservaDTO reservaDTO);
    ReservaDTO buscarReserva(String id);
    void deletarReserva(String id);
    ReservaDTO atualizarReserva(ReservaDTO reservaDTO);
}
