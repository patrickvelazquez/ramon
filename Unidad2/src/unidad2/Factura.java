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
public class Factura extends NotaVenta
{
    protected String rfc;
    protected String nombreCliente;
    protected String domicilio;
    protected String fechaFacturacion;
    protected float iva;
    
    public Factura()
    {
        super();
        this.rfc="LESS9910";
        this.domicilio="Bumbel Gluiop";
        this.nombreCliente="Samara P.";
        this.fechaFacturacion="11/10/2018";
        this.iva=0.0f;
    }
    
    public Factura(int num, String fec, String con, ProductoPerecedero prod, float can, int tip, String rf, String no, String dom, String fe, float iv)
    {
        super(num, fec, con, prod, can, tip);
        this.rfc=rf;
        this.nombreCliente=no;
        this.domicilio=dom;
        this.fechaFacturacion=fe;
        this.iva=iv;
    }

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the fechaFacturacion
     */
    public String getFechaFacturacion() {
        return fechaFacturacion;
    }

    /**
     * @param fechaFacturacion the fechaFacturacion to set
     */
    public void setFechaFacturacion(String fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    /**
     * @return the iva
     */
    public float getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(float iva) {
        this.iva = iva;
    }
    
    public float calcularImpuesto(){
        return this.calcularPago()*(this.getIva()/100);
    }
    
    public float calcularTotal(){
        return this.calcularPago()+this.calcularImpuesto();
    }    
    
    @Override
    public float calcularPago()
    {
        return cantidad*producto.calcularPrecio();
    }
       
}
