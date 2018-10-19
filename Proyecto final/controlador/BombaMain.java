/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import vista.vdlgBomba;
import javax.swing.JFrame;
import modelo.Bomba;
import modelo.Gasolina;
/**
 *
 * @author Luis Espinoza
 */
public class BombaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Bomba bom= new Bomba();
   Gasolina gaso = new Gasolina();
   vdlgBomba vista = new vdlgBomba(new JFrame(),true);
   ControladorBomba controlador = new ControladorBomba(bom,gaso,vista);
    }
    
}
