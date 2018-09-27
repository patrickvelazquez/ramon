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
public class Boleto {
    private int noBoleto;
    private String nomCliente;
    private String destino;
    private int tipo;
    private float precio;
    private String fecha;
    
    public Boleto()
    {
        this.noBoleto=1;
        this.nomCliente="Guillermo";
        this.destino="Guasave";
        this.tipo=1;
        this.precio=495.00f;
        this.fecha="21/09/2018";
    }
    public Boleto(int noBol, String cliente, String dest, int tipo, float prec, String fecha)
    {
        this.noBoleto=noBol;
        this.nomCliente=cliente;
        this.destino=dest;
        this.tipo=tipo;
        this.precio=prec;
        this.fecha=fecha;
    }
    public Boleto(Boleto otro)
    {
        this.noBoleto=otro.noBoleto;
        this.nomCliente=otro.nomCliente;
        this.destino=otro.destino;
        this.tipo=otro.tipo;
        this.precio=otro.precio;
        this.fecha=otro.fecha;
    }

    /**
     * @return the noBoleto
     */
    public int getNoBoleto() {
        return noBoleto;
    }

    /**
     * @param noBoleto the noBoleto to set
     */
    public void setNoBoleto(int noBoleto) {
        this.noBoleto = noBoleto;
    }

    /**
     * @return the nomCliente
     */
    public String getNomCliente() {
        return nomCliente;
    }

    /**
     * @param nomCliente the nomCliente to set
     */
    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
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
    
    public float calcularSubTotal()
    {
        float subtotal = 0.0f, aumento=0.0f;
        subtotal=precio;
        final float PORCENTAJE = 0.80f;
        //tipo 1 igual al precio, si es tipo 2 es el precio mas el 80%
        if(tipo==2)
        {
           aumento=precio*PORCENTAJE;
           subtotal+=aumento;
        }
        return subtotal;
    }
    
    public float calcularImpuesto()
    {
        float impuesto = 0.0f, subtotal=0.0f;
        final float IVA = 0.16f;
        //el impuesto es de 16%
        subtotal=calcularSubTotal();
        impuesto=subtotal*IVA;
        return impuesto;
    }
    
    public float calcularDescuento(int edad)
    {
        float descuento =0.0f, subtotal=0.0f;
        final float DECREMENTO = 0.50f;
        if(edad>=60)
        {
            subtotal=calcularSubTotal();
            descuento=subtotal*DECREMENTO;
        }
        //de la tercera edad mas de 60 un 50% 
        return descuento;
    }
    
    public float calcularTotalPagar(float descuento)
    {
        float totalpagar=0f, impuesto=0.0f, subtotal=0.0f;
        subtotal=calcularSubTotal();
        impuesto=calcularImpuesto();
        totalpagar=(subtotal+impuesto)-descuento;
        return totalpagar;
    }
}
