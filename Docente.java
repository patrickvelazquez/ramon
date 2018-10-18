/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 *
 * @author Kenneth Wilson
 */
public class Docente extends Empleado{
    private int numMaterias;
    private float pagoHora;
    
    public Docente(){
        super();
        this.numMaterias = 1;
        this.pagoHora = 20.0f;
    }

    public Docente(int numEmpleado, String nombre, Puesto puesto, String fechaIngreso, int numMaterias, float pagoHora) {
        super(numEmpleado, nombre, puesto, fechaIngreso);
        this.numMaterias = numMaterias;
        this.pagoHora = pagoHora;
    }

    public Docente(Empleado otro, int numMaterias, float pagoHora) {
        super(otro);
        this.numMaterias = numMaterias;
        this.pagoHora = pagoHora;
    }
    
    public int getNumMaterias() {
        return numMaterias;
    }

    public void setNumMaterias(int numMaterias) {
        this.numMaterias = numMaterias;
    }

    public float getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(float pagoHora) {
        this.pagoHora = pagoHora;
    }
    
    @Override
    public float calcularPago() {
        if(getPuesto().getTipoPuesto() == 1){
            return (getPagoHora()*getNumMaterias())*(1.18f);
        }
        else{
            return getPagoHora()*getNumMaterias();
        }
    }

    @Override
    public float calcularImpuesto() {
        if((getPuesto().getNivelAcad()>0)&&(getPuesto().getNivelAcad()<3)){
            return calcularPago()*0.16f;
        }
        else{
            return calcularPago()*0.18f;
        }
    }
    
    public float calcularPercepcion(){
        if((getNumMaterias()>=1)&&(getNumMaterias()<=3)){
            return calcularPago()*(0.1f);
        }
        else if((getNumMaterias()>=4)&&(getNumMaterias()<=5)){
            return calcularPago()*(0.3f);
        }
        else{
            return 0;
        }
    }
}
