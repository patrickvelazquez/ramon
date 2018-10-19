/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import javax.swing.JFrame;
import modelo.BombaGasolina;
import modelo.Gasolina;
import vista.vdlgMenu;

/**
 *
 * @author Konakun
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BombaGasolina bomba = new BombaGasolina();
        Gasolina gasolina = new Gasolina();
        vdlgMenu vista = new vdlgMenu(new JFrame(),true);
        ControladorMenu controlador = new ControladorMenu(vista, gasolina, bomba);
    } 
    
}
