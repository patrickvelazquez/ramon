/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.Bomba;
import modelo.Gasolina;
import vista.vdlgBomba;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
/**
 *
 * @author Kenneth Wilson
 */
public class ControladorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bomba bomba = new Bomba();
        vdlgBomba vdlgBomba = new vdlgBomba(new JFrame(), true);

        Controlador control = new Controlador(bomba, vdlgBomba);
    }
    
}
