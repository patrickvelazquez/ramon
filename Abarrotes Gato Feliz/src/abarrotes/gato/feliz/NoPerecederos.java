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
public class NoPerecederos extends Productos{
    private String loteFabricacion;
    
    public NoPerecederos(){
        super();
        this.loteFabricacion = "";
    }
    
    public NoPerecederos(int idProducto, String nombreProducto, int unidadProducto, float precioUnitario, String loteFabricacion){
        super(idProducto, nombreProducto, unidadProducto, precioUnitario);
        this.loteFabricacion = loteFabricacion;
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
    
    @Override
    public float calcularPrecio() {
        return precioUnitario * 1.5f;
    }
}
