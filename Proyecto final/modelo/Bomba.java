/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Luis Espinoza
 */
public class Bomba {
 
    private int numBomba;
    private Gasolina gasolina;
    private float capacidadLts;
    private float litrosVendidos;
    
   public Bomba(){
        numBomba=0;
        gasolina=null;
        capacidadLts=1000;
        litrosVendidos=0;
    }
    public Bomba(int num, Gasolina gaso, float capacidad, float litrosV)
    {
        numBomba=num;
        gasolina=gaso;
        capacidadLts=capacidad;
        litrosVendidos=litrosV;
    }
    public Bomba(Bomba otra){
        
        numBomba=otra.numBomba;
        gasolina=otra.gasolina;
        capacidadLts=otra.capacidadLts;
        litrosVendidos=otra.litrosVendidos;
    }


    /**
     * @return the numBomba
     */
    public int getNumBomba() {
        return numBomba;
    }

    /**
     * @param numBomba the numBomba to set
     */
    public void setNumBomba(int numBomba) {
        this.numBomba = numBomba;
    }

    /**
     * @return the gasolina
     */
    public Gasolina getGasolina() {
        return gasolina;
    }

    /**
     * @param gasolina the gasolina to set
     */
    public void setGasolina(Gasolina gasolina) {
        this.gasolina = gasolina;
    }

    /**
     * @return the capacidadLts
     */
    public float getCapacidadLts() {
        return capacidadLts;
    }

    /**
     * @param capacidadLts the capacidadLts to set
     */
    public void setCapacidadLts(float capacidadLts) {
        this.capacidadLts = capacidadLts;
    }

    /**
     * @return the litrosVendidos
     */
    public float getLitrosVendidos() {
        return litrosVendidos;
    }

    /**
     * @param litrosVendidos the litrosVendidos to set
     */
    public void setLitrosVendidos(float litrosVendidos) {
        this.litrosVendidos = litrosVendidos;
    }
    public float revisarInventario(){
        return this.capacidadLts-this.litrosVendidos;
    }
    public boolean realizarVenta(float cantidad)
    {
        return cantidad<=this.revisarInventario();
    }
    public float calcularVentaTotal(){
        return this.litrosVendidos*gasolina.calcularPrecio();
    }
            
}
