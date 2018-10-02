
package Segundo;

public class CostoBoleto 
{
    private int dia,mes,año,numeroBoleto,edad;
    private String nombreCliente,tipoBoleto,destino;
    private float costo;
    
    
    public CostoBoleto()
    {
        this.año=2000;
        this.costo=500;
        this.destino="Durango";
        this.dia=15;
        this.mes=10;
        this.nombreCliente="Marco";
        this.numeroBoleto=201216;
        this.tipoBoleto="Premium";
        this.edad=17;
    }
    public CostoBoleto(int dia,int mes,int año,int numeroBoleto,String nombreCliente,String tipoBoleto,String destino,float costo,int edad)
    {
        this.año=año;
        this.costo=costo;
        this.destino=destino;
        this.dia=dia;
        this.mes=mes;
        this.nombreCliente=nombreCliente;
        this.numeroBoleto=numeroBoleto;
        this.tipoBoleto=tipoBoleto;
        this.edad=edad;
    }
    
    public CostoBoleto(CostoBoleto nuevo)
    {
        this.año=nuevo.año;
        this.costo=nuevo.costo;
        this.destino=nuevo.destino;
        this.dia=nuevo.dia;
        this.mes=nuevo.mes;
        this.nombreCliente=nuevo.nombreCliente;
        this.numeroBoleto=nuevo.numeroBoleto;
        this.tipoBoleto=nuevo.tipoBoleto;
        this.edad=nuevo.edad;
    }
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getNumeroBoleto() {
        return numeroBoleto;
    }

    public void setNumeroBoleto(int numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTipoBoleto() {
        return tipoBoleto;
    }

    public void setTipoBoleto(String tipoBoleto) {
        this.tipoBoleto = tipoBoleto;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the costo
     */
    public float getCosto() {
        return costo;
    }
    
    /**
     * @return the dia
     */
    public int getEdad() {
        return edad;
    }

   
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }
    
    public String fechaConFormato(){
        
        return dia + "/" + mes + "/" + año;
    }
    
    public void determinaTipoBoleto(int respuesta)
    {
        if(respuesta == 1)
        {
            this.tipoBoleto = "Económico";
            this.costo = 500;
        }  
        else
        {
            this.tipoBoleto = "Premium";
            this.costo = 900;
        }
    }
    public String datosCompra()
    {
        return "Nombre: " + nombreCliente + "\nEdad:" + edad + "\nNúmero de Boleto: "+numeroBoleto+"\nTipo de boleto: "+tipoBoleto+"\nCosto: "+costo+"\nDestino: "+destino;
    }
    
    public float impuesto()
    {
        return (float) (costo*0.16);
    }
    
    public float subtotal()
    {
        return (float) costo-descuento(edad);
    }
    
    public float descuento(int edad)
    {
        float descuento=0;
        if(edad>=60)
            descuento = ((costo)*0.50f);
        
        return (float) descuento;
    }
    
    public float totalPago()
    {
        return (float) ((costo - descuento(edad)) + impuesto());
    }
    
    public String pago()
    {
        return "Subtotal sin IVA: "+costo+"\nImpuesto %16 IVA: "+impuesto()+"\nSubtotal:"+subtotal()+"\nDescuento: "+descuento(edad)+"\nTotal a pagar: "+totalPago();
    }
}