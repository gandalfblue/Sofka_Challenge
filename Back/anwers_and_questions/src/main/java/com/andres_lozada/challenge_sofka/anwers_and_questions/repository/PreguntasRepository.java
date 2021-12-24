/**
 * Nombre del paquete
 */
package com.andres_lozada.challenge_sofka.anwers_and_questions.repository;

/*
 * Son las importaciones de librerias que se usan
 */
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.andres_lozada.challenge_sofka.anwers_and_questions.model.Preguntas;

/**
 * @author Andres Lozada
 *Interfaz que representa el metodo abstracto del funcionamiento de la clase Preguntas
 */
public interface PreguntasRepository extends MongoRepository<Preguntas, String> {
	
	List<Preguntas> findByNivel(Integer nivel);
}
