/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preexamen;

/**
 *
 * @author Luis Espinoza
 */
public class ProductoPerecedero extends Producto {
    
    protected String fechaCaducidad;
    protected float temperatura;
   
    public ProductoPerecedero(){
        super();
        this.fechaCaducidad="";
        this.temperatura=0;
    }
    public ProductoPerecedero(int id,String nombre,int unidad, float precioUnitario, String fechaCaducidad,float temperatura){
        super(id,nombre,unidad,precioUnitario);
        this.temperatura=temperatura;
        this.fechaCaducidad=fechaCaducidad;
    }

    @Override
    public float calcularPrecio() {
        switch (this.getUnidad()) {
            case 1:
                return this.precioUnitario*1.53f;
            case 2:
                return this.precioUnitario*1.55f;
            case 3:
                return this.precioUnitario*1.54f;
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
