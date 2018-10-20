/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preexamen;

/**
 *
 * @author Kenneth Stoney Wilson Herrera
 */
public class Perecedero extends Producto{
    private  String fechaCad;
    private float temperatura;
    
    public Perecedero()
    {
        super();
        this.fechaCad = "";
        this.temperatura = 0.0f;
    }
    
    public Perecedero(int idProducto, String nombre,int unidad, float precioUnitario, String fechaCad, float temperatura)
    {
        super(idProducto, nombre, unidad, precioUnitario);
        this.fechaCad = fechaCad;
        this.temperatura = temperatura;
    }

    public String getFechaCad() {
        return fechaCad;
    }

    public void setFechaCad(String fechaCad) {
        this.fechaCad = fechaCad;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public float calcularPrecio() {
        int s = getUnidad();
        float costoR = 0.0f;
        if(s == 1){
            costoR = getPrecioUnitario()*1.03f;
        }
        else if(s == 2){
            costoR = getPrecioUnitario()*1.05f;
        }
        else if(s == 3){
            costoR = getPrecioUnitario()*1.04f;
        }
        return costoR;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
