/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Drago
 */
public class Boleto {
    private int numId;
    private String cliente;
    private String destino;
    private int tipo;
    private String fecha;
    private float precio;
    
    public Boleto(){
        this.numId = 1;
        this.cliente = "N/A";
        this.destino = "N/A";
        this.tipo = 0;
        this.fecha = "1/1/2000";
        this.precio = 0.0f;
        
    }
    public Boleto(int numId, String cliente, String destino, int tipo, String fecha, float precio){
        this.numId = numId;
        this.cliente = cliente;
        this.destino = destino;
        this.tipo = tipo;
        this.fecha = fecha;
        this.precio = precio;
    }
    public Boleto(Boleto otro){
        this.numId = otro.numId;
        this.cliente = otro.cliente;
        this.destino = otro.destino;
        this.tipo = otro.tipo;
        this.fecha = otro.fecha;
        this.precio = otro.precio;
        
    }

    /**
     * @return the numId
     */
    public int getNumId() {
        return numId;
    }

    /**
     * @param numId the numId to set
     */
    public void setNumId(int numId) {
        this.numId = numId;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
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
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
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
    
    public float calcularSubtotal(){
        float subtotal = 0.0f;
        switch(tipo){
            case 1:
                subtotal = precio;
                break;
            case 2:
                subtotal = precio*1.8f;
                break;
        }
        return subtotal;
    }
    
    public float calcularImpuesto(){
        float impuesto = 0.0f;
        impuesto = this.calcularSubtotal()*.16f;
        return impuesto;
    }
    
    public float calcularDescuento(int edad){
        float descuento = 0.0f;
        if(edad > 60)descuento = this.calcularSubtotal() * 0.5f;
        return descuento;
    }
    
    public float calcularTotal(int edad){
        float total = 0.0f;
        total = this.calcularSubtotal() + this.calcularImpuesto() - this.calcularDescuento(edad);
        return total;
    }
    
    public String imprimirBoleto(Boleto otro, int edad){
        String impresion;
        impresion = "Numero de cliente: " + otro.getNumId() + "\nCliente: " + otro.getCliente() + "\nDestino: " + otro.getDestino() + "\nTipo: " + otro.getTipo() + "\nPrecio del boleto simple: $" + otro.getPrecio() + "\nFecha: " + otro.getFecha() + "\nSubtotal: $" + otro.calcularSubtotal() + "\nImpuesto : $" + otro.calcularImpuesto() + "\nDescuento: $" + otro.calcularDescuento(edad) + "\nTotal: $" + otro.calcularTotal(edad);
        return impresion;
    }
}
