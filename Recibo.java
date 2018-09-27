/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author PC16
 */
public class Recibo {
   
    private int numRecibo;
    private String nombreTrabajador;
    private int puesto;
    private int diasTrabajados;
    private float sueldoBase;
    private int nivel;
    
    public Recibo()
    {
        this.diasTrabajados=0;
        this.nivel=0;
        this.nombreTrabajador="";
        this.numRecibo=0;
        this.puesto=0;
        this.sueldoBase=0;
    }
    public Recibo(int num,String nombre, int puesto, int dias, float sueldo, int nivel)
    {
        this.diasTrabajados=dias;
        this.nivel=nivel;
        this.nombreTrabajador=nombre;
        this.numRecibo=num;
        this.puesto=puesto;
        this.sueldoBase=sueldo;
    }
    public Recibo(Recibo otro)
    {
        this.diasTrabajados=otro.diasTrabajados;
        this.nivel=otro.nivel;
        this.nombreTrabajador=otro.nombreTrabajador;
        this.numRecibo=otro.numRecibo;
        this.puesto=otro.puesto;
        this.sueldoBase=otro.sueldoBase;
    }

    /**
     * @return the numRecibo
     */
    public int getNumRecibo() {
        return numRecibo;
    }

    /**
     * @param numRecibo the numRecibo to set
     */
    public void setNumRecibo(int numRecibo) {
        this.numRecibo = numRecibo;
    }

    /**
     * @return the nombreTrabajador
     */
    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    /**
     * @param nombreTrabajador the nombreTrabajador to set
     */
    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    /**
     * @return the puesto
     */
    public int getPuesto() {
        return puesto;
    }

    /**
     * @param puesto the puesto to set
     */
    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    /**
     * @return the diasTrabajados
     */
    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    /**
     * @param diasTrabajados the diasTrabajados to set
     */
    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    /**
     * @return the sueldoBase
     */
    public float getSueldoBase() {
        return sueldoBase;
    }

    /**
     * @param sueldoBase the sueldoBase to set
     */
    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public float calcularSueldo()
    {
        float res=0.0f;
        if(this.puesto==1)
        {
            res=(this.sueldoBase*1.1f)*this.diasTrabajados;
        }
        else if(this.puesto==2)
        {
            res=(this.sueldoBase*1.1f)*this.diasTrabajados*1.2f;
        }
        else if(this.puesto==3)
        {
            res=((this.sueldoBase*1.1f*this.diasTrabajados)*1.2f)*1.5f;
        }
        return res;
    }
    public float calcularImpuesto(){
        float res=0.0f;
        if(this.nivel==1)
        {
            res=this.calcularSueldo()*0.05f;
        }
        else if(this.nivel==2)
        {
            res=this.calcularImpuesto()*0.03f;
        }
        return res;
    }
    public float calcularBono(int hijos)
    {
        float res;
        res=hijos*this.sueldoBase;
        return res;
    }
    public float calcularTotal(int hijos)
    {
        float res;
        res=this.calcularSueldo()+this.calcularBono(hijos)-this.calcularImpuesto();
        return res;
    }
    
}
