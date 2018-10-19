package controlador;

import modelo.BombaGasolina;
import modelo.Gasolina1;

import vista.Bomba;
import vista.Gasolina;
import javax.swing.JFrame;

public class Main 
{

    public static void main(String[] args) {
        BombaGasolina nuevo = new BombaGasolina();
        Gasolina1 gasolina = new Gasolina1();
        Bomba iniciaBomba = new Bomba();
        
        Gasolina vista = new Gasolina();
        Controlador controlador = new Controlador(nuevo,vista,iniciaBomba);
        
    }
    
}
