/**
 * 
 */
package com.andres_lozada.challenge_sofka.anwers_and_questions.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.andres_lozada.challenge_sofka.anwers_and_questions.model.Preguntas;

/**
 * @author Andres Lozada
 *
 */
public interface PreguntasRepository extends MongoRepository<Preguntas, String> {
	
	List<Preguntas> findByNivel(Integer nivel);
}
