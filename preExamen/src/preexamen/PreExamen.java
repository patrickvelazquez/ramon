/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preexamen;
import javax.swing.JOptionPane;
/**
 *
 * @author Kenneth Stoney Wilson Herrera
 */
public class PreExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object menu[] = {"1. Crear Producto","2. Generar Factura", "3. Calcular Subtotal", "4. Calcular Total", "5. Salir"};
        Object menuUnidad[] = {"1. Kilogramos", "2. Litros", "3. Piezas"};
        Object menuTipoPago[] = {"1. Contado", "2. Crédito"};
        int idP = 0, tipoU = 0, numero = 0, tipoPago = 0;
        float precio = 0.0f, iva = 0.0f, temper = 0.0f, cantidad = 0.0f;
        String opcMenu = "", nombreP = "", opUnidad = "",opTPago = "", fechaCad = "", fechaNV = "", fechaFactura = "", concepto = "";
        String rfc = "", nombreC = "", domFiscal = "";
        Perecedero prod = new Perecedero();
        Factura fact = new Factura();
        do{
            opcMenu = (String) JOptionPane.showInputDialog(null, "Elige una opción", "Abarrotes del Gato Feliz - Menú",
                    JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
            switch(opcMenu){
                case "1. Crear Producto":
                    idP = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el Id del Producto","Crear Producto",JOptionPane.QUESTION_MESSAGE));
                    nombreP = JOptionPane.showInputDialog(null, "Introduzca el Nombre del Producto", "Crear Producto", JOptionPane.QUESTION_MESSAGE);
                    opUnidad = (String) JOptionPane.showInputDialog(null, "Elija la Unidad de Producto", "Crear Producto", 
                            JOptionPane.QUESTION_MESSAGE, null, menuUnidad, menuUnidad[0]);
                    precio = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa el Precio Unitario", "Crear Producto", JOptionPane.QUESTION_MESSAGE));
                    fechaCad = JOptionPane.showInputDialog(null, "Introduzca la Fecha de Caducidad", "Crear Producto", JOptionPane.QUESTION_MESSAGE);
                    temper = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa la Temperatura", "Crear Producto", JOptionPane.QUESTION_MESSAGE));
                    if(opUnidad.equals("1. Kilogramos")){
                        tipoU = 1;
                    }else if(opUnidad.equals("2. Litros")){
                        tipoU = 2;
                    }else if(opUnidad.equals("3. Piezas")){
                        tipoU = 3;
                    }
                    prod.setIdProducto(idP);
                    prod.setNombre(nombreP);
                    prod.setUnidad(tipoU);
                    prod.setPrecioUnitario(precio);
                    prod.setFechaCad(fechaCad);
                    prod.setTemperatura(temper);
                    break;
                case "2. Generar Factura":
                    numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el Número de Venta","Generar Fsctura",JOptionPane.QUESTION_MESSAGE));
                    fechaNV = JOptionPane.showInputDialog(null,"Ingresa la Fecha de la Venta", "Generar Factura",JOptionPane.QUESTION_MESSAGE);
                    concepto = JOptionPane.showInputDialog(null,"Ingresa el Concepto", "Generar Factura",JOptionPane.QUESTION_MESSAGE);
                    cantidad = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingresa la Cantidad del Producto","Generar Factura",JOptionPane.QUESTION_MESSAGE));
                    opTPago = (String) JOptionPane.showInputDialog(null, "Elija la Unidad de Producto", "Crear Producto", 
                            JOptionPane.QUESTION_MESSAGE, null, menuTipoPago, menuTipoPago[0]);
                    rfc = JOptionPane.showInputDialog(null, "Ingresa el RFC del Cliente","Generar Factura",JOptionPane.QUESTION_MESSAGE);
                    nombreC = JOptionPane.showInputDialog(null, "Ingresa el Nombre del Cliente", "Generar Factura", JOptionPane.QUESTION_MESSAGE);
                    domFiscal = JOptionPane.showInputDialog(null, "Ingresa el Domicilio Fiscal", "Generar Factura", JOptionPane.QUESTION_MESSAGE);
                    fechaFactura = JOptionPane.showInputDialog(null,"Ingresa la Fecha de Facturación", "Generar Factura", JOptionPane.QUESTION_MESSAGE);
                    iva = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingresa el IVA (%)","Generar Factura",JOptionPane.QUESTION_MESSAGE));
                    if(opTPago.equals(menuTipoPago[0])){
                        tipoPago = 1;
                    }else if(opTPago.equals(menuTipoPago[1])){
                        tipoPago = 2;
                    }
                    fact.setNumero(numero);
                    fact.setFecha(fechaNV);
                    fact.setConcepto(concepto);
                    fact.setProducto(prod);
                    fact.setCantidad(cantidad);
                    fact.setTipoPago(tipoPago);
                    fact.setRfc(rfc);
                    fact.setNombre(nombreC);
                    fact.setDomFiscal(domFiscal);
                    fact.setFechaFactura(fechaFactura);
                    fact.setIva(iva);
                    break;
                case "3. Calcular Subtotal":
                    JOptionPane.showMessageDialog(null, "El precio de producto es $" + prod.calcularPrecio() +  
                            "\nEl Subtotal es: " + fact.calcularPago(), "Calcular Subtotal", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "4. Calcular Total":
                    JOptionPane.showMessageDialog(null, "\nSubtotal: " + fact.calcularPago() + 
                            "Con un impuesto de "+fact.getIva()+" % :" + fact.calcularImpuesto() + "\n El total a pagar es de $" + fact.calcularTotal(), "Calcular Total", JOptionPane.INFORMATION_MESSAGE);
                    break;
                
                case "5. Salir":
                    JOptionPane.showMessageDialog(null, "Adiós");
                    break;
            }
        }while(!opcMenu.equals("5. Salir"));
        // TODO code application logic here
        
    }
    
}
