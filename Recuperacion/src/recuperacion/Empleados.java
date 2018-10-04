package recuperacion;

public class Empleados 
{
    private int numeroEmpleado,nivel,numeroVentas;
    private String nombre,domicilio;
    private float sueldoBase,comision;
    
    public Empleados()
    {
        this.comision=0.05f;
        this.domicilio="Mazatlán";
        this.nivel=1;
        this.nombre="Marco";
        this.numeroEmpleado=1;
        this.sueldoBase=5000;
        this.numeroVentas=30;
    }
    public Empleados(int numeroEmpleado,int nivel,int numeroVentas,String nombre,String domicilio,float sueldoBase,float comision)
    {
        this.comision=comision;
        this.domicilio=domicilio;
        this.nivel=nivel;
        this.nombre=nombre;
        this.numeroEmpleado=numeroEmpleado;
        this.numeroVentas=numeroVentas;
        this.sueldoBase=sueldoBase;
    }
    public Empleados(Empleados vendedor)
    {
        this.comision=vendedor.comision;
        this.domicilio=vendedor.domicilio;
        this.nivel=vendedor.nivel;
        this.nombre=vendedor.nombre;
        this.numeroEmpleado=vendedor.numeroEmpleado;
        this.numeroVentas=vendedor.numeroVentas;
        this.sueldoBase=vendedor.sueldoBase;
    }

    /**
     * @return the numeroEmpleado
     */
    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    /**
     * @param numeroEmpleado the numeroEmpleado to set
     */
    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the numeroVentas
     */
    public int getNumeroVentas() {
        return numeroVentas;
    }

    /**
     * @param numeroVentas the numeroVentas to set
     */
    public void setNumeroVentas(int numeroVentas) {
        this.numeroVentas = numeroVentas;
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
     * @return the sueldoBase
     */
    public float getSueldoBase() {
        return sueldoBase;
    }

    /**
     * @param sueldoBase the sueldoBase to set
     */
    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    /**
     * @return the comision
     */
    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    public float calcularPagoComision(float precioVenta)
    {
        float total;
        if(nivel == 1)
        {
            total = (float) (((comision*precioVenta)+(0.02*precioVenta))*numeroVentas);
        }
        else
        {
            total = (float) (((comision*precioVenta)+(0.05*precioVenta))*numeroVentas);
        }
        return total;
    }
    public float calcularBonoVenta()
    {
        float bono;
        if(nivel == 1)
            bono = (float) (0.05*sueldoBase);
        else
            bono = (float) (0.10*sueldoBase);
        return bono;
    }
    public float calcularPago(float precioVenta)
    {
        float total;
        total = sueldoBase+calcularPagoComision(precioVenta)+calcularBonoVenta();
        return total;
    }
}   
