package gente;

import java.time.LocalDate;

/**
 * @author Bartolome Vich Lozano
 * @version 1.2
 *
 */
public class Persona {
	
	private String nombre;
	private String apellidos;
	private String dni;
	private LocalDate fechaNacimiento;
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param fechaNacimiento
	 */
	public Persona(String nombre, String apellidos, String dni, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param diaNacimiento
	 * @param mesNacimiento
	 * @param anyoNacimiento
	 */
	public Persona(String nombre, String apellidos, String dni, int diaNacimiento, int mesNacimiento, int anyoNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = LocalDate.of(anyoNacimiento, mesNacimiento, diaNacimiento);
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
