/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

/**
 *
 * @author CarlosSant47
 */
public class Fecha {
    private int dia, mes, año;
    
    public Fecha()
    {
        //CONSTRUCTOR POR OMISION
        this.dia = 1;
        this.mes = 1;
        this.año = 2000;
    }
    
    public Fecha(int d, int m, int a)
    {
        //CONTRUCTOR CON ARGUMENTOS
        this.año = a;
        this.dia = d;
        this.mes = m;
    }
    
    public Fecha(Fecha fecha)
    {
        //CONSTRUCTOR COPIA
        this.dia = fecha.dia;
        this.mes = fecha.mes;
        this.año = fecha.año;
    }

    /**
     * @return the dia
     */
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
    
    
    ///ESCRIBIR METODOS DE COMPORTAMIENTO
    public String fechaConFormato()
    {
        return dia + "/" + mes + "/" + año;
    }
    
    public int diasMes()
    {
        int diames = 0;
        
        switch(mes)
        {
            case 4:
            case 6:
            case 9:
            case 11:
                diames = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diames = 31;
                break;
            case 2:
                if(isBiciesto())
                {
                    diames = 29;
                }
                else
                {
                    diames = 28;
                }
                break;
                
        }
        return diames;
    }
    
    
    public boolean isBiciesto()
    {
        boolean exito = false;
        if(año % 4 == 0)
        {
            exito = true;
        }
        
        return exito;
    }
    
    
    
    
}
