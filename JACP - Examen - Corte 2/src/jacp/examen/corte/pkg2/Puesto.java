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
public class Puesto {
    private int numPuesto;
    private String descripcion;
    private String funciones;
    private String nivelAcademico;
    private int tipoPuesto;
    
    public Puesto(){
        this.numPuesto = 0;
        this.descripcion = "";
        this.funciones = "";
        this.nivelAcademico = "";
        this.tipoPuesto = 0;
    }
    
    public Puesto(int numPuesto, String descripcion, String funciones, String nivelAcademico, int tipoPuesto){
        this.numPuesto = numPuesto;
        this.descripcion = descripcion;
        this.funciones = funciones;
        this.nivelAcademico = nivelAcademico;
        this.tipoPuesto = tipoPuesto;
    }
    
    public Puesto(Puesto otro){
        this.numPuesto = otro.numPuesto;
        this.descripcion = otro.descripcion;
        this.funciones = otro.funciones;
        this.nivelAcademico = otro.nivelAcademico;
        this.tipoPuesto = otro.tipoPuesto;
    }

    /**
     * @return the numPuesto
     */
    public int getNumPuesto() {
        return numPuesto;
    }

    /**
     * @param numPuesto the numPuesto to set
     */
    public void setNumPuesto(int numPuesto) {
        this.numPuesto = numPuesto;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the funciones
     */
    public String getFunciones() {
        return funciones;
    }

    /**
     * @param funciones the funciones to set
     */
    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

    /**
     * @return the nivelAcademico
     */
    public String getNivelAcademico() {
        return nivelAcademico;
    }

    /**
     * @param nivelAcademico the nivelAcademico to set
     */
    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    /**
     * @return the tipoPuesto
     */
    public int getTipoPuesto() {
        return tipoPuesto;
    }

    /**
     * @param tipoPuesto the tipoPuesto to set
     */
    public void setTipoPuesto(int tipoPuesto) {
        this.tipoPuesto = tipoPuesto;
    }
        
}
