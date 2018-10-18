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
public abstract class Productos {
    protected int id;
    protected String nombreProducto;
    protected int unidadProducto;
    protected float precioUnitario;
    
    public Productos(){
        this.id=82198;
        this.nombreProducto="Teql";
        this.unidadProducto=2;
        this.precioUnitario=10;
    }
    
    public Productos(int i, String n, int u, float p){
        this.id=i;
        this.nombreProducto=n;
        this.unidadProducto=u;
        this.precioUnitario=p;
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
     * @return the nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * @param nombreProducto the nombreProducto to set
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * @return the unidadProducto
     */
    public int getUnidadProducto() {
        return unidadProducto;
    }

    /**
     * @param unidadProducto the unidadProducto to set
     */
    public void setUnidadProducto(int unidadProducto) {
        this.unidadProducto = unidadProducto;
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
