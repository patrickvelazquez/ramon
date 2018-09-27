package programa1;
/*
                                     |####`--|#|---|##|---|#|--'##|#|
   _                                 |____,--|#|---|##|---|#|--.__|_|
 _|#)_____________________________________,--'EEEEEEEEEEEEEE'_=-.
((_____((_________________________,-Programing by CarlosSant47 ==)        _________
                               .--|##,----o  o  o  o  o  o  o__|/`---,-,-'=========`=+==.
                               |##|_Y__,__.-._,__,  __,-.___/ J \ .----.#############|##|
                               |##|              `-.|#|##|#|`===l##\   _\############|##|
                              =======-===l          |_|__|_|     \##`-"__,=======.###|##|
                                                                  \__,"          '======'
*/
public class Boleto {
    
    private int noBoleto, tipoViaje;
    private float precio;
    private String nombreCliente;
    private String destino;
    private String fecha;
    
    public Boleto()
    {
        this.noBoleto = 1;
        this.precio = 1000f;
        this.nombreCliente = "Juan";
        this.destino = "Mazatlan";
        this.fecha = "01/04/2018";
        this.tipoViaje = 1;
        
    }
    
    
    public Boleto(int n, String no, String des, String f, int t, float p)
    {
        this.noBoleto = n;
        this.nombreCliente = no;
        this.destino = des;
        this.fecha = f;
        this.tipoViaje = t;
        this.precio = p;
    }
    
    
    public Boleto(Boleto bol)
    {
        this.noBoleto = bol.noBoleto;
        this.nombreCliente = bol.nombreCliente;
        this.destino = bol.destino;
        this.fecha = bol.fecha;
        this.tipoViaje = bol.tipoViaje;
        this.precio = bol.precio;
    }
    
    /**
     * @return the noBoleto
     */
    public int getNoBoleto() {
        return noBoleto;
    }

    /**
     * @param noBoleto the noBoleto to set
     */
    public void setNoBoleto(int noBoleto) {
        this.noBoleto = noBoleto;
    }

    /**
     * @return the tipoViaje
     */
    public int getTipoViaje() {
        return tipoViaje;
    }

    /**
     * @param tipoViaje the tipoViaje to set
     */
    public void setTipoViaje(int tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
    public float calcularSubtotal()
    {
        float subtotal = 0.0f;
        if(this.tipoViaje == 1)
        {
            subtotal = this.precio;
        }
        else
        {
            subtotal = this.precio + ((this.precio * 80) / 100);
        }
        
        return subtotal;
    }
    
    
    public float calcularTotal(int edad)
    {
        return (calcularSubtotal() + calcularImpuesto()) - calcularDescuento(edad);
    }
    
    
    public float calcularImpuesto()
    {
        return (float) ((this.precio*.16));
    }
    
    public float calcularDescuento(int edad)
    {

        if(edad > 60)
        {
            return (float) (this.calcularSubtotal() * .50);
        }
        else
        {
            return 0.0f;
        }

    }


    public String mostrarInformacion()
    {
        return "Numero de boleto " + this.noBoleto + " Para el clinete " + this.nombreCliente + " Con destino a " + this.destino +
            " Programado para el " + this.fecha + " Con un costo de $" + this.precio;
    }
    
}
