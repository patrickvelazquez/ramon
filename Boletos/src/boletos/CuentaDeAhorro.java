/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletos;

/**
 *
 * @author software 19
 */
public class CuentaDeAhorro 
{
    private String nombreDelCliente;
    private String domicilio;
    private String fechaDeNacimiento;
    private String fechaDeApertura=this.fechaDeApertura;
    private String nombreDeLaSucursal=this.nombreDeLaSucursal;
    private double saldo;
    private double nuevoSaldo;
    private double retiro;
    private int numero;
    private int dia;
    private int mes;
    private int año;
    private int añoNacimiento;
    
    
    public CuentaDeAhorro()
    {
    //Constructor por omision
    String nombreDelCliente=this.nombreDelCliente;
    String domicilio=this.domicilio;
    String fechaDeNacimiento=this.fechaDeNacimiento;
    String fechaDeApertura=this.fechaDeApertura;
    String nombreDeLaSucursal=this.nombreDeLaSucursal;
    this.numero=1;
    this.saldo=8763;
    this.nuevoSaldo=1;
    this.retiro=0;
    this.dia=14;
    this.mes=04;
    this.año=2018;
    this.añoNacimiento=1;
    }
    public CuentaDeAhorro(String n, String d, String nacimiento,int num, double saldo, double nSaldo, String apertura
        ,String sucursal, int dia, int mes, int año, int añoN, double retiro)
    {
        //Constructor con argumentos
        this.nombreDelCliente=n;
        this.domicilio=d;
        this.fechaDeNacimiento=nacimiento;
        this.numero=num;
        this.saldo=saldo;
        this.nuevoSaldo=nSaldo;
        this.fechaDeApertura=apertura;
        this.nombreDeLaSucursal=sucursal;
        this.dia=dia;
        this.mes=mes;
        this.año=año;
        this.añoNacimiento=añoN;
        this.retiro=retiro;
    }
    public CuentaDeAhorro(CuentaDeAhorro otro)
    {
        //Constructor copia
        this.nombreDelCliente=otro.nombreDelCliente;
        this.domicilio=otro.domicilio;
        this.fechaDeNacimiento=otro.fechaDeNacimiento;
        this.nombreDelCliente=otro.nombreDelCliente;
        this.saldo=otro.saldo;
        this.nuevoSaldo=otro.nuevoSaldo;
        this.fechaDeApertura=otro.fechaDeApertura;
        this.nombreDeLaSucursal=otro.nombreDeLaSucursal;
        this.dia=otro.dia;
        this.mes=otro.mes;
        this.año=otro.año;
        this.añoNacimiento=otro.añoNacimiento;
        this.retiro=otro.retiro;
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
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the fechaDeNacimiento
     */
    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    /**
     * @param fechaDeNacimiento the fechaDeNacimiento to set
     */
    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    /**
     * @return the fechaDeApertura
     */
    public String getFechaDeApertura() {
        return fechaDeApertura;
    }

    /**
     * @param fechaDeApertura the fechaDeApertura to set
     */
    public void setFechaDeApertura(String fechaDeApertura) {
        this.fechaDeApertura = fechaDeApertura;
    }

    /**
     * @return the nombreDeLaSucursal
     */
    public String getNombreDeLaSucursal() {
        return nombreDeLaSucursal;
    }

    /**
     * @param nombreDeLaSucursal the nombreDeLaSucursal to set
     */
    public void setNombreDeLaSucursal(String nombreDeLaSucursal) {
        this.nombreDeLaSucursal = nombreDeLaSucursal;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the nuevoSaldo
     */
    public double getNuevoSaldo() {
        return nuevoSaldo;
    }

    /**
     * @param nuevoSaldo the nuevoSaldo to set
     */
    public void setNuevoSaldo(double nuevoSaldo) {
        this.nuevoSaldo = nuevoSaldo;
    }

    /**
     * @return the retiro
     */
    public double getRetiro() {
        return retiro;
    }

    /**
     * @param retiro the retiro to set
     */
    public void setRetiro(double retiro) {
        this.retiro = retiro;
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
     * @return the añoNacimiento
     */
    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    /**
     * @param añoNacimiento the añoNacimiento to set
     */
    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }
    
    public String fechaConFormato()
    {
        return getDia()+"/"+getMes()+"/"+getAño();
    }
    public String fechaNacimiento()
    {
        return getDia()+"/"+getMes()+"/"+getAñoNacimiento();    
    }
    public String fechaDeApertura()
    {
        return getDia()+"/"+getMes()+"/"+getAño();    
    }
    public int edad()
    {
        int edad;
        edad=getAño()-getAñoNacimiento();
        return edad;
    }
    public float Depositos()
    {
        float depositos = 0;
        depositos=(float) (getSaldo()+getNuevoSaldo());
        return depositos;
    }
    public float Retiros ()
    {
        float saldoP=0;
        saldoP=(float)(getSaldo()-getRetiro());
        return saldoP;
    }
}