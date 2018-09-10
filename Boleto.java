/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicial;

/**
 *
 * @author patrickMac
 */
public class Boleto { 
    private int idBoleto;
    private String nombreCliente;
    private String destino;
    private int tipo;
    private float precio;
    
    public Boleto(){
    this.idBoleto=0;
    this.nombreCliente="";
    this.destino="";
    this.tipo=0;
    this.precio=0.0f;
    }
    
}
