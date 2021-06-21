package gente;

import java.time.LocalDate;
/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.10 2021/4/22
 */

public class Empleado extends Persona implements TiposPersona {
  
    private TipoEmpleado tipoEmpleado;
    private float sueldo;

    public Empleado(TipoEmpleado tipoEmpleado,
    				String dni,
    				String nombre,
    				String apellidos,
    				LocalDate fechaNacimiento) {
    	
		super (nombre, apellidos, dni, fechaNacimiento);
        this.tipoEmpleado = tipoEmpleado;
        this.sueldo = tipoEmpleado.obtenerSueldo();
    }

    public Empleado(TipoEmpleado tipoEmpleado,
    				String dni,
    				String nombre,
    				String apellidos,
    				int diaNacimiento,
    				int mesNacimiento,
    				int anyoNacimiento) {

    	super(nombre, apellidos, dni, diaNacimiento, mesNacimiento, anyoNacimiento);
        this.tipoEmpleado = tipoEmpleado;
        this.sueldo = tipoEmpleado.obtenerSueldo();
    }
    
    public float getSueldo() {
        return sueldo;
    }

    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }
    
	@Override	
	public String devolverTipoPersona() {
		
		return this.tipoEmpleado.getNombreEmpleo();
		
	}
    @Override
    public String toString() {
    	
        return "\n Puesto: " + tipoEmpleado.getNombreEmpleo() + " Sueldo: " + sueldo
               +"\n Nombre: " + this.getNombre() + " " + this.getApellidos() + " DNI:" + this.getDni() 
               + " Edad " + this.getEdad()
               +"\n" ;
  
    }
    

   
}
