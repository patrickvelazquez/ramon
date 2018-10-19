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
public class ProductoNoPerecedero extends Producto {

    protected String loteFabricacion;
    
    public ProductoNoPerecedero(){
        super();
        this.loteFabricacion="";
    }
    public ProductoNoPerecedero(int id,String nombre,int unidad, float precioUnitario,String loteFabricacion){
        super(id,nombre,unidad,precioUnitario);
        this.loteFabricacion=loteFabricacion;
    }
    
    @Override
    public float calcularPrecio() {
        return this.precioUnitario*1.5f;
    }

    /**
     * @return the loteFabricacion
     */
    public String getLoteFabricacion() {
        return loteFabricacion;
    }

    /**
     * @param loteFabricacion the loteFabricacion to set
     */
    public void setLoteFabricacion(String loteFabricacion) {
        this.loteFabricacion = loteFabricacion;
    }
    
}
