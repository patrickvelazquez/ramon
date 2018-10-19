package practicaparaexamen;

class Perecedero extends Producto 
{
    private String fechaCaducidad;
    private float temperatura;
    
    public Perecedero()
    {
        super();
        this.fechaCaducidad="12/12/2018";
        this.temperatura=20;
    }
    
    public Perecedero(String fechaCaducidad, float temperatura, int idProducto, int unidadProducto, String nombreProducto, float precioUnitario) {
        super(idProducto, unidadProducto, nombreProducto, precioUnitario);
        this.fechaCaducidad = fechaCaducidad;
        this.temperatura = temperatura;
    }
        
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }
    
    public float precioProducto() 
    {
        float comision,ganancia;
        float total = 0;
        ganancia = getPrecioUnitario()*0.5f;
        switch(getUnidadProducto())
        {
            case 1:
                comision = 0.03f*getPrecioUnitario();
                total = getPrecioUnitario()+comision+ganancia;
                break;
            case 2:
                comision = 0.05f*getPrecioUnitario();
                total = getPrecioUnitario()+comision+ganancia;
                break;
            case 3:
                comision = 0.04f*getPrecioUnitario();
                total = getPrecioUnitario()+comision+ganancia;
                break;
        }
        return total;
    }  
}
