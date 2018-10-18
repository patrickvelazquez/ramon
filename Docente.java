/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 *
 * @author SAMANTHA
 */
public class Docente extends Empleado {
    private int numeroMaterias;
    private float pagoHoras;
    
    public Docente()
    {
        this.numeroMaterias=3;
        this.pagoHoras=21;
    }
    
    public Docente(int n, float p)
    {
        this.numeroMaterias=n;
        this.pagoHoras=p;
    }

    /**
     * @return the numeroMaterias
     */
    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    /**
     * @param numeroMaterias the numeroMaterias to set
     */
    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }

    /**
     * @return the pagoHoras
     */
    public float getPagoHoras() {
        return pagoHoras;
    }

    /**
     * @param pagoHoras the pagoHoras to set
     */
    public void setPagoHoras(float pagoHoras) {
        this.pagoHoras = pagoHoras;
    }
    
    public float calcularPerseccion()
    {
        if (numeroMaterias<=3)
            return 0.10f;
        else 
            return 0.30f;
    }
    
    @Override
    public float calcularPago()
    {
        float pago;
        
        pago=this.getPagoHoras()*this.getNumeroMaterias();
        if(this.puestoEmpleado.getTipoPuesto()==1)
            return pago*0.18f;
        else 
            return pago;
    }
    
    @Override 
    public float calcularImpuesto()
    {
        if(this.puestoEmpleado.getTipoPuesto()<=2)
            return calcularPago()*0.16f;
        else 
            return calcularPago()*0.18f;
    }
    
}
