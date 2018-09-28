/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *
 * @author Kennyswh
 */
public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha()
    {
        //Constructor por Omisión
        this.dia = 1;
        this.mes = 1;
        this.año = 2000;
    }

    public Fecha(int d, int m, int a)
    {
        //Constructor por Argumentos
        this.año = a;
        this.dia = d;
        this.mes = m;
    }

    public Fecha(Fecha fecha)
    {
        //Constructor Copia
        this.dia = fecha.dia;
        this.mes = fecha.mes;
        this.año = fecha.año;
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


    ///Metodos de Comportamiento
    public String fechaConFormato()
    {
        return dia + "/" + mes + "/" + año;
    }

    public int diasMes()
    {
        int diaMes = 0;

        switch(mes)
        {
            case 4:
            case 6:
            case 9:
            case 11:
                diaMes = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diaMes = 31;
                break;
            case 2:
                if(isBisiesto())
                {
                    diaMes = 29;
                }
                else
                {
                    diaMes = 28;
                }
                break;

        }
        return diaMes;
    }

    public boolean isBisiesto()
    {
        boolean exito = false;
        if(año % 4 == 0)
        {
            exito = true;
        }

        return exito;
    }

}