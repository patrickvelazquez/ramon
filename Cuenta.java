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
public class Cuenta {
    private int numeroCuenta;
    private String nombreCliente;
    private String domicilio;
    private String fechaNacimiento;
    private float saldo;
    private String fechaApertura;
    private String nombreSucursal;
    
    public Cuenta(){
        //Constructor por Omisión
        this.numeroCuenta = 0;
        this.nombreCliente = "";
        this.domicilio = "";
        this.fechaNacimiento = "";
        this.saldo =  0.0f;
        this.fechaApertura = "";
        this.nombreSucursal = "";
    }
    
    public Cuenta(int n, String c, String d, String f, float s, String a, String sucursal){
        //Constructor por Argumentos
        this.numeroCuenta = n;
        this.nombreCliente = c;
        this.domicilio = d;
        this.fechaNacimiento = f;
        this.saldo = s;
        this.fechaApertura = a;
        this.nombreSucursal = sucursal;
    }
    
    public Cuenta(Cuenta otra){
        //Constructor Copia
        this.numeroCuenta = otra.numeroCuenta;
        this.nombreCliente = otra.nombreCliente;
        this.domicilio = otra.domicilio;
        this.fechaNacimiento = otra.fechaNacimiento;
        this.saldo = otra.saldo;
        this.fechaApertura = otra.fechaApertura;
        this.nombreSucursal = otra.nombreSucursal;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }
    
    //Métodos de Comportamiento
    public boolean crearCuenta(float saldo, int edad){
        if((saldo >= 1000) && edad >= 18)
            return true;
        else
            return false;
    }
    
    public void depositar(float cantidad){
        setSaldo(getSaldo()+cantidad);
    }
    
    public boolean retirar(float cantidad){
        if(cantidad <= getSaldo()){
            setSaldo(getSaldo()- cantidad);
            return true;
        }
        else{
            return false;
        }
    }
    
    public String consultarSaldo(){
        return String.valueOf(getSaldo());
    }
}
