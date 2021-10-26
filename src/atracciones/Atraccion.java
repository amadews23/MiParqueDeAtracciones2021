package atracciones;

import gente.Cliente;
import gente.Empleado;
import java.util.ArrayList;


/**
 *
 * @author Bartolome Vich Lozano
 * @version 2.00 2021/10/26
 */
public class Atraccion {
   
        protected String nombreAtraccion;
        protected boolean esActiva;
        private ArrayList<Cliente> listaClientes ;
        private ArrayList<Empleado> listaEmpleados;
        private TipoAtraccion tipoAtraccion;

       
    /**
     *
     * @param nombreAtraccion
     * @param tipoAtraccion
     */
    public Atraccion(String nombreAtraccion, TipoAtraccion tipoAtraccion) {
    	
        this.nombreAtraccion = nombreAtraccion;
        this.esActiva = false; //por defecto Atracción está inactiva
        this.listaClientes = new ArrayList<>();
        this.listaEmpleados = new ArrayList<>();
        this.tipoAtraccion = tipoAtraccion;

    }

    /**
     *
     * @param nombreAtraccion
     * @param listaClientes
     * @param listaEmpleadosAyudantes
     * @param listaEmpleadosResponsables
     * @param listaEmpleadosAtenciones
     * @param listaEmpleadosRelaciones
     * @param tipoAtraccion
     */
    public Atraccion(
            String nombreAtraccion, 
            ArrayList<Cliente> listaClientes, 
            ArrayList<Empleado> listaEmpleados, 
            TipoAtraccion tipoAtraccion) {
        
        this.nombreAtraccion = nombreAtraccion;
        this.esActiva = false; //por defecto Atracción está inactiva
        this.listaClientes = listaClientes;
        this.listaEmpleados = listaEmpleados;
        this.tipoAtraccion = tipoAtraccion;
    }

    /**
     *
     * @return nombreAtraccion
     */
    public String getNombreAtraccion() {
        return nombreAtraccion;
    }

    /**
     *
     * @param nombreAtraccion
     */
    public void setNombreAtraccion(String nombreAtraccion) {
        this.nombreAtraccion = nombreAtraccion;
    }

    /**
     *
     * @return boolea
     */
    public boolean isEsActiva() {
        return esActiva;
    }

    /**
     *
     * @param esActiva
     */
    public void setEsActiva(boolean esActiva) {
        this.esActiva = esActiva;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }



    @Override
    public String toString() {
        String estaActiva = "No";
        if (esActiva == true) {
            estaActiva = "Si";
        }
        return "\nNombre de Atraccion: " + nombreAtraccion + " ¿Está activa? " + estaActiva  
                + "\n" + tipoAtraccion.toString() + "\n";
    }


        

}
