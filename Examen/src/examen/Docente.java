package examen;

public class Docente extends Empleado 
{
    private int numeroMaterias;
    private float pagoHora;

    public Docente(int numeroMaterias, float pagoHora, int numeroEmpleado, String nombre, String fechaIngreso, Puesto puesto) {
        super(numeroEmpleado, nombre, fechaIngreso, puesto);
        this.numeroMaterias = numeroMaterias;
        this.pagoHora = pagoHora;
    }
    
    public Docente()
    {
        super();
        this.numeroMaterias=1;
        this.pagoHora=50;
    }
    public Docente(Docente nuevo)
    {
        this.fechaIngreso=nuevo.fechaIngreso;
        this.nombre=nuevo.nombre;
        this.numeroEmpleado=nuevo.numeroEmpleado;
        this.numeroMaterias=nuevo.numeroMaterias;
        this.pagoHora=nuevo.pagoHora;
        this.puesto=nuevo.puesto;
    }
    
    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }

    public float getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(float pagoHora) {
        this.pagoHora = pagoHora;
    }

    @Override
    public float calculoPago(int horas) 
    {
        float total = 0;
        float porcentaje,pago;
        if(getPuesto().getTipoPuesto().equals("Eventual"))
        {
            pago = getPagoHora()*horas;
            porcentaje = (float) (pago*0.18f);
            total = pago + porcentaje;
        }
        else
        {
            total = getPagoHora()*horas;
        }
        return total;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float impuesto(int horas) 
    {
        float total;
        
        if("Técnico".equals(getPuesto().getTipoPuesto()) || "Lic e Ing".equals(getPuesto().getTipoPuesto()))
        {
            total = calculoPago(horas)*0.16f;
        }
        else
        {
            total = calculoPago(horas)*0.18f;
        }
        return total;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public float pagoPersecion(int horas)
    {
        float total = 0;
        if(getNumeroMaterias()==1 || getNumeroMaterias()==3 || getNumeroMaterias() == 1)
        {
            total = calculoPago(horas)*0.10f;
        }
        else if(getNumeroMaterias()==4 || getNumeroMaterias()==5)
        {
            total = calculoPago(horas)*0.30f;
        }
        return total;
    }
}