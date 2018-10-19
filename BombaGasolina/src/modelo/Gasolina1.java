package modelo;

public class Gasolina1 
{
    private int idGasolina,tipo;
    private String marca;
    private float precioBase;
    
    public Gasolina1()
    {
        this.idGasolina=1;
        this.marca="UPSIN";
        this.precioBase=16;
        this.tipo=1;
    }
    public Gasolina1(int idGasolina,int tipo, String marca,float precioBase)
    {
        this.idGasolina=idGasolina;
        this.marca=marca;
        this.precioBase=precioBase;
        this.tipo=tipo;
    }
    public Gasolina1(Gasolina1 nuevo)
    {
        this.idGasolina=nuevo.idGasolina;
        this.marca=nuevo.marca;
        this.precioBase=nuevo.precioBase;
        this.tipo=nuevo.tipo;
    }

    /**
     * @return the idGasolina
     */
    public int getIdGasolina() {
        return idGasolina;
    }

    /**
     * @param idGasolina the idGasolina to set
     */
    public void setIdGasolina(int idGasolina) {
        this.idGasolina = idGasolina;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the precioBase
     */
    public float getPrecioBase() {
        return precioBase;
    }

    /**
     * @param precioBase the precioBase to set
     */
    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    } 
    public float calcularPrecio()
    {
        float porcentaje,total = 0;
        switch(tipo)
        {
            case 1:
                porcentaje = (float) (precioBase*0.10);
                total = (float) (precioBase + porcentaje);
                break;
            case 2:
                porcentaje = (float) (precioBase*0.20);
                total = (float) (precioBase + porcentaje); 
                break;
            case 3:
                porcentaje = (float) (precioBase*0.25);
                total = (float) (precioBase + porcentaje);
                break;
        }
        return total;
    }
}