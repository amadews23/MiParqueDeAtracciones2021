/**
 * 
 */
package gente;

/**
 * @author Bartolome Vich Lozano
 *
 */
public enum TipoCliente {
	
	BEBE("Bebé", 0,2, -1.0F),
	NINYO("Niño", 3,12, -0.50F),
    ADULTO("Adulto", 13,64, 0F),
    SENIOR("Senior", 64,120, -0.35F);

	private final String nombreTipoCliente;
	private final int edadMin;
	private final int edadMax;
	private final float descuento;

	
	/**
	 * @param nombreTipoCliente
	 * @param edadMin
	 * @param edadMax
	 * @param descuento
	 */
	private TipoCliente(String nombreTipoCliente, int edadMin, int edadMax, float descuento) {
		this.nombreTipoCliente = nombreTipoCliente;
		this.edadMin = edadMin;
		this.edadMax = edadMax;
		this.descuento = descuento;
	}
	
	public String getNombreTipoCliente() {
		return nombreTipoCliente;
	}
	public int getEdadMin() {
		return edadMin;
	}
	public int getEdadMax() {
		return edadMax;
	}
	public float getDescuento() {
		return descuento;
	}
	
}
	

