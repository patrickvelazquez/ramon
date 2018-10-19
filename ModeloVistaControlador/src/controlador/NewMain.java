package controlador;

import modelo.fecha;
import vista.vDlgFecha;
import javax.swing.JFrame;

public class NewMain 
{
    public static void main(String[] args) 
    {
        fecha hoy = new fecha();
        vDlgFecha vista = new vDlgFecha(new JFrame(),true);
        Controlador controlador = new Controlador(hoy,vista);
    }
}
