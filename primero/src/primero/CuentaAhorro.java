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
public class CuentaAhorro {
    private int numero;
    private float saldo;
    private String fechaApertura;
    private String sucursal;
    private String nombreCliente;
    private String domicilioCliente;
    private String fechaNacimiento;
    
    public CuentaAhorro()
    {
        this.domicilioCliente="";
        this.fechaApertura="";
        this.fechaNacimiento="";
        this.nombreCliente="";
        this.numero=0;
        this.saldo=0;
        this.sucursal="";
    }
    public CuentaAhorro(int num, float saldo, String fechaA, String sucursal, String nombre, String domicilio, String fechaN)
    {
        this.domicilioCliente=domicilio;
        this.fechaApertura=fechaA;
        this.fechaNacimiento=fechaN;
        this.nombreCliente=nombre;
        this.numero=num;
        this.saldo=saldo;
        this.sucursal=sucursal;

    }
    public CuentaAhorro(CuentaAhorro otra)
    {
        this.domicilioCliente=otra.domicilioCliente;
        this.fechaApertura=otra.fechaApertura;
        this.fechaNacimiento=otra.fechaNacimiento;
        this.nombreCliente=otra.nombreCliente;
        this.numero=otra.numero;
        this.saldo=otra.saldo;
        this.sucursal=otra.sucursal;
        
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the fechaApertura
     */
    public String getFechaApertura() {
        return fechaApertura;
    }

    /**
     * @param fechaApertura the fechaApertura to set
     */
    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    /**
     * @return the sucursal
     */
    public String getSucursal() {
        return sucursal;
    }

    /**
     * @param sucursal the sucursal to set
     */
    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
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
     * @return the domicilioCliente
     */
    public String getDomicilioCliente() {
        return domicilioCliente;
    }

    /**
     * @param domicilioCliente the domicilioCliente to set
     */
    public void setDomicilioCliente(String domicilioCliente) {
        this.domicilioCliente = domicilioCliente;
    }

    /**
     * @return the fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public boolean aperturar(float cantidad, int edad)
    {
        if(cantidad>=1000 && edad >=18)
            return true;
        else
            return false;
    }
    public void depositar(float cantidad)
    {
        this.saldo=this.saldo+cantidad;
    }
    public boolean retirar(float cantidad)
    {
        if (cantidad<=this.saldo)
            return true;
        else
            return false;
    }
    public float consultarSaldo()
    {
        return this.saldo;
    }
}
