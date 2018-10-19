/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Factura;
import vista.vdlgNotaVenta;
import modelo.ProductoPerecedero;
import javax.swing.JFrame;
/**
 *
 * @author Luis Espinoza
 */
public class NotaVentaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factura fac= new Factura();
        ProductoPerecedero pro = new ProductoPerecedero();
        vdlgNotaVenta vista = new vdlgNotaVenta(new JFrame(),true);
        ControladorNotaVenta controlador = new ControladorNotaVenta(fac,pro,vista);
        
    }
    
}
