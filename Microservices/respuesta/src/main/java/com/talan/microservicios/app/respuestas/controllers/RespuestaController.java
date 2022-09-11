package com.talan.microservicios.app.respuestas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.talan.microservicios.app.respuestas.models.entity.Respuesta;
import com.talan.microservicios.app.respuestas.services.IRespuestaService;

@RestController
public class RespuestaController {

	@Autowired
	private IRespuestaService service;
	
	@PostMapping
	public ResponseEntity<?> crear(@RequestBody Iterable<Respuesta> respuestas){
		Iterable<Respuesta> respuestasDb =service.saveAll(respuestas);
		return ResponseEntity.status(HttpStatus.CREATED).body(respuestasDb);
	}
	
	@GetMapping("/alumno/{alumnoId}/examen/{examenId}")
	public ResponseEntity<?> ObtenerRespuestaAlumno(@PathVariable Long alumnoId,@PathVariable Long examenId){
		
		Iterable<Respuesta> respuestas= service.findRespuestaByAlumno(alumnoId, examenId);
		return ResponseEntity.ok(respuestas);
		
	}
	@GetMapping("/alumno/{alumnoId}/examenesRespondidos")
	public ResponseEntity<?> ObtenerExamenesRespondidosId(@PathVariable Long alumnoId){
		
		Iterable<Long> examenesIds= service.findExamenesByAlumno(alumnoId);
		return ResponseEntity.ok(examenesIds);
		
	}
}
