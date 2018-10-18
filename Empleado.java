/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 *
 * @author Kenneth Wilson
 */
public abstract class Empleado {

    protected int numEmpleado;
    protected String nombre;
    protected Puesto puesto;
    protected String fechaIngreso;
    
    public Empleado(){
        this.numEmpleado = 1;
        this.nombre = "John Doe";
        this.puesto = new Puesto();
        this.fechaIngreso = "01/01/2000";
    }
    public Empleado(int numEmpleado, String nombre, Puesto puesto, String fechaIngreso) {
        this.numEmpleado = numEmpleado;
        this.nombre = nombre;
        this.puesto = puesto;
        this.fechaIngreso = fechaIngreso;
    }
    public Empleado(Empleado otro){
        this.numEmpleado = otro.numEmpleado;
        this.nombre = otro.nombre;
        this.puesto = otro.puesto;
        this.fechaIngreso = otro.fechaIngreso;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public abstract float calcularPago();
    public abstract float calcularImpuesto();
}
