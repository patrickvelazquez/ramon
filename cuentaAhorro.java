/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *
 * @author JOSHYEL
 */
public class cuentaAhorro {
    private String nombre;
    private String domicilio;
    private String fechaNacimiento;
    private int numCuenta;
    private double saldo;
    private String fechaApertura;
    private String nomSucursal;
    
    public cuentaAhorro()
    {
        this.nombre="Ninguno";
        this.domicilio="Ninguno";
        this.fechaNacimiento="00/00/0000";
        this.numCuenta=0;
        this.saldo=0.0;
        this.fechaApertura="00/00/0000";
        this.nomSucursal="Banamex";
    }
    
    public cuentaAhorro(String name, String domi, String nacim, int cuenta, double sald, String apert, String sucur)
    {
        this.nombre=name;
        this.domicilio=domi;
        this.fechaNacimiento=nacim;
        this.numCuenta=cuenta;
        this.saldo=sald;
        this.fechaApertura=apert;
        this.nomSucursal=sucur;
    }
    
    public cuentaAhorro(cuentaAhorro copy)
    {
        this.nombre=copy.nombre;
        this.domicilio=copy.domicilio;
        this.fechaNacimiento=copy.fechaNacimiento;
        this.numCuenta=copy.numCuenta;
        this.saldo=copy.saldo;
        this.fechaApertura=copy.fechaApertura;
        this.nomSucursal=copy.nomSucursal;
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

    /**
     * @return the numCuenta
     */
    public int getNumCuenta() {
        return numCuenta;
    }

    /**
     * @param numCuenta the numCuenta to set
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
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
     * @return the nomSucursal
     */
    public String getNomSucursal() {
        return nomSucursal;
    }

    /**
     * @param nomSucursal the nomSucursal to set
     */
    public void setNomSucursal(String nomSucursal) {
        this.nomSucursal = nomSucursal;
    }
    
    public boolean isMayorEdad()
    {
        boolean mayor=false;
        String comparar = "2000";
        String[] partes=fechaNacimiento.split("/");
        String año = partes[2];
        int fecha = Integer.parseInt(año);
        int comFecha = Integer.parseInt(comparar);
        if(fecha<comFecha)
        {
           mayor=true; 
        }
        return mayor;
    }
    public void depositarDinero(double cantidad)
    {
        this.saldo+=cantidad;
    }
    
    public boolean isRetirarDinero(double cantidad)
    {
        boolean exito=false;
        if(cantidad<=saldo)
        {
            saldo-=cantidad;
            exito=true;
        }
        return exito;
    }
    
    public void consultarSaldo()
    {
        System.out.println("El saldo acutal es de " + saldo);
    }
}
