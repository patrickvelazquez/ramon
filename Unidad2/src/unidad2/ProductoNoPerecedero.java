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
public class ProductoNoPerecedero extends Productos 
{

    protected String loteFabricacion;
    
    public ProductoNoPerecedero()
    {
        super();
        this.loteFabricacion="09/10/2018";
    }
    
    public ProductoNoPerecedero(int i, String n, int u, float p, String l)
    {
        super(i,n,u,p);
        this.loteFabricacion=l;
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
    public float calcularPrecio()
    {
        return precioUnitario*1.5f;//this
    }
    
}
