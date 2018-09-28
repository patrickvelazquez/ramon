/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;
import java.util.Scanner;/**
/**
 *
 * @author Luis Espinoza
 */
public class CotizacionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in = new Scanner(System.in);
        int num, plazo, opcion;
        String descAuto;
        float precioAuto,porcentaje;
        
        Cotizacion coti = new Cotizacion();
        do
        {
            System.out.println("1.Inicializar objeto");
            System.out.println("2. Calcular Pago inicial");
            System.out.println("3. Calcular total a financiar");
            System.out.println("4. Calcular pago mensual");
            System.out.println("5. Modificar");
            System.out.println("6. Salir");
            System.out.println("Elija una opción");
            opcion = in.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Ingrese número de cotización");
                    num=in.nextInt();
                    coti.setNum(num);
                    
                    System.out.println("Ingrese descripción de auto");
                    descAuto=in.next();
                    coti.setDescAuto(descAuto);
                    
                    System.out.println("Ingrese precio de auto");
                    precioAuto=in.nextInt();
                    coti.setPrecioAuto(precioAuto);
                    
                    System.out.println("Ingrese porcentaje de pago inicial");
                    plazo=in.nextInt();
                    coti.setPlazo(plazo);
                    
                    System.out.println("Ingrese plazos(meses)");
                    porcentaje=in.nextInt();
                    coti.setPorcentajePagoInicial(porcentaje);
                    break;
                case 2:
                    System.out.println("El pago inicial es: $" +coti.calcularPagoInicial());
                    break;
                case 3:
                    System.out.println("El total a financiar es: $" +coti.calcularTotalAFinananciar());
                    break;
                case 4:
                    System.out.println("El pago mesual es: $" +coti.calcularPagoMensual());
                    break;
                case 5:
                    do
                    {
                        System.out.println("1. Numero");
                        System.out.println("2. Descripcion de auto");
                        System.out.println("3. Precio de auto");
                        System.out.println("4. Porcentaje de pago inicial");
                        System.out.println("5. Plazo");
                        System.out.println("6. Regresar");
                        System.out.println("Elija una opción");
                        opcion = in.nextInt();
                        switch(opcion){
                            case 1:
                                System.out.println("Ingrese número de cotización");
                                num=in.nextInt();
                                coti.setNum(num);
                                break;
                            case 2:
                                System.out.println("Ingrese descripción de auto");
                                descAuto=in.next();
                                coti.setDescAuto(descAuto);
                                 break;
                            case 3:
                                 System.out.println("Ingrese descripción de auto");
                                descAuto=in.next();
                                coti.setDescAuto(descAuto);
                                break;
                            case 4:
                                System.out.println("Ingrese porcentaje de pago inicial");
                                plazo=in.nextInt();
                                coti.setPlazo(plazo);
                                break;
                            case 5:
                                System.out.println("Ingrese plazos(meses)");
                                porcentaje=in.nextInt();
                                coti.setPorcentajePagoInicial(porcentaje);
                                break;
                            default:
                               System.out.println("Ingrese una opcion valida");
                                
                        }
                    }while(opcion!=6);
                    break;
                default:
                  System.out.println("Ingrese una opción valida");
            }
        }while(opcion!=6);

        
        
    }
    
}
