package com.tala.microservicios.app.respuestas.services;

import com.tala.microservicios.app.respuestas.models.entity.Respuesta;

public interface IRespuestaService {

	Iterable<Respuesta> saveAll(Iterable<Respuesta> respuestas);
	public Iterable<Respuesta> findRespuestaByAlumnoOrExamen(Long alumnoId,Long examenId);
	public Iterable<Long> findExamIdsConRespuestaByAlumno(Long alumnoId);
}
