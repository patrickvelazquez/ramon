
package Tercero;

public class cotizacionAutomovil 
{
    private int numeroCotizacion;
    private String descripcionAutomovil;
    private float costo;
    private float porcentajePagoInicial;
    private int plazo;
    
    public cotizacionAutomovil()
    {
        this.costo=220000;
        this.descripcionAutomovil="Yaris_Sx";
        this.numeroCotizacion=123;
        this.plazo=36;
        this.porcentajePagoInicial=(float) 0.25;
    }
    
    public cotizacionAutomovil(int numeroCotizacion, String descripcionAutomovil,float costo,float porcentajePagoInicial,int plazo)
    {
        this.costo=costo;
        this.descripcionAutomovil=descripcionAutomovil;
        this.numeroCotizacion=numeroCotizacion;
        this.plazo=plazo;
        this.porcentajePagoInicial=porcentajePagoInicial;
    }
    
    public cotizacionAutomovil(cotizacionAutomovil nuevo)
    {
        this.costo=nuevo.costo;
        this.descripcionAutomovil=nuevo.descripcionAutomovil;
        this.numeroCotizacion=nuevo.numeroCotizacion;
        this.plazo=nuevo.plazo;
        this.porcentajePagoInicial=nuevo.plazo;
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
     * @return the descripcionAutomovil
     */
    public String getDescripcionAutomovil() {
        return descripcionAutomovil;
    }

    /**
     * @param descripcionAutomovil the descripcionAutomovil to set
     */
    public void setDescripcionAutomovil(String descripcionAutomovil) {
        this.descripcionAutomovil = descripcionAutomovil;
    }

    /**
     * @return the costo
     */
    public float getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(float costo) {
        this.costo = costo;
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
    
    public float calcularPagoInicial()
    {
        return (float) (costo*porcentajePagoInicial);
    }
    
    public float pagoMensual()
    {
        return (float) (totalFin()/plazo);      
    }
    
    public float totalFin()
    {
        return (float) (costo-calcularPagoInicial());
    }     
    
    public String datosCompra()
    {
        return "Número de cotización:" + numeroCotizacion + "\nDescripción del automovil: "+descripcionAutomovil+"\nCosto: $"+costo+"\nPlazo: "+plazo+" meses\nPago inicial: $"+calcularPagoInicial()+"\nTotal a pagar: $"+totalFin()+"\nPago mensual: $"+pagoMensual()+"\nPorcentaje inicial: "+porcentajePagoInicial;
    }
}
