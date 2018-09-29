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
public class Cotizacion {
    private int numeroCoti;
    private String descrip;
    private float precio;
    private float porcentajePrecio;
    private int plazo; 
    
  public Cotizacion(){
      this.numeroCoti = 0;
      this.descrip = "";
      this.precio = 0;
      this.porcentajePrecio = 0;
      this.plazo = 0;
  }
      public Cotizacion (int num, String descr, float pre, float porcent, int plaz){
          this.numeroCoti = num;
          this.descrip = descr;
          this.precio = pre;
          this.porcentajePrecio = porcent;
          this.plazo = plaz;
      } 
      public Cotizacion (Cotizacion otro){
          this.numeroCoti = otro.numeroCoti;
          this.descrip = otro.descrip;
          this.precio = otro.precio;
          this.porcentajePrecio = otro.porcentajePrecio;
          this.plazo = otro.plazo;
      }
      public int getNumeroCoti(){
          return numeroCoti;
      }
      public void setNumeroCoti(int numeroCoti){
          this.numeroCoti = numeroCoti;
      }
      public String getDescrip(){
          return descrip;
      }
      public void setDescrip(String descrip){
          this.descrip = descrip;
      }
      public float getPrecio(){
          return precio;
      }
      public void setPrecio(float precio){
          this.precio = precio;
      }
      public float getPorcentajePrecio(){
          return porcentajePrecio;
      }
      public void setPorcentajePrecio(float porcentajePrecio){
          this.porcentajePrecio = porcentajePrecio;
      }
      public int getPlazo(){
          return plazo;
      }
      public void setPlazo(int plazo){
          this.plazo = plazo;
      }
  }
    

