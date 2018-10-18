/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;
import javax.swing.JOptionPane;
/**
 *
 * @author SAMANTHA
 */
public class MainProductos {
    
    public static void main(String[] args) 
    {
        int id,unidad,numeroFactura,tipo;
        String nombre,fechaCaducidad,fecha,concepto,rfc, nombreCliente, domicilio, fechaFacturacion;
        float precioUnitario,temperatura,cantidad,iva;
        ProductoPerecedero producto=null;
        
        Object menu[]={"1. Crear producto","2. Crear factura","3. Calcular precio producto","4. Calcular subtotal","5. Calcular impuesto","6. Calcular total","7. Salir"};
        String opcMenu;
        ProductoPerecedero ObjetoP = new ProductoPerecedero();
        Factura ObjetoF = new Factura();
        do{
            opcMenu=(String)JOptionPane.showInputDialog(null,"Elige una opción","Menu",JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
            switch(opcMenu)
            {
                case (String)"1. Crear producto":
                    
                    id=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el ID del producto: ","Nuevo producto",JOptionPane.QUESTION_MESSAGE));
                    ObjetoP.setId(id);
                    
                    nombre=JOptionPane.showInputDialog(null,"Ingrese el nombre del producto: ","Nuevo producto",JOptionPane.QUESTION_MESSAGE);
                    ObjetoP.setNombreProducto(nombre);
                    
                    unidad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número según la unidad (1. Kg, 2. Litros, 3. Pieza): ","Nuevo producto",JOptionPane.QUESTION_MESSAGE));
                    ObjetoP.setUnidadProducto(unidad);
                    
                    precioUnitario=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el precio unitario: ","Nuevo producto",JOptionPane.QUESTION_MESSAGE));
                    ObjetoP.setPrecioUnitario(precioUnitario);
                    
                    fechaCaducidad=JOptionPane.showInputDialog(null,"Ingrese la fecha de caducidad: ","Nuevo Producto",JOptionPane.QUESTION_MESSAGE);
                    ObjetoP.setFechaCaducidad(fechaCaducidad);
                    
                    temperatura=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la temperatura del producto: ","Nuevo producto",JOptionPane.QUESTION_MESSAGE));
                    ObjetoP.setTemperatura(temperatura);
                    break;
                    
                case (String)"2. Crear factura":
                    
                    numeroFactura=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número de factura: ","Factura",JOptionPane.QUESTION_MESSAGE));
                    ObjetoF.setNumero(numeroFactura);
                    
                    fecha=JOptionPane.showInputDialog(null,"Ingrese la fecha: ","Factura",JOptionPane.QUESTION_MESSAGE);
                    ObjetoF.setFecha(fecha);
                    
                    concepto=JOptionPane.showInputDialog(null,"Ingrese el concepto: ","Factura",JOptionPane.QUESTION_MESSAGE);
                    ObjetoF.setConcepto(concepto);
                    
                    ObjetoF.setProducto(ObjetoP);
                    
                    cantidad=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la cantidad de producto: ","Factura",JOptionPane.QUESTION_MESSAGE));
                    ObjetoF.setCantidad(cantidad);
                    
                    tipo=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número segun el tipo de pago(1. Contado, 2. Credito): ","Factura",JOptionPane.QUESTION_MESSAGE));
                    ObjetoF.setTipoPago(tipo);
                    
                    rfc=JOptionPane.showInputDialog(null,"Ingrese el RFC:","Factura",JOptionPane.QUESTION_MESSAGE);
                    ObjetoF.setRfc(rfc);
                    
                    nombreCliente=JOptionPane.showInputDialog(null,"Ingrese el nombre del cliente: ","Factura",JOptionPane.QUESTION_MESSAGE);
                    ObjetoF.setNombreCliente(nombreCliente);
                    
                    domicilio=JOptionPane.showInputDialog(null,"Ingrese el domicilio fiscal: ","Factura",JOptionPane.QUESTION_MESSAGE);
                    ObjetoF.setDomicilio(domicilio);
                    
                    fechaFacturacion=JOptionPane.showInputDialog(null,"Ingrese la fecha de factura: ","Factura",JOptionPane.QUESTION_MESSAGE);
                    ObjetoF.setFechaFacturacion(fechaFacturacion);
                    
                    iva=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el IVA: ","Factura",JOptionPane.QUESTION_MESSAGE));
                    ObjetoF.setIva(iva);
                    break;
                case (String)"3. Calcular precio producto":
                    JOptionPane.showMessageDialog(null,"EL precio del producto es: "+ObjetoP.calcularPrecio());
                    break;
                case (String)"4. Calcular subtotal":
                    JOptionPane.showMessageDialog(null,"El subtotal es: "+ObjetoF.calcularPago());
                    break;
                case (String)"5. Calcular impuesto":
                    JOptionPane.showMessageDialog(null,"El total es: "+ObjetoF.calcularTotal());
                    break;
                case (String)"6. Calcular total":
                     JOptionPane.showMessageDialog(null,"El impuesto es: "+ObjetoF.calcularImpuesto());
                     break;
            }
            
        }while(!opcMenu.equals("7. Salir"));
    }
    
}
