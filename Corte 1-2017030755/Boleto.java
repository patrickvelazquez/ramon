/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *
 * @author SAMANTHA
 */
public class Boleto 
{
    
    private int numero;
    private String cliente;
    private String destino;
    private int tipo;
    private float precio;
    private String fecha;
    
    public Boleto()
    {
        this.cliente="Samantha Leal";
        this.destino="Mazatlán";
        this.fecha="10/10/2018";
        this.numero=82198;
        this.precio=200;
        this.tipo=1;
    }
    
    public Boleto(int n, String c, String d, int t, float p, String f)
    {
        this.numero=n;
        this.cliente=c;
        this.destino=d;
        this.fecha=f;
        this.precio=p;
        this.tipo=t;
    }

    public int getNumero() 
    {
        return numero;
    }

    public void setNumero(int numero) 
    {
        this.numero = numero;
    }

    public String getCliente() 
    {
        return cliente;
    }
    
    public void setCliente(String cliente) 
    {
        this.cliente = cliente;
    }

    public String getDestino() 
    {
        return destino;
    }

    public void setDestino(String destino) 
    {
        this.destino = destino;
    }

    public int getTipo() 
    {
        return tipo;
    }

    public void setTipo(int tipo) 
    {
        this.tipo = tipo;
    }

    public float getPrecio() 
    {
        return precio;
    }

    public void setPrecio(float precio) 
    {
        this.precio = precio;
    }

    public String getFecha() 
    {
        return fecha;
    }

    public void setFecha(String fecha) 
    {
        this.fecha = fecha;
    }
    
    public float obtenerDescuento(int e)
    {
        if(e>60)
            return precio*0.50F;
        else 
            return 0F;
    }
    
    public float calcularImpuesto()
    {
        return precio*0.16F;
    }
    
    public float calcularSubtotal()
    {
        if(tipo==2)
            return precio*1.80F;
        else
            return precio;
    }

}
