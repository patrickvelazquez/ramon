package modelo;

public abstract class NotaVenta 
{
    protected int numeroNota,cantidad;
    protected String  fecha,concepto,tipoPago;
    protected Perecedero producto;

    public NotaVenta()
    {
        this.cantidad=1;
        this.concepto="Comestibles";
        this.fecha="20/12/2016";
        this.numeroNota=1;
        this.producto=new Perecedero();
        this.tipoPago="Efectivo";
    }
    public NotaVenta(int numeroNota, int cantidad, String tipoPago, String fecha, String concepto, Perecedero producto) {
        this.numeroNota = numeroNota;
        this.cantidad = cantidad;
        this.tipoPago = tipoPago;
        this.fecha = fecha;
        this.concepto = concepto;
        this.producto = producto;
    }
    public NotaVenta(NotaVenta nuevo)
    {
        this.cantidad=nuevo.cantidad;
        this.concepto=nuevo.concepto;
        this.fecha=nuevo.fecha;
        this.numeroNota=nuevo.numeroNota;
        this.producto = nuevo.producto;
        this.tipoPago=nuevo.tipoPago;
    }

    public int getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Perecedero getProducto() {
        return producto;
    }

    public void setProducto(Perecedero producto) {
        this.producto = producto;
    }
    
    public float calculoPago()
    {
        float total = 0;
        total = getCantidad()*producto.precioProducto();
        return total;
    }
}