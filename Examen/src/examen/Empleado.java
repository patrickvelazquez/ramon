/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Luis Espinoza
 */
public abstract class Empleado {
    protected int numEmpleado;
    protected String nombre;
    protected Puesto puesto;
    protected String fechaIngreso;
    
    
   public Empleado(){
       this.numEmpleado=0;
       this.nombre="";
       this.puesto=null;
       this.fechaIngreso="";
   }
   public Empleado(int numEmpleado, String nombre, Puesto puesto, String fechaIngreso){
       this.numEmpleado=numEmpleado;
       this.nombre=nombre;
       this.puesto=puesto;
       this.fechaIngreso=fechaIngreso;
   }

    /**
     * @return the numEmpleado
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }

    /**
     * @param numEmpleado the numEmpleado to set
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
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
    public abstract float calcularPago(int horas);
    public abstract float calcularImpuesto(int horas);
}

