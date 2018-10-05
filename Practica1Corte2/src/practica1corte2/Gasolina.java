/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1corte2;

/**
 *
 * @author Drago
 */
public class Gasolina {
    private int idGasolina;
    private String marca;
    private int tipo;
    private float precioBase;
    
    public Gasolina(){
        this.idGasolina = 0;
        this.marca = "N/A";
        this.tipo = 0;
        this.precioBase = 0.0f;
    }
    
    public Gasolina(int idGasolina, String marca, int tipo, float precioBase){
        this.idGasolina = idGasolina;
        this.marca = marca;
        this.tipo = tipo;
        this.precioBase = precioBase;
        
    }
    public Gasolina(Gasolina otro){
        this.idGasolina = otro.idGasolina;
        this.marca = otro.marca;
        this.tipo = otro.tipo;
        this.precioBase = otro.precioBase;
    }

    /**
     * @return the idGasolina
     */
    public int getIdGasolina() {
        return idGasolina;
    }

    /**
     * @param idGasolina the idGasolina to set
     */
    public void setIdGasolina(int idGasolina) {
        this.idGasolina = idGasolina;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
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

    /**
     * @return the precioBase
     */
    public float getPrecioBase() {
        return precioBase;
    }

    /**
     * @param precioBase the precioBase to set
     */
    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }
    
    public float calcularPrecio(){
        float precio = precioBase;
        switch(tipo){
            case 1:
                precio = precioBase*1.1f;
                break;
            case 2:
                precio = precioBase*1.2f;
                break;
            case 3:
                precio = precioBase*1.25f;
                break;
        }
        return precio;
    }
}
