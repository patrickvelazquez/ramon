/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

/**
 *
 * @author SAMANTHA
 */
public class Bomba 
{
    Gasolina IGasolina = new Gasolina();
    
    private int numero;
    private Gasolina tipoGasolina;
    private float capacidad;
    private float contador;
    
    public Bomba(){
        this.numero=82198;
        this.tipoGasolina=null;
        this.capacidad=100.0f;
        this.contador=0.0F;
    }
    
    public Bomba(int n, Gasolina g, float ca, float co){
        this.numero=n;
        this.tipoGasolina=g;
        this.capacidad=ca;
        this.contador=co;
    }
    
    public Bomba(Bomba otro){
        this.numero=otro.numero;
        this.tipoGasolina=otro.tipoGasolina;
        this.capacidad=otro.capacidad;
        this.contador=otro.contador;
    }

    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the tipoGasolina
     */
    public Gasolina getTipoGasolina() {
        return tipoGasolina;
    }

    /**
     * @param tipoGasolina the tipoGasolina to set
     */
    public void setTipoGasolina(Gasolina tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    /**
     * @return the capacidad
     */
    public float getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the contador
     */
    public float getContador() {
        return contador;
    }

    /**
     * @param contador the contador to set
     */
    public void setContador(float contador) {
        this.contador = contador;
    }
    
    public float revisarInventario()
    {
        return capacidad-contador;
    }
    
    public float realizarVenta(float c)
    {
        if(c<revisarInventario())
        {
            contador+=c;
            return (IGasolina.calcularPrecio()*c);
        }
        else 
            return 0.0f;
    }
    
    public float calcularVentaTotal(){
        return contador*IGasolina.getPrecio();
    }
    
}
