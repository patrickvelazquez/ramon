/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.corte.pkg1;
import java.util.Scanner;

/**
 *
 * @author Drago
 */
public class BombaGasolinaMain {

    /**
     * @param args the command line arguments
     */
    /*
     *Iniciar bomba  
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numBomba = 0, tipoGasolina = 0, opcion = 0;
        float precio = 0.0f, capacidad = 0.0f, litrosVendidos = 0, cantidadLitros = 0.0f, venta = 0.0f;
        
        Scanner in = new Scanner(System.in);
        
        BombaGasolina nueva = new BombaGasolina();
        
        do{
            System.out.println("1.- Iniciar bomba");
            System.out.println("2.- Verificar inventario");
            System.out.println("3.- Venta de gasolina");
            System.out.println("4.- Calcular venta total");
            System.out.println("5.- Salir");
            
            opcion = in.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Dame el numero de bomba");
                    numBomba = in.nextInt();
                    System.out.println("Dame el tipo de gasolina (1 - Magna / 2 - Premium)");
                    tipoGasolina = in.nextInt();
                    System.out.println("Dame el precio de la gasolina");
                    precio = in.nextFloat();
                    System.out.println("Dame la capacidad");
                    capacidad = in.nextFloat();
                    System.out.println("Dame los litros vendidos al momento");
                    litrosVendidos = in.nextFloat();
                    
                    
                    nueva.setNumBomba(numBomba);
                    nueva.setTipoGasolina(tipoGasolina);
                    nueva.setPrecio(precio);
                    nueva.setCapacidad(capacidad);
                    nueva.setLitrosVendidos(litrosVendidos);
                    break;
                case 2:
                    System.out.println("Quedan " + nueva.revisarInventario() + "litros de gasolina");
                    break;
                case 3:
                    System.out.println("Dame la cantidad de litros a vender");
                    cantidadLitros = in.nextFloat();
                    venta = nueva.ventaGasolina(cantidadLitros);
                    if(venta != 0.0f){
                        System.out.println("La venta por " + cantidadLitros + "litros, fueron $" + venta);
                    }
                    else{
                        System.out.println("Hubo un error en la venta, cheque si hay inventario restante o si inserto correctamente los litros a vender");
                    }
                        
                    break;
                case 4:
                    venta = nueva.calcularVentaTotal();
                    System.out.println("La venta del dia fue de: $" + venta);
                    break;
                case 5:
                    System.out.println("Gracias por usar este programa");
                    break;
                default:
                    System.out.println("No es una opción valida");
            }
            System.out.println("Presione enter para continuar...");
            in.nextLine();
            in.nextLine();
        }while(opcion != 5);
    }    
}
