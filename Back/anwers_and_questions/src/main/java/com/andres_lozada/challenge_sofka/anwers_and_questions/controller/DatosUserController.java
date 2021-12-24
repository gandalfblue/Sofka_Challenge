/*
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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.andres_lozada.challenge_sofka.anwers_and_questions.model.DatosUser;
import com.andres_lozada.challenge_sofka.anwers_and_questions.repository.DatosUserRepository;

/**
 * @author Andres Lozada
 * Clase que representa las operaciones y funciones necesarias para 
 * crear, buscar y actualizar los atributos de los datos de los usuarios
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class DatosUserController {
	
	/*
	 * Instancia que representa la interfaz de DatosUser
	 */
	@Autowired
	DatosUserRepository datosuserRepository;
	
	/**
     * Funcion que permite buscar los datos de los aributos de los usuarios en la database
     */
	@GetMapping("/users")
	public ResponseEntity<List<DatosUser>> getAllDatosUser(@RequestParam(required = false) Integer cedula){
		
		try {
			
			List<DatosUser> user = new ArrayList<DatosUser>();
			
			if (cedula == null) {
				datosuserRepository.findAll().forEach(user::add);
			} else {
				datosuserRepository.findByCedula(cedula).forEach(user::add);
			}
		
			if (user.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(user, HttpStatus.OK);
		
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	/**
     * Funcion que permite crear los datos de los aributos de los usuarios en la database
     */
	@PostMapping("/users")
	public ResponseEntity<DatosUser> createDatosUser(@RequestBody DatosUser cedula){
		
		try {
			
			DatosUser datos = datosuserRepository.save(new DatosUser(
					cedula.getNombre(),
					cedula.getUsername(),
					cedula.getCedula(),
					cedula.getPuntos_total()));
			return new ResponseEntity<>(datos, HttpStatus.CREATED);
			
		} catch (Exception e) {
			
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	/**
     * Funcion que permite actualizar los datos de los aributos de los usuarios en la database
     */
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
