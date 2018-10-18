/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 *
 * @author SAMANTHA
 */
public abstract class Empleado
{
    protected int numeroDeEmpleado;
    protected String nombreEmpleado;
    protected Puesto puestoEmpleado;
    protected String fechaIngresoE;
    
    public Empleado()
    {
        this.numeroDeEmpleado=82198;
        this.nombreEmpleado="Samara Jo.";
        this.puestoEmpleado=null;
        this.fechaIngresoE="19-10-1999";
    }
    
    public Empleado(int n, String no, Puesto p, String f)
    {
        this.nombreEmpleado=no;
        this.numeroDeEmpleado=n;
        this.puestoEmpleado=p;
        this.fechaIngresoE=f;
    }
    
    /**
     * @return the numeroDeEmpleado
     */
    public int getNumeroDeEmpleado() {
        return numeroDeEmpleado;
    }

    /**
     * @param numeroDeEmpleado the numeroDeEmpleado to set
     */
    public void setNumeroDeEmpleado(int numeroDeEmpleado) {
        this.numeroDeEmpleado = numeroDeEmpleado;
    }

    /**
     * @return the nombreEmpleado
     */
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    /**
     * @param nombreEmpleado the nombreEmpleado to set
     */
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    /**
     * @return the puestoEmpleado
     */
    public Puesto getPuestoEmpleado() {
        return puestoEmpleado;
    }

    /**
     * @param puestoEmpleado the puestoEmpleado to set
     */
    public void setPuestoEmpleado(Puesto puestoEmpleado) {
        this.puestoEmpleado = puestoEmpleado;
    }

    /**
     * @return the fechaIngresoE
     */
    public String getFechaIngresoE() {
        return fechaIngresoE;
    }

    /**
     * @param fechaIngresoE the fechaIngresoE to set
     */
    public void setFechaIngresoE(String fechaIngresoE) {
        this.fechaIngresoE = fechaIngresoE;
    }
    
    public abstract float calcularPago();
    public abstract float calcularImpuesto();
    
}
