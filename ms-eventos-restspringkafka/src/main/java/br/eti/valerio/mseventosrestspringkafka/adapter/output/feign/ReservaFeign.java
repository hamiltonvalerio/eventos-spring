package br.eti.valerio.mseventosrestspringkafka.adapter.output.feign;

import br.eti.valerio.mseventosrestspringkafka.coredomain.entity.Reserva;
import br.eti.valerio.mseventosrestspringkafka.infra.feign.config.ClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "reserva", url = "http://localhost:8081/reserva", configuration = ClientConfiguration.class)
public interface ReservaFeign {

    @PostMapping(value = "/salvar", produces = "application/json")
    Reserva salvarReserva(@RequestBody Reserva reserva);
}