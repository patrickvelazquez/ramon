/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;
import java.util.Scanner;
/**
 *
 * @author JOSHYEL
 */
public class CotizacionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=0, numCo=0, precio=0, plazo=0;
        String description = new String();
        float porcIni=0.0f;
        Scanner in = new Scanner(System.in);
        Cotizacion cotizacion = new Cotizacion();
        do
        {
            System.out.println("1. Capturar datos");
            System.out.println("2. Mostrar datos");
            System.out.println("3. Modificar datos");
            System.out.println("4. Calcular Pago Inicial");
            System.out.println("5. Calcular Total a Financiar");
            System.out.println("6. Calcular Pago Mensual");
            System.out.println("7. Salir");
            opcion=in.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Ingrese numero de la cotizacion");
                    numCo= in.nextInt();
                    System.out.println("Ingrese descrpcion");
                    description = in.next();
                    System.out.println("Ingrese precio");
                    precio=in.nextInt();
                    System.out.println("Ingrese porcentaje de pago Inicial(decimal)");
                    porcIni=in.nextFloat();
                    System.out.println("Ingrese plazo(en meses)");
                    plazo=in.nextInt();
                    cotizacion.setNumCotizacion(numCo);
                    cotizacion.setDescripcion(description);
                    cotizacion.setPrecio(precio);
                    cotizacion.setPorcentaje(porcIni);
                    cotizacion.setPlazo(plazo);
                    break;
                case 2:
                    System.out.println("Num. Cotizacion " + cotizacion.getNumCotizacion());
                    System.out.println("Descripcion " + cotizacion.getDescripcion());
                    System.out.println("Precio " + cotizacion.getPrecio());
                    System.out.println("Porcentaje " + cotizacion.getPorcentaje() + " %");
                    System.out.println("Plazo " + cotizacion.getPlazo());
                    break;
                case 3:
                    System.out.println("Que quieres modificar?");
                    System.out.println("1. Descripcion");
                    System.out.println("2. Precio");
                    System.out.println("3. Porcentaje");
                    System.out.println("4. Plazo");
                    System.out.println("5. Salir");
                    opcion = in.nextInt();
                    switch(opcion)
                    {
                        case 1:
                            System.out.println("Ingrese descripcion");
                            description = in.next();
                            cotizacion.setDescripcion(description);
                            break;
                        case 2:
                            System.out.println("Ingrese precio");
                            precio = in.nextInt();
                            cotizacion.setPrecio(precio);
                            break;
                        case 3:
                            System.out.println("Ingrese porcentaje");
                            porcIni=in.nextFloat();
                            cotizacion.setPorcentaje(porcIni);
                            break;
                        case 4:
                            System.out.println("Ingrese plazo");
                            plazo = in.nextInt();
                            cotizacion.setPlazo(plazo);
                            break;
                        case 5:
                            break;
                            
                        default: System.out.println("Ingrese una opcion valida");      
                    }
                    break;
                case 4:
                    System.out.println("Pago inicial $"+ cotizacion.calcularPagoIni());
                    break;
                case 5:
                    System.out.println("Total a financiar $" + cotizacion.calcularTotalaFin());
                    break;
                case 6:
                    System.out.println("Pago mensual $" + cotizacion.calcularPagoMensual());
                    break;
                case 7:
                    System.out.println("Hasta la vista....");
                    break;
                    
                default: System.out.println("Ingrese una opcion valida");
            }
        }while(opcion!=7);
    }
    
}
