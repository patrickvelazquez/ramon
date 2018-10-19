package practicaparaexamen;

public class NoPerecedero extends Producto
{
    private String loteFabricacion;

    public NoPerecedero()
    {
        super();
        this.loteFabricacion="Pollos san antonio alv";
    }
    public NoPerecedero(String loteFabricacion, int idProducto, int unidadProducto, String nombreProducto, float precioUnitario) {
        super(idProducto, unidadProducto, nombreProducto, precioUnitario);
        this.loteFabricacion = loteFabricacion;
    }
    public String getLoteFabricacion() {
        return loteFabricacion;
    }
    public void setLoteFabricacion(String loteFabricacion) {
        this.loteFabricacion = loteFabricacion;
    }
    @Override
    public float precioProducto() 
    {
        float ganancia,total;
        ganancia = getPrecioUnitario()*0.5f;
        total = getPrecioUnitario()+ganancia;
        return total;
    }
}
