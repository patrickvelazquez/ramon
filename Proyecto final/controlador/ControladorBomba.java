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
import modelo.Bomba;
import modelo.Gasolina;
import vista.vdlgBomba;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ControladorBomba implements ActionListener{

    private Bomba bom;
    private Gasolina gaso;
    private vdlgBomba vista;
    public ControladorBomba(Bomba bom, Gasolina gaso, vdlgBomba vista){
    
        this.bom=bom;
        this.gaso=gaso;
        this.vista=vista;
        vista.btnGuardar.addActionListener(this);
        vista.btnLimpiar.addActionListener(this);
        vista.btnMostrar.addActionListener(this);
        vista.btnRealizarVenta.addActionListener(this);
        vista.txtCapacidad.setText(String.valueOf(bom.getCapacidadLts()));
        vista.txtCapacidad.setEnabled(false);
        vista.txtCantidad.setEnabled(false);
        vista.txtLitros.setEnabled(false);
        vista.txtTotal.setEnabled(false);
        vista.txtPrecioVenta.setEnabled(false);
        vista.setTitle("BOMBA DE GASOLINA");
        vista.setVisible(true);
        
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==vista.btnGuardar){
            bom.setNumBomba(Integer.parseInt(vista.txtNumBomba.getText()));
            gaso.setIdGasolina(Integer.parseInt(vista.txtIdGasolina.getText()));
            gaso.setMarca(vista.txtMarca.getText());
            gaso.setPrecioBase(Float.parseFloat(vista.txtPrecioBase.getText()));
            gaso.setTipo(vista.cmbTipo.getSelectedIndex());
            //bom.setCapacidadLts(Float.parseFloat(vista.txtCapacidad.getText()));
            //vista.txtCapacidad.setEnabled(false);
            bom.setGasolina(gaso);
            vista.txtPrecioVenta.setText(String.valueOf(gaso.calcularPrecio()));
            vista.txtCantidad.setEnabled(true);
        }
        if(e.getSource()==vista.btnMostrar){
            
           // vista.txtCapacidad.setText(String.valueOf(bom.getCapacidadLts()));
            vista.txtIdGasolina.setText(String.valueOf(gaso.getIdGasolina()));
            vista.txtLitros.setText(String.valueOf(bom.getLitrosVendidos()));
            vista.txtMarca.setText(String.valueOf(gaso.getMarca()));
            vista.txtNumBomba.setText(String.valueOf(bom.getNumBomba()));
            vista.txtPrecioBase.setText(String.valueOf(gaso.getPrecioBase()));
            vista.cmbTipo.setSelectedIndex(gaso.getTipo());
         //   vista.txtTotal.setText(String.valueOf(gaso.c));
            //    vista.txtAño.setText(String.valueOf(hoy.getAño()));
        }
        if(e.getSource()==vista.btnLimpiar){
           //    vista.txtCapacidad.setText("");
            vista.txtIdGasolina.setText("");
         //   vista.txtLitros.setText("");
            vista.txtMarca.setText("");
            vista.txtNumBomba.setText("");
            vista.txtPrecioBase.setText("");
            vista.txtCantidad.setText("");
            vista.cmbTipo.setSelectedIndex(0);
        }
  
        if(e.getSource()==vista.btnRealizarVenta){
            float cantidad;
            cantidad=Float.parseFloat(vista.txtCantidad.getText());
            if (bom.realizarVenta(cantidad)){
             bom.setLitrosVendidos(bom.getLitrosVendidos()+cantidad);
                   JOptionPane.showMessageDialog(null,"Costo de la venta: $"+gaso.calcularPrecio()*cantidad);
            vista.txtTotal.setText(String.valueOf(bom.calcularVentaTotal()));
            vista.txtLitros.setText(String.valueOf(bom.getLitrosVendidos()));
            vista.txtCapacidad.setText(String.valueOf(bom.revisarInventario()));
            
               }
               else
                   JOptionPane.showMessageDialog(null,"No se pudo realizar venta");
            }
        }   
        }
