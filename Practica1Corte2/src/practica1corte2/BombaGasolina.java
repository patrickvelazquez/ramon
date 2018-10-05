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
public class BombaGasolina {
    private int numBomba;
    private Gasolina tipoGasolina;
    private float capacidad;
    private float litrosVendidos;
    
    public BombaGasolina(){
        this.numBomba = 0;
        this.tipoGasolina = new Gasolina();
        this.capacidad = 1000;
        this.litrosVendidos = 0;
    }
    public BombaGasolina(int numBomba, Gasolina tipoGasolina, float capacidad, float litrosVendidos){
        this.numBomba = numBomba;
        this.tipoGasolina = tipoGasolina;
        this.capacidad = capacidad;
        this.litrosVendidos = litrosVendidos;
    }
    public BombaGasolina(BombaGasolina otro){
        this.numBomba = otro.numBomba;
        this.tipoGasolina = otro.tipoGasolina;
        this.capacidad = otro.capacidad;
        this.litrosVendidos = otro.litrosVendidos;
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
     * @return the tipoGasolina
     */
    public Gasolina getTipoGasolina() {
        return tipoGasolina;
    }

    /**
     * @param tipoGasolina the tipoGasolina to set
     */
    public void setTipoGasolina(Gasolina tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    /**
     * @return the capacidad
     */
    public float getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
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
        float inventario = 0.0f;
        inventario = capacidad - litrosVendidos;
        return inventario;
    }
    
    public float realizarVenta(float litrosVendidos){
        float venta = 0.0f;
        if(litrosVendidos < this.revisarInventario() && litrosVendidos > 0){
            this.litrosVendidos = this.litrosVendidos + litrosVendidos;
            venta = litrosVendidos * tipoGasolina.calcularPrecio();
        }
        return venta;
    }
    
    public float calcularVentaTotal(){
        float ventaTotal = 0.0f;
        ventaTotal = litrosVendidos * tipoGasolina.calcularPrecio();
        return ventaTotal;
    }
}
