/**
 * Nombre del paquete
 */
package com.andres_lozada.challenge_sofka.anwers_and_questions.controller;

/*
 * Son las importaciones de librerias que se usan
 */
import java.util.ArrayList;
import java.util.List;
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
 * Clase que representa las operaciones y funciones necesarias para 
 * buscar los atributos de las Preguntas
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class PreguntasController {
	
	/*
	 * Instancia que representa la interfaz de Preguntas
	 */
	@Autowired
	PreguntasRepository preguntasRepository;
	
	/**
     * Funcion que permite buscar los datos de los aributos de las preguntas en la database
     */
	@GetMapping("/preguntas/nivel/{nivel}")
	public ResponseEntity<List<Preguntas>> getPreguntasByNivel(@PathVariable("nivel") Integer nivel){
		
		try {		
			
			List<Preguntas> pregunta = new ArrayList<Preguntas>();			
			
			if (nivel != null) {
				preguntasRepository.findByNivel(nivel).forEach(pregunta::add);
			}
			
			if (pregunta.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			else {				
				return new ResponseEntity<>(pregunta, HttpStatus.OK);
			}
			
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
