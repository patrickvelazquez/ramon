/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abarrotes.gato.feliz;

/**
 *
 * @author Drago
 */
public class Perecedero extends Productos{
    private String fechaCaducidad;
    private float temperatura;
    
    public Perecedero(){
        super();
        this.fechaCaducidad = "";
        this.temperatura = 0.0f;
    }
    
    public Perecedero(int idProducto, String nombreProducto, int unidadProducto, float precioUnitario, String fechaCaducidad, float temperatura){
        super(idProducto, nombreProducto, unidadProducto, precioUnitario);
        this.fechaCaducidad = fechaCaducidad;
        this.temperatura = temperatura;
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
    
    @Override
    public float calcularPrecio() {
        switch(unidadProducto){
            case 1:
                return precioUnitario * 1.53f;
            case 2:
                return precioUnitario * 1.55f;
            case 3:
                return precioUnitario * 1.54f;
            default:
                return 404.4040404f;
        }
    }
}
