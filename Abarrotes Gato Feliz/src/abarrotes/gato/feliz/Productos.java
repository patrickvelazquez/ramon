/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abarrotes.gato.feliz;

/**
 *
 * @author Konakun
 */
public abstract class Productos {
    protected int idProducto;
    protected String nombreProducto;
    protected int unidadProducto;
    protected float precioUnitario;
    
    public Productos(){
        this.idProducto = 0;
        this.nombreProducto = "";
        this.unidadProducto = 0;
        this.precioUnitario = 0.0f;
    }
    
    public Productos(int idProducto, String nombreProducto, int unidadProducto, float precioUnitario){
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.unidadProducto = unidadProducto;
        this.precioUnitario = precioUnitario;
    }

    /**
     * @return the idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
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
     * @return the PrecioUnitario
     */
    public float getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * @param PrecioUnitario the PrecioUnitario to set
     */
    public void setPrecioUnitario(float PrecioUnitario) {
        this.precioUnitario = PrecioUnitario;
    }
    
    public abstract float calcularPrecio();
}
