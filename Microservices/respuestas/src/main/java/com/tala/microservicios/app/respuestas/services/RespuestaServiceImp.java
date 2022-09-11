package com.tala.microservicios.app.respuestas.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tala.microservicios.app.respuestas.models.entity.Respuesta;
import com.tala.microservicios.app.respuestas.models.repository.IRespuestaRepository;

@Service
public class RespuestaServiceImp implements IRespuestaService{

	@Autowired
	private IRespuestaRepository repository;
	@Override
	@Transactional
	public Iterable<Respuesta> saveAll(Iterable<Respuesta> respuestas) {
		
		return repository.saveAll(respuestas);
	}
	@Override
	@Transactional(readOnly= true)
	public Iterable<Respuesta> findRespuestaByAlumnoOrExamen(Long alumnoId, Long examenId) {
		// TODO Auto-generated method stub
		return repository.findRespuestaByAlumnoOrExamen(alumnoId, examenId);
	}
	@Override
	public Iterable<Long> findExamIdsConRespuestaByAlumno(Long alumnoId) {
		// TODO Auto-generated method stub
		return repository.findExamIdsConRespuestaByAlumno(alumnoId);
	}
	

}
