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

@Document(collection = "db_preguntas")
public class Preguntas {
	
	@Id
	private String id;
	
	private Integer nivel;
	private Integer numeropregunta;
	private String pregunta;
	private String respuestaverdadera;
	private String respuestafalsa1;
	private String respuestafalsa2;
	private String respuestafalsa3;
	
	public Preguntas() {
		
	}

	/**
	 * @param nivel
	 * @param pregunta
	 * @param respuestaverdadera
	 * @param respuestafalsa1
	 * @param respuestafalsa2
	 * @param respuestafalsa3
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
	 * @return the nivel
	 */
	public Integer getNivel() {
		return nivel;
	}

	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	
	/**
	 * @return the nivel
	 */
	public Integer getNumeropregunta() {
		return numeropregunta;
	}

	/**
	 * @param nivel the nivel to set
	 */
	public void setNumeropregunta(Integer numeropregunta) {
		this.numeropregunta = numeropregunta;
	}

	/**
	 * @return the pregunta
	 */
	public String getPregunta() {
		return pregunta;
	}

	/**
	 * @param pregunta the pregunta to set
	 */
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	/**
	 * @return the respuestaverdadera
	 */
	public String getRespuestaverdadera() {
		return respuestaverdadera;
	}

	/**
	 * @param respuestaverdadera the respuestaverdadera to set
	 */
	public void setRespuestaverdadera(String respuestaverdadera) {
		this.respuestaverdadera = respuestaverdadera;
	}

	/**
	 * @return the respuestafalsa1
	 */
	public String getRespuestafalsa1() {
		return respuestafalsa1;
	}

	/**
	 * @param respuestafalsa1 the respuestafalsa1 to set
	 */
	public void setRespuestafalsa1(String respuestafalsa1) {
		this.respuestafalsa1 = respuestafalsa1;
	}

	/**
	 * @return the respuestafalsa2
	 */
	public String getRespuestafalsa2() {
		return respuestafalsa2;
	}

	/**
	 * @param respuestafalsa2 the respuestafalsa2 to set
	 */
	public void setRespuestafalsa2(String respuestafalsa2) {
		this.respuestafalsa2 = respuestafalsa2;
	}

	/**
	 * @return the respuestafalsa3
	 */
	public String getRespuestafalsa3() {
		return respuestafalsa3;
	}

	/**
	 * @param respuestafalsa3 the respuestafalsa3 to set
	 */
	public void setRespuestafalsa3(String respuestafalsa3) {
		this.respuestafalsa3 = respuestafalsa3;
	}
}
