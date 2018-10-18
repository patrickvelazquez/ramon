/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Luis Espinoza
 */
public class Docente extends Empleado {

    private int numMaterias;
    private float pagoHora;
    
    
    
    @Override
    public float calcularPago(int horas) {
           if (puesto.getTipo()==1){
               return (pagoHora*horas)*1.18f;
           }
           if (puesto.getTipo()==2)
                   {
                       return (pagoHora*horas);
                   }
           return 0;
    }

    @Override
    public float calcularImpuesto(int horas) {
     
        if (puesto.getTipo()==1 || puesto.getTipo()==2){
            
            return this.calcularPago(horas)*.16f;
        }
        else return this.calcularPago(horas)*.18f;
    }
    
    public float calcularTotal(int horas){
    
        return this.calcularPago(horas)+this.calcularPagoP(horas)-this.calcularImpuesto(horas);
    }
    public float calcularPagoP(int horas){
      
        switch(this.numMaterias){
            case 1:
            case 2:
            case 3:
                return this.calcularPago(horas)*.1f;
      
            case 4:
            case 5:
               return this.calcularPago(horas)*0.3f;
           
            
        }
        return 0;
    }

    /**
     * @return the numMaterias
     */
    public int getNumMaterias() {
        return numMaterias;
    }

    /**
     * @param numMaterias the numMaterias to set
     */
    public void setNumMaterias(int numMaterias) {
        this.numMaterias = numMaterias;
    }

    /**
     * @return the pagoHora
     */
    public float getPagoHora() {
        return pagoHora;
    }

    /**
     * @param pagoHora the pagoHora to set
     */
    public void setPagoHora(float pagoHora) {
        this.pagoHora = pagoHora;
    }
    
}
