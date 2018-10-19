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
public class ControladorBombaGasolina implements ActionListener {
    private vdlgBombaGasolina vista;
    private Gasolina gasolina;
    private BombaGasolina bomba;
    
    public ControladorBombaGasolina(vdlgBombaGasolina vista, Gasolina gasolina, BombaGasolina bomba){
        this.vista = vista;
        this.gasolina = gasolina;
        this.bomba=bomba;
        
        vista.btnCargarGasolina.addActionListener(this);
        vista.btnGuardar.addActionListener(this);
        vista.btnSalir.addActionListener(this);
        vista.setTitle("Iniciar Bomba");
        vista.setVisible(true);
    }

    /**
     * @return the vista
     */
    public vdlgBombaGasolina getVista() {
        return vista;
    }

    /**
     * @param vista the vista to set
     */
    public void setVista(vdlgBombaGasolina vista) {
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
        if(e.getSource() == vista.btnGuardar){
            bomba.setNumBomba(Integer.parseInt(vista.txtNumeroBomba.getText()));
            bomba.setTipoGasolina(gasolina);
            bomba.setCapacidad(Float.parseFloat(vista.txtCapacidad.getText()));
            bomba.setLitrosVendidos(Float.parseFloat(vista.txtLitrosVendidos.getText()));
            JOptionPane.showMessageDialog(null, "Los datos se han guardado");
        }
        else if(e.getSource() == vista.btnSalir){
            
            vista.dispose();
            vdlgMenu ventana = new vdlgMenu(null, true);
            ControladorMenu control = new ControladorMenu(ventana, gasolina, bomba);
        }
        else if(e.getSource() == vista.btnCargarGasolina){
            vista.txtGasolina.setText(gasolina.getMarca());
            JOptionPane.showMessageDialog(null, "Se ha cargado la gasolina");
        }
    }
}