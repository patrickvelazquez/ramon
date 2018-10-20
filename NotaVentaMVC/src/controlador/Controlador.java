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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Kenneth Wilson
 */

public class Controlador implements ActionListener{
    private Factura fact;
    private vdlgNotaVenta dlgNV;
    public Controlador(Factura fact, vdlgNotaVenta dlgNV){
        this.fact = fact;
        this.dlgNV = dlgNV;
        dlgNV.btnGuardar.addActionListener(this);
        dlgNV.btnMostrar.addActionListener(this);
        dlgNV.btnLimpiar.addActionListener(this);
        dlgNV.btnCalSubtotal.addActionListener(this);
        dlgNV.btnCalTotal.addActionListener(this);
        dlgNV.setVisible(true);
        dlgNV.setTitle("Nota venta");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == dlgNV.btnGuardar){
            fact.setDomFiscal(dlgNV.txtDomFiscal.getText());
            fact.setFechaFactura(dlgNV.txtFechaFactura.getText());
            fact.setIva(Integer.parseInt(dlgNV.txtIva.getText()));
            fact.setNombre(dlgNV.txtNombreC.getText());
            fact.setRfc(dlgNV.txtRfc.getText());
            fact.setFecha(dlgNV.txtFechaV.getText());
            fact.setConcepto(dlgNV.txtConcepto.getText());
            fact.setNumero(Integer.parseInt(dlgNV.txtNumVenta.getText()));
            fact.setCantidad(Float.parseFloat(dlgNV.txtCantidad.getText()));
            fact.setTipoPago(dlgNV.cmbTipoPago.getSelectedIndex() + 1);
            Perecedero prod = new Perecedero(Integer.parseInt(dlgNV.txtIdProducto.getText()), dlgNV.txtNombreP.getText(), dlgNV.cmbUnidad.getSelectedIndex() + 1,
                    Float.parseFloat(dlgNV.txtPrecioU.getText()), dlgNV.txtFechaCaducidad.getText(), Integer.parseInt(dlgNV.txtTemperatura.getText()));
            fact.setProducto(prod);
        }
        else if(e.getSource() == dlgNV.btnMostrar){
            dlgNV.txtCantidad.setText(String.valueOf(fact.getCantidad()));
            dlgNV.txtConcepto.setText(fact.getConcepto());
            dlgNV.txtDomFiscal.setText(fact.getDomFiscal());
            dlgNV.txtFechaV.setText(fact.getFecha());
            dlgNV.txtFechaCaducidad.setText(fact.getProducto().getFechaCad());
            dlgNV.txtFechaFactura.setText(fact.getFechaFactura());
            dlgNV.txtIdProducto.setText(String.valueOf(fact.getProducto().getIdProducto()));
            dlgNV.txtIva.setText(String.valueOf(fact.getIva()));
            dlgNV.txtNombreC.setText(fact.getNombre());
            dlgNV.txtNombreP.setText(fact.getProducto().getNombre());
            dlgNV.txtNumVenta.setText(String.valueOf(fact.getNumero()));
            dlgNV.txtPrecioU.setText(String.valueOf(fact.getProducto().getPrecioUnitario()));
            dlgNV.txtRfc.setText(fact.getRfc());
            dlgNV.txtTemperatura.setText(String.valueOf(fact.getProducto().getTemperatura()));
            dlgNV.cmbTipoPago.setSelectedIndex(fact.getTipoPago() - 1);
            dlgNV.cmbUnidad.setSelectedIndex(fact.getProducto().getUnidad() - 1);
        }
        else if(e.getSource() == dlgNV.btnLimpiar){
            dlgNV.txtCantidad.setText("");
            dlgNV.txtConcepto.setText("");
            dlgNV.txtDomFiscal.setText("");
            dlgNV.txtFechaV.setText("");
            dlgNV.txtFechaCaducidad.setText("");
            dlgNV.txtFechaFactura.setText("");
            dlgNV.txtIdProducto.setText("");
            dlgNV.txtIva.setText("");
            dlgNV.txtNombreC.setText("");
            dlgNV.txtNombreP.setText("");
            dlgNV.txtNumVenta.setText("");
            dlgNV.txtPrecioU.setText("");
            dlgNV.txtRfc.setText("");
            dlgNV.txtTemperatura.setText("");
            dlgNV.cmbUnidad.setSelectedIndex(-1);
            dlgNV.cmbTipoPago.setSelectedIndex(-1);
        }
        else if(e.getSource() == dlgNV.btnCalSubtotal){
            JOptionPane.showMessageDialog(null, "El precio de producto es $" + fact.getProducto().calcularPrecio() +  
                            "\nEl Subtotal es $" + fact.calcularPago(), "Calcular Subtotal", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(e.getSource() == dlgNV.btnCalTotal){
            JOptionPane.showMessageDialog(null, "\nSubtotal $" + fact.calcularPago() + 
                    "\nCon un impuesto de "+fact.getIva()+" % : $" + fact.calcularImpuesto() + 
                    "\n El total a pagar es de $" + fact.calcularTotal(), "Calcular Total", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
}
