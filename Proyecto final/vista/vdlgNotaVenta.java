/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Luis Espinoza
 */
public class vdlgNotaVenta extends javax.swing.JDialog {

    /**
     * Creates new form vdlgNotaVenta
     */
    public vdlgNotaVenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtNumNota = new javax.swing.JTextField();
        txtFechaCaducidad = new javax.swing.JTextField();
        txtConcepto = new javax.swing.JTextField();
        txtIdProducto = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        cmbUnidad = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTemperatura = new javax.swing.JTextField();
        txtPrecioUnitario1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtPrecioProducto = new javax.swing.JTextField();
        txtImpuesto = new javax.swing.JTextField();
        txtPago = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        cmbTipoPago = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtIva = new javax.swing.JTextField();
        txtRfc = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Número de nota:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 24, -1, -1));

        jLabel2.setText("Fecha:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, -1, -1));

        jLabel3.setText("Concepto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 88, -1, -1));

        jLabel4.setText("ID Producto:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 123, -1, -1));

        jLabel5.setText("Nombre del producto:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 155, -1, -1));

        jLabel6.setText("Unidad del producto:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 187, -1, -1));

        jLabel7.setText("Precio unitario:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 219, -1, -1));

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 102, -1));

        txtNumNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumNotaActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 102, -1));

        txtFechaCaducidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaCaducidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtFechaCaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 102, -1));

        txtConcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConceptoActionPerformed(evt);
            }
        });
        jPanel1.add(txtConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 102, -1));

        txtIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProductoActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 102, -1));

        txtNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductoActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 102, -1));

        cmbUnidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kg", "Litro", "Pieza" }));
        jPanel1.add(cmbUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 100, -1));

        jLabel16.setText("Fecha caducidad:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 102, -1));

        jLabel10.setText("Cantidad:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel9.setText("Temperatura:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        txtTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperaturaActionPerformed(evt);
            }
        });
        jPanel1.add(txtTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 102, -1));

        txtPrecioUnitario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioUnitario1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecioUnitario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 102, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 290, 370));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Tipo de pago:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel12.setText("Precio del producto:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel13.setText("Pago:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel14.setText("Impuesto:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel15.setText("Total:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        btnMostrar.setText("Mostrar");
        jPanel2.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        btnCalcular.setText("Calcular");
        jPanel2.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        btnLimpiar.setText("Limpiar");
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        txtPrecioProducto.setEnabled(false);
        txtPrecioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioProductoActionPerformed(evt);
            }
        });
        jPanel2.add(txtPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 102, -1));

        txtImpuesto.setEnabled(false);
        txtImpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImpuestoActionPerformed(evt);
            }
        });
        jPanel2.add(txtImpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 102, -1));

        txtPago.setEnabled(false);
        txtPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagoActionPerformed(evt);
            }
        });
        jPanel2.add(txtPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 102, -1));

        txtTotal.setEnabled(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        jPanel2.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 102, -1));

        cmbTipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contado", "Credito" }));
        jPanel2.add(cmbTipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 100, -1));

        jLabel8.setText("IVA:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel19.setText("Domicilio fiscal:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel18.setText("Nombre del cliente:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel17.setText("RFC:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIvaActionPerformed(evt);
            }
        });
        jPanel2.add(txtIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 102, -1));

        txtRfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRfcActionPerformed(evt);
            }
        });
        jPanel2.add(txtRfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 102, -1));

        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 102, -1));

        txtDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDomicilioActionPerformed(evt);
            }
        });
        jPanel2.add(txtDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 102, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 400, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioProductoActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtImpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImpuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImpuestoActionPerformed

    private void txtPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPagoActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperaturaActionPerformed

    private void txtNumNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumNotaActionPerformed

    private void txtFechaCaducidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaCaducidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaCaducidadActionPerformed

    private void txtConceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConceptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConceptoActionPerformed

    private void txtIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProductoActionPerformed

    private void txtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoActionPerformed

    private void txtIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIvaActionPerformed

    private void txtPrecioUnitario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioUnitario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioUnitario1ActionPerformed

    private void txtRfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRfcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRfcActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void txtDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDomicilioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vdlgNotaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vdlgNotaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vdlgNotaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vdlgNotaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vdlgNotaVenta dialog = new vdlgNotaVenta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCalcular;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnMostrar;
    public javax.swing.JComboBox<String> cmbTipoPago;
    public javax.swing.JComboBox<String> cmbUnidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField txtCantidad;
    public javax.swing.JTextField txtConcepto;
    public javax.swing.JTextField txtDomicilio;
    public javax.swing.JTextField txtFecha;
    public javax.swing.JTextField txtFechaCaducidad;
    public javax.swing.JTextField txtIdProducto;
    public javax.swing.JTextField txtImpuesto;
    public javax.swing.JTextField txtIva;
    public javax.swing.JTextField txtNombreCliente;
    public javax.swing.JTextField txtNombreProducto;
    public javax.swing.JTextField txtNumNota;
    public javax.swing.JTextField txtPago;
    public javax.swing.JTextField txtPrecioProducto;
    public javax.swing.JTextField txtPrecioUnitario1;
    public javax.swing.JTextField txtRfc;
    public javax.swing.JTextField txtTemperatura;
    public javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
