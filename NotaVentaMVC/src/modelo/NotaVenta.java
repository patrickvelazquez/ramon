/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Kenneth Stoney Wilson Herrera
 */
public class NotaVenta {
    protected int numero;
    protected String fecha;
    protected String concepto;
    protected Perecedero producto;
    protected float cantidad;
    protected int tipoPago;
    
    public NotaVenta()
    { 
        this.numero = 0;
        this.fecha = "01-01-2000";
        this.concepto = "Sin concepto.";
        this.producto = null;
        this.cantidad = 0.0f;
        this.tipoPago = 1;
    }
    
    public NotaVenta(int numero, String fecha, String concepto, Perecedero producto, float cantidad, int tipoPago)
    { 
        this.numero = numero;
        this.fecha = fecha;
        this.concepto = concepto;
        this.producto = producto;
        this.cantidad = cantidad;
        this.tipoPago = tipoPago;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Perecedero getProducto() {
        return producto;
    }

    public void setProducto(Perecedero producto) {
        this.producto = producto;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public int getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(int tipoPago) {
        this.tipoPago = tipoPago;
    }
    
    public float calcularPago()
    {
        return getCantidad()*getProducto().calcularPrecio();
    }
    
}
