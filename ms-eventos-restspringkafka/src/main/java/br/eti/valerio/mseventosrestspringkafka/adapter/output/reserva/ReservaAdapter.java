package br.eti.valerio.mseventosrestspringkafka.adapter.output.reserva;

import br.eti.valerio.mseventosrestspringkafka.adapter.input.dto.ReservaDTO;
import br.eti.valerio.mseventosrestspringkafka.adapter.output.feign.ReservaFeign;
import br.eti.valerio.mseventosrestspringkafka.application.ports.out.ReservaPort;
import br.eti.valerio.mseventosrestspringkafka.coredomain.entity.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReservaAdapter implements ReservaPort {

    private final ReservaFeign reservaFeign;

    @Autowired
    public ReservaAdapter(ReservaFeign reservaFeign) {
        this.reservaFeign = reservaFeign;
    }

    @Override
    public Reserva salvarReserva(Reserva reserva) {
        return reservaFeign.salvarReserva(reserva);
    }

    @Override
    public ReservaDTO buscarReserva(String id) {
        return reservaFeign.buscarReserva(id);
    }
}
