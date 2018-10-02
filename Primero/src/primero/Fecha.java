/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *
 * @author PC 14
 */
public class Fecha {
    private int dia;
    private int mes;
    private int año;
    
    public Fecha(){
        //constructor por omisión
        this.dia=1;
        this.mes=1;
        this.año=2000;
        
    }
    public Fecha (int dia, int mes, int año){
                //Constructor Por Argumentos
    this.dia=dia;
    this.mes=mes;
    this.año=año;
    }
    public Fecha(Fecha otro){
        this.dia=otro.dia;
        this.mes=otro.mes;
        this.año=otro.año;
    }

    /**
     * @return the Dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param Dia the Dia to set
     */
    public void setDia(int Dia) {
        this.dia = Dia;
    }

    /**
     * @return the Mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param Mes the Mes to set
     */
    public void setMes(int Mes) {
        this.mes = Mes;
    }

    /**
     * @return the Año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param Año the Año to set
     */
    public void setAño(int Año) {
        this.año = Año;
    }
    
    //Escribir Métodos de Comportamiento
    
    public String fechaConFormato(){
        
        return dia + "/" + mes + "/" + año;
    }
    
    public int diasMes(){
        
        int diaMes=0;
        
        switch (mes){
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
                if(this.isBisiesto())diaMes=29;
                else diaMes=28;
                break;
        }
        return diaMes;
    }
    public boolean isBisiesto(){
        boolean exito=false;
        if(año%4==0) exito=true;
        return exito;
    }
}
