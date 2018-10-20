/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.*;
import vista.*;
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
        Factura fact = new Factura();
        vdlgNotaVenta vdlgNV = new vdlgNotaVenta(new JFrame(), true);

        Controlador control = new Controlador(fact, vdlgNV);
    }
    
}
