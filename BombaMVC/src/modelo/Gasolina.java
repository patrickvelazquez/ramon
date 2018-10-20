/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Kenneth Wilson
 */
public class Gasolina {
    private int idGasolina;
    private String marca;
    private int tipo;
    private float precioBase;
    
    public Gasolina(){
        this.idGasolina = 1;
        this.marca = "";
        this.tipo = 1;
        this.precioBase = 15.0f;
    }
    public Gasolina(int id, String m, int t, float pB){
        this.idGasolina = id;
        this.marca = m;
        this.tipo = t;
        this.precioBase = pB;
    }
    public Gasolina(Gasolina otra){
        this.idGasolina = otra.idGasolina;
        this.marca = otra.marca;
        this.tipo = otra.tipo;
        this.precioBase = otra.precioBase;
    }

    public int getIdGasolina() {
        return idGasolina;
    }

    public void setIdGasolina(int idGasolina) {
        this.idGasolina = idGasolina;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }
    
    public float calcularPrecio(){
        float p = 0.0f;
        if(getTipo()==1){
            p = 0.1f;
        }else if(getTipo()==2){
            p = 0.2f;
        }else if(getTipo()==3){
            p = 0.25f;
        }
        return getPrecioBase() + getPrecioBase()*p;
    }
}
