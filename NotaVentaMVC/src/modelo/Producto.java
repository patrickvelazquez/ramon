/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Kenneth Stoney Wilson Herrera
 */
public abstract class Producto{
    protected int idProducto;
    protected String nombre;
    protected int unidad;
    protected float precioUnitario;
    
    public Producto()
    {
        this.idProducto = 0;
        this.nombre = "";
        this.unidad = 1;
        this.precioUnitario = 0.0f;
    }
    
    public Producto(int idProducto, String nombre,int unidad, float precioUnitario)
    {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.unidad = unidad;
        this.precioUnitario = precioUnitario;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    public abstract float calcularPrecio();
}
