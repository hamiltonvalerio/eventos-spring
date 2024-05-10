package br.eti.valerio.mseventosrestspringtokafka.application.ports.in;

import br.eti.valerio.mseventosrestspringtokafka.adapter.input.dto.ReservaDTO;

public interface ReservaUseCasePort {
    ReservaDTO salvarReserva(ReservaDTO reservaDTO);
    ReservaDTO buscarReserva(String id);
    void deletarReserva(String id);
    ReservaDTO atualizarReserva(ReservaDTO reservaDTO);
}
