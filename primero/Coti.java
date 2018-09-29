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
public class Coti {
    public static void main (String [] args){
    Scanner in = new Scanner(System.in);
   
   int numeroCoti=0, opcion=0, plazo=0;
   String descrip="";
   float porcentajePrecio=0, precio=0.0f, pagoIni=0, pagoMen=0, total=0;
   Cotizacion Coti = new Cotizacion(); 
   do{
       System.out.println("Bienvenido");
       System.out.println("1. Iniciar objeto");
       System.out.println("2. Modificar");
       System.out.println("3. Calcular Pagos");
       System.out.println("4. Salir");
       opcion = in.nextInt();
       switch(opcion){
           case 1: 
               System.out.println("Ingrese Número de Cotización");
               numeroCoti=in.nextInt();
               System.out.println("Ingrese Descripción del Automóvil");
               descrip = in.next();
               System.out.println("Ingrese Precio");
               precio=in.nextInt();
               System.out.println("Ingrese Porcentaje de Pago Inicial (0.porcentaje)");
               porcentajePrecio=in.nextFloat();
               System.out.println("Ingrese Plazo");
               plazo=in.nextInt();
               break;
           case 2: 
               do{ 
                System.out.println("¿Qué dato desea modificar");
                System.out.println("1. Descripción");
                System.out.println("2. Precio");
                System.out.println("3. Porcentaje de Pago Inicial");
                System.out.println("4. Plazo");
                System.out.println("5. Regresar");
                opcion = in.nextInt();
                switch(opcion){
                    case 1: 
                        System.out.println("Ingrese Nueva Descripción");
                        descrip = in.next();
                        Coti.setDescrip(descrip);
                        break;
                    case 2: 
                        System.out.println("Ingrese Nuevo Precio");
                        precio = in.nextInt();
                        Coti.setPrecio(precio);
                        break;
                    case 3:
                        System.out.println("Ingrese Nuevo Porcentaje de Pago Inicial (0.porcentaje)");
                        porcentajePrecio = in.nextFloat();
                        Coti.setPorcentajePrecio(porcentajePrecio);
                        break;
                    case 4:
                        System.out.println("Agregue Nuevo Plazo");
                        plazo = in.nextInt();
                        Coti.setPlazo(plazo);
                        break;
                }
                }while(opcion!=5);
           case 3:
               do{
               System.out.println("CALCULAR PAGOS");
               System.out.println("1. Calcular Pago Inicial");
               System.out.println("2. Calcular Pago Mensual");
               System.out.println("3. Calcular Total");
               System.out.println("4. Salir");
               opcion = in.nextInt();
               switch(opcion){
                   case 1: 
                       pagoIni = precio * porcentajePrecio;
                       System.out.println("El pago inicial es de: " + pagoIni);
                       break;
                   case 2: 
                       pagoMen = (precio - pagoIni) / plazo;
                       System.out.println("El pago mensual es de: " + pagoMen);
                       break;
                   case 3: 
                       total = precio - pagoIni;
                       System.out.println("El pago total es de: " + total);
                       break;
               }
               }while(opcion!=3);
             }
   
   }while(opcion!=4);
}
}