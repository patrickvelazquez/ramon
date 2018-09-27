package examen;

public class BombaGasolina 
{
    private int numeroBomba,tipoGasolina,capacidad;
    private float precioGasolina,litrosVendidos;
    
    public BombaGasolina()
    {
        this.capacidad=1000;
        this.litrosVendidos=0.0f;
        this.numeroBomba=1;
        this.precioGasolina=15.0f;
        this.tipoGasolina=1;
    }
    public BombaGasolina(int numeroBomba,int tipoGasolina,int capacidad,float precioGasolina,float litrosVendidos)
    {
        this.capacidad=capacidad;
        this.litrosVendidos=litrosVendidos;
        this.numeroBomba=numeroBomba;
        this.precioGasolina=precioGasolina;
        this.tipoGasolina=tipoGasolina;
    }
    public BombaGasolina(BombaGasolina bomba)
    {
        this.capacidad=bomba.capacidad;
        this.litrosVendidos=bomba.litrosVendidos;
        this.numeroBomba=bomba.numeroBomba;
        this.precioGasolina=bomba.precioGasolina;
        this.tipoGasolina=bomba.tipoGasolina;
    }

    /**
     * @return the numeroBomba
     */
    public int getNumeroBomba() {
        return numeroBomba;
    }

    /**
     * @param numeroBomba the numeroBomba to set
     */
    public void setNumeroBomba(int numeroBomba) {
        this.numeroBomba = numeroBomba;
    }

    /**
     * @return the tipoGasolina
     */
    public int getTipoGasolina() {
        return tipoGasolina;
    }

    /**
     * @param tipoGasolina the tipoGasolina to set
     */
    public void setTipoGasolina(int tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the precioGasolina
     */
    public float getPrecioGasolina() {
        return precioGasolina;
    }

    /**
     * @param precioGasolina the precioGasolina to set
     */
    public void setPrecioGasolina(float precioGasolina) {
        this.precioGasolina = precioGasolina;
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
    
    public float inventario()
    {
        float gasolinaRestante;
        gasolinaRestante = capacidad - litrosVendidos;
        return (float) gasolinaRestante;
    }
    public boolean verificarDisponibilidad(float litros)
    {
        if(litros>inventario())
            return false;
        else
            return true;
    }
    public float venta(float litros)
    {
        float costoVenta = 0;
        if(verificarDisponibilidad(litros)==true)
        {
            litrosVendidos+=litros;
            costoVenta=litros*precioGasolina;
        }
        return (float) costoVenta;
    }
    public float totalVenta()
    {
        float total = 0;
        total = litrosVendidos * precioGasolina;
        return (float) total;
    }
}