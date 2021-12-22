/**
 * 
 */
package com.andres_lozada.challenge_sofka.anwers_and_questions.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Andres Lozada
 *
 */

@Document(collection = "db_datosuser")
public class DatosUser {
	
	@Id
	private String id;
	
	private Integer consecutivo;
	private String nombre;
	private String username;
	private Integer cedula;
	private Integer puntos_total;
	
	public DatosUser() {
		
	}

	/**
	 * @param consecutivo
	 * @param nombre
	 * @param username
	 * @param cedula
	 * @param puntos_total
	 */
	public DatosUser(Integer consecutivo, String nombre, String username, Integer cedula, Integer puntos_total) {
		super();
		this.consecutivo = consecutivo;
		this.nombre = nombre;
		this.username = username;
		this.cedula = cedula;
		this.puntos_total = puntos_total;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the consecutivo
	 */
	public Integer getConsecutivo() {
		return consecutivo;
	}

	/**
	 * @param consecutivo the consecutivo to set
	 */
	public void setConsecutivo(Integer consecutivo) {
		this.consecutivo = consecutivo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the cedula
	 */
	public Integer getCedula() {
		return cedula;
	}

	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

	/**
	 * @return the puntos_total
	 */
	public Integer getPuntos_total() {
		return puntos_total;
	}

	/**
	 * @param puntos_total the puntos_total to set
	 */
	public void setPuntos_total(Integer puntos_total) {
		this.puntos_total = puntos_total;
	}

	
}
