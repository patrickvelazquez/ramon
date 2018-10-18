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
public class Puesto {

    /**
     * @return the numPuesto
     */
      private int numPuesto;
    private String descripcion;
    private String funcion;
    private int nivel;
    private int tipo;
    
    public Puesto(){
        this.numPuesto=0;
        this.descripcion="";
        this.funcion="";
        this.nivel=1;
        this.tipo=1;
    }
    public Puesto(int numPuesto, String descripcion, String funcion, int nivel, int tipo){
        this.numPuesto=numPuesto;
        this.descripcion=descripcion;
        this.funcion=funcion;
        this.nivel=nivel;
        this.tipo=tipo;
    }
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
     * @return the funcion
     */
    public String getFuncion() {
        return funcion;
    }

    /**
     * @param funcion the funcion to set
     */
    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
  

    
}
