package programa1;

public class CuentaBanco {

    private String nombreCliente;
    private String domicilio;
    private String fechaNacimiento;
    private String fechaApertura;
    private String sucursal;
    private float saldo;
    private int numCueta;



    public CuentaBanco()
    {
        this.nombreCliente = "Carlos";
        this.domicilio = "Calle 1";
        this.fechaNacimiento = "25/09/1999";
        this.fechaApertura = "26/06/2018";
        this.sucursal = "Santander";
        this.saldo = 0.0f;
        this.numCueta = 0;
    }

    public CuentaBanco(int numCueta, int monto, String sucursal, String fechaApertura, String nombreCliente, String fechaNacimiento, String domicilio)
    {
        this.nombreCliente = nombreCliente;
        this.domicilio = domicilio;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaApertura = fechaApertura;
        this.sucursal = sucursal;
        this.saldo = monto;
        this.numCueta = numCueta;
    }

    public CuentaBanco(CuentaBanco cuenta)
    {
        this.nombreCliente = cuenta.nombreCliente;
        this.domicilio = cuenta.domicilio;
        this.fechaNacimiento = cuenta.fechaNacimiento;
        this.fechaApertura = cuenta.fechaApertura;
        this.sucursal = cuenta.sucursal;
        this.saldo =cuenta. saldo;
        this.numCueta = cuenta.numCueta;
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

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumCueta() {
        return numCueta;
    }

    public void setNumCueta(int numCueta) {
        this.numCueta = numCueta;
    }

    public boolean crearCuenta(String nombreCliente, int monto, String fechaApertura, int edad, String fechaNacimiento, String domicilio)
    {
        boolean exito = false;
        if(monto >= 1000 && edad >= 18)
        {
            this.nombreCliente = nombreCliente;
            this.fechaApertura = fechaApertura;
            this.fechaNacimiento = fechaNacimiento;
            this.domicilio = domicilio;
            this.saldo = monto;
            exito = true;
        }

        return exito;
    }

    public boolean retirarFondos(int monto)
    {
        boolean exito = false;
        if(monto <= this.saldo)
        {
            this.saldo = this.saldo - monto;
            exito = true;
        }
        return exito;
    }


    public void depositarFondos(float monto)
    {
        this.saldo += monto;
    }

    public float consultarSaldo()
    {
        return this.saldo;
    }


}
