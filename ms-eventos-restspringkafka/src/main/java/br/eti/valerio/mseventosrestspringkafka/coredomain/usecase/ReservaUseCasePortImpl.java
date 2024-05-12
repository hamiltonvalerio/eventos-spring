package br.eti.valerio.mseventosrestspringkafka.coredomain.usecase;

import br.eti.valerio.mseventosrestspringkafka.adapter.input.dto.ReservaDTO;
import br.eti.valerio.mseventosrestspringkafka.adapter.input.mapper.MapperReserva;
import br.eti.valerio.mseventosrestspringkafka.application.ports.in.ReservaProducer;
import br.eti.valerio.mseventosrestspringkafka.application.ports.in.ReservaUseCasePort;
import br.eti.valerio.mseventosrestspringkafka.application.ports.out.ReservaPort;
import br.eti.valerio.mseventosrestspringkafka.coredomain.entity.Reserva;
import org.springframework.stereotype.Component;

@Component
public class ReservaUseCasePortImpl implements ReservaUseCasePort {

    private final ReservaPort reservaPort;

    private final ReservaProducer reservaProducer;

    private static final String PENDENTE_DE_PAGAMENTO = "PENDENTE DE PAGAMENTO";


    public ReservaUseCasePortImpl(ReservaPort reservaPort, ReservaProducer reservaProducer) {
        this.reservaPort = reservaPort;
        this.reservaProducer = reservaProducer;
    }

    @Override
    public ReservaDTO salvarReserva(ReservaDTO reservaDTO) {
        reservaDTO.setStatus(PENDENTE_DE_PAGAMENTO);
        var reserva = reservaPort.salvarReserva(MapperReserva.INSTANCE.toReserva(reservaDTO));
        if(reserva == null) {
            throw new RuntimeException("Erro ao criar pedido");
        }else{
            enviarMensagem(reserva);
        }
        return MapperReserva.INSTANCE.toReservaDTO(reserva);
    }

    private void enviarMensagem(Reserva reserva) {
        System.out.println("Enviando mensagem para a reserva: " + reserva.getId());
        reservaProducer.sendReserva(reserva.getId());
    }

    @Override
    public ReservaDTO buscarReserva(String id) {
        return reservaPort.buscarReserva(id);
    }

    @Override
    public void deletarReserva(String id) { }

    @Override
    public ReservaDTO atualizarReserva(ReservaDTO reservaDTO) {
        return null;
    }
}
