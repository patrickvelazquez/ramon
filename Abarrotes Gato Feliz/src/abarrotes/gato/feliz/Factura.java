/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abarrotes.gato.feliz;

/**
 *
 * @author Drago
 */
public class Factura extends NotaVenta {

    private String rfc;
    private String nombreCliente;
    private String domicilioFiscal;
    private String fechaFactura;
    private float iva;
    
    public Factura(){
        super();
        this.rfc = "";
        this.nombreCliente = "N/A";
        this.domicilioFiscal = "N/A";
        this.fechaFactura = "N/A";
        this.iva = 0.0f;
    }
    
    public Factura(int numero, String fecha, String concepto, Perecedero producto, float cantidad, int tipoPago, String rfc, String nombreCliente, String domicilioFiscal, String fechaFactura, float iva){
        super(numero,fecha,concepto,producto,cantidad,tipoPago);
        this.rfc = rfc;
        this.nombreCliente = nombreCliente;
        this.domicilioFiscal = domicilioFiscal;
        this.fechaFactura = fechaFactura;
        this.iva = iva;
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
     * @return the fechaFactura
     */
    public String getFechaFactura() {
        return fechaFactura;
    }

    /**
     * @param fechaFactura the fechaFactura to set
     */
    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
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
    
    @Override
    public float calcularPago() {
        return cantidad * producto.calcularPrecio();
    }
    
    public float calcularImpuesto(){
        return calcularPago() * (iva/100);
    }
    
    public float calcularTotal(){
        return calcularPago() + calcularImpuesto();
    }
}
