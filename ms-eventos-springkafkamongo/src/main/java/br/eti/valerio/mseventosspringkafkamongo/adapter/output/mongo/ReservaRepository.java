package br.eti.valerio.mseventosspringkafkamongo.adapter.output.mongo;

import br.eti.valerio.mseventosspringkafkamongo.coredomain.entity.Reserva;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReservaRepository extends MongoRepository<Reserva, String> {
}
