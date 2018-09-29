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
public class Cuenta {
    private String nombreCliente;
    private String domicilio;
    private String fechaNacimiento;
    private int numeroCuenta;
    private float saldo;
    private float cantidad;
    private String fechaApertura;
    private String nombreSucursal;
    
    public Cuenta(){
        this.nombreCliente = "";
        this.domicilio = "";
        this.fechaNacimiento = "";
        this.numeroCuenta = 0;
        this.saldo = 0.0f;
        this.fechaApertura = "";
        this.nombreSucursal = "";
        
    }
    public Cuenta(String nomCl, String domi, String fechaNaci, int numCuenta, 
            float sald,float cant, String fechaApert, String nombreSuc){
        this.nombreCliente = nomCl;
        this.domicilio = domi;
        this.fechaNacimiento = fechaNaci;
        this.numeroCuenta = numCuenta;
        this.saldo = sald;
        this.cantidad = cant;
        this.fechaApertura = fechaApert;
        this.nombreSucursal = nombreSuc;
        
    }
    public Cuenta ( Cuenta otro){
        this.nombreCliente = otro.nombreCliente;
        this.domicilio = otro.domicilio;
        this.fechaNacimiento = otro.fechaNacimiento;
        this.numeroCuenta = otro.numeroCuenta;
        this.saldo = otro.saldo;
        this.cantidad = otro.cantidad;
        this.fechaApertura = otro.fechaApertura;
        this.nombreSucursal = otro.nombreSucursal;
    }
    public String getNombreCliente(){
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }
    public String getDomicilio(){
        return domicilio;
    }
    public void setDomicilio(String domicilio){
        this.domicilio = domicilio;
    }
    public String getFechaNacimiento(){
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    public int getNumeroCuenta(){
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float saldo)       {
        this.saldo = saldo;
    }
    public float getCantidad(){
        return cantidad;
    }
    public void setCantidad(float cantidad){
        this.cantidad = cantidad;
    }
    public String getFechaApertura(){
        return fechaApertura;
    }
    public void setFechaApertura(String fechaApertura){
        this.fechaApertura = fechaApertura;
    }
    public String getNombreSucursal(){
        return nombreSucursal;
    }
    public void setNombreSucursal(String nombreSucursal){
        this.nombreSucursal = nombreSucursal;
    }
}
