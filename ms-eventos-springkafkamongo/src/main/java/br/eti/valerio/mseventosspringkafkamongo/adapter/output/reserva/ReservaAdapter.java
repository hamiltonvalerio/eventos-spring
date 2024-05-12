package br.eti.valerio.mseventosspringkafkamongo.adapter.output.reserva;

import br.eti.valerio.mseventosspringkafkamongo.adapter.output.mongo.ReservaRepository;
import br.eti.valerio.mseventosspringkafkamongo.application.ports.out.ReservaPort;
import br.eti.valerio.mseventosspringkafkamongo.coredomain.entity.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReservaAdapter implements ReservaPort {

    private final ReservaRepository reservaRepository;

    @Autowired
    public ReservaAdapter(ReservaRepository reservaRepository)
    {
        this.reservaRepository = reservaRepository;
    }

    @Override
    public Reserva salvarReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    @Override
    public Reserva buscarReserva(String id) {
        return reservaRepository.findById(Long.valueOf(id)).orElse(null);
    }
}
