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
public class CotizacionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int numero = 0, opcion = 0, plazo = 0;
        float precio =  0.0f, porcentaje =  0.0f;
        String descripcion;
        Cotizacion cotizacion = new Cotizacion();
        do{
            System.out.println("1. Crear Cotizacion");
            System.out.println("2. Calcular Pago Inicial");
            System.out.println("3. Calcular Total a Financiar");
            System.out.println("4. Calcular Pago Mensual");
            System.out.println("5. Imprimir Cotizacion");
            System.out.println("6. Modificar Datos");
            System.out.println("7. Salir");
            
            opcion = in.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingresa el numero de cotización");
                    numero = in.nextInt();
                    in.nextLine();
                    System.out.println("Ingresa la descripción");
                    descripcion = in.nextLine();
                    System.out.println("Ingresa el precio");
                    precio = in.nextFloat();
                    System.out.println("Ingresa el porcentaje de pago inicial %");
                    porcentaje = in.nextFloat();
                    System.out.println("Ingresa el plazo en meses");
                    plazo = in.nextInt();
                    cotizacion.setNumeroCotizacion(numero);
                    cotizacion.setDescripcion(descripcion);
                    cotizacion.setPrecio(precio);
                    cotizacion.setPorcentajePagoInicial(porcentaje);
                    cotizacion.setPlazo(plazo);
                    break;
                case 2:
                    System.out.println("El Pago Inicial es: $" + cotizacion.calcularPagoInicial());
                    break;
                case 3:
                    System.out.println("El Total a financiar es: $" + cotizacion.calcularTotalFinanciar());
                    break;
                case 4:
                    System.out.println("El Pago Mensual es de: $" + cotizacion.calcularPagoMensual());
                    break;
                case 5:
                    System.out.println("Numero de Cotizacion: " + cotizacion.getNumeroCotizacion() + "\nDescripcion: " 
                            + cotizacion.getDescripcion() + "\nPrecio: $" + cotizacion.getPrecio() + "\nPorcentaje de Pago Inicial: "
                            + cotizacion.getPorcentajePagoInicial() + "% \nPlazo: " + cotizacion.getPlazo() + " Meses");
                    break;    
                case 6:
                    do{
                        System.out.println("Elija la opcion deseada:");
                        System.out.println("1. Modificar Número de Cotización");
                        System.out.println("2. Modificar Descripcion");
                        System.out.println("3. Modificar Precio");
                        System.out.println("4. Modificar Porcentaje de Pago Inicial");
                        System.out.println("5. Modificar Plazo");
                        System.out.println("6. Regresar");
                        opcion = in.nextInt();
                        switch(opcion){
                            case 1:
                                System.out.println("Ingresa el numero de cotización");
                                numero = in.nextInt();
                                cotizacion.setNumeroCotizacion(numero);
                                break;
                            case 2:
                                in.nextLine();
                                System.out.println("Ingresa la descripcion");
                                descripcion = in.nextLine();
                                cotizacion.setDescripcion(descripcion);
                                break;
                            case 3:
                                System.out.println("Ingresa el precio");
                                precio = in.nextFloat();
                                cotizacion.setPrecio(precio);
                                break;
                            case 4:  
                                System.out.println("Ingresa el porcentaje de pago inicial %");
                                porcentaje = in.nextFloat();
                                cotizacion.setPorcentajePagoInicial(porcentaje);
                                break;
                            case 5:
                                System.out.println("Ingresa el plazo en meses");
                                plazo = in.nextInt();
                                cotizacion.setPlazo(plazo);
                                break;
                            case 6:
                                break;
                            default:
                                System.out.println("No es una opción válida");
                        }
                    }while(opcion != 6);
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
