/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Luis Espinoza
 */
import modelo.Fecha;
import vista.vdlgFecha;
import javax.swing.JFrame;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fecha hoy = new Fecha();
        vdlgFecha vista = new vdlgFecha(new JFrame(),true);
        Controlador controlador = new Controlador(hoy,vista);
        
    }
    
}
