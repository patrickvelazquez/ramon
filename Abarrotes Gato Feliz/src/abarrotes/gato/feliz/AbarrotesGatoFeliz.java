/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abarrotes.gato.feliz;
import javax.swing.JOptionPane;
/**
 *
 * @author Drago
 */
public class AbarrotesGatoFeliz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroNota, tipoPago, idProducto, unidadProducto;
        float cantidad, iva, precioUnitario, temperatura;
        Factura nuevaFactura = new Factura();
        String fecha, concepto, rfc, nombreCliente, domicilioFiscal, fechaFactura, nombreProducto, fechaCaducidad;
        
        Object menu[] = {"1.- Generar Objeto","2.- Calculo de Pago","3.- Calculo de Impuesto","4.- Calculo de Total","5.- Imprimir", "6.- Salir"};

        String opcMenu = "";
        do{
            opcMenu = (String) JOptionPane.showInputDialog(null, "Seleccione la opción deseada", "Menu", JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
            
            switch(opcMenu){
                case "1.- Generar Objeto":
                    numeroNota = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el numero de nota", "Factura", JOptionPane.QUESTION_MESSAGE));
                    fecha = JOptionPane.showInputDialog(null, "Dame la fecha", "Factura", JOptionPane.QUESTION_MESSAGE);
                    concepto = JOptionPane.showInputDialog(null, "Dame el concepto", "Factura", JOptionPane.QUESTION_MESSAGE);
                    
                    idProducto = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el id del producto", "Producto", JOptionPane.QUESTION_MESSAGE));
                    nombreProducto = JOptionPane.showInputDialog(null, "Dame el nombre del producto", "Producto", JOptionPane.QUESTION_MESSAGE);
                    do{
                        unidadProducto = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el tipo de unidad del producto \n(1- Kg | 2- Litros | 3- Pieza)", "Producto", JOptionPane.QUESTION_MESSAGE));
                    }while(unidadProducto <= 0 || unidadProducto >= 4);
                    precioUnitario = Float.parseFloat(JOptionPane.showInputDialog(null, "Dame el precio por unidad", "Producto", JOptionPane.QUESTION_MESSAGE));
                    fechaCaducidad = JOptionPane.showInputDialog(null, "Dame la fecha de caducidad del producto", "Producto", JOptionPane.QUESTION_MESSAGE);
                    temperatura = Float.parseFloat(JOptionPane.showInputDialog(null, "Dame la temperatura del producto", "Producto", JOptionPane.QUESTION_MESSAGE));
                    
                    cantidad = Float.parseFloat(JOptionPane.showInputDialog(null, "Dame la cantidad de producto a comprar", "Factura", JOptionPane.QUESTION_MESSAGE));
                    do{
                        tipoPago = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el tipo de pago \n(1- Contado | 2- Credito)", "Factura", JOptionPane.QUESTION_MESSAGE));
                    }while(tipoPago <= 0 || tipoPago >= 3);
                            
                    rfc = JOptionPane.showInputDialog(null, "Dame el rfc del cliente", "Factura", JOptionPane.QUESTION_MESSAGE);
                    nombreCliente = JOptionPane.showInputDialog(null, "Dame nombre del cliente", "Factura", JOptionPane.QUESTION_MESSAGE);
                    domicilioFiscal = JOptionPane.showInputDialog(null, "Dame el domicilio fiscal del cliente", "Factura", JOptionPane.QUESTION_MESSAGE);
                    fechaFactura = JOptionPane.showInputDialog(null, "Dame la fecha de facturación", "Factura", JOptionPane.QUESTION_MESSAGE);
                    iva = Float.parseFloat(JOptionPane.showInputDialog(null, "Dame el porcentaje de IVA", "Factura", JOptionPane.QUESTION_MESSAGE));
                    
                    nuevaFactura.setNumero(numeroNota);
                    nuevaFactura.setFecha(fecha);
                    nuevaFactura.setConcepto(concepto);
                    nuevaFactura.producto.setIdProducto(idProducto);
                    nuevaFactura.producto.setNombreProducto(nombreProducto);
                    nuevaFactura.producto.setUnidadProducto(unidadProducto);
                    nuevaFactura.producto.setPrecioUnitario(precioUnitario);
                    nuevaFactura.producto.setFechaCaducidad(fechaCaducidad);
                    nuevaFactura.producto.setTemperatura(temperatura);
                    nuevaFactura.setCantidad(cantidad);
                    nuevaFactura.setTipoPago(tipoPago);
                    nuevaFactura.setRfc(rfc);
                    nuevaFactura.setNombreCliente(nombreCliente);
                    nuevaFactura.setDomicilioFiscal(domicilioFiscal);
                    nuevaFactura.setFechaFactura(fechaFactura);
                    nuevaFactura.setIva(iva);
                    break;
                case "2.- Calculo de Pago":
                    JOptionPane.showMessageDialog(null, "El pago de la compra es: $" + nuevaFactura.calcularPago());
                    break;
                case "3.- Calculo de Impuesto":
                    JOptionPane.showMessageDialog(null, "Los impuestos de la compra son: $" + nuevaFactura.calcularImpuesto());
                    break;
                case "4.- Calculo de Total":
                    JOptionPane.showMessageDialog(null, "El total de la compra es: $" + nuevaFactura.calcularTotal());
                    break;
                case "5.- Imprimir":
                    JOptionPane.showMessageDialog(null, "\nNumero de nota: " + nuevaFactura.getNumero() + "\nFecha: " + nuevaFactura.getFecha() + "\nConcepto de compra: " + nuevaFactura.getConcepto() + "\nNombre del Producto: " + nuevaFactura.producto.getNombreProducto() + "\nUnidad del Producto (1- Kg|2- Litros|3-Pieza): " + nuevaFactura.producto.getUnidadProducto() + "\nPrecio Unitario: $" + nuevaFactura.producto.getPrecioUnitario() + "\n Precio venta: $" + nuevaFactura.producto.calcularPrecio() + "\nCantidad: " + nuevaFactura.getCantidad() + "\nTipo de Pago(1- Contado|2- Credito): " + nuevaFactura.getTipoPago() + "\nRFC del cliente: " + nuevaFactura.getRfc() + "\nNombre del Cliente: " + nuevaFactura.getNombreCliente() + "\nDomicilio Fiscal: " + nuevaFactura.getDomicilioFiscal() + "\nFecha de Factura: " + nuevaFactura.getFechaFactura() + "\nIVA: " + nuevaFactura.getIva() + "%\nCalculo de pago: $" + nuevaFactura.calcularPago() + "\nImpuestos: $" + nuevaFactura.calcularImpuesto() + "\n Total: $" + nuevaFactura.calcularTotal());
                    break;
                case "6.- Salir":
                    JOptionPane.showMessageDialog(null, "Gracias por usar este programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No es una opción valida");
            }
        }while(!"6.- Salir".equals(opcMenu));
        
    }
    
}
