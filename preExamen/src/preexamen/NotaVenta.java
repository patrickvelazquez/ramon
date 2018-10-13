/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preexamen;

/**
 *
 * @author Luis Espinoza
 */
public abstract class NotaVenta {
    
    protected int numero;
    protected String fecha;
    protected String concepto;
    protected ProductoPerecedero producto;
    protected float cantidad;
    protected int tipoPago;
    
    public NotaVenta(){
        this.numero=0;
        this.fecha="01-01-200";
        this.concepto="Sin concepto";
        this.producto=null;
        this.cantidad=10;
        this.tipoPago=1;
    }
    public NotaVenta(int numero, String fecha,String concepto, ProductoPerecedero producto, float cantidad, int tipoPago)
    {
        this.numero=numero;
        this.fecha=fecha;
        this.concepto=concepto;
        this.producto=producto;
        this.cantidad=cantidad;
        this.tipoPago=tipoPago;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
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
     * @return the concepto
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * @param concepto the concepto to set
     */
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    /**
     * @return the cantidad
     */
    public float getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the tipoPago
     */
    public int getTipoPago() {
        return tipoPago;
    }

    /**
     * @param tipoPago the tipoPago to set
     */
    public void setTipoPago(int tipoPago) {
        this.tipoPago = tipoPago;
    }

    /**
     * @return the producto
     */
    public ProductoPerecedero getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(ProductoPerecedero producto) {
        this.producto = producto;
    }
    
    public abstract float calcularPago();
    
}
