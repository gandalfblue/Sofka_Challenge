/**
 * Nombre del paquete
 */
package com.andres_lozada.challenge_sofka.anwers_and_questions.repository;

/*
 * Son las importaciones de librerias que se usan
 */
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.andres_lozada.challenge_sofka.anwers_and_questions.model.DatosUser;

/**
 * @author Andres Lozada
 * Interfaz que representa el metodo abstracto del funcionamiento de la clase DatosUser
 * 
 */
public interface DatosUserRepository extends MongoRepository<DatosUser, String>{
	
	List<DatosUser> findByCedula(Integer cedula);
}
