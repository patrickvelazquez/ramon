/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

/**
 *
 * @author SAMANTHA
 */
public class ProductoPerecedero extends Productos
{
    protected String fechaCaducidad;
    protected float temperatura;
    
    public ProductoPerecedero()
    {
        super();
        this.fechaCaducidad="30/12/2018";
        this.temperatura=20;
    }
    
    public ProductoPerecedero(int i, String n, int u, float p, String f, float t)
    {
        super(i,n,u,p);
        this.fechaCaducidad=f;
        this.temperatura=t;
    }
    
    @Override
    public float calcularPrecio()
    {
        switch (getUnidadProducto())
        {
            case 1:
                return precioUnitario*1.53f;
            case 2:
                return precioUnitario*1.55f;
            case 3:
                return precioUnitario*1.54f;
            default:
                return 0;
        }
    }

    /**
     * @return the fechaCaducidad
     */
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * @param fechaCaducidad the fechaCaducidad to set
     */
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * @return the temperatura
     */
    public float getTemperatura() {
        return temperatura;
    }

    /**
     * @param temperatura the temperatura to set
     */
    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }
    
}
