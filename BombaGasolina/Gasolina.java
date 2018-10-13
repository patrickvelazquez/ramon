/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *
 * @author Luis Espinoza
 */
public class Gasolina {
    
    private int idGasolina;
    private int tipo;
    private float precioBase;
    private String marca;
    
    public Gasolina()
    {
        idGasolina=0;
        tipo=0;
        precioBase=0;
        marca="";
    }
    
    public Gasolina(int id, int tip, float precio, String marc){
        
        idGasolina=id;
        tipo=tip;
        precioBase=precio;
        marca=marc;
    }
    
    public Gasolina(Gasolina otra)
    {
        idGasolina=otra.idGasolina;
        tipo=otra.tipo;
        precioBase=otra.precioBase;
        marca=otra.marca;
    }

    /**
     * @return the idGasolina
     */
    public int getIdGasolina() {
        return idGasolina;
    }

    /**
     * @param idGasolina the idGasolina to set
     */
    public void setIdGasolina(int idGasolina) {
        this.idGasolina = idGasolina;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the precioBase
     */
    public float getPrecioBase() {
        return precioBase;
    }

    /**
     * @param precioBase the precioBase to set
     */
    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public float calcularPrecio(){
        switch (tipo) {
            case 1:
                return precioBase*1.1f;
            case 2:
                return precioBase*1.2f;
            case 3:
                return precioBase*1.25f;
            default:
                return 0;
        }
    }
}
