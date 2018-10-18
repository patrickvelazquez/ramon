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
public class Puesto {
    private int numPuesto;
    private String descripcion;
    private String funciones;
    private int nivelAcad;
    private int tipoPuesto;
    
    public Puesto(){
        this.numPuesto = 1;
        this.descripcion = "";
        this.funciones = "";
        this.nivelAcad = 1;
        this.tipoPuesto = 1;
    }
    public Puesto(int n, String d, String f, int a, int p){
        this.numPuesto = n;
        this.descripcion = d;
        this.funciones = f;
        this.nivelAcad = a;
        this.tipoPuesto = p;
    }
    public Puesto(Puesto otro){
        this.numPuesto = otro.numPuesto;
        this.descripcion = otro.descripcion;
        this.funciones = otro.funciones;
        this.nivelAcad = otro.nivelAcad;
        this.tipoPuesto = otro.tipoPuesto;
    }

    public int getNumPuesto() {
        return numPuesto;
    }

    public void setNumPuesto(int numPuesto) {
        this.numPuesto = numPuesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

    public int getNivelAcad() {
        return nivelAcad;
    }

    public void setNivelAcad(int nivelAcad) {
        this.nivelAcad = nivelAcad;
    }

    public int getTipoPuesto() {
        return tipoPuesto;
    }

    public void setTipoPuesto(int tipoPuesto) {
        this.tipoPuesto = tipoPuesto;
    }
    
}
