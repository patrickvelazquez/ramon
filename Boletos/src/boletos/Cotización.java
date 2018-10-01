/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletos;

/**
 *
 * @author MULTIMEDIA 12
 */
public class Cotización 
{
    private int numeroDeCotizacion;
    private String descripcion;
    private double porcentajeDePagoIncial;
    private double precio;
    private int plazo;
    
    public Cotización()
    {
        this.numeroDeCotizacion = 0;
        String descripcion = this.descripcion;
        double porcentajeDePagoInicial = this.porcentajeDePagoIncial;
        double precio = this.precio;
        this.plazo = 0;
    }
    
    public Cotización(int noDeCotizacion, String des, double porcentajeDePa, double precio, int plazo)
    {
        this.numeroDeCotizacion = noDeCotizacion;
        this.descripcion = des;
        this.porcentajeDePagoIncial = porcentajeDePa;
        this.precio = precio;
        this.plazo = plazo;
    }
    
    public Cotización(Cotización otro)
    {
        this.numeroDeCotizacion=otro.numeroDeCotizacion;
        this.descripcion=otro.descripcion;
        this.porcentajeDePagoIncial=otro.porcentajeDePagoIncial;
        this.numeroDeCotizacion=otro.numeroDeCotizacion;
        this.precio=otro.precio;
    }

    /**
     * @return the numeroDeCotizacion
     */
    public int getNumeroDeCotizacion() {
        return numeroDeCotizacion;
    }

    /**
     * @param numeroDeCotizacion the numeroDeCotizacion to set
     */
    public void setNumeroDeCotizacion(int numeroDeCotizacion) {
        this.numeroDeCotizacion = numeroDeCotizacion;
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
     * @return the porcentajeDePagoIncial
     */
    public double getPorcentajeDePagoIncial() {
        double Inicial = 0.0;
        Inicial = precio*porcentajeDePagoIncial;
        return Inicial;
    }

    /**
     * @param porcentajeDePagoIncial the porcentajeDePagoIncial to set
     */
    public void setPorcentajeDePagoIncial(double porcentajeDePagoIncial) {
        this.porcentajeDePagoIncial = porcentajeDePagoIncial;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
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
}
