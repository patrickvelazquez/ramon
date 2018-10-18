/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

/**
 *
 * @author SAMANTHA
 */
public class Gasolina {
    private int id;
    private String marca;
    private int tipo;
    private float precio;
    
    public Gasolina(){
        this.id=82198;
        this.marca="Zustul";
        this.tipo=1;
        this.precio=10.0f;
    }
    
    public Gasolina(int i, String m, int t, float p){
        this.id=i;
        this.marca=m;
        this.tipo=t;
        this.precio=p;
    }
    
    public Gasolina(Gasolina otro){
        this.id=otro.id;
        this.marca=otro.marca;
        this.precio=otro.precio;
        this.tipo=otro.tipo;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public float calcularPrecio()
    {
        if(tipo==1)
            return precio+(precio*0.10f);
        else if(tipo==2)
            return precio+(precio*0.20f);
        else
            return precio+(precio*0.25f);
    }
      
}
