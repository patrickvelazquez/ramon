/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Konakun
 */
public class Cotizacion {
    private int numeroCotizacion;
    private String descripcion;
    private float precio;
    private float porcentajePagoInicial;
    private int plazo;
    
    public Cotizacion(){
        this.numeroCotizacion = 1;
        this.descripcion = "N/A";
        this.precio = 0.0f;
        this.porcentajePagoInicial = 0;
        this.plazo = 0;
    }
    
    public Cotizacion(int numeroCotizacion, String descripcion, float precio, float porcentajePagoInicial, int plazo){
        this.numeroCotizacion = numeroCotizacion;
        this.descripcion = descripcion;
        this.precio = precio;
        this.porcentajePagoInicial = porcentajePagoInicial;
        this.plazo = plazo;
    }
    
    public Cotizacion(Cotizacion otro){
        this.numeroCotizacion = otro.numeroCotizacion;
        this.descripcion = otro.descripcion;
        this.precio = otro.precio;
        this.porcentajePagoInicial = otro.porcentajePagoInicial;
        this.plazo = otro.plazo;
    }

    /**
     * @return the numeroCotizacion
     */
    public int getNumeroCotizacion() {
        return numeroCotizacion;
    }

    /**
     * @param numeroCotizacion the numeroCotizacion to set
     */
    public void setNumeroCotizacion(int numeroCotizacion) {
        this.numeroCotizacion = numeroCotizacion;
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
     * @return the porcentajePagoInicial
     */
    public float getPorcentajePagoInicial() {
        return porcentajePagoInicial;
    }

    /**
     * @param porcentajePagoInicial the porcentajePagoInicial to set
     */
    public void setPorcentajePagoInicial(float porcentajePagoInicial) {
        this.porcentajePagoInicial = porcentajePagoInicial;
    }

    /**
     * @return the plazo
     */
    public int getPlazo() {
        return plazo;
    }

    /**
     * @param plazo the plazo to set
     */
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    
    public float calcularPagoInicial(){
        float pagoInicial = 0.0f;
        pagoInicial = precio * (porcentajePagoInicial/100.0f);
        return pagoInicial;
    }
    
    public float calcularTotalFinanciar(){
        float totalFinanciar = 0.0f;
        totalFinanciar = precio - calcularPagoInicial();
        return totalFinanciar;
    }
    
    public float calcularPagoMensual(){
        float pagoMensual = 0.0f;
        pagoMensual = calcularTotalFinanciar()/plazo;
        return pagoMensual;
    }
    
    public String imprimirCotizacion(Cotizacion otro){
        String impresion = "";
        impresion = "Numero Cotización: " + otro.numeroCotizacion + "\nDescripción: " + otro.descripcion + "\nPrecio: $" + otro.precio + "\nPorcentaje de pago inicial: " + otro.porcentajePagoInicial + "%" + "\nPlazo: " + otro.plazo + " meses" + "\nPago inicial; $" + otro.calcularPagoInicial() + "\nTotal a financiar: $" + otro.calcularTotalFinanciar() + "\nPago mensual: $" + otro.calcularPagoMensual();
        return impresion;
    }
}
