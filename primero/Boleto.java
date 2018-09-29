/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *
 * @author Cicely
 */
public class Boleto {
    private int numero;
    private String nombreCliente;
    private int edad;
    private float precio;
    private String tipoViaje;
    private String fecha;
    private String destino;        

public Boleto(){
this.numero =0;
this.nombreCliente = " ";
this.edad = 0;
this.precio = 0.0f;
this.tipoViaje = "";
this.fecha = "";
this.destino = "";

}
public Boleto(int num, String nomCl, int ed, float prec, String tV, String fch, String dstn){
    this.numero = num;
    this.nombreCliente = nomCl;
    this.edad = ed;
    this.precio = prec;
    this.tipoViaje = tV;
    this.fecha = fch;
    this.destino = dstn;
}
public Boleto (Boleto otro){
    this.numero = otro.numero;
    this.nombreCliente = otro.nombreCliente;
    this.edad = otro.edad;
    this.precio = otro.precio;
    this.tipoViaje = otro.tipoViaje;
    this.fecha = otro.fecha;
    this.destino = otro.destino;
}
public int getNumero(){ 
    return numero;
}
public void setNumero(int numero){
    this.numero = numero;
}
public String getNombreCliente(){
    return nombreCliente;
}
public void setNombreCliente(String nombreCliente){
    this.nombreCliente = nombreCliente;
}
public int getEdad(){
    return edad;
}
public void setEdad(int edad){
    this.edad = edad;
}
public float getPrecio(){
    return precio;
}
public void setPrecio(float precio){
    this.precio = precio;
}
public String tipoViaje(){
    return tipoViaje;
}
public void setTipoViaje(String tipoViaje){
    this.tipoViaje = tipoViaje;
}
public String fecha(){
    return fecha;
}
public void setFecha(String fecha){
    this.fecha = fecha;
}
public String getDestino(){
    return destino; 
}
public void setDestino(String destino){
    this.destino = destino;
}

/*public int descuento(){
    if(edad > 60){
        descuento = 
    }*/
}
