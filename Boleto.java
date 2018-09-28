/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *
 * @author Kennyswh
 */
public class Boleto {
    private int numero;
    private String nombreCliente;
    private String destino;
    private String tipoViaje;
    private float precio;
    private String fecha;

    public Boleto(){
        //Constructor por Omisión
        this.numero = 0;
        this.nombreCliente = "";
        this.destino = "";
        this.tipoViaje = "";
        this.precio =  0.0f;
        this.fecha = "";
    }
    public Boleto(int n, String nombreC, String d, String v, float p, String f){
        //Constructor por Argumentos
        this.numero = n;
        this.nombreCliente = nombreC;
        this.destino = d;
        this.tipoViaje = v;
        this.precio = p;
        this.fecha = f;
    }
    public Boleto(Boleto otro){
        //Constructor Copia
        this.numero = otro.numero;
        this.nombreCliente = otro.nombreCliente;
        this.destino = otro.destino;
        this.tipoViaje = otro.tipoViaje;
        this.precio = otro.precio;
        this.fecha = otro.fecha;
    }
    //Getter & Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    //Metodos de Comportamiento
    public void definirTipoBoleto(int e, float precio){
        if(e == 1){
            setTipoViaje("1: Sencillo");
            setPrecio(precio);
        }
        else if(e == 2){
            setTipoViaje("2: Premium");
            setPrecio(precio * 1.8F);
        }
    }
    public float calcularImpuesto(){
        return getPrecio() * 0.16F;
    }

    public float calcularDescuento(int edad){
        if(edad > 60){
            return getPrecio() * 0.5F;
        }
        else{
            return 0;
        }
    }

    public String imprimirBoleto(){
        return "No. " + String.valueOf(getNumero()) + "\nNombre: " + getNombreCliente() + "\nDestino: " + getDestino()
                + "\nTipo de Viaje: " + getTipoViaje() + "\nPrecio: " + getPrecio() + "\nFecha: "
                + getFecha();
    }
}
