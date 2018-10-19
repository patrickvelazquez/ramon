package modelo;

public class BombaGasolina 
{
    private int numBomba;
    private Gasolina1 tipoGasolina;
    private float capacidad,litrosVendidos;
    
    public BombaGasolina()
    {
        this.capacidad=10000;
        this.litrosVendidos=50;
        this.numBomba=1;
        this.tipoGasolina= new Gasolina1();
    }
    public BombaGasolina(int numBomba,Gasolina1 tipoGasolina,float capacidad,float litrosVendidos)
    {
        this.capacidad=capacidad;
        this.litrosVendidos=litrosVendidos;
        this.numBomba=numBomba;
        this.tipoGasolina=tipoGasolina;
    }
    public BombaGasolina(BombaGasolina nuevo)
    {
        this.capacidad=nuevo.capacidad;
        this.litrosVendidos=nuevo.litrosVendidos;
        this.numBomba=nuevo.numBomba;
        this.tipoGasolina=nuevo.tipoGasolina;
    }

    /**
     * @return the numBomba
     */
    public int getNumBomba() {
        return numBomba;
    }

    /**
     * @param numBomba the numBomba to set
     */
    public void setNumBomba(int numBomba) {
        this.numBomba = numBomba;
    }

    /**
     * @return the tipoGasolina
     */
    public Gasolina1 getTipoGasolina() {
        return tipoGasolina;
    }

    /**
     * @param tipoGasolina the tipoGasolina to set
     */
    public void setTipoGasolina(Gasolina1 tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    /**
     * @return the capacidad
     */
    public float getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the litrosVendidos
     */
    public float getLitrosVendidos() {
        return litrosVendidos;
    }

    /**
     * @param litrosVendidos the litrosVendidos to set
     */
    public void setLitrosVendidos(float litrosVendidos) {
        this.litrosVendidos = litrosVendidos;
    }
        public float revisarInventario()
    {
        float total;
        total = getCapacidad() - getLitrosVendidos();
        return total;
    }
    public float realizarVenta(float litros)
    {
        float total=0;
        
        if(litros>revisarInventario())
            total = 0;
        else
        {
            setLitrosVendidos(getLitrosVendidos() + litros);
            total = getTipoGasolina().calcularPrecio()*litros;
        }
        return total;   
    }
    public float calcularVentaTotal()
    {
        float total;
        total = getLitrosVendidos()*getTipoGasolina().calcularPrecio();
        return total;
    }
}