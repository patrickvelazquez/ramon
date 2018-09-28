/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;
import java.util.Scanner;

/**
 *
 * @author Kennyswh
 */
public class BoletoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int numero = 0, opcion = 0, tipo = 0, edad = 0;
         float precio =  0.0f, total =  0.0f;
         String cliente, destino, fecha;
         Boleto boleto = new Boleto();
         do{
            System.out.println("1. Iniciar Objeto");
            System.out.println("2. Imprimir Boleto");
            System.out.println("3. Calcular Impuesto");
            System.out.println("4. Calcular Descuento");
            System.out.println("5. Calcular Total a Pagar");
            System.out.println("6. Modificar Datos");
            System.out.println("7. Salir");
            
            opcion = in.nextInt();
            
            switch(opcion){
                case 1:
                    
                    System.out.println("Ingresa el numero de boleto");
                    numero = in.nextInt();
                    in.nextLine();
                    System.out.println("Ingresa el nombre del cliente");
                    cliente = in.nextLine();
                    System.out.println("Ingresa el destino");
                    destino = in.nextLine();
                    System.out.println("Ingresa el precio sencillo");
                    precio = in.nextFloat();
                    do{
                        System.out.println("Elige el tipo de viaje:");
                        System.out.println("1: Sencillo");
                        System.out.println("2: Premium");
                        tipo = in.nextInt();
                    }while(tipo!=1 && tipo!=2);
                    in.nextLine();
                    System.out.println("Ingresa la fecha");
                    fecha = in.nextLine();
                    System.out.println("Ingresa la edad del cliente");
                    edad = in.nextInt();
                    boleto.definirTipoBoleto(tipo, precio);
                    boleto.setNumero(numero);
                    boleto.setNombreCliente(cliente);
                    boleto.setDestino(destino);
                    boleto.setFecha(fecha);
                    break;
                case 2:
                    System.out.println(boleto.imprimirBoleto());
                    break;
                case 3:
                    System.out.println("El Impuesto de 16% es: " + String.valueOf(boleto.calcularImpuesto()));
                    break;
                case 4:
                    System.out.println("El descuento es de: " + String.valueOf(boleto.calcularDescuento(edad)));
                    break;
                case 5:
                    total = boleto.getPrecio()+boleto.calcularImpuesto()-boleto.calcularDescuento(edad);
                    System.out.println("El total a pagar es: " + String.valueOf(total));
                    break;    
                case 6:
                    do{
                        System.out.println("Elija la opcion deseada:");
                        System.out.println("1. Modificar Número");
                        System.out.println("2. Modificar Nombre del cliente");
                        System.out.println("3. Modificar Edad");
                        System.out.println("4. Modificar Destino");
                        System.out.println("5. Modificar Tipo de viaje");
                        System.out.println("6. Modificar Precio Sencillo");
                        System.out.println("7. Modificar Fecha");
                        System.out.println("8. Regresar");
                        opcion = in.nextInt();
                        switch(opcion){
                            case 1:
                                System.out.println("Ingresa el numero de boleto");
                                numero = in.nextInt();
                                boleto.setNumero(numero);
                                break;
                            case 2:
                                System.out.println("Ingresa el nombre del cliente");
                                cliente = in.nextLine();
                                boleto.setNombreCliente(cliente);
                                break;
                            case 3:
                                System.out.println("Ingresa la edad del cliente");
                                edad = in.nextInt();
                                break;
                            case 4:
                                System.out.println("Ingresa el destino");
                                destino = in.nextLine();
                                boleto.setDestino(destino);
                                break;
                            case 5:
                                do{
                                    System.out.println("Elige el tipo de viaje:");
                                    System.out.println("1: Sencillo");
                                    System.out.println("2: Premium");
                                    tipo = in.nextInt();
                                }while(tipo!=1 && tipo!=2);
                                boleto.definirTipoBoleto(tipo, precio);
                                break;
                            case 6:
                                System.out.println("Ingresa el precio sencillo");
                                precio = in.nextFloat();
                                if(tipo > 0){
                                   boleto.definirTipoBoleto(tipo, precio); 
                                }
                                break;
                            case 7:
                                System.out.println("Ingresa la fecha");
                                fecha = in.nextLine();
                                boleto.setFecha(fecha);
                                break;
                            case 8:
                                break;
                            default:
                                System.out.println("No es una opción válida");
                        }
                    }while(opcion != 8);
                    break;
                case 7:
                    System.out.println("Gracias, hasta la vista");
                    break;
                default:
                    System.out.println("No es una opción válida");
            }
        System.out.println("Oprima cualquier tecla para continuar");
            in.nextInt();
        } while(opcion != 7);
        // TODO code application logic here
    }
    
}
