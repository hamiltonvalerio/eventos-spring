package br.eti.valerio.mseventosrestspringtokafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsEventosRestspringtokafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsEventosRestspringtokafkaApplication.class, args);
	}

}
