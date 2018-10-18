/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jacp.examen.corte.pkg2;

/**
 *
 * @author Drago
 */
public class Docente extends Empleado{
    private int matImpartidas;
    private float pagoHora;
    
    public Docente(){
        super();
        this.matImpartidas = 0;
        this.pagoHora = 0.0f;
    }
    
    public Docente(int noEmpleado, String nombre, Puesto puesto, String fechaIngreso, int matImpartidas, float pagoHora){
        super(noEmpleado, nombre, puesto, fechaIngreso);
        this.matImpartidas = matImpartidas;
        this.pagoHora = pagoHora;
    }

    /**
     * @return the matImpartidas
     */
    public int getMatImpartidas() {
        return matImpartidas;
    }

    /**
     * @param matImpartidas the matImpartidas to set
     */
    public void setMatImpartidas(int matImpartidas) {
        this.matImpartidas = matImpartidas;
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

    @Override
    public float calcularPago(int horasImpartidas) {
        switch(puesto.getTipoPuesto()){
            case 1:
                return pagoHora * horasImpartidas * 1.18f;
            case 2:
                return pagoHora * horasImpartidas;
            default:
                return 0;
        }
    }

    @Override
    public float calcularImpuestos() {
        if(puesto.getTipoPuesto() == 1 || puesto.getTipoPuesto() == 2){
            return pagoHora * 0.16f;
        }
        else{
            return pagoHora * 0.18f;
        }
    }
    
    public float calcularPerseccion() {
        if(matImpartidas >= 1 && matImpartidas <= 3){
            return pagoHora * 0.1f;
        }
        else if(matImpartidas >= 4 && matImpartidas <= 5){
            return pagoHora * 0.3f;
        }
        else{
            return 0;
        }
    }
}
