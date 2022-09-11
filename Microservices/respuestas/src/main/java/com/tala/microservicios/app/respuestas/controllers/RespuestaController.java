package com.tala.microservicios.app.respuestas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tala.microservicios.app.respuestas.models.entity.Respuesta;
import com.tala.microservicios.app.respuestas.services.IRespuestaService;

@RestController
public class RespuestaController {

	@Autowired
	private IRespuestaService service;
	
	@PostMapping
	public ResponseEntity<?> crear(@RequestBody Iterable<Respuesta> respuestas){
		Iterable<Respuesta> respuestaDb = service.saveAll(respuestas);
		return ResponseEntity.status(HttpStatus.CREATED).body(respuestaDb);
	}
	
	@GetMapping("/alumno/{alumnoId}/examen/{examenId}")
	public ResponseEntity<?> obtenerRespuestaAlumnoOExamen(@PathVariable Long alumnoId, @PathVariable Long examenId){
		Iterable<Respuesta> respuestas= service.findRespuestaByAlumnoOrExamen(alumnoId, examenId);
		return ResponseEntity.ok(respuestas);
	}
	@GetMapping("/alumno/{alumnoId}/examenes-respondidos")
	public ResponseEntity<?> obtenerExamenesRespondidosPorAlumno(@PathVariable Long alumnoId){
		Iterable<Long> examenesIds = service.findExamIdsConRespuestaByAlumno(alumnoId);
		return ResponseEntity.ok(examenesIds);
	}
}
