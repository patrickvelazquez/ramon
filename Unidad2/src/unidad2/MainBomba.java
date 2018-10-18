/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author SAMANTHA
 */
public class MainBomba 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Object menu[]={"1. Iniciar bomba","2. Hacer venta","3. Revisar inventario","4. Total de venta","5. Salir"};
        //Object subMenu[]={"1. Día","2. Mes","3. Año","Regresar"};
        
        int num,id, tipo;
        float cap=0.0f, con=0.0f,can=0.0f,precio;
        String marca;
        Gasolina tipGas;
        Bomba IBomba = new Bomba();
        String opcMenu="";
        do
        {
            opcMenu=(String) JOptionPane.showInputDialog(null,"Elige una opción","Menu",JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
            switch(opcMenu)
            {
                case (String)"1. Iniciar bomba":
                {
                    num=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de la bomba","Nueva bomba",JOptionPane.QUESTION_MESSAGE));
                    cap=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la capacidad: ","Nueva bomba",JOptionPane.QUESTION_MESSAGE));
                    id=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el id","Gasolina",JOptionPane.QUESTION_MESSAGE));
                    marca=(String)JOptionPane.showInputDialog(null, "Ingrese la marca","Gasolina",JOptionPane.QUESTION_MESSAGE);
                    tipo=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número segun el tipo(1,2 o 3)","Gasolina",JOptionPane.QUESTION_MESSAGE));
                    precio=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el precio","Gasolina",JOptionPane.QUESTION_MESSAGE));
                    Gasolina IGasolina=new Gasolina(id, marca, tipo, precio);
                    IBomba.setNumero(num);
                    IBomba.setCapacidad(cap);
                    break;
                }
                case (String)"2. Hacer venta":
                {
                    float venta;
                    can=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la cantidad deseada en litros: ","Nueva venta",JOptionPane.QUESTION_MESSAGE));
                    venta=IBomba.realizarVenta(can);
                    if(venta>0.0F)
                        JOptionPane.showMessageDialog(null,"El costo de venta es "+ venta);
                    else
                        JOptionPane.showMessageDialog(null,"La venta deseada no puede ser realizada.");
                    break;
                }
                case (String)"3. Revisar inventario":
                        JOptionPane.showMessageDialog(null,"La cantidad disponible es "+IBomba.revisarInventario());
                        break;
                case (String)"4. Total de venta":
                    JOptionPane.showMessageDialog(null,"La venta total es de "+IBomba.calcularVentaTotal());
                    break;
                case (String)"5. Salir":
                    break;
                default:
                    System.out.println("Opccion invalida");
                    break;   
        }
    }while(!opcMenu.equals("5. Salir"));
}
}
