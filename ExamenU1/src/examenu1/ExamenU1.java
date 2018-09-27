/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenu1;
import java.util.Scanner;
/**
 *
 * @author Kenneth Stoney Wilson Herrera
 */
public class ExamenU1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = 0, opcion = 0, tipoGasolina = 0, cantidad = 0;
        float precio =  0.0f, costo =  0.0f;
        
        Bomba bomba = new Bomba();
         do{
            System.out.println("1. Iniciar Bomba");
            System.out.println("2. Verificar Inventario");
            System.out.println("3. Vender Gasolina");
            System.out.println("4. Calcular Venta Total");
            System.out.println("5. Salir");
            
            opcion = in.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingresa el Número de la bomba");
                    numero = in.nextInt();
                    System.out.println("Ingresa el Tipo de Gasolina (1, 2 o 3)");
                    tipoGasolina =in.nextInt();
                    System.out.println("Ingresa el Precio");
                    precio = in.nextFloat();
                    bomba.setNumero(numero);
                    bomba.setTipoGasolina(tipoGasolina);
                    bomba.setPrecio(precio);
                    //bomba.setCapacidad(1000);
                    //bomba.setContador(0);
                    break;
                case 2:
                    System.out.println("Hay " + bomba.revisarInventario() + " Litros Disponibles");
                    break;
                case 3:
                    do{
                        System.out.println("Ingresa la cantidad a vender");
                        cantidad = in.nextInt();
                        costo = bomba.vender(cantidad);
                        if(costo > 0){
                            System.out.println("Venta realizada \n El total de la venta es de: $" + costo);
                        }
                        else{
                            System.out.println("No hay suficientes litros disponibles para realizar la venta");
                        }
                        System.out.println("¿Desea continuar? (1 - Si, 0 - No)");
                        opcion = in.nextInt();
                    }while(opcion != 0);
                    break;
                case 4:
                    System.out.println("La venta total es de: $" + bomba.calcularVentaTotal());
                    break;  
                case 5:
                    System.out.println("Gracias, adiós");
                    break;
                default:
                    System.out.println("No es una opción válida");
            }
        System.out.println("Oprima cualquier tecla para continuar");
            in.nextInt();
        } while(opcion != 5);
        // TODO code application logic here
    } 
}
