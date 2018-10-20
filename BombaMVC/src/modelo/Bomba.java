/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Kenneth Wilson
 */
public class Bomba {
    private int numBomba;
    private Gasolina tipoGasolina;
    private int capacidad;
    private int contador;
    
    public Bomba(){
        this.numBomba = 1;
        this.tipoGasolina = new Gasolina();
        this.capacidad = 1000;
        this.contador = 0;
    }
    public Bomba(int n, Gasolina t, int cap, int cont){
        this.numBomba = n;
        this.tipoGasolina = t;
        this.capacidad = cap;
        this.contador = cont;
    }
    public Bomba(Bomba otra){
        this.numBomba = otra.numBomba;
        this.tipoGasolina = otra.tipoGasolina;
        this.capacidad = otra.capacidad;
        this.contador = otra.contador;
    }

    public int getNumBomba() {
        return numBomba;
    }

    public void setNumBomba(int numBomba) {
        this.numBomba = numBomba;
    }

    public Gasolina getTipoGasolina() {
        return tipoGasolina;
    }

    public void setTipoGasolina(Gasolina tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public int revisarInventario(){
        return getCapacidad()-getContador();
    }
    
    public float vender(int cantidad){
        if(revisarInventario() >= cantidad)
        {
            setContador(getContador()+cantidad);
            return getTipoGasolina().calcularPrecio()*cantidad;
        }
        else{
            return 0;
        }
    }
    
    public float calcularVentaTotal(){
        return getContador()*getTipoGasolina().calcularPrecio();
    }
}
