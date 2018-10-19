/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Luis Espinoza
 */
public abstract class Producto {
    protected int id;
    protected String nombre;
    protected int unidad;
    protected float precioUnitario;
    
    public Producto(){
        this.id=0;
        this.nombre="";
        this.unidad=1;
        this.precioUnitario=0;
    }
    public Producto(int id,String nombre,int unidad, float precioUnitario)
    {
        this.id=id;
        this.nombre=nombre;
        this.unidad=unidad;
        this.precioUnitario=precioUnitario;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the unidad
     */
    public int getUnidad() {
        return unidad;
    }

    /**
     * @param unidad the unidad to set
     */
    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    /**
     * @return the precioUnitario
     */
    public float getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * @param precioUnitario the precioUnitario to set
     */
    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public abstract float calcularPrecio();
}
