package modelo;

public abstract class Producto 
{
    protected int idProducto;
    protected String nombreProducto,unidadProducto;
    protected float precioUnitario;

    public Producto()
    {
        this.idProducto=1;
        this.nombreProducto="Maruchan";
        this.precioUnitario=15;
        this.unidadProducto="Kilogramos";
    }
    public Producto(int idProducto, String unidadProducto, String nombreProducto, float precioUnitario) {
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

    public String getUnidadProducto() {
        return unidadProducto;
    }

    public void setUnidadProducto(String unidadProducto) {
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
