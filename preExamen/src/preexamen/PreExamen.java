/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preexamen;
import javax.swing.JOptionPane;
/**
 *
 * @author Luis Espinoza
 */
public class PreExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int id;
        String nombre;
        int unidad;
        float precioUnitario;
        String fechaCaducidad;
        float temperatura;
        int numeroFactura;
        String fecha,concepto; 
                ProductoPerecedero producto=null;
                float cantidad;
            int tipoPago;
            String rfc, nombreCliente, domicilioFiscal, fechaFacturacion;
            float iva;
        Object menu[]={"Crear producto","Crear factura","Calcular precio producto","Calcular subtotal","Calcular impuesto","Calcular total","Salir"};
        String opcMenu="";
        ProductoPerecedero pro = new ProductoPerecedero();
        Factura fac = new Factura();
        do{
            opcMenu=(String)JOptionPane.showInputDialog(null,"Elija una opción","Menú",JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
            switch(opcMenu){
                case (String)"Crear producto":
                    
                    id=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el id del producto","Producto",JOptionPane.QUESTION_MESSAGE));
                    pro.setId(id);
                    
                    nombre=JOptionPane.showInputDialog(null,"Ingresa el nombre del producto","Producto",JOptionPane.QUESTION_MESSAGE);
                    pro.setNombre(nombre);
                    
                    unidad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa unidad \n1. Kg\n2. Litros \n3. Pieza","Producto",JOptionPane.QUESTION_MESSAGE));
                    pro.setUnidad(unidad);
                    
                    precioUnitario=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingresa el precio unitario","Producto",JOptionPane.QUESTION_MESSAGE));
                    pro.setPrecioUnitario(precioUnitario);
                    
                    fechaCaducidad=JOptionPane.showInputDialog(null,"Ingresa la fecha de caducidad","Producto",JOptionPane.QUESTION_MESSAGE);
                    pro.setFechaCaducidad(fechaCaducidad);
                    
                    temperatura=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingresa la temperatura del producto","Producto",JOptionPane.QUESTION_MESSAGE));
                    break;
                    
                case (String)"Crear factura":
                    
                    numeroFactura=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el numero de factura","Factura",JOptionPane.QUESTION_MESSAGE));
                    fac.setNumero(numeroFactura);
                    
                    fecha=JOptionPane.showInputDialog(null,"Ingresa la fecha de factura","Factura",JOptionPane.QUESTION_MESSAGE);
                    fac.setFecha(fecha);
                    
                    concepto=JOptionPane.showInputDialog(null,"Ingresa el concepto de factura","Factura",JOptionPane.QUESTION_MESSAGE);
                    fac.setConcepto(concepto);
                    
                    fac.setProducto(pro);
                    
                    cantidad=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingresa la cantidad de producto","Factura",JOptionPane.QUESTION_MESSAGE));
                    fac.setCantidad(cantidad);
                    
                    tipoPago=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el tipo de pago \n 1.Contado\n2.Credito","Factura",JOptionPane.QUESTION_MESSAGE));
                    fac.setTipoPago(tipoPago);
                    
                    rfc=JOptionPane.showInputDialog(null,"Ingresa el rfc","Factura",JOptionPane.QUESTION_MESSAGE);
                    fac.setRfc(rfc);
                    
                    nombreCliente=JOptionPane.showInputDialog(null,"Ingresa el nombre de cliente","Factura",JOptionPane.QUESTION_MESSAGE);
                    fac.setNombreCliente(nombreCliente);
                    
                    domicilioFiscal=JOptionPane.showInputDialog(null,"Ingresa el domicilio fiscal","Factura",JOptionPane.QUESTION_MESSAGE);
                    fac.setDomicilioFiscal(domicilioFiscal);
                    
                    fechaFacturacion=JOptionPane.showInputDialog(null,"Ingresa la fecha de factura","Factura",JOptionPane.QUESTION_MESSAGE);
                    fac.setFechaFacturacion(fechaFacturacion);
                    
                    iva=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingresa el IVA","Factura",JOptionPane.QUESTION_MESSAGE));
                    fac.setIva(iva);
                    
                    
                    break;
                case (String)"Calcular precio producto":
                    JOptionPane.showMessageDialog(null,"EL precio del producto es:"+pro.calcularPrecio());
                    break;
                case (String)"Calcular subtotal":
                    JOptionPane.showMessageDialog(null,"El subtotal es: "+fac.calcularPago());
                    break;
                case (String)"Calcular total":
                    JOptionPane.showMessageDialog(null,"El total es: "+fac.calcularTotal());
                    break;
                case (String)"Calcular impuesto":
                     JOptionPane.showMessageDialog(null,"El total es: "+fac.calcularImpuesto());
                     break;
            }
            
        }while(!opcMenu.equals("Salir"));
    }
    
}
