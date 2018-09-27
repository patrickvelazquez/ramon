package Cuarto;

import static javafx.beans.binding.Bindings.and;

public class cuentaBanco 
{
    private int diaA,mesA,añoA,diaN,mesN,añoN,edad;
    private float importe,saldo;
    private String nombre,domicilio,nombreSucursal,numeroCelular;
    
    public cuentaBanco()
    {
        this.añoA=2018;
        this.añoN=2000;
        this.diaA=19;
        this.diaN=8;
        this.domicilio="Mazatlán";
        this.importe=3000;
        this.mesA=4;
        this.mesN=10;
        this.nombre="Marco";
        this.nombreSucursal="UPSIN";
        this.numeroCelular="6692254419";
        this.saldo=3000;
        this.edad=18;
    }
    
    public cuentaBanco(int edad,int diaA,int mesA, int añoA,int diaN,int mesN,int añoN,float importe,float saldo, String nombre, String domicilio,String nombreSucursal,String numeroCelular)
    {
        this.añoA=añoA;
        this.añoN=añoN;
        this.diaA=diaA;
        this.diaN=diaN;
        this.domicilio=domicilio;
        this.importe=importe;
        this.mesA=mesA;
        this.mesN=mesN;
        this.nombre=nombre;
        this.nombreSucursal=nombreSucursal;
        this.numeroCelular=numeroCelular;
        this.saldo=saldo;
        this.edad=edad;
    }
    
    public cuentaBanco(cuentaBanco nuevoCliente)
    {
        this.añoA=nuevoCliente.añoA;
        this.añoN=nuevoCliente.añoN;
        this.diaA=nuevoCliente.diaA;
        this.diaN=nuevoCliente.diaN;
        this.domicilio=nuevoCliente.domicilio;
        this.importe=nuevoCliente.importe;
        this.mesA=nuevoCliente.mesA;
        this.mesN=nuevoCliente.mesN;
        this.nombre=nuevoCliente.nombre;
        this.nombreSucursal=nuevoCliente.nombreSucursal;
        this.numeroCelular=nuevoCliente.numeroCelular;
        this.saldo=nuevoCliente.saldo; 
        this.edad=nuevoCliente.edad;
    }

    /**
     * @return the diaA
     */
    public int getDiaA() {
        return diaA;
    }

    /**
     * @param diaA the diaA to set
     */
    public void setDiaA(int diaA) {
        this.diaA = diaA;
    }

    /**
     * @return the mesA
     */
    public int getMesA() {
        return mesA;
    }

    /**
     * @param mesA the mesA to set
     */
    public void setMesA(int mesA) {
        this.mesA = mesA;
    }

    /**
     * @return the añoA
     */
    public int getAñoA() {
        return añoA;
    }

    /**
     * @param añoA the añoA to set
     */
    public void setAñoA(int añoA) {
        this.añoA = añoA;
    }

    /**
     * @return the diaN
     */
    public int getDiaN() {
        return diaN;
    }

    /**
     * @param diaN the diaN to set
     */
    public void setDiaN(int diaN) {
        this.diaN = diaN;
    }

    /**
     * @return the mesN
     */
    public int getMesN() {
        return mesN;
    }

    /**
     * @param mesN the mesN to set
     */
    public void setMesN(int mesN) {
        this.mesN = mesN;
    }

    /**
     * @return the añoN
     */
    public int getAñoN() {
        return añoN;
    }

    /**
     * @param añoN the añoN to set
     */
    public void setAñoN(int añoN) {
        this.añoN = añoN;
    }

    /**
     * @return the importe
     */
    public float getImporte() {
        return importe;
    }

    /**
     * @param importe the importe to set
     */
    public void setImporte(float importe) {
        this.importe = importe;
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
     * @return the nombreSucursal
     */
    public String getNombreSucursal() {
        return nombreSucursal;
    }

    /**
     * @param nombreSucursal the nombreSucursal to set
     */
    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    /**
     * @return the numeroCelular
     */
    public String getNumeroCelular() {
        return numeroCelular;
    }

    /**
     * @param numeroCelular the numeroCelular to set
     */
    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
    
    public void hacerDeposito(float deposito)
    {
        this.saldo+=deposito;   
    }
    
    public boolean hacerRetiro(float retiro) 
    {
        boolean retiroExitoso=false;
        if(retiro<=saldo)
        {
            saldo-=retiro;
            retiroExitoso = true;
        }
        return retiroExitoso;
    }
    public boolean aperturaCuenta(float importe,int edad)
    {
        if(edad>=18)
        {
            if(importe>=1000)
                return true;
            else
                return false; 
        }
        else
        {
            return false;
        }
    }   
    public String fechaApertura()
    {
        return diaA + "/" + mesA + "/" + añoA;
    }   
     public String fechaNacimiento()
    {
        return diaN + "/" + mesN + "/" + añoN;
    }
    public String informacionCliente()
    {
        return "Nombre:"+nombre+"  Domicilio: "+domicilio+" Nacimiento: "+fechaNacimiento()+"  Edad: " + edad+"\nNúmero de Celular: "+numeroCelular;
    }
    
    public String informacionCuenta()
    {
        return "Fecha de apertura: "+fechaApertura()+" Sucursal: "+nombreSucursal+" Saldo: $"+saldo;
    }
}
