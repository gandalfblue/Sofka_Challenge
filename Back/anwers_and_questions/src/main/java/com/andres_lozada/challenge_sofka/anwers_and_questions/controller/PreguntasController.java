/**
 * 
 */
package com.andres_lozada.challenge_sofka.anwers_and_questions.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.andres_lozada.challenge_sofka.anwers_and_questions.model.Preguntas;
import com.andres_lozada.challenge_sofka.anwers_and_questions.repository.PreguntasRepository;

/**
 * @author Andres Lozada
 *
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class PreguntasController {
	
	@Autowired
	PreguntasRepository preguntasRepository;
	
	@GetMapping("/preguntas/nivel/{nivel}")
	public ResponseEntity<Preguntas> getPreguntasByNivel(@PathVariable("nivel") Integer nivel){
					
			Preguntas pregunta = preguntasRepository.findByNivel(nivel).get(0);
			Optional<Preguntas> preguntasData = Optional.of(pregunta);
			
			if (preguntasData.isPresent()) {
				return new ResponseEntity<>(preguntasData.get(), HttpStatus.OK);
			} else {
				
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}		
	}
}
