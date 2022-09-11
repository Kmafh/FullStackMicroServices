package com.talan.microservicios.app.respuestas.services;

import com.talan.microservicios.app.respuestas.models.entity.Respuesta;

public interface IRespuestaService {

	public Iterable<Respuesta> saveAll(Iterable<Respuesta> respuesta);
	public Iterable<Respuesta> findRespuestaByAlumno(Long alumnoId, Long examenId);
	public Iterable<Long> findExamenesByAlumno(Long alumnoId);
}
