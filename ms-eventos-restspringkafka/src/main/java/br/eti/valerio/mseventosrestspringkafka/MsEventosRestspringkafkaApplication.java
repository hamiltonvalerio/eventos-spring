package br.eti.valerio.mseventosrestspringkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsEventosRestspringkafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsEventosRestspringkafkaApplication.class, args);
	}

}
