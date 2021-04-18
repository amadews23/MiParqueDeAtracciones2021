/**
 * 
 */
package gente;

/**
 * @author Bartolome Vich Lozano
 *
 */
public enum TipoEmpleado {
	
    ATENCION("Atencion al cliente", 0.15F),
    AYUDANTE("Ayudante de atracción", 0F),
    RELACIONES("Relaciones públicas",0.2F),
    RESPONSABLE("Responsable de atracción",0.1F);
    
    private final static float SUELDO_BASE = 950F;
    private final String nombreEmpleo;
    private final float incrementoSueldo;
    
    private TipoEmpleado (String nombreEmpleo, float incrementoSueldo) {
    	
    	this.nombreEmpleo = nombreEmpleo;
    	this.incrementoSueldo = incrementoSueldo;
    }

	public String getNombreEmpleo() {
		return nombreEmpleo;
	}

	public float getIncrementoSueldo() {
		return incrementoSueldo;
	}
	
    public float obtenerSueldo() {
        return SUELDO_BASE + (incrementoSueldo * SUELDO_BASE);
    }        
    
}
