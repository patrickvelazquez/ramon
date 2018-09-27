/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_contreras;

/**
 *
 * @author JOSHYEL
 */
public class bombaGasolina {
    private int numBomba;
    private int tipoGaso;
    private int precio;
    private int capacidad;
    private int litrosVend;
    
    public bombaGasolina()
    {
        this.numBomba=0;
        this.tipoGaso=0;
        this.precio=15;
        this.capacidad=1000;
        this.litrosVend=0;
    }
    
    public bombaGasolina(int num, int tipo, int prec, int cap, int vend)
    {
        this.numBomba=num;
        this.tipoGaso=tipo;
        this.precio=prec;
        this.capacidad=cap;
        this.litrosVend=vend;
    }
    
    public bombaGasolina(bombaGasolina bom)
    {
        this.numBomba=bom.numBomba;
        this.tipoGaso=bom.tipoGaso;
        this.precio=bom.precio;
        this.capacidad=bom.capacidad;
        this.litrosVend=bom.litrosVend;
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
     * @return the tipoGaso
     */
    public int getTipoGaso() {
        return tipoGaso;
    }

    /**
     * @param tipoGaso the tipoGaso to set
     */
    public void setTipoGaso(int tipoGaso) {
        this.tipoGaso = tipoGaso;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
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
     * @return the litrosVend
     */
    public int getLitrosVend() {
        return litrosVend;
    }

    /**
     * @param litrosVend the litrosVend to set
     */
    public void setLitrosVend(int litrosVend) {
        this.litrosVend = litrosVend;
    }
    
    public int revisarInventario()
    {
        int disponible=0;
        disponible=capacidad-litrosVend;
        return disponible;
    }
    
    public int realizarVenta(int litros)
    {
        int venta=0;
        if(litros<capacidad)
        {
            venta=litros*precio;
            litrosVend=litros+litrosVend;
        }
        return venta;
    }
    
    public int calcularVentaTotal()
    {//en el caso de la compra de 1000 litros,no aumenta y se muestra el acumulado
     //ya que multiplica los litros vendidos por el precio, y los litros se quedan en la misma cantidad
        int ventaTotal=0;
        ventaTotal=litrosVend*precio;
        return ventaTotal;
    }
}
