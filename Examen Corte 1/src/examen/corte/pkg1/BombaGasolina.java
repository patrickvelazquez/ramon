/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.corte.pkg1;

/**
 *
 * @author Drago
 */
public class BombaGasolina {
    private int numBomba;
    private int tipoGasolina;
    private float precio;
    private float capacidad;
    private float litrosVendidos;
    
    public BombaGasolina(){
        this.numBomba = 0;
        this.tipoGasolina = 0;
        this.precio = 0.0f;
        this.capacidad = 1000.0f;
        this.litrosVendidos = 0.0f;
    }
    
    public BombaGasolina(int numBomba, int tipoGasolina, float precio, float capacidad, float litrosVendidos){
        this.numBomba = numBomba;
        this.tipoGasolina = tipoGasolina;
        this.precio = precio;
        this.capacidad = capacidad;
        this.litrosVendidos = litrosVendidos;
    }
    
    public BombaGasolina(BombaGasolina otro){
        this.numBomba = otro.numBomba;
        this.tipoGasolina = otro.tipoGasolina;
        this.precio = otro.precio;
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
    public int getTipoGasolina() {
        return tipoGasolina;
    }

    /**
     * @param tipoGasolina the tipoGasolina to set
     */
    public void setTipoGasolina(int tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
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
    
    public float ventaGasolina(float cantidadLitros){
        float venta = 0.0f;
        if(revisarInventario() > cantidadLitros)
        {
            venta = cantidadLitros * precio;
            this.litrosVendidos = litrosVendidos + cantidadLitros;
        }
        return venta;
    }
    
    public float revisarInventario(){
        float cantidadRestante = 0.0f;
        cantidadRestante = capacidad - litrosVendidos;
        return cantidadRestante;
    }
    
    public float calcularVentaTotal(){
        float ventaTotal = 0.0f;
        ventaTotal = litrosVendidos*precio;
        return ventaTotal;
    }
}
