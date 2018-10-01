/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *
 * @author SAMANTHA
 */
public class Cuenta {
    
    private String cliente;
    private String domicilio;
    private String fechaNacimiento;
    private int numero;
    private float saldo;
    private String sucursal;
    
    public Cuenta(){
        this.cliente="Samantha";
        this.domicilio="Villa del Sol";
        this.fechaNacimiento="19/10/1999";
        this.numero=82198;
        this.saldo=20000;
        this.sucursal="Sendero";
    }
    
    public Cuenta(String c, String d, String f, int n, float s, String su){
        this.cliente=c;
        this.domicilio=d;
        this.fechaNacimiento=f;
        this.numero=n;
        this.saldo=s;
        this.sucursal=su;
    }
    
    public Cuenta(Cuenta otro){
        this.cliente=otro.cliente;
        this.domicilio=otro.domicilio;
        this.fechaNacimiento=otro.fechaNacimiento;
        this.numero=otro.numero;
        this.saldo=otro.saldo;
        this.sucursal=otro.sucursal;
    }
    
    public void setCliente(String c){
        this.cliente=c;
    }
    
    public String getCliente(){
        return cliente;
    }
    
    public void setDomicilio(String d){
        this.domicilio=d;
    }
    
    public String getDomicilio(){
        return domicilio;
    }
    
    public void setFechaNacimiento(String f){
        this.fechaNacimiento=f;
    }
    
    public String getFechaNacimiento(){
        return fechaNacimiento;
    }
    
    public void setNumero(int n){
        this.numero=n;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setSaldo(float s){
        this.saldo=s;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public String getSucursal(){
        return sucursal;
    }
    public void setSucursal(String s){
        this.sucursal=s;
    }
    
    public boolean permitirApertura(float c, int e){
        if(c>=10000 && e>18)
            return true;
        else
            return false;
    }
    
    public void recibirDeposito(float c){
        setSaldo(getSaldo()+c);
    }
    
    public void retirar(float c){
        if(c<=getSaldo())
        {
            setSaldo(getSaldo()-c);
        }
    }
}
