/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Drago
 */
public class Fecha{
	private int dia; //dar clic derecho, reestructurar/encapsular, seleccionar get y set;
	private int mes;
	private int año;

	public Fecha(){
		//constructor por omision
		this.dia = 1;
		this.mes = 1;
		this.año = 2000;
	}
	
	public Fecha(int dia, int mes, int año){
	//constructor con argumentos
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	
	public Fecha(Fecha otra){
		//constructor por copia
		this.dia = otra.dia;
		this.mes = otra.mes;
		this.año = otra.año;
	}
	//escribir metodos de comportamiento
	public String fechaConFormato(){
	return getDia() + "/" + getMes() + "/" + getAño();
	}
	
	public int diasMeses(){
		int diaMes=0;
		switch(getMes())
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
				if(this.isBisiesto()) diaMes=29;
				else diaMes=28;
				break;
		}
		return diaMes;
	}
	
	public boolean isBisiesto(){
		boolean exito = false;
		if(getAño()%4==0) exito = true;
		return exito;
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
}
