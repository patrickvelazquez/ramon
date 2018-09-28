/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *
 * @author Luis
 */
    public class Fecha
    {
    private int dia;
    private int mes;
    private int año;
    
    public Fecha()
    {
    //Constructor por omision
    this.dia=1;
    this.mes=1;
    this.año=2000;
    
    }
    public Fecha(int d, int m, int a)
    {
        //Constructor con argumentos
        this.dia=d;
        this.mes=m;
        this.año=a;
    }
    public Fecha(Fecha otro)
    {
        //Constructor copia
        this.dia=otro.dia;
        this.mes=otro.mes;
        this.año=otro.año;
    }

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }
    
    //Escribir métodos de comportamient
    
    public String fechaConFormato()
    {
        return dia+"/"+mes+"/"+año;
    }
    public int diasDelMes()
    {
        int diaMes=0;
        
        switch(mes){
            case 4:
            case 6:
            case 9:
            case 11:
                diaMes=30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diaMes=31;
                break;
            case 2:
                if(this.esBisiesto())diaMes=29;
                else diaMes=28;
                break;
        }
        return diaMes;
    }
    public boolean esBisiesto()
    {
        boolean exito=false;
        if(año%4==0) exito= true;
        return exito;
    }
}
