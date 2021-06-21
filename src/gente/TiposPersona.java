/**
 * 
 */
package gente;

/**
 * @author Bartolome Vich Lozano
 * @version 1.0
 */
interface TiposPersona {
	
	default String devolverTipoPersona() {
		
		return "Una persona cualquiera";
	}
}
