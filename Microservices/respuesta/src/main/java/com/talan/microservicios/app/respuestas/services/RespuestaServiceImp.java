package com.talan.microservicios.app.respuestas.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.talan.microservicios.app.respuestas.models.entity.Respuesta;
import com.talan.microservicios.app.respuestas.models.repository.IRespuestasRepository;

@Service

public class RespuestaServiceImp implements IRespuestaService{

	@Autowired
	private IRespuestasRepository repository;
	
	@Override
	@Transactional
	public Iterable<Respuesta> saveAll(Iterable<Respuesta> respuestas) {
		
		return repository.saveAll(respuestas);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Respuesta> findRespuestaByAlumno(Long alumnoId, Long examenId) {
		// TODO Auto-generated method stub
		return repository.findRespuestaByAlumno(alumnoId, examenId);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Long> findExamenesByAlumno(Long alumnoId) {

		return repository.findExamenesByAlumno(alumnoId);
	}

}
