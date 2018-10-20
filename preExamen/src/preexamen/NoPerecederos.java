/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preexamen;

/**
 *
 * @author Kenneth Stoney Wilson Herrera
 */
public class NoPerecederos extends Producto{
    private String lote;
    
    public NoPerecederos()
    {
        this.lote= "";
    }
    
    public NoPerecederos(int idProducto, String nombre,int unidad, float precioUnitario, String lote)
    {
        super(idProducto, nombre, unidad, precioUnitario);
        this.lote = lote;
    }
    @Override
    public float calcularPrecio() {
        return getPrecioUnitario()*1.5f;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
