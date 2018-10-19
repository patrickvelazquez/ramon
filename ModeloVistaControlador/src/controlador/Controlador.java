package controlador;

import modelo.fecha;
import vista.vDlgFecha;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener
{
    private fecha hoy;
    private vDlgFecha vista; 

    public Controlador(fecha hoy, vDlgFecha vista) 
    {
        this.hoy = hoy;
        this.vista = vista;
        vista.btnGuardar.addActionListener(this);
        vista.btnLimpiar.addActionListener(this);
        vista.btnMostrar.addActionListener(this);
        vista.setTitle("Fecha");
        vista.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        if(e.getSource()==vista.btnGuardar)
        {
            hoy.setDia(Integer.parseInt(vista.txtDia.getText()));
            hoy.setAño(Integer.parseInt(vista.txtAño.getText()));
            hoy.setMes(Integer.parseInt(vista.txtMes.getText()));
        }
        if(e.getSource()==vista.btnLimpiar)
        {
            vista.txtDia.setText("");
            vista.txtAño.setText("");
            vista.txtMes.setText("");
        }
        if(e.getSource()==vista.btnMostrar)
        {
            vista.txtDia.setText(String.valueOf(hoy.getDia()));
            vista.txtAño.setText(String.valueOf(hoy.getAño()));
            vista.txtMes.setText(String.valueOf(hoy.getMes()));
        }
        
    }
}