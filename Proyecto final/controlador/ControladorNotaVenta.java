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
import modelo.Factura;
import modelo.ProductoPerecedero;
import vista.vdlgNotaVenta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ControladorNotaVenta implements ActionListener {
    
    private Factura fac;
    private ProductoPerecedero pro;
    private vdlgNotaVenta vista;
    
   public ControladorNotaVenta(Factura fac, ProductoPerecedero pro, vdlgNotaVenta vista){
       
       this.fac=fac;
       this.pro=pro;
       this.vista=vista;
       vista.btnGuardar.addActionListener(this);
       vista.btnLimpiar.addActionListener(this);
       vista.btnMostrar.addActionListener(this);
       vista.btnCalcular.addActionListener(this);
       vista.setTitle("Nota de Venta");
       vista.setVisible(true);
               
       
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==vista.btnGuardar){
            
            pro.setId(Integer.parseInt(vista.txtIdProducto.getText()));
            pro.setFechaCaducidad(vista.txtFechaCaducidad.getText());
            pro.setNombre(vista.txtNombreProducto.getText());
            pro.setPrecioUnitario(Float.parseFloat(vista.txtPrecioUnitario1.getText()));
            pro.setTemperatura(Float.parseFloat(vista.txtTemperatura.getText()));
            pro.setUnidad(vista.cmbUnidad.getSelectedIndex());
            fac.setCantidad(Float.parseFloat(vista.txtCantidad.getText()));
            fac.setConcepto(vista.txtConcepto.getText());
            fac.setDomicilioFiscal(vista.txtDomicilio.getText());
            fac.setFecha(vista.txtFecha.getText());
            fac.setIva(Float.parseFloat(vista.txtIva.getText()));
            fac.setNombreCliente(vista.txtNombreCliente.getText());
            fac.setNumero(Integer.parseInt(vista.txtNumNota.getText()));
            fac.setProducto(pro);
            fac.setRfc(vista.txtRfc.getText());
            fac.setTipoPago(vista.cmbTipoPago.getSelectedIndex());
        }
        if(e.getSource()==vista.btnMostrar){
            
           vista.txtCantidad.setText(String.valueOf(fac.getCantidad()));
           vista.txtConcepto.setText(String.valueOf(fac.getConcepto()));
           vista.txtDomicilio.setText(String.valueOf(fac.getDomicilioFiscal()));
           vista.txtFecha.setText(String.valueOf(fac.getFecha()));
           vista.txtIva.setText(String.valueOf(fac.getIva()));
           vista.txtNumNota.setText(String.valueOf(fac.getNumero()));
           vista.txtNombreCliente.setText(String.valueOf(fac.getNombreCliente()));
           vista.txtRfc.setText(String.valueOf(fac.getRfc()));
           vista.cmbTipoPago.setSelectedIndex(fac.getTipoPago());
           vista.txtIdProducto.setText(String.valueOf(pro.getId()));
           vista.txtNombreProducto.setText(String.valueOf(pro.getNombre()));
           vista.txtPrecioUnitario1.setText(String.valueOf(pro.getPrecioUnitario()));
           vista.txtTemperatura.setText(String.valueOf(pro.getTemperatura()));
           vista.txtFechaCaducidad.setText(String.valueOf(pro.getFechaCaducidad()));
           vista.cmbUnidad.setSelectedIndex(pro.getUnidad());
        }
        if(e.getSource()==vista.btnLimpiar){
            
           vista.txtCantidad.setText("");
           vista.txtConcepto.setText("");
           vista.txtDomicilio.setText("");
           vista.txtFecha.setText("");
           vista.txtIva.setText("");
           vista.txtNumNota.setText("");
           vista.txtRfc.setText("");
           vista.cmbTipoPago.setSelectedIndex(0);
           vista.txtIdProducto.setText("");
           vista.txtNombreProducto.setText("");
           vista.txtPrecioUnitario1.setText("");
           vista.txtTemperatura.setText("");
           vista.txtFechaCaducidad.setText("");
           vista.txtNombreCliente.setText("");
           vista.txtTotal.setText("");
           vista.txtImpuesto.setText("");
           vista.txtPago.setText("");
           vista.txtPrecioProducto.setText("");
           vista.cmbUnidad.setSelectedIndex(0);
        }
        if(e.getSource()==vista.btnCalcular){
            vista.txtTotal.setText(String.valueOf(fac.calcularTotal()));
            vista.txtImpuesto.setText(String.valueOf(fac.calcularImpuesto()));
            vista.txtPago.setText(String.valueOf(fac.calcularPago()));
            vista.txtPrecioProducto.setText(String.valueOf(pro.calcularPrecio()));
            
        }
        
                }
    
    
    
}
