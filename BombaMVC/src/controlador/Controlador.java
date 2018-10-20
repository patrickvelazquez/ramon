/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.Gasolina;
import modelo.Bomba;
import vista.vdlgBomba;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Kenneth Wilson
 */
public class Controlador implements ActionListener{
    private Bomba bomba;
    private vdlgBomba dlgB;
    
    public Controlador(Bomba bomba, vdlgBomba dlgB){
        this.bomba = bomba;
        this.dlgB = dlgB;
        dlgB.btnGuardar.addActionListener(this);
        dlgB.btnInventario.addActionListener(this);
        dlgB.btnLimpiar.addActionListener(this);
        dlgB.btnMostrar.addActionListener(this);
        dlgB.btnVender.addActionListener(this);
        dlgB.btnVentaTotal.addActionListener(this);
        dlgB.setVisible(true);
        dlgB.setTitle("Bomba");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == dlgB.btnGuardar)
        {
            
            Gasolina gasolina = new Gasolina(Integer.parseInt(dlgB.txtIdGasolina.getText()),
                dlgB.txtMarca.getText(), dlgB.cmbTipoG.getSelectedIndex() + 1, Float.parseFloat(dlgB.txtPrecioBase.getText()));
            bomba.setNumBomba(Integer.parseInt(dlgB.txtNumBomba.getText()));
            bomba.setCapacidad(Integer.parseInt(dlgB.txtCapacidad.getText()));
            bomba.setTipoGasolina(gasolina);
        }
        else if(e.getSource() == dlgB.btnLimpiar)
        {
            dlgB.txtCapacidad.setText("");
            dlgB.txtMarca.setText("");
            dlgB.txtIdGasolina.setText("");
            dlgB.txtPrecioBase.setText("");
            dlgB.txtNumBomba.setText("");
            dlgB.cmbTipoG.setSelectedIndex(-1);
        }
        else if(e.getSource() == dlgB.btnInventario)
        {
            JOptionPane.showMessageDialog(null, "El inventario total es " + bomba.revisarInventario(), "Inventario", JOptionPane.WARNING_MESSAGE);
        }
        else if (e.getSource() == dlgB.btnMostrar)
        {
            dlgB.txtCapacidad.setText(String.valueOf(bomba.getCapacidad()));
            dlgB.txtIdGasolina.setText(String.valueOf(bomba.getTipoGasolina().getIdGasolina()));
            dlgB.txtMarca.setText(bomba.getTipoGasolina().getMarca());
            dlgB.txtPrecioBase.setText(String.valueOf(bomba.getTipoGasolina().getPrecioBase()));
            dlgB.txtNumBomba.setText(String.valueOf(bomba.getNumBomba()));
            dlgB.cmbTipoG.setSelectedIndex(bomba.getTipoGasolina().getTipo() - 1);
        }
        else if(e.getSource() == dlgB.btnVentaTotal)
        {
            JOptionPane.showMessageDialog(null, "la venta total es de $" + bomba.calcularVentaTotal(), "Venta Total", JOptionPane.WARNING_MESSAGE);

        }
        else if(e.getSource() == dlgB.btnVender)
        {

            if(dlgB.txtVender.getText().matches(""))
            {
                JOptionPane.showMessageDialog(null, "Introduce la cantidad de litros vendidos", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                float venta = bomba.vender(Integer.parseInt(dlgB.txtVender.getText()));
                if(venta<=0)
                {
                    JOptionPane.showMessageDialog(null, "No se puede realizar la venta", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "El total de venta es de $" + venta, "Vender", JOptionPane.QUESTION_MESSAGE);
                }
            }
        }
    }
    
}
