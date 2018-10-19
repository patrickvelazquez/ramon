package practicaparaexamen;

public abstract class Producto 
{
    protected int idProducto,unidadProducto;
    protected String nombreProducto;
    protected float precioUnitario;

    public Producto()
    {
        this.idProducto=1;
        this.nombreProducto="Maruchan";
        this.precioUnitario=15;
        this.unidadProducto=1;
    }
    public Producto(int idProducto, int unidadProducto, String nombreProducto, float precioUnitario) {
        this.idProducto = idProducto;
        this.unidadProducto = unidadProducto;
        this.nombreProducto = nombreProducto;
        this.precioUnitario = precioUnitario;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getUnidadProducto() {
        return unidadProducto;
    }

    public void setUnidadProducto(int unidadProducto) {
        this.unidadProducto = unidadProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public abstract float precioProducto();
}
