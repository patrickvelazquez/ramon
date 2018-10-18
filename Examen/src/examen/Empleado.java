package examen;

public abstract class Empleado 
{
    protected int numeroEmpleado;
    protected String nombre,fechaIngreso;
    protected Puesto puesto;

    public Empleado()
    {
        this.fechaIngreso="18/10/2018";
        this.nombre="Marco";
        this.numeroEmpleado=1;
        this.puesto=new Puesto();
    }
    public Empleado(int numeroEmpleado, String nombre, String fechaIngreso, Puesto puesto) {
        this.numeroEmpleado = numeroEmpleado;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.puesto = puesto;
    }
    public Empleado(Empleado nuevo)
    {
        this.fechaIngreso = nuevo.fechaIngreso;
        this.nombre= nuevo.nombre;
        this.numeroEmpleado=nuevo.numeroEmpleado;
        this.puesto=nuevo.puesto;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }
    
    public abstract float calculoPago(int horas);
    public abstract float impuesto(int horas);
}
