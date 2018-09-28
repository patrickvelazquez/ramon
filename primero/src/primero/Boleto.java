/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *
 * @author Luis Espinoza
 */
public class Boleto {
    
    private int id;
    private String nombreCliente;
    private float precio;
    private int tipoViaje;
    private String fecha;
    private String destino;
    public Boleto()
    {
        this.id=0;
        this.nombreCliente="";
        this.precio=0.0f;
        this.tipoViaje=0;
        this.destino="";
        this.fecha="";
    }
    public Boleto(int id,String nombre, float precio,int tipo, String fecha, String destino )
    {
        this.id=id;
        this.nombreCliente=nombre;
        this.fecha=fecha;
        this.destino=destino;
        this.precio=precio;
        this.tipoViaje=tipo;
    }
    public Boleto(Boleto otro){
    
        this.destino=otro.destino;
        this.fecha=otro.fecha;
        this.id=otro.id;
        this.nombreCliente=otro.nombreCliente;
        this.precio=otro.precio;
        this.tipoViaje=otro.tipoViaje;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the tipoViaje
     */
    public int getTipoViaje() {
        return tipoViaje;
    }

    /**
     * @param tipoViaje the tipoViaje to set
     */
    public void setTipoViaje(int tipoViaje) {
        this.tipoViaje = tipoViaje;
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
    
    public float calcularSubtotal(){
    float res;
    if(this.tipoViaje==1)
        res=this.precio;
    else
        res=this.precio*1.80f;
    return res;
    }
    public float calcularImpuesto()
    {
        float res;
        res=(float) (this.calcularSubtotal()*0.16);
        return res;
    }
    
    public float calcularDescuento(int edad)
    {
        float res=0.0f;
        if(edad>60)
            res=(float)(this.calcularSubtotal()*0.5f);
        return res;
    }
}

