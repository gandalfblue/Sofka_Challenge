/**
 * Nombre del paquete
 */
package com.andres_lozada.challenge_sofka.anwers_and_questions.model;

/*
 * Son las importaciones de librerias que se usan
 */
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Andres Lozada
 *Clase que representa los datos de los usuarios
 */
@Document(collection = "db_datosuser")
public class DatosUser {	
	
	/*
	 * Atributo que representa el id de identificación en la base de datos
	 */
	@Id
	private String id;	
	/*
	 * Atributo que representa el username del usuario
	 */
	private String username;
	/*
	 * Atributo que representa el nombre del usuario
	 */
	private String nombre;
	/*
	 * Atributo que representa la cedula del usuario
	 */
	private Integer cedula;
	/*
	 * Atributo que representa el puntaje total del usuario
	 */
	private Integer puntos_total;
	
	/**
     * Constructor de instancia sin inicializar los atributos
     */	
	public DatosUser() {
		
	}
	
	/**
     * Constructor de instancia que permite inicializar al momento
     * de la creacion el valor de los atributos de los datos 
     * del usuario: nombre, username, cedula y puntos totales
	 * @param nombre parametro asociado al nombre del usuario en esta instancia
	 * @param username parametro asociado al usernam del usuario en esta instancia
	 * @param cedula parametro asociado a la cedula del usuario en esta instancia
	 * @param puntos_total parametro asociado a los puntos totales del usuario en esta instancia
	 */
	public DatosUser(String nombre, String username, Integer cedula, Integer puntos_total) {
		super();
		this.nombre = nombre;
		this.username = username;
		this.cedula = cedula;
		this.puntos_total = puntos_total;
	}

	/**
	 * Obtiene el valor almacenado del atributo id
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Permite realizar modificaciones al valor almacenado del atributo id
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Obtiene el valor almacenado del atributo nombre
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Permite realizar modificaciones al valor almacenado del atributo nombre
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el valor almacenado del atributo username
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Permite realizar modificaciones al valor almacenado del atributo username
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Obtiene el valor almacenado del atributo cedula
	 * @return the cedula
	 */
	public Integer getCedula() {
		return cedula;
	}

	/**
	 * Permite realizar modificaciones al valor almacenado del atributo cedula
	 * @param cedula
	 */
	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

	/**
	 * Obtiene el valor almacenado del atributo puntos_totales
	 * @return the puntos_total
	 */
	public Integer getPuntos_total() {
		return puntos_total;
	}

	/**
	 * Permite realizar modificaciones al valor almacenado del atributo puntos_totales
	 * @param puntos_total the puntos_total to set
	 */
	public void setPuntos_total(Integer puntos_total) {
		this.puntos_total = puntos_total;
	}	
}
