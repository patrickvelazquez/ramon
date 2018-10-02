/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import javax.swing.JOptionPane;
/**
 *
 * @author Konakun
 */
public class CuentaAhorro {
    private int numeroDeCuenta;
    private String nombre;
    private String fechaDeNacimiento;
    private String domicilio;
    private float saldo;
    private String fechaDeApertura;
    private String sucursalDeBanco;
    
    public CuentaAhorro(){
        this.numeroDeCuenta = 0;
        this.nombre = "N/A";
        this.fechaDeNacimiento = "1/01/2000";
        this.domicilio = "N/A";
        this.saldo = 0.0f;
        this.fechaDeApertura = "1/01/2000";
        this.sucursalDeBanco = "N/A";
    }
    
    public CuentaAhorro(int numeroDeCuenta, String nombre, String fechaDeNacimiento, String domicilio, float saldo, String fechaDeApertura, String sucursalDeBanco){
        this.numeroDeCuenta = numeroDeCuenta;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.domicilio = domicilio;
        this.saldo = saldo;
        this.fechaDeApertura = fechaDeApertura;
        this.sucursalDeBanco = sucursalDeBanco;
    }
    
    public CuentaAhorro(CuentaAhorro otro){
        this.numeroDeCuenta = otro.numeroDeCuenta;
        this.nombre = otro.nombre;
        this.fechaDeNacimiento = otro.fechaDeNacimiento;
        this.domicilio = otro.domicilio;
        this.saldo = otro.saldo;
        this.fechaDeApertura = otro.fechaDeApertura;
        this.sucursalDeBanco = otro.sucursalDeBanco;
    }

    /**
     * @return the numeroDeCuenta
     */
    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    /**
     * @param numeroDeCuenta the numeroDeCuenta to set
     */
    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
     * @return the sucursalDeBanco
     */
    public String getSucursalDeBanco() {
        return sucursalDeBanco;
    }

    /**
     * @param sucursalDeBanco the sucursalDeBanco to set
     */
    public void setSucursalDeBanco(String sucursalDeBanco) {
        this.sucursalDeBanco = sucursalDeBanco;
    }
    
    public void depositoDeEfectivo(float montoDeEfectivo){
        this.saldo = saldo + montoDeEfectivo;
        JOptionPane.showMessageDialog(null, "Saldo en cuenta: $" + saldo);
    }
    
    public void retiroDeEfectivo(float montoDeEfectivo){
        if(montoDeEfectivo < saldo){
            this.saldo = saldo - montoDeEfectivo;
            JOptionPane.showMessageDialog(null, "Se ha retirado $" + montoDeEfectivo + "\nQueda en cuenta: $" + saldo);
        }
        else{
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
        }
    }
    
    public String consultaDeSaldo(){
        String saldoRestante = "";
        saldoRestante = "Su saldo es :$" + saldo;
        return saldoRestante;
    }
    
    public boolean aperturaCuenta(int edad, float montoDeEfectivo){
        boolean confirmacion = false;
        if(edad >= 18 && montoDeEfectivo >= 1000.0f){
            confirmacion = true;
        }
        return confirmacion;
    }
}
