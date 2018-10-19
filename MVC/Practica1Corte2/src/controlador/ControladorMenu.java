/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.ActionEvent;
import modelo.Gasolina;
import modelo.BombaGasolina;

import vista.vdlgBombaGasolina;
import vista.vdlgGasolina;
import vista.vdlgMenu;
import vista.vdlgRealizarVenta;
import vista.vdlgRevisarInventario;
import vista.vdlgTotalVenta;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Konakun
 */
public class ControladorMenu implements ActionListener{
    private vdlgMenu vista;
    private Gasolina gasolina;
    private BombaGasolina bomba;
    
    public ControladorMenu(vdlgMenu vista, Gasolina gasolina, BombaGasolina bomba){
        this.vista = vista;
        this.gasolina = gasolina;
        this.bomba=bomba;
        
        vista.btnIniciarGasolina.addActionListener(this);
        vista.btnIniciarBomba.addActionListener(this);
        vista.btnRealizarVenta.addActionListener(this);
        vista.btnRevisarInventario.addActionListener(this);
        vista.btnTotalVenta.addActionListener(this);
        vista.btnSalir.addActionListener(this);
        vista.setTitle("Gasolinera");
        vista.setVisible(true);
    }

    /**
     * @return the vista
     */
    public vdlgMenu getVista() {
        return vista;
    }

    /**
     * @param vista the vista to set
     */
    public void setVista(vdlgMenu vista) {
        this.vista = vista;
    }

    /**
     * @return the gasolina
     */
    public Gasolina getGasolina() {
        return gasolina;
    }

    /**
     * @param gasolina the gasolina to set
     */
    public void setGasolina(Gasolina gasolina) {
        this.gasolina = gasolina;
    }

    /**
     * @return the bomba
     */
    public BombaGasolina getBomba() {
        return bomba;
    }

    /**
     * @param bomba the bomba to set
     */
    public void setBomba(BombaGasolina bomba) {
        this.bomba = bomba;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.btnIniciarGasolina){
            vista.dispose();
            vdlgGasolina ventana = new vdlgGasolina(null,true);
            ControladorGasolina control = new ControladorGasolina(ventana, gasolina, bomba);
        }
        else if(e.getSource() == vista.btnIniciarBomba){
            vista.dispose();
            vdlgBombaGasolina ventana = new vdlgBombaGasolina(null,true);
            ControladorBombaGasolina control = new ControladorBombaGasolina(ventana, gasolina, bomba);
        }
        else if(e.getSource() == vista.btnRealizarVenta){
            vista.dispose();
            vdlgRealizarVenta ventana = new vdlgRealizarVenta(null,true);
            ControladorRealizarVenta control = new ControladorRealizarVenta(ventana, gasolina, bomba);
        }
        else if(e.getSource() == vista.btnRevisarInventario){
            vista.dispose();
            vdlgRevisarInventario ventana = new vdlgRevisarInventario(null,true);
            ControladorRevisarInventario control = new ControladorRevisarInventario(ventana, gasolina, bomba);
        }
        else if(e.getSource() == vista.btnTotalVenta){
            vista.dispose();
            vdlgTotalVenta ventana = new vdlgTotalVenta(null,true);
            ControladorTotalVenta control = new ControladorTotalVenta(ventana, gasolina, bomba);
        }
        else if(e.getSource() == vista.btnSalir){
            vista.dispose();
            JOptionPane.showMessageDialog(null, "Gracias por usar este programa");
            System.exit(0);
        }
    }
}
