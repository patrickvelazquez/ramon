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
public class Factura extends NotaVenta {

    protected String rfc;
    protected String nombreCliente;
    protected String domicilioFiscal;
    protected String fechaFacturacion;
    protected float iva;
    
    public Factura(){
        super();
        this.rfc="";
        this.nombreCliente="";
        this.domicilioFiscal="";
        this.fechaFacturacion="";
        this.iva=0;
    }
    public Factura(int numero, String fecha,String concepto, ProductoPerecedero producto, float cantidad, 
            int tipoPago,String rfc, String nombreCliente,String domicilioFiscal, String fechaFacturacion, float iva)
    {
        super(numero,fecha,concepto,producto,cantidad,tipoPago);
        this.rfc=rfc;
        this.nombreCliente=nombreCliente;
        this.domicilioFiscal=domicilioFiscal;
        this.fechaFacturacion=fechaFacturacion;
        this.iva=iva;
    }
    
    @Override
    public float calcularPago() {
       return cantidad * producto.calcularPrecio();

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
     * @return the domicilioFiscal
     */
    public String getDomicilioFiscal() {
        return domicilioFiscal;
    }

    /**
     * @param domicilioFiscal the domicilioFiscal to set
     */
    public void setDomicilioFiscal(String domicilioFiscal) {
        this.domicilioFiscal = domicilioFiscal;
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
        return this.calcularPago()*(this.iva/100);
    }
    public float calcularTotal(){
        return this.calcularPago()+this.calcularImpuesto();
    }
    
    
}
