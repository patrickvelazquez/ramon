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
public class Factura extends NotaVenta {
    private String rfc;
    private String nombre;
    private String domFiscal;
    private String fechaFactura;
    private float iva;
    
    public Factura()
    {
        super();
        this.rfc = "";
        this.nombre = "";
        this.domFiscal = "";
        this.fechaFactura = "";
        this.iva = 0.0f;
    }
    
    public Factura(int numero, String fecha, String concepto, Perecedero producto, float cantidad, int tipoPago, String rfc, String nombre, String domFiscal, String fechaFactura, float iva)
    {
        super(numero, fecha, concepto, producto, cantidad, tipoPago);
        this.rfc = rfc;
        this.nombre = nombre;
        this.domFiscal = domFiscal;
        this.fechaFactura = fecha;
        this.iva = iva;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomFiscal() {
        return domFiscal;
    }

    public void setDomFiscal(String domFiscal) {
        this.domFiscal = domFiscal;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }
    
    public float calcularImpuesto()
    {
        return calcularPago() * (getIva() /100);
    }
    
    public float calcularTotal()
    {
        return calcularPago() + calcularImpuesto();
    }
}
