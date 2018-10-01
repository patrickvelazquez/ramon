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
public class Boletos 
{
    private int numeroDelBoleto;
    private int dia;
    private int mes;
    private int año;
    private String nombreDelCliente;
    private String destino;
    private int tipoDeViaje;
    private String fecha;
    private double precio;
    
    public Boletos()
    {
        String destino = this.destino;
        String fecha = this.fecha;
        String nombreDelCliente = this.nombreDelCliente;
        this.numeroDelBoleto = 2035;
        double precio = this.precio;
        this.tipoDeViaje = 0;
    }
    
    public Boletos(int b, String Cliente, String des, int Viaje, String fe, float p)
    {
        this.destino = des;
        this.fecha = fe;
        this.nombreDelCliente = Cliente;
        this.numeroDelBoleto = b;
        this.precio = p;
        this.tipoDeViaje = Viaje;
        this.dia=14;
        this.mes=04;
        this.año=2018;
    }
    
    public Boletos(Boletos otro)
    {
        this.destino=otro.destino;
        this.fecha=otro.fecha;
        this.nombreDelCliente=otro.nombreDelCliente;
        this.numeroDelBoleto=otro.numeroDelBoleto;
        this.precio=otro.precio;
        this.tipoDeViaje=otro.tipoDeViaje;
    }
    
    /**
     * @return the numeroDelBoleto
     */
    public int getNumeroDelBoleto() {
        return numeroDelBoleto;
    }

    /**
     * @param numeroDelBoleto the numeroDelBoleto to set
     */
    public void setNumeroDelBoleto(int numeroDelBoleto) {
        this.numeroDelBoleto = numeroDelBoleto;
    }

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * @return the nombreDelCliente
     */
    public String getNombreDelCliente() {
        return nombreDelCliente;
    }

    /**
     * @param nombreDelCliente the nombreDelCliente to set
     */
    public void setNombreDelCliente(String nombreDelCliente) {
        this.nombreDelCliente = nombreDelCliente;
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
     * @return the tipoDeViaje
     */
    public int getTipoDeViaje() {
        return tipoDeViaje;
    }

    /**
     * @param tipoDeViaje the tipoDeViaje to set
     */
    public void setTipoDeViaje(int tipoDeViaje) {
        this.tipoDeViaje = tipoDeViaje;
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
    
    public String fechaConFormato()
    {
        return getDia()+"/"+getMes()+"/"+getAño();
    }
}
