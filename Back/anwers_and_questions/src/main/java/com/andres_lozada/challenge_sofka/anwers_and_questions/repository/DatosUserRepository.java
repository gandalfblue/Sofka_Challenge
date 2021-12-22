/**
 * 
 */
package com.andres_lozada.challenge_sofka.anwers_and_questions.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.andres_lozada.challenge_sofka.anwers_and_questions.model.DatosUser;

/**
 * @author Andres Lozada
 *
 */
public interface DatosUserRepository extends MongoRepository<DatosUser, String>{
	
	List<DatosUser> findByCedula(Integer cedula);
}
