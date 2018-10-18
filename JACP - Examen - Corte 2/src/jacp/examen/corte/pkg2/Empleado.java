/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jacp.examen.corte.pkg2;

/**
 *
 * @author Drago
 */
public abstract class Empleado {
    protected int noEmpleado;
    protected String nombre;
    protected Puesto puesto;
    protected String fechaIngreso;
    
    public Empleado(){
        this.noEmpleado = 0;
        this.nombre = "";
        this.puesto = null;
        this.fechaIngreso = "";
    }
    
    public Empleado(int noEmpleado, String nombre, Puesto puesto, String fechaIngreso){
        this.noEmpleado = noEmpleado;
        this.nombre = nombre;
        this.puesto = puesto;
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * @return the noEmpleado
     */
    public int getNoEmpleado() {
        return noEmpleado;
    }

    /**
     * @param noEmpleado the noEmpleado to set
     */
    public void setNoEmpleado(int noEmpleado) {
        this.noEmpleado = noEmpleado;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the puesto
     */
    public Puesto getPuesto() {
        return puesto;
    }

    /**
     * @param puesto the puesto to set
     */
    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    /**
     * @return the fechaIngreso
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * @param fechaIngreso the fechaIngreso to set
     */
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    public abstract float calcularPago(int horasImpartidas);
    public abstract float calcularImpuestos();
}
