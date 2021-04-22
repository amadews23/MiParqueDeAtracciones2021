/**
 * 
 */
package gente;

import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;

/**
 * Clase Cliente que representa los visitantes
 * @author Bartolome Vich Lozano
 * @version 1.1
 *
 */

public class Cliente extends Persona implements TiposPersona {



	private int altura;
	private boolean esEstudiante;
	private boolean esDiscapacitado;
	private boolean esCarnetJoven;
	private boolean esDesempleado;
	private TipoCliente tipoCliente;
	
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
		configurarTipoCliente();
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
		configurarTipoCliente();
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
	
	private void configurarTipoCliente() {
		
		this.tipoCliente = tipoCliente.devolverTipoCliente(this.getEdad());
	}
	
	@Override	
	public String devolverTipoPersona() {
		
		return this.tipoCliente.getNombreTipoCliente();
		
	}
	
    @Override
    public String toString() {
        
        String estudiante = "No";
        String carnetJoven = "No";
        String discapacitado = "No";
        String desempleado = "No";
        
        if (esEstudiante == true) {
            estudiante="Si";
        }
        
        if (esCarnetJoven == true) {
            carnetJoven="Si";
        }
        
        if (esDiscapacitado == true) {
            discapacitado="Si";
        }
        
        if (esDesempleado == true) {
            desempleado="Si";
        }
        return "\nCliente: " + getNombre() + " " + getApellidos()
                //+ "\n Fecha de Nacimiento: " + getFechaNacimiento().format(DateTimeFormatter.ofPattern("dd MMMM yyyy"))
                + "\n Edad:" + getEdad()
                + "\n Estudiante: " + estudiante
                + "\n Discapacitado: " + discapacitado
                + "\n Carnet Joven: " + carnetJoven
                + "\n Desempleado: " + desempleado ;
    }
}



