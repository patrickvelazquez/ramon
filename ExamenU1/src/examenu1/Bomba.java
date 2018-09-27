/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenu1;

/**
 *
 * @author Kenneth Stoney Wilson Herrera
 */
public class Bomba {
    private int numero;
    private int tipoGasolina;
    private float precio;
    private int capacidad;
    private int contador;
    
    public Bomba(){
        //Constructor por Omision
        this.numero = 0;
        this.tipoGasolina = 0;
        this.precio = 18.0f;
        this.capacidad = 1000;
        this.contador = 0;
    }
    
    public Bomba(int n, int t, float p, int c, int v){
        //Constructor por Argumentos
        this.numero = n;
        this.tipoGasolina = t;
        this.precio = p;
        this.capacidad = c;
        this.contador = v;
    }
    
    public Bomba(Bomba otra){
        //Constructor Copia
        this.numero = otra.numero;
        this.tipoGasolina = otra.tipoGasolina;
        this.precio = otra.precio;
        this.capacidad = otra.capacidad;
        this.contador = otra.contador;
    }

    //Métodos Setters y Getters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTipoGasolina() {
        return tipoGasolina;
    }

    public void setTipoGasolina(int tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
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
    
    //Métodos de Comportamiento
    public int revisarInventario(){
        return getCapacidad()-getContador();
    }
    
    public float vender(int cantidad){
        if(revisarInventario() >= cantidad)
        {
            setContador(getContador()+cantidad);
            return getPrecio()*cantidad;
        }
        else{
            return 0;
        }
    }
    
    public float calcularVentaTotal(){
        return getContador()*getPrecio();
    }
}
