/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_contreras;
import java.util.Scanner;
/**
 *
 * @author JOSHYEL
 */
public class Examen_Contreras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        bombaGasolina bomba = new bombaGasolina();
        int opcion=0, num=0, precio=0, capacidad=0, tipo=0, venta=0;
        
        do
        {
            System.out.println("1. Inicar bomba");
            System.out.println("2. Verificar inventario");
            System.out.println("3. Venta de gasolina");
            System.out.println("4. Calcular venta total");
            System.out.println("5. Salir");
            opcion = in.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Ingrese numero de bomba");
                    num = in.nextInt();
                    bomba.setNumBomba(num);
                    System.out.println("Ingrese precio de gasolina");
                    precio = in.nextInt();
                    bomba.setPrecio(precio);
                    System.out.println("Ingrese la capacidad de litros");
                    capacidad = in.nextInt();
                    bomba.setCapacidad(capacidad);
                    System.out.println("Ingrese tipo de gasolina (1 o 2)");
                    tipo = in.nextInt();
                    bomba.setTipoGaso(tipo);
                    break;
                case 2:
                    System.out.println("Litros disponibles " + bomba.revisarInventario());
                    break;
                case 3:
                    System.out.println("Ingrese los litros a vender");
                    venta = in.nextInt();
                    System.out.println("La venta es de $" + bomba.realizarVenta(venta));
                    break;
                case 4:
                    System.out.println("La venta total fue de " + bomba.calcularVentaTotal());
                    break;
                case 5:
                    break;
                    
                default: System.out.println("Ingrese una opcion valida");
            }
            System.out.println("presione una tecla para continuar");
            in.nextInt();
        }while(opcion!=5);
        
    }
    
}
