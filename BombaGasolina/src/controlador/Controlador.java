package controlador;

import modelo.BombaGasolina;

import vista.Gasolina;
import vista.Bomba;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener
{
    private BombaGasolina nuevo;
    private Gasolina vista;
    private Bomba vista2;

    public Controlador(BombaGasolina nuevo, Gasolina vista,Bomba vista2)
    {
        this.nuevo = nuevo;
        this.vista = vista;
        this.vista2=vista2;
        vista.btnHacerVenta.addActionListener(this);
        vista.btnIniciarBomba.addActionListener(this);
        vista.btnRevisar.addActionListener(this);
        vista.btnSalir.addActionListener(this);
        vista.btnTotal.addActionListener(this);
        vista.setTitle("Gasolinera NISPU");
        vista.setVisible(true);
        vista2.btnGuardar.addActionListener(this);
        vista2.btnLimpiar.addActionListener(this);
        vista2.btnMostrar.addActionListener(this);
        vista2.btnSalir.addActionListener(this);
        vista2.setTitle("Iniciar bomba");
        vista2.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==vista.btnSalir)
        {
            vista.setVisible(false);
            this.vista.dispose();
        }
        if(e.getSource()==vista.btnIniciarBomba)
        {
            vista.setVisible(false);
            vista2.setVisible(true);
        }
        if(e.getSource()==vista.btnHacerVenta)
        {
            realizarVenta(nuevo);
        }
        if(e.getSource()==vista.btnRevisar)
        {
            JOptionPane.showMessageDialog(null, "Hay "+nuevo.revisarInventario() + " litros de "+nuevo.getCapacidad()+" litros"+"\nDe la marca de gasolina: "+nuevo.getTipoGasolina().getMarca()+"\nDel tipo: "+nuevo.getTipoGasolina().getTipo());
        }
        if(e.getSource()==vista.btnTotal)
        {
            JOptionPane.showMessageDialog(null, "La venta total es de: $"+nuevo.calcularVentaTotal()+"\nLa marca de gasolina es: "+nuevo.getTipoGasolina().getMarca()+"\nDel tipo: "+nuevo.getTipoGasolina().getTipo()+ " cuyo precio base es de: "+nuevo.getTipoGasolina().getPrecioBase()+
                            "\nY precio en venta: "+nuevo.getTipoGasolina().calcularPrecio());
        }
        if(e.getSource()==vista2.btnGuardar)
        {
            nuevo.setNumBomba(1);
            nuevo.setCapacidad(1000);
            nuevo.setLitrosVendidos(0);
            nuevo.getTipoGasolina().setIdGasolina(Integer.parseInt(vista2.txtID.getText()));
            nuevo.getTipoGasolina().setMarca(vista2.txtMarca.getText());
            nuevo.getTipoGasolina().setPrecioBase(Float.parseFloat(vista2.txtPrecioBase.getText()));
            nuevo.getTipoGasolina().setTipo(Integer.parseInt(vista2.txtTipoGasolina.getText()));
        }
        if(e.getSource()==vista2.btnLimpiar)
        {
            vista2.txtID.setText("");
            vista2.txtMarca.setText("");
            vista2.txtPrecioBase.setText("");
            vista2.txtTipoGasolina.setText("");
        }
        if(e.getSource()==vista2.btnMostrar)
        {
            vista2.txtID.setText(String.valueOf(nuevo.getTipoGasolina().getIdGasolina()));
            vista2.txtMarca.setText(String.valueOf(nuevo.getTipoGasolina().getMarca()));
            vista2.txtPrecioBase.setText(String.valueOf(nuevo.getTipoGasolina().getPrecioBase()));
            vista2.txtTipoGasolina.setText(String.valueOf(nuevo.getTipoGasolina().getTipo()));
        }
        if(e.getSource()==vista2.btnSalir)
        {
            vista2.setVisible(false);
            vista.setVisible(true);
        }
    }
     private static void realizarVenta(BombaGasolina nuevo)
    {
        boolean salida = false;
        String aux,opcMenu,marca;
        int tipo,respuesta = 0;
        float litros,total=0;
        if(nuevo.revisarInventario()==0)
            JOptionPane.showMessageDialog(null, "No hay gasolina");
        else
        {
            do
            {
                aux = (String) JOptionPane.showInputDialog(null,"¿Cuántos litros de gasolina desea?","Venta gasolina",JOptionPane.QUESTION_MESSAGE);
                litros = Float.parseFloat(aux);
                total = nuevo.realizarVenta(litros);
                if(total==0)
                {
                    JOptionPane.showMessageDialog(null, "No contamos con esa cantidad de litros");
                    salida = true;
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "La cantidad a pagar es de: $"+total);
                    salida = true;
                }
            }while(salida==false);
        }
    }
    
}
