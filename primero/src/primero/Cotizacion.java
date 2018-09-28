/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *
 * @author Luis Espinoza
 */
public class Cotizacion {
    private int num;
        private String descAuto;
        private float precioAuto;
        private float porcentajePagoInicial;
        private int plazo;
        
        public Cotizacion()
        {
            this.descAuto="Yaris sx";
            this.num=0123;
            this.plazo=36;
            this.porcentajePagoInicial=25;
            this.precioAuto=220000;
        }
        public Cotizacion(int num,String desc,float precio, float porcentaje, int plazo)
        {
            this.descAuto=desc;
            this.num=num;
            this.plazo=plazo;
            this.porcentajePagoInicial=porcentaje;
            this.precioAuto=precio;
        }
        public Cotizacion(Cotizacion otra)
        {
            this.descAuto=otra.descAuto;
            this.num=otra.num;
            this.plazo=otra.plazo;
            this.porcentajePagoInicial=otra.porcentajePagoInicial;
            this.precioAuto=otra.precioAuto;
        }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @return the descAuto
     */
    public String getDescAuto() {
        return descAuto;
    }

    /**
     * @param descAuto the descAuto to set
     */
    public void setDescAuto(String descAuto) {
        this.descAuto = descAuto;
    }

    /**
     * @return the precioAuto
     */
    public float getPrecioAuto() {
        return precioAuto;
    }

    /**
     * @param precioAuto the precioAuto to set
     */
    public void setPrecioAuto(float precioAuto) {
        this.precioAuto = precioAuto;
    }

    /**
     * @return the porcentajePagoInicial
     */
    public float getPorcentajePagoInicial() {
        return porcentajePagoInicial;
    }

    /**
     * @param porcentajePagoInicial the porcentajePagoInicial to set
     */
    public void setPorcentajePagoInicial(float porcentajePagoInicial) {
        this.porcentajePagoInicial = porcentajePagoInicial;
    }

    /**
     * @return the plazo
     */
    public int getPlazo() {
        return plazo;
    }

    /**
     * @param plazo the plazo to set
     */
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    public float calcularPagoInicial()
    {
     float res;
     res=(this.precioAuto*this.porcentajePagoInicial)/100;
     return res;
    }
    public float calcularTotalAFinananciar()
    {
        float res;
        res=this.precioAuto-this.calcularPagoInicial();
        return res;
        
    }
    public float calcularPagoMensual()
    {
        float res;
        res=this.calcularTotalAFinananciar()/this.plazo;
        return res;
    }
}
