package practicaparaexamen;

public class Factura extends NotaVenta
{
    private String rfc,nombreCliente,domicilio;
    private float iva;
    
    public Factura()
    {
        super();
        this.domicilio="Mazatlán compa";
        this.iva=0.16f;
        this.nombreCliente="Marco";
        this.rfc="sañdlksadl";
    }
    public Factura(String rfc, String nombreCliente, String domicilio, String fecha, float iva, int numeroNota, int cantidad, int tipoPago,  String concepto, Perecedero producto) 
    {
        super(numeroNota, cantidad, tipoPago, fecha, concepto, producto);
        this.rfc = rfc;
        this.nombreCliente = nombreCliente;
        this.domicilio = domicilio;
        this.iva = iva;
    }
   
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public float getIva() {
        return iva;
    }
    public void setIva(float iva) {
        this.iva = iva;
    }
    public float calculoImpuesto()
    {
        float total = 0;
        total = calculoPago()*getIva();
        return total;
    }
    public float calculoTotal()
    {
        float total = 0;
        total = calculoImpuesto()+calculoPago();
        return total;
    }
}