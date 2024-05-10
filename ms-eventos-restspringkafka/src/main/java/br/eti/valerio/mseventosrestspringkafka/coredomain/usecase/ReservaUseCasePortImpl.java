package br.eti.valerio.mseventosrestspringkafka.coredomain.usecase;

import br.eti.valerio.mseventosrestspringkafka.adapter.input.dto.ReservaDTO;
import br.eti.valerio.mseventosrestspringkafka.adapter.input.mapper.MapperReserva;
import br.eti.valerio.mseventosrestspringkafka.application.ports.in.ReservaUseCasePort;
import br.eti.valerio.mseventosrestspringkafka.application.ports.out.ReservaPort;
import org.springframework.stereotype.Component;

@Component
public class ReservaUseCasePortImpl implements ReservaUseCasePort {

    private final ReservaPort reservaPort;

    public ReservaUseCasePortImpl(ReservaPort reservaPort) {
        this.reservaPort = reservaPort;
    }

    @Override
    public ReservaDTO salvarReserva(ReservaDTO reservaDTO) {
        var reserva = reservaPort.salvarReserva(MapperReserva.INSTANCE.toReserva(reservaDTO));
        return MapperReserva.INSTANCE.toReservaDTO(reserva);
    }

    @Override
    public ReservaDTO buscarReserva(String id) {
        return null;
    }

    @Override
    public void deletarReserva(String id) {

    }

    @Override
    public ReservaDTO atualizarReserva(ReservaDTO reservaDTO) {
        return null;
    }
}
