/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *
 * @author JOSHYEL
 */
public class Cotizacion {
    private int numCotizacion;
    private String descripcion;
    private int precio;
    private float porcentaje;
    private int plazo;
    
    public Cotizacion()
    {
        this.numCotizacion=1;
        this.descripcion="Ninguna";
        this.precio=0;
        this.porcentaje=0.00f;
        this.plazo=0;
    }
    
    public Cotizacion(int numCoti, String des, int pre, float porc, int pla)
    {
        this.numCotizacion=numCoti;
        this.descripcion=des;
        this.precio=pre;
        this.porcentaje=porc;
        this.plazo=pla;
    }
    
    public Cotizacion(Cotizacion otro)
    {
        this.numCotizacion=otro.numCotizacion;
        this.descripcion=otro.descripcion;
        this.precio=otro.precio;
        this.porcentaje=otro.porcentaje;
        this.plazo=otro.plazo;
    }

    /**
     * @return the numCotizacion
     */
    public int getNumCotizacion() {
        return numCotizacion;
    }

    /**
     * @param numCotizacion the numCotizacion to set
     */
    public void setNumCotizacion(int numCotizacion) {
        this.numCotizacion = numCotizacion;
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
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the porcentaje
     */
    public float getPorcentaje() {
        return porcentaje;
    }

    /**
     * @param porcentaje the porcentaje to set
     */
    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
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
    
    public float calcularPagoIni()
    {
        float pagoInicial=0.0f;
        pagoInicial=precio*porcentaje;
        return pagoInicial;
    }
    
    public float calcularTotalaFin()
    {
        float totalaFin=0.0f, inicial=0.0f;
        inicial=calcularPagoIni();
        totalaFin=precio-inicial;
        return totalaFin;
    }
    
    public float calcularPagoMensual()
    {
        float pagoMensual=0.0f, totalFina=0.0f;
        totalFina=calcularTotalaFin();
        pagoMensual=totalFina/plazo;
        return pagoMensual;
    }
    
}
