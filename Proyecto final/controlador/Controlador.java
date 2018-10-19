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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener {

    private Fecha hoy;
    private vdlgFecha vista;
    
    public Controlador(Fecha hoy, vdlgFecha vista){
        this.hoy=hoy;
        this.vista=vista;
        vista.btnGuardar.addActionListener(this);
        vista.btnLimpiar.addActionListener(this);
        vista.btnMostrar.addActionListener(this);
        vista.setTitle("Fecha....");
        vista.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.btnGuardar){
            hoy.setDia(Integer.parseInt(vista.txtDia.getText()));
            hoy.setMes(Integer.parseInt(vista.txtMes.getText()));
            hoy.setAño(Integer.parseInt(vista.txtAño.getText()));
        }
        if(e.getSource()==vista.btnLimpiar){
            vista.txtAño.setText("");
            vista.txtDia.setText("");
            vista.txtMes.setText("");
        }
        if(e.getSource()==vista.btnMostrar){
            vista.txtAño.setText(String.valueOf(hoy.getAño()));
            vista.txtDia.setText(String.valueOf(hoy.getDia()));
            vista.txtMes.setText(String.valueOf(hoy.getMes()));
        }
    }
    
}
