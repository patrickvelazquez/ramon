/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *
 * @author Kennyswh
 */
public class Cotizacion {
    private int numeroCotizacion;
    private String descripcion;
    private float precio;
    private float porcentajePagoInicial;
    private int plazo;
    
    public Cotizacion(){
        //Constructor por Omisión
        this.numeroCotizacion = 0;
        this.descripcion = "";
        this.precio = 0;
        this.porcentajePagoInicial = 0;
        this.plazo = 0;
    }
    public Cotizacion(int n, String d, float p, float i, int plazo){
        //Constructor por Argumentos
        this.numeroCotizacion = n;
        this.descripcion = d;
        this.precio = p;
        this.porcentajePagoInicial = i;
        this.plazo = plazo;
    }
    public Cotizacion(Cotizacion otra){
        //Constructor Copia
        this.numeroCotizacion = otra.numeroCotizacion;
        this.descripcion = otra.descripcion;
        this.precio = otra.precio;
        this.porcentajePagoInicial = otra.porcentajePagoInicial;
        this.plazo = otra.plazo;
    }

    public int getNumeroCotizacion() {
        return numeroCotizacion;
    }

    public void setNumeroCotizacion(int numeroCotizacion) {
        this.numeroCotizacion = numeroCotizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPorcentajePagoInicial() {
        return porcentajePagoInicial;
    }

    public void setPorcentajePagoInicial(float porcentajePagoInicial) {
        this.porcentajePagoInicial = porcentajePagoInicial;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    
    //Métodos de Comportamiento
    public float calcularPagoInicial(){
        return getPrecio()*getPorcentajePagoInicial()/100;
    }
    
    public float calcularTotalFinanciar(){
        return getPrecio() - calcularPagoInicial();
    }
    
    public float calcularPagoMensual(){
        return calcularTotalFinanciar()/getPlazo();
    }
}
