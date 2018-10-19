package modelo;

public class fecha 
{
    private int dia,mes,año;

    public fecha(int dia, int mes, int año) 
    {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    public fecha()
    {
        this.año=2000;
        this.dia=1;
        this.mes=1;
    }
    public fecha(fecha nueva)
    {
        this.año=nueva.año;
        this.dia=nueva.dia;
        this.mes=nueva.mes;
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
    
}