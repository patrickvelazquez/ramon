/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *
 * @author Samantha
 */
public class Cotizacion {
    
    private int numero;
    private String descripción;
    private float porcentaje;
    private int plazo;
    private float precio;
    
    public Cotizacion(){
        this.numero=82198;
        this.precio=234000;
        this.descripción="Rojo, grande y bonito";
        this.porcentaje=10;
        this.plazo=12;
    }
    
    public Cotizacion(int n, String d, float pr, float p, int pl){
        this.numero=n;
        this.descripción=d;
        this.precio=pr;
        this.porcentaje=p;
        this.plazo=pl;
    }
    
    public Cotizacion(Cotizacion otro){
        this.numero=otro.numero;
        this.descripción=otro.descripción;
        this.precio=otro.precio;
        this.porcentaje=otro.porcentaje;
        this.plazo=otro.plazo;
        
    }
    
    public void setNumero(int n){
        this.numero=n;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setDescripción(String d){
        this.descripción=d;
    }
    
    public String getDescripción(){
        return descripción;
    }
    
    public void setPorcentaje(float p){
        this.porcentaje=p;
    }
    
    public float getPorcentaje(){
        return porcentaje;
    }
    
    public void setPlazo(int p){
        this.plazo=p;
    }
    
    public int getPlazo(){
        return plazo;
    }
    
    public void setPrecio(float p){
        this.precio=p;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public float calcularPagoInicial(){
       float p;
       
       p=precio*porcentaje;
       return p;
    }
    
    public float calcularTotal(){
        float t;
        
        t=precio-calcularPagoInicial();
        return t;
    }
    
    public float calcularPagoMensual(){
        return calcularTotal()/getPlazo();
    }
}
