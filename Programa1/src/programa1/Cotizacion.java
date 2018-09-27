package programa1;

public class Cotizacion {

    private int numCotizacion;
    private int porcentajePagIn;
    private int plazo;
    private String descripcion;
    private float precio;


    public Cotizacion()
    {
        this.setNumCotizacion(1);
        this.setDescripcion("VolksWagen Escaravajo 1969 Edition");
        this.setPorcentajePagIn(10);
        this.setPrecio(55000f);
        this.setPlazo(18);
    }


    public Cotizacion(int numCotizacion, String descripcion, float precio, int porcentajePagIn, int plazo)
    {
        this.setNumCotizacion(numCotizacion);
        this.setDescripcion(descripcion);
        this.setPorcentajePagIn(porcentajePagIn);
        this.setPrecio(precio);
        this.setPlazo(plazo);
    }

    public Cotizacion(Cotizacion cotizacion)
    {
        this.setNumCotizacion(cotizacion.getNumCotizacion());
        this.setDescripcion(cotizacion.getDescripcion());
        this.setPorcentajePagIn(cotizacion.getPorcentajePagIn());
        this.setPrecio(cotizacion.getPrecio());
        this.setPlazo(cotizacion.getPlazo());
    }


    public int getNumCotizacion() {
        return numCotizacion;
    }

    public void setNumCotizacion(int numCotizacion) {
        this.numCotizacion = numCotizacion;
    }

    public int getPorcentajePagIn() {
        return porcentajePagIn;
    }

    public void setPorcentajePagIn(int porcentajePagIn) {
        this.porcentajePagIn = porcentajePagIn;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


    public int calcularPagoInicial() {
        return (int)(this.precio * this.porcentajePagIn) / 100;
    }

    public int calcularPagoFinal()
    {
        return (int) this.precio - calcularPagoInicial();
    }


    public int calcularPagoMensual()
    {
        return this.calcularPagoFinal() / this.plazo;
    }


}
