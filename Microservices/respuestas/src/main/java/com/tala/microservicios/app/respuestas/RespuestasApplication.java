package com.tala.microservicios.app.respuestas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.tala.microservicios.app.respuestas.models.entity",
		"com.tala.microservicios.app.usuarios.models.entity.alumno",
		"com.talan.microservicios.commons.examenes.models.entity"})
public class RespuestasApplication {

	public static void main(String[] args) {
		SpringApplication.run(RespuestasApplication.class, args);
	}

}
