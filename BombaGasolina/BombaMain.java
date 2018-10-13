/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;
import javax.swing.JOptionPane;
/**
 *
 * @author Luis Espinoza
 */
public class BombaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Object menu[]={"Iniciar bomba","Hacer venta","Revisar inventario","Total venta","Salir"};
    Bomba bom=new Bomba();
    Gasolina gaso=new Gasolina();
    String opcMenu="";
    int numBomba,idGasolina,tipoGasolina;
    float capacidadLts, litrosVendidos, precioBase,cantidad;
    String marca;
    do
    {
        opcMenu=(String)JOptionPane.showInputDialog(null,"Elija una opción","Menú",JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
        switch(opcMenu){
            case (String)"Iniciar bomba":
                numBomba=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa número de bomba"));
                bom.setNumBomba(numBomba);
                
                idGasolina=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa id de Gasolina"));
                gaso.setIdGasolina(idGasolina);
                
                tipoGasolina=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa tipo de gasolina","Bomba Gasolina",JOptionPane.QUESTION_MESSAGE));
                gaso.setTipo(tipoGasolina);
                
                precioBase=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingresa precio base de gasolina","Bomba Gasolina",JOptionPane.QUESTION_MESSAGE));
                gaso.setPrecioBase(precioBase);
                
                marca=JOptionPane.showInputDialog(null,"Ingresa la marca de gasolina","Bomba Gasolina",JOptionPane.QUESTION_MESSAGE);
                gaso.setMarca(marca);
                
                bom.setGasolina(gaso);
                
                
                 break;
            case (String)"Hacer venta":
                cantidad=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingresa cantidad","Realizar venta",JOptionPane.QUESTION_MESSAGE));
               if(bom.realizarVenta(cantidad))
               {
                   
                   bom.setLitrosVendidos(bom.getLitrosVendidos()+cantidad);
                   JOptionPane.showMessageDialog(null,"Costo de la venta: $"+gaso.calcularPrecio()*cantidad);
               }
               else
                   JOptionPane.showMessageDialog(null,"No se pudo realizar venta");
                break;
            case (String)"Revisar inventario":
                JOptionPane.showMessageDialog(null,"La cantidad disponible es: "+bom.revisarInventario()+" Lts.");
                break;
            case (String)"Total venta":
                JOptionPane.showMessageDialog(null,"El total de la venta es: $"+bom.calcularVentaTotal());
                break;
        }
    }while(!opcMenu.equals("Salir"));
        
        
        
    }
    
}
