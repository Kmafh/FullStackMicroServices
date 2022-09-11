package com.talan.microservicios.app.cursos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.talan.microservicios.app.cursos.clients.IFindClient;
import com.talan.microservicios.app.cursos.models.entity.Curso;
import com.talan.microservicios.app.cursos.models.repository.CursoRepository;
import com.talan.microservicios.app.usuarios.common.service.CommonServiceImp;


@Service
public class CursoServiceImp extends CommonServiceImp<Curso, CursoRepository> implements ICursoService {

	@Autowired
	private IFindClient client;
	
	@Override
	@Transactional(readOnly = true)
	public Curso findCrusoByAlumnoId(Long id) {
		return repository.findCrusoByAlumnoId(id);
	}

	@Override
	public Iterable<Long> obtenerExamenesIdRespondidosPorAlumno(Long alumnoId) {
		return client.obtenerExamenesIdRespondidosPorAlumno(alumnoId);
	}

	

}
