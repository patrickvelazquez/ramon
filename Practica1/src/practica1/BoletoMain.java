/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Drago
 */
public class BoletoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        int numId = 0, tipo = 0, opcion = 0, edad = 0;
        String cliente = "", destino = "", fecha = "";
        float precio = 0.0f, subtotal = 0.0f, descuento=0.0f, impuesto=0.0f, total = 0.0f;
        
        Boleto nuevo = new Boleto();
        do{
            System.out.println("1.- Iniciar Objeto");
            System.out.println("2.- Calcular Subtotal");
            System.out.println("3.- Calcular Impuesto");
            System.out.println("4.- Calcular Descuento");
            System.out.println("5.- Calcular Total");
            System.out.println("6.- Consultar Boleto");
            System.out.println("7.- Imprimir");
            System.out.println("8.- Modificar Boleto");
            System.out.println("9.- Salir");
            
            opcion = in.nextInt();
            
            switch(opcion){
                case 1:
                    numId = numId+1;
                    
                    System.out.println("Dame el nombre del cliente");
                    in.nextLine();
                    cliente = in.nextLine();
                    System.out.println("Dame el destino del cliente");
                    in.nextLine();
                    destino = in.nextLine();
                    System.out.println("Dame el precio del Boleto");
                    precio = in.nextFloat();
                    System.out.println("Dame el tipo de boleto (1- Simple / 2- Redondo)");
                    tipo = in.nextInt();
                    System.out.println("Dame la fecha");
                    in.nextLine();
                    fecha = in.nextLine();
                    System.out.println("Dame la edad del cliente");
                    edad = in.nextInt();
                    
                    nuevo.setNumId(numId);
                    nuevo.setCliente(cliente);
                    nuevo.setDestino(destino);
                    nuevo.setTipo(tipo);
                    nuevo.setFecha(fecha);
                    nuevo.setPrecio(precio);
                    
                    break;
                case 2:
                    subtotal = nuevo.calcularSubtotal();
                    System.out.println("El subtotal es de: $" + subtotal);
                    break;
                case 3:
                    impuesto = nuevo.calcularImpuesto();
                    System.out.println("El Impuesto es de: $" + impuesto);
                    break;
                case 4:
                    descuento = nuevo.calcularDescuento(edad);
                    System.out.println("El descuento es de: $" + descuento);
                    break;
                case 5:
                    total = nuevo.calcularTotal(edad);
                    System.out.println("El total es de: $" + total);
                    break;
                case 6:
                    do{
                        System.out.println("1.- Obtener numero identificador");
                        System.out.println("2.- Obtener nombre del cliente");
                        System.out.println("3.- Obtener destino del boleto");
                        System.out.println("4.- Obtener tipo de boleto");
                        System.out.println("5.- Obtener precio del boleto");
                        System.out.println("6.- Obtener fecha del boleto");
                        System.out.println("7.- Salir al menu");
                        
                        opcion = in.nextInt();
                        
                        switch(opcion){
                            case 1:
                                System.out.println("El numero identificador del boleto es: " + nuevo.getNumId());
                                break;
                            case 2:
                                System.out.println("El nombre del cliente es: " + nuevo.getCliente());
                                break;
                            case 3:
                                System.out.println("El destino del boleto es: " + nuevo.getDestino());
                                break;
                            case 4:
                                System.out.println("El tipo del boleto es: " + nuevo.getTipo());
                                break;
                            case 5:
                                System.out.println("El precio del boleto es: $" + nuevo.getPrecio());
                                break;
                            case 6:
                                System.out.println("La fecha del boleto es: " + nuevo.getFecha());
                                break;
                            case 7:
                                break;
                            default:
                                System.out.println("No es una opción valida");
                        }
                    }while(opcion != 7);
                    break;
                case 7:
                    System.out.println(nuevo.imprimirBoleto(nuevo,edad));
                    break;
                case 8:
                    do{
                        System.out.println("1.- Cambiar numero identificador");
                        System.out.println("2.- Cambiar nombre del cliente");
                        System.out.println("3.- Cambiar destino del boleto");
                        System.out.println("4.- Cambiar tipo de boleto");
                        System.out.println("5.- Cambiar precio del boleto");
                        System.out.println("6.- Cambiar fecha del boleto");
                        System.out.println("7.- Cambiar la edad del cliente");
                        System.out.println("8.- Salir");
                        
                        opcion = in.nextInt();
                        
                        switch(opcion){
                            case 1:
                                System.out.println("Dame el numero identificador");
                                numId = in.nextInt();
                                nuevo.setNumId(numId);
                                break;
                            case 2:
                                System.out.println("Dame el nombre del cliente");
                                in.nextLine();
                                cliente = in.nextLine();
                                nuevo.setCliente(cliente);
                                break;
                            case 3:
                                System.out.println("Dame el destino del cliente");
                                in.nextLine();
                                destino = in.nextLine();
                                nuevo.setDestino(destino);
                                break;
                            case 4:
                                System.out.println("Dame el tipo de boleto (1- Simple / 2- Redondo)");
                                tipo = in.nextInt();
                                nuevo.setTipo(tipo);
                                break;
                            case 5:
                                System.out.println("Dame el precio del Boleto");
                                precio = in.nextFloat();
                                nuevo.setPrecio(precio);
                                break;
                            case 6:
                                System.out.println("Dame la fecha");
                                in.nextLine();
                                fecha = in.nextLine();
                                nuevo.setFecha(fecha);
                                break;
                            case 7:
                                System.out.println("Dame la edad del cliente");
                                edad = in.nextInt();
                                break;
                            case 8:
                                break;
                            default:
                                System.out.println("No es una opción valida");
                        }
                    }while(opcion != 8);
                    break;
                case 9:
                    System.out.println("Gracias...");
                    break;
                default:
                    System.out.println("No es una opción valida");
                }
            System.out.println("Oprima cualquier tecla para continuar...");
            in.nextLine();
            in.nextLine();
        }while(opcion!=9);
        
    }
}
