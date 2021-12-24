/**
 * Nombre del paquete
 */
package com.andres_lozada.challenge_sofka.anwers_and_questions.model;

/*
 * Son las importaciones de librerias que se usan * 
 */
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Andres Lozada
 *Clase que representa los datos de las preguntas
 */

@Document(collection = "db_preguntas")
public class Preguntas {
	
	/*
	 * Atributo que representa el id de identificación en la base de datos
	 */
	@Id
	private String id;	
	/*
	 * Atributo que representa el nivel de las preguntas
	 */
	private Integer nivel;
	/*
	 * Atributo que representa el numero de cada pregunta
	 */
	private Integer numeropregunta;
	/*
	 * Atributo que representa cada una de las preguntas
	 */
	private String pregunta;
	/*
	 * Atributo que representa la respuestas verdaderas de las preguntas
	 */
	private String respuestaverdadera;
	/*
	 * Atributo que representa la respuestas falsas #1 de las preguntas
	 */
	private String respuestafalsa1;
	/*
	 * Atributo que representa la respuestas falsas #2 de las preguntas
	 */
	private String respuestafalsa2;
	/*
	 * Atributo que representa la respuestas falsas #3 de las preguntas
	 */
	private String respuestafalsa3;
	
	/**
     * Constructor de instancia sin inicializar los atributos
     */	
	public Preguntas() {
		
	}

	/**
	 * Constructor de instancia que permite inicializar al momento
     * de la creacion el valor de los atributos de los datos 
     * de las preguntas: nivel, pregunta, respuestaverdadera,
     * respuestafalse1, respuestafalsa2 y respuestafalsa3
	 * @param nivel parametro asociado al nivel de las preguntas en esta instancia
	 * @param pregunta parametro asociado a las preguntas en esta instancia
	 * @param respuestaverdadera parametro asociado a la respuesta verdadera de las preguntas en esta instancia
	 * @param respuestafalsa1 parametro asociado a la respuesta falsa #1 de las preguntas en esta instancia
	 * @param respuestafalsa2 parametro asociado a la respuesta falsa #2 de las preguntas en esta instancia
	 * @param respuestafalsa3 parametro asociado a la respuesta falsa #3 de las preguntas en esta instancia
	 */
	public Preguntas(Integer nivel, Integer numeropregunta, String pregunta, String respuestaverdadera, String respuestafalsa1,
			String respuestafalsa2, String respuestafalsa3) {
		super();
		this.nivel = nivel;
		this.numeropregunta = numeropregunta;
		this.pregunta = pregunta;
		this.respuestaverdadera = respuestaverdadera;
		this.respuestafalsa1 = respuestafalsa1;
		this.respuestafalsa2 = respuestafalsa2;
		this.respuestafalsa3 = respuestafalsa3;
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
	 * Obtiene el valor almacenado del atributo nivel
	 * @return the nivel
	 */
	public Integer getNivel() {
		return nivel;
	}

	/**
	 * Permite realizar modificaciones al valor almacenado del atributo nivel
	 * @param nivel
	 */
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	
	/**
	 * Obtiene el valor almacenado del atributo numeropregunta
	 * @return the numeropregunta
	 */
	public Integer getNumeropregunta() {
		return numeropregunta;
	}

	/**
	 * Permite realizar modificaciones al valor almacenado del atributo numeropregunta
	 * @param numeropregunta
	 */
	public void setNumeropregunta(Integer numeropregunta) {
		this.numeropregunta = numeropregunta;
	}

	/**
	 * Obtiene el valor almacenado del atributo pregunta
	 * @return the pregunta
	 */
	public String getPregunta() {
		return pregunta;
	}

	/**
	 * Permite realizar modificaciones al valor almacenado del atributo pregunta
	 * @param pregunta
	 */
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	/**
	 * Obtiene el valor almacenado del atributo respuestaverdadera
	 * @return the respuestaverdadera
	 */
	public String getRespuestaverdadera() {
		return respuestaverdadera;
	}

	/**
	 * Permite realizar modificaciones al valor almacenado del atributo respuestaverdadera
	 * @param respuestaverdadera 
	 */
	public void setRespuestaverdadera(String respuestaverdadera) {
		this.respuestaverdadera = respuestaverdadera;
	}

	/**
	 * Obtiene el valor almacenado del atributo respuestafalsa1
	 * @return the respuestafalsa1
	 */
	public String getRespuestafalsa1() {
		return respuestafalsa1;
	}

	/**
	 * Permite realizar modificaciones al valor almacenado del atributo respuestafalsa1
	 * @param respuestafalsa1
	 */
	public void setRespuestafalsa1(String respuestafalsa1) {
		this.respuestafalsa1 = respuestafalsa1;
	}

	/**
	 * Obtiene el valor almacenado del atributo respuestafalsa2
	 * @return the respuestafalsa2
	 */
	public String getRespuestafalsa2() {
		return respuestafalsa2;
	}

	/**
	 * Permite realizar modificaciones al valor almacenado del atributo respuestafalsa2
	 * @param respuestafalsa2 the respuestafalsa2 to set
	 */
	public void setRespuestafalsa2(String respuestafalsa2) {
		this.respuestafalsa2 = respuestafalsa2;
	}

	/**
	 * Obtiene el valor almacenado del atributo respuestafalsa3
	 * @return the respuestafalsa3
	 */
	public String getRespuestafalsa3() {
		return respuestafalsa3;
	}

	/**
	 * Permite realizar modificaciones al valor almacenado del atributo respuestafalsa3
	 * @param respuestafalsa3 the respuestafalsa3 to set
	 */
	public void setRespuestafalsa3(String respuestafalsa3) {
		this.respuestafalsa3 = respuestafalsa3;
	}
}
