package com.talan.microservicios.app.cursos.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="microservicio-respuesta")
public interface IFindClient {

	@GetMapping("/alumno/{alumnoId}/examenesRespondidos")
	public Iterable<Long> obtenerExamenesIdRespondidosPorAlumno(@PathVariable Long alumnoId);
}
