package br.eti.valerio.mseventosspringkafkamongo.application.ports.in;


import br.eti.valerio.mseventosspringkafkamongo.adapter.input.dto.ReservaDTO;

public interface ReservaUseCasePort {
    ReservaDTO salvarReserva(ReservaDTO reservaDTO);
    ReservaDTO buscarReserva(String id);
    void deletarReserva(String id);
    ReservaDTO atualizarReserva(ReservaDTO reservaDTO);
}
