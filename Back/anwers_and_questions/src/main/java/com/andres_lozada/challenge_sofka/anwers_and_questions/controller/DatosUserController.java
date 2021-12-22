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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andres_lozada.challenge_sofka.anwers_and_questions.model.DatosUser;
import com.andres_lozada.challenge_sofka.anwers_and_questions.repository.DatosUserRepository;

/**
 * @author Andres Lozada
 *
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class DatosUserController {
	
	@Autowired
	DatosUserRepository datosuserRepository;
	
	@GetMapping("/users/cedula/{cedula}")
	public ResponseEntity<DatosUser> getDatosUserByCedula(@PathVariable("cedula") Integer cedula){
		
		DatosUser datos = datosuserRepository.findByCedula(cedula).get(0);
		Optional<DatosUser> user = Optional.of(datos);
		
		if (user.isPresent()) {
			
			return new ResponseEntity<>(user.get(), HttpStatus.OK);
		} else {
			
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	@PostMapping("/users")
	public ResponseEntity<DatosUser> createDatosUser(@RequestBody DatosUser cedula){
		
		try {
			
			DatosUser datos = datosuserRepository.save(new DatosUser(
					cedula.getCedula(),
					cedula.getNombre(),
					cedula.getUsername(),
					cedula.getConsecutivo(),
					cedula.getPuntos_total()));
			return new ResponseEntity<>(datos, HttpStatus.CREATED);
			
		} catch (Exception e) {
			
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/users/{cedula}")
	public ResponseEntity<DatosUser> updateDatosUser(@PathVariable("cedula") Integer cedula, @RequestBody DatosUser cedula_user){
		
		DatosUser datos = datosuserRepository.findByCedula(cedula).get(0);
		Optional<DatosUser> users = Optional.ofNullable(datos);
		
		if (users.isPresent()) {
			
			DatosUser datosu = users.get();
			
			datosu.setPuntos_total(cedula_user.getPuntos_total());
			
			return new ResponseEntity<>(datosuserRepository.save(datosu), HttpStatus.OK);
		}else {
		      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
