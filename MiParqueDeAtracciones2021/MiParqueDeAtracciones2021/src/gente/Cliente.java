/**
 * 
 */
package gente;

import java.time.LocalDate;

/**
 * Clase Cliente que representa los visitantes
 * @author Bartolome Vich Lozano
 * @version 1.0
 *
 */

public class Cliente extends Persona{



	private int altura;
	private boolean esEstudiante;
	private boolean esDiscapacitado;
	private boolean esCarnetJoven;
	private boolean esDesempleado;
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param fechaNacimiento
	 * @param altura
	 * @param esEstudiante
	 * @param esDiscapacitado
	 * @param esCarnetJoven
	 * @param esDesempleado
	 */
	public Cliente(String nombre, 
				   String apellidos, 
				   String dni,
				   LocalDate fechaNacimiento,
				   int altura,
				   boolean esEstudiante,
				   boolean esDiscapacitado,
				   boolean esCarnetJoven,
				   boolean esDesempleado) {
		
		super (nombre, apellidos, dni, fechaNacimiento);
		
		this.altura = altura;
		this.esEstudiante = esEstudiante;
		this.esDiscapacitado = esDiscapacitado;
		this.esCarnetJoven = esCarnetJoven;
		this.esDesempleado = esDesempleado;
	}
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param fechaNacimiento
	 * @param altura
	 * @param esEstudiante
	 * @param esDiscapacitado
	 * @param esCarnetJoven
	 * @param esDesempleado
	 */
	public Cliente(String nombre, 
				   String apellidos, 
				   String dni,
				   int diaNacimiento,
				   int mesNacimiento,
				   int anyoNacimiento,
				   int altura,
				   boolean esEstudiante,
				   boolean esDiscapacitado,
				   boolean esCarnetJoven,
				   boolean esDesempleado) {
		
		super (nombre, apellidos, dni, diaNacimiento,mesNacimiento, anyoNacimiento);
		
		this.altura = altura;
		this.esEstudiante = esEstudiante;
		this.esDiscapacitado = esDiscapacitado;
		this.esCarnetJoven = esCarnetJoven;
		this.esDesempleado = esDesempleado;
	}	

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public boolean isEsEstudiante() {
		return esEstudiante;
	}

	public void setEsEstudiante(boolean esEstudiante) {
		this.esEstudiante = esEstudiante;
	}

	public boolean isEsDiscapacitado() {
		return esDiscapacitado;
	}

	public void setEsDiscapacitado(boolean esDiscapacitado) {
		this.esDiscapacitado = esDiscapacitado;
	}

	public boolean isEsCarnetJoven() {
		return esCarnetJoven;
	}

	public void setEsCarnetJoven(boolean esCarnetJoven) {
		this.esCarnetJoven = esCarnetJoven;
	}

	public boolean isEsDesempleado() {
		return esDesempleado;
	}

	public void setEsDesempleado(boolean esDesempleado) {
		this.esDesempleado = esDesempleado;
	}
	
	@Override
	public String toString() {
		return "Cliente [getAltura()=" + getAltura() + ", isEsEstudiante()=" + isEsEstudiante()
				+ ", isEsDiscapacitado()=" + isEsDiscapacitado() + ", isEsCarnetJoven()=" + isEsCarnetJoven()
				+ ", isEsDesempleado()=" + isEsDesempleado() + ", getNombre()=" + getNombre() + ", getApellidos()="
				+ getApellidos() + ", getDni()=" + getDni() + ", getFechaNacimiento()=" + getFechaNacimiento()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


}
