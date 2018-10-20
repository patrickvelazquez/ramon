package controlador;

import modelo.Factura;
import modelo.NoPerecedero;
import modelo.NotaVenta;
import modelo.Perecedero;

import vista.GenerarFactura;
import vista.ProductoNoPerecedero;
import vista.ProductoPerecedero;
import vista.menuPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener
{
    private Perecedero productoP;
    private NoPerecedero productoNP;
    private Factura facturaNueva;
    private GenerarFactura vistaFactura;
    private ProductoNoPerecedero vistaNoPerecedero;
    private ProductoPerecedero vistaPerecedero;
    private menuPrincipal vistaPrincipal;

    public Controlador(Perecedero productoP, NoPerecedero productoNP, Factura facturaNueva, GenerarFactura vistaFactura, ProductoNoPerecedero vistaNoPerecedero, ProductoPerecedero vistaPerecedero, menuPrincipal vistaPrincipal) {
        this.productoP = productoP;
        this.productoNP = productoNP;
        this.facturaNueva = facturaNueva;
        
        this.vistaFactura = vistaFactura;
        this.vistaNoPerecedero = vistaNoPerecedero;
        this.vistaPerecedero = vistaPerecedero;
        this.vistaPrincipal = vistaPrincipal;
        
        vistaFactura.btnGuardar.addActionListener(this);
        vistaFactura.btnLimpiar.addActionListener(this);
        vistaFactura.btnMostrar.addActionListener(this);
        vistaFactura.btnSalir.addActionListener(this);
        vistaFactura.setTitle("Crear factura");
        vistaFactura.setVisible(false);
        
        vistaNoPerecedero.btnGuardar.addActionListener(this);
        vistaNoPerecedero.btnLimpiar.addActionListener(this);
        vistaNoPerecedero.btnMostrar.addActionListener(this);
        vistaNoPerecedero.btnSalir.addActionListener(this);
        vistaNoPerecedero.setTitle("Producto no perecedero");
        vistaNoPerecedero.setVisible(false);
        
        vistaPerecedero.btnGuardar.addActionListener(this);
        vistaPerecedero.btnLimpiar.addActionListener(this);
        vistaPerecedero.btnMostrar.addActionListener(this);
        vistaPerecedero.btnSalir.addActionListener(this);
        vistaPerecedero.setTitle("Producto perecedero");
        vistaPerecedero.setVisible(false);
        
        vistaPrincipal.btnCalcularSubtotal.addActionListener(this);
        vistaPrincipal.btnCalcularTotal.addActionListener(this);
        vistaPrincipal.btnGenerarFactura.addActionListener(this);
        vistaPrincipal.btnIniciarProducto.addActionListener(this);
        vistaPrincipal.btnMostrarFactura.addActionListener(this);
        vistaPrincipal.btnSalir.addActionListener(this);
        vistaPrincipal.setTitle("Menú principal");
        vistaPrincipal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==vistaPrincipal.btnCalcularSubtotal)
        {
            Object perecederos[] = {"Perecedero","No Perecedero"};
            String aux;
            aux = (String) JOptionPane.showInputDialog(null,"El producto es...","Crear producto",JOptionPane.QUESTION_MESSAGE,null,perecederos,perecederos[0]);
            if(comprobadorPerecedero(aux)==true)
            {
                JOptionPane.showMessageDialog(null, "El subtotal es: $"+productoP.precioProducto()*facturaNueva.getCantidad());
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El subtotal es: $"+productoNP.precioProducto()*facturaNueva.getCantidad());
            }
        }
        if(e.getSource()==vistaPrincipal.btnCalcularTotal)
        {
            botonTotal(productoP,productoNP,facturaNueva);
        }
        if(e.getSource()==vistaPrincipal.btnMostrarFactura)
        {
            String aux;
            Object perecederos[] = {"Perecedero","No Perecedero"};
            aux = (String) JOptionPane.showInputDialog(null,"El producto es...","Crear producto",JOptionPane.QUESTION_MESSAGE,null,perecederos,perecederos[0]);
            factura(facturaNueva,productoP,productoNP,comprobadorPerecedero(aux));
        }
        if(e.getSource()==vistaPrincipal.btnSalir)
        {
            vistaPrincipal.dispose();
        }
        if(e.getSource()==vistaPrincipal.btnIniciarProducto)
        {
            vistaPrincipal.setVisible(false);
            String aux;
            Object perecederos[] = {"Perecedero","No Perecedero"};
            aux = (String) JOptionPane.showInputDialog(null,"El producto es...","Crear producto",JOptionPane.QUESTION_MESSAGE,null,perecederos,perecederos[0]);
            if(comprobadorPerecedero(aux)==true)
            {
                vistaPerecedero.setVisible(true);
            }
            else
            {
                vistaNoPerecedero.setVisible(true);
            }
        }
        if(e.getSource()==vistaPrincipal.btnGenerarFactura)
        {
            vistaPrincipal.setVisible(false);
            vistaFactura.setVisible(true);
        }
        
        if(e.getSource()==vistaPerecedero.btnGuardar)
        {
            int facturas;
            productoP.setFechaCaducidad(vistaPerecedero.txtFechaCaducidad.getText());
            productoP.setIdProducto(Integer.parseInt(vistaPerecedero.txtID.getText()));
            productoP.setNombreProducto(vistaPerecedero.txtNombre.getText());
            productoP.setPrecioUnitario(Float.parseFloat(vistaPerecedero.txtPrecioUnitario.getText()));
            productoP.setTemperatura(Float.parseFloat(vistaPerecedero.txtTemperatura.getText()));
            productoP.setUnidadProducto((vistaPerecedero.txtUnidad.getName()));
            facturas = JOptionPane.showConfirmDialog(null, "¿Desea generar factura?");
            if(facturas == JOptionPane.YES_OPTION)
            {
                vistaPerecedero.setVisible(false);
                vistaPerecedero.dispose();
                vistaFactura.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Datos guardados con éxito");
                vistaPerecedero.setVisible(false);
                vistaPerecedero.dispose();
                vistaPrincipal.setVisible(true);
            }            
        }
        if(e.getSource()==vistaPerecedero.btnLimpiar)
        {
            vistaPerecedero.txtFechaCaducidad.setText("");
            vistaPerecedero.txtID.setText("");
            vistaPerecedero.txtNombre.setText("");
            vistaPerecedero.txtPrecioUnitario.setText("");
            vistaPerecedero.txtTemperatura.setText("");
            vistaPerecedero.txtUnidad.setToolTipText("");
        }
        if(e.getSource()==vistaPerecedero.btnMostrar)
        {
            vistaPerecedero.txtFechaCaducidad.setText(String.valueOf(productoP.getFechaCaducidad()));
            vistaPerecedero.txtID.setText(String.valueOf(productoP.getIdProducto()));
            vistaPerecedero.txtNombre.setText(String.valueOf(productoP.getNombreProducto()));
            vistaPerecedero.txtPrecioUnitario.setText(String.valueOf(productoP.getPrecioUnitario()));
            vistaPerecedero.txtTemperatura.setText(String.valueOf(productoP.getTemperatura()));
            vistaPerecedero.txtUnidad.setSelectedItem(productoP.getUnidadProducto());
        }
        if(e.getSource()==vistaPerecedero.btnSalir)
        {
            vistaPerecedero.setVisible(false);
            vistaPerecedero.dispose();
            vistaPrincipal.setVisible(true);
        }
        if(e.getSource()==vistaNoPerecedero.btnGuardar)
        {
            int facturas;
            productoNP.setIdProducto(Integer.parseInt(vistaNoPerecedero.txtID.getText()));
            productoNP.setNombreProducto(vistaNoPerecedero.txtNombre.getText());
            productoNP.setPrecioUnitario(Float.parseFloat(vistaNoPerecedero.txtPrecioUnitario.getText()));
            productoNP.setUnidadProducto((vistaNoPerecedero.txtUnidad.getName()));
            productoNP.setLoteFabricacion(vistaNoPerecedero.txtLoteFabricacion.getText());
            facturas = JOptionPane.showConfirmDialog(null, "¿Desea generar factura?");
            if(facturas == JOptionPane.YES_OPTION)
            {
                vistaNoPerecedero.setVisible(false);
                vistaNoPerecedero.dispose();
                vistaFactura.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Datos guardados con éxito");
                vistaNoPerecedero.setVisible(false);
                vistaNoPerecedero.dispose();
                vistaPrincipal.setVisible(true);
            }            
        }
        if(e.getSource()==vistaNoPerecedero.btnLimpiar)
        {
            vistaNoPerecedero.txtID.setText("");
            vistaNoPerecedero.txtNombre.setText("");
            vistaNoPerecedero.txtPrecioUnitario.setText("");
            vistaNoPerecedero.txtUnidad.setToolTipText("");
            vistaNoPerecedero.txtLoteFabricacion.setText("");
        }
        if(e.getSource()==vistaNoPerecedero.btnSalir)
        {
            vistaNoPerecedero.setVisible(false);
            vistaNoPerecedero.dispose();
            vistaPrincipal.setVisible(true);
        }
        if(e.getSource()==vistaFactura.btnGuardar)
        {
            facturaNueva.setCantidad(Integer.parseInt(vistaFactura.txtCantidadProducto.getText()));
            facturaNueva.setConcepto(vistaFactura.txtConcepto.getText());
            facturaNueva.setDomicilio(vistaFactura.txtDomicilio.getText());
            facturaNueva.setFecha(vistaFactura.txtFecha.getText());
            facturaNueva.setIva(Float.parseFloat(vistaFactura.txtIVA.getText()));
            facturaNueva.setNombreCliente(vistaFactura.txtNombreCliente.getText());
            facturaNueva.setNumeroNota(Integer.parseInt("1"));
            facturaNueva.setRfc(vistaFactura.txtRFC.getText());
            facturaNueva.setTipoPago(String.valueOf(vistaFactura.txtMetodoPago));
        }
        if(e.getSource()==vistaFactura.btnLimpiar)
        {
            vistaFactura.txtCantidadProducto.setText("");
            vistaFactura.txtConcepto.setText("");
            vistaFactura.txtDomicilio.setText("");
            vistaFactura.txtFecha.setText("");
            vistaFactura.txtIVA.setText("");
            vistaFactura.txtNombreCliente.setText("");
            vistaFactura.txtRFC.setText("");
            
        }
        if(e.getSource()==vistaFactura.btnMostrar)
        {
            vistaFactura.txtCantidadProducto.setText(String.valueOf(facturaNueva.getCantidad()));
            vistaFactura.txtConcepto.setText(String.valueOf(facturaNueva.getConcepto()));
            vistaFactura.txtDomicilio.setText(String.valueOf(facturaNueva.getDomicilio()));
            vistaFactura.txtFecha.setText(String.valueOf(facturaNueva.getFecha()));
            vistaFactura.txtIVA.setText(String.valueOf(facturaNueva.getIva()));
            vistaFactura.txtNombreCliente.setText(String.valueOf(facturaNueva.getNombreCliente()));
            vistaFactura.txtRFC.setText(String.valueOf(facturaNueva.getRfc()));
        }
        if(e.getSource()==vistaFactura.btnSalir)
        {
            vistaFactura.setVisible(false);
            vistaFactura.dispose();
            vistaPrincipal.setVisible(true);
        }
    }
  
    private static boolean comprobadorPerecedero(String aux)
    {
        boolean salida = false;
        if(aux.equals("Perecedero"))
            salida = true;
        return salida;
    }
    private static void factura(Factura facturaNueva,Perecedero productoP,NoPerecedero productoNP,boolean perecederos)
    {
        String aux;
  
        if(perecederos == true)
        {
            if(facturaNueva.getTipoPago().equals("Efectivo"))
            {
                JOptionPane.showMessageDialog(null, "Datos de la factura\n--------------\n\n"+"Número nota: "+facturaNueva.getNumeroNota()+"\nCantidad: "+facturaNueva.getCantidad()+"\nTipo de pago: Efectivo"+"\nFecha: "+facturaNueva.getFecha()+"\nConcepto: "+facturaNueva.getConcepto()+
                    "\nRFC: "+facturaNueva.getRfc()+"\nNombre del cliente: "+facturaNueva.getNombreCliente()+"\nDomicilio fiscal: "+facturaNueva.getDomicilio()+
                "\nIVA: "+facturaNueva.getIva()+"\nDatos del producto\n----------------------\nTipo de producto: Perecedero"+"\nID Producto: "+productoP.getIdProducto()+"'\nUnidad del producto: "+productoP.getUnidadProducto()+
                     "\nNombre del producto: "+productoP.getNombreProducto()+"\nFecha caducidad: "+productoP.getFechaCaducidad()+"\nTemperatura: "+productoP.getTemperatura()+"\nPrecio del producto: " + productoP.precioProducto());
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Datos de la factura\n--------------\n\n"+"Número nota: "+facturaNueva.getNumeroNota()+"\nCantidad: "+facturaNueva.getCantidad()+"\nTipo de pago: Tarjeta de crédito"+"\nFecha: "+facturaNueva.getFecha()+"\nConcepto: "+facturaNueva.getConcepto()+
                    "\nRFC: "+facturaNueva.getRfc()+"\nNombre del cliente: "+facturaNueva.getNombreCliente()+"\nDomicilio fiscal: "+facturaNueva.getDomicilio()+
                "\nIVA: "+facturaNueva.getIva()+"\nDatos del producto\n----------------------\nTipo de producto: Perecedero"+"\nID Producto: "+productoP.getIdProducto()+"'\nUnidad del producto: "+productoP.getUnidadProducto()+
                     "\nNombre del producto: "+productoP.getNombreProducto()+"\nFecha caducidad: "+productoP.getFechaCaducidad()+"\nTemperatura: "+productoP.getTemperatura()+"\nPrecio del producto: " + productoP.precioProducto());
            }
        }
        else
        {
            if(facturaNueva.getTipoPago().equals("Efectivo"))
            {
                JOptionPane.showMessageDialog(null, "Datos de la factura\n--------------\n\n"+"Número nota: "+facturaNueva.getNumeroNota()+"\nCantidad: "+facturaNueva.getCantidad()+"\nTipo de pago: Efectivo"+"\nFecha: "+facturaNueva.getFecha()+"\nConcepto: "+facturaNueva.getConcepto()+
                    "\nRFC: "+facturaNueva.getRfc()+"\nNombre del cliente: "+facturaNueva.getNombreCliente()+"\nDomicilio fiscal: "+facturaNueva.getDomicilio()+
                "\nIVA: "+facturaNueva.getIva()+"\nDatos del producto\n----------------------\nTipo de producto: No Perecedero"+"\nID Producto: "+productoNP.getIdProducto()+"\nUnidad del producto: "+productoNP.getUnidadProducto()+
                    "\nNombre del producto: "+productoNP.getNombreProducto()+"\nLote de Fabricación: "+productoNP.getLoteFabricacion()+"\nPrecio del producto: "+productoNP.precioProducto());
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Datos de la factura\n--------------\n\n"+"Número nota: "+facturaNueva.getNumeroNota()+"\nCantidad: "+facturaNueva.getCantidad()+"\nTipo de pago: Tarjeta de crédito"+"\nFecha: "+facturaNueva.getFecha()+"\nConcepto: "+facturaNueva.getConcepto()+
                    "\nRFC: "+facturaNueva.getRfc()+"\nNombre del cliente: "+facturaNueva.getNombreCliente()+"\nDomicilio fiscal: "+facturaNueva.getDomicilio()+
                "\nIVA: "+facturaNueva.getIva()+"\nDatos del producto\n----------------------\nTipo de producto: No Perecedero"+"\nID Producto: "+productoNP.getIdProducto()+"\nUnidad del producto: "+productoNP.getUnidadProducto()+
                    "\nNombre del producto: "+productoNP.getNombreProducto()+"\nLote de Fabricación: "+productoNP.getLoteFabricacion()+"\nPrecio del producto: "+productoNP.precioProducto());
                
            }
        }
    }
    private static void botonTotal(Perecedero productoP,NoPerecedero productoNP,Factura facturaNueva)
    {
        String aux;
            Object perecederos[] = {"Perecedero","No Perecedero"};
            aux = (String) JOptionPane.showInputDialog(null,"El producto es...","Crear producto",JOptionPane.QUESTION_MESSAGE,null,perecederos,perecederos[0]);
            if(comprobadorPerecedero(aux)==true)
            {
                float iva = productoP.precioProducto()*facturaNueva.getIva();
                float total = (productoP.precioProducto()*facturaNueva.getCantidad())+iva;
                JOptionPane.showMessageDialog(null, "El subtotal es: $"+productoP.precioProducto()*facturaNueva.getCantidad()+"\nEl impuesto es: $"+productoP.precioProducto()*facturaNueva.getIva()+
                        "\nTotal a pagar es: $"+total);
            }
            else
            {
                float iva = productoNP.precioProducto()*facturaNueva.getIva();
                float total = (productoNP.precioProducto()*facturaNueva.getCantidad())+iva;
                JOptionPane.showMessageDialog(null, "El subtotal es: $"+productoNP.precioProducto()*facturaNueva.getCantidad()+"\nEl impuesto es: $"+productoNP.precioProducto()*facturaNueva.getIva()+
                        "\nTotal a pagar es: $"+total);
            }
    }
}