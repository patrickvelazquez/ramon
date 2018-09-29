/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;
import java.util.Scanner;
/**
 *
 * @author Cicely
 */
public class Bol {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int numero =0, edad = 0, opcion = 0;
        float precio = 0;
        double descuento, subtotal = 0, impuesto, total;
        String nombreCliente = "", tipoViaje = "", fecha = "", destino = "";
        Boleto Bol = new Boleto(); 
        do {
           
            System.out.println("1. Iniciar");
            System.out.println("2. Modificar");
            System.out.println("3. Calcular total a pagar");
            System.out.println("4. Salir");
            opcion = in.nextInt();
            switch(opcion){
                case 1: 
                    System.out.println("Ingrese número de boleto");
                    numero = in.nextInt();
                    System.out.println("Ingrese nombre del cliente");
                    nombreCliente = in.next();
                    System.out.println("Ingrese edad del cliente");
                    edad = in.nextInt();
                    System.out.println("Ingrese precio");
                    precio = in.nextFloat();
                    System.out.println("Ingrese tipo de viaje (sencillo o tipo)");
                    tipoViaje = in.next();
                    System.out.println("Ingrese fecha");
                    fecha = in.next();
                    System.out.println("Ingrese destino");
                    destino = in.next();
                    break;
                case 2: 
                    do{
                        System.out.println("¿Qué dato desea modificar?");
                        System.out.println("1. Numero");
                        System.out.println("2. Nombre del Cliente");
                        System.out.println("3. Precio del Boleto");
                        System.out.println("4. Tipo de Viaje");
                        System.out.println("5. Fecha");
                        System.out.println("6. Destino");
                        System.out.println("7. Regresar");
                        opcion = in.nextInt();
                    
                    switch(opcion){
                        case 1:  
                                System.out.println("Ingrese nuevo número");
                                numero = in.nextInt();
                                Bol.setNumero(numero);
                                break;
                         case 2:  
                                System.out.println("Ingrese nuevo nombre");
                                nombreCliente = in.next();
                                Bol.setNombreCliente(nombreCliente); 
                                break;
                         case 3:  
                                System.out.println("Ingrese nuevo precio");
                                precio = in.nextInt();
                                Bol.setPrecio(precio);
                                break;
                         case 4:  
                                System.out.println("Ingrese nuevo tipo de viaje");
                                tipoViaje = in.next();
                                Bol.setTipoViaje(tipoViaje);
                                break;
                         case 5:  
                                System.out.println("Ingrese nueva fecha");
                                fecha = in.next();
                                Bol.setFecha(fecha);
                                break;
                         case 6:  
                                System.out.println("Ingrese nuevo destino");
                                destino = in.next();
                                Bol.setDestino(destino);
                                break;
                        }
                    }while(opcion!=7);
                      
                    case 3: 
                        do{ 
                            if("tipo".equals(tipoViaje)){
                                subtotal = precio * 0.80 + precio;                                 
                                System.out.println("El Subtotal del Tipo 2 es: " + subtotal);
                            }
                            else if("sencillo".equals(tipoViaje)){
                                subtotal = precio;                               
                                System.out.println("El Subtotal es: " + subtotal);
                            }
                            impuesto = precio * 0.16;                           
                            System.out.println("El impuesto es: " + impuesto);
                            if(edad > 60){
                                descuento = precio * 0.50;
                                total = subtotal - descuento + impuesto;                               
                                System.out.println("El precio con descuento es: " + descuento);                               
                                System.out.println("El total a pagar con descuento es: " + total);
                              }else {                                                                                   
                                    total = subtotal + impuesto;                                    
                                    System.out.println("El total a pagar es: " + total); 
                                    }
                            break;
                            }while(opcion !=1);
                           
                        }
            }while(opcion!=4);
            }
        }
    

