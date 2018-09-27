/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Konakun
 */
public class CotizacionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int opcion = 0, numeroCotizacion = 0, porcentajePagoInicial = 0, plazo = 0;
        float precio = 0.0f;
        String descripcion = "";
        Cotizacion nueva = new Cotizacion();
        do{
            System.out.println("1.- Iniciar Objeto");
            System.out.println("2.- Calcular pago inicial");
            System.out.println("3.- Calcular total a financiar");
            System.out.println("4.- Calcular pago mensual");
            System.out.println("5.- Modificar cotización");
            System.out.println("6.- Imprimir cotización");
            System.out.println("7.- Salir");
            
            opcion = in.nextInt();
            
            switch(opcion){
                case 1:
                    numeroCotizacion = numeroCotizacion + 1;
                    System.out.println("Dame la descripción");
                    in.nextLine();
                    descripcion = in.nextLine();
                    System.out.println("Dame el precio");
                    precio = in.nextFloat();
                    System.out.println("Dame el porcentaje de pago inicial");
                    porcentajePagoInicial = in.nextInt();
                    System.out.println("Dame el plazo de pago");
                    plazo = in.nextInt();
                    
                    nueva.setNumeroCotizacion(numeroCotizacion);
                    nueva.setDescripcion(descripcion);
                    nueva.setPrecio(precio);
                    nueva.setPorcentajePagoInicial(porcentajePagoInicial);
                    nueva.setPlazo(plazo);
                    
                    break;
                case 2:
                    System.out.println("El pago inicial es de: $" + nueva.calcularPagoInicial());
                    break;
                case 3:
                    System.out.println("El total a financiar es de: $" + nueva.calcularTotalFinanciar());
                    break;
                case 4:
                    System.out.println("El pago menusal es de: $" + nueva.calcularPagoMensual());
                   break;
                case 5:
                    do{
                        System.out.println("1.- Cambiar numero de cotización");
                        System.out.println("2.- Cambiar descripción");
                        System.out.println("3.- Cambiar precio");
                        System.out.println("4.- Cambiar porcentaje de pago inicial");
                        System.out.println("5.- Cambiar plazo de pago");
                        System.out.println("6.- Salir al menu");
                        
                        opcion = in.nextInt();
                        
                        switch(opcion){
                            case 1:
                                System.out.println("Dame el numero de cotización");
                                numeroCotizacion = in.nextInt();
                                nueva.setNumeroCotizacion(numeroCotizacion);
                                break;
                            case 2:
                                System.out.println("Dame la descripción");
                                in.nextLine();
                                descripcion = in.nextLine();
                                nueva.setDescripcion(descripcion);
                                break;
                            case 3:
                                System.out.println("Dame el precio");
                                precio = in.nextFloat();
                                nueva.setPrecio(precio);
                                break;
                            case 4:
                                System.out.println("Dame el porcentaje de pago inicial");
                                porcentajePagoInicial = in.nextInt();
                                nueva.setPorcentajePagoInicial(porcentajePagoInicial);
                                break;
                            case 5:
                                System.out.println("Dame el plazo de pago");
                                plazo = in.nextInt();
                                nueva.setPlazo(plazo);
                                break;
                            case 6:
                                break;
                            default:
                                System.out.println("No es una opción valida");
                        }
                    }while(opcion != 6);
                    break;
                case 6:
                    System.out.println(nueva.imprimirCotizacion(nueva));
                    break;
                case 7:
                    System.out.println("Gracias...");
                    break;
                default:
                    System.out.println("No es una opción valida");
            }
            System.out.println("Oprima cualquier tecla para continuar...");
            in.nextLine();
            in.nextLine();
        }while(opcion!=7);
    }
    
}
