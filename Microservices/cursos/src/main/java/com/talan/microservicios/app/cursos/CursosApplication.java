package com.talan.microservicios.app.cursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.tala.microservicios.app.usuarios.models.entity.alumno",
			"com.talan.microservicios.app.cursos.models.entity",
			"com.talan.microservicios.commons.examenes.models.entity"})
public class CursosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursosApplication.class, args);
	}

}
