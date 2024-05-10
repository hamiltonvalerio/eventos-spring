package br.eti.valerio.mseventosrestspringtokafka.adapter.output.feign;

import br.eti.valerio.mseventosrestspringtokafka.coredomain.entity.Reserva;
import br.eti.valerio.mseventosrestspringtokafka.infra.feign.config.ClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "reserva", url = "http://localhost:8081/reserva", configuration = ClientConfiguration.class)
public interface ReservaFeign {

    @PostMapping(value = "/salvar", produces = "application/json")
    Reserva salvarReserva(@RequestBody Reserva reserva);
}
