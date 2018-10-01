/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;
import java.util.Scanner;//scanf
/**
 *
 * @author SAMANTHA
 */
public class CotMain {
    // Entrada de información
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);//declarar scanf
       Cotizacion ObjetoCot=new Cotizacion();
       int n,o,pl,op;
       float p,po, pi,t,pm;
       String d;
         //p=in.nextInt();
         //in.nextLine();//limpiar 
         //d=in.nextLine();
         //F en flotante
        do
        {
       
            System.out.println("SOLICITUD DE INFORMACIÓN");
            System.out.println("1. Ingresar nuevos datos");
            System.out.println("2. Consultar información actual");
            System.out.println("3. Modificar información");
            System.out.println("4. Calcular pago inicial");
            System.out.println("5. Calcular pago mensual");
            System.out.println("6. Calcular total a pagar");
            System.out.println("7. Salir");
            o=in.nextInt();
            switch(o)
            {
                case 1:
                {
                    System.out.println("Ingrese no. de Cotización: ");
                    n=in.nextInt();
                    ObjetoCot.setNumero(n);
                    System.out.println("Ingresa descripción: ");
                    in.nextLine();
                    d=in.nextLine();
                    ObjetoCot.setDescripción(d);
                    System.out.println("Ingrese precio: ");
                    p=in.nextFloat();
                    ObjetoCot.setPrecio(p);
                    System.out.println("Ingrese porcentaje inicial: ");
                    po=in.nextFloat();
                    ObjetoCot.setPorcentaje(po);
                    System.out.println("Ingrese el número de plazos mensuales: ");
                    pl=in.nextInt();
                    ObjetoCot.setPlazo(pl);
                    break;
                }
                case 2:
                {
                   System.out.print("No. de cotización: ");
                   n=ObjetoCot.getNumero();
                   System.out.println(n);
                   System.out.print("Descripción: ");
                   d=ObjetoCot.getDescripción();
                   System.out.println(d);
                   System.out.print("Precio: ");
                   p=ObjetoCot.getPrecio();
                   System.out.println(p);
                   System.out.print("Porcentaje de pago inicial: ");
                   po=ObjetoCot.getPorcentaje();
                   System.out.println(po);
                   System.out.print("Plazos mensuales: ");
                   pl=ObjetoCot.getPlazo();
                   System.out.println(pl); 
                   break;
                }
                case 3:
                {
                    System.out.println("MODIFICACIÓN");
                    System.out.println("1. Todos los datos");
                    System.out.println("2. Número de cotización");
                    System.out.println("3. Descripción");
                    System.out.println("4. Precio ");
                    System.out.println("5. Porcentaje inicial");
                    System.out.println("6. Plazo mensual");
                    op=in.nextInt();
                    switch(op)
                    {
                        case 1:
                        {
                            System.out.println("Ingrese el nuevo número: ");
                             n=in.nextInt();
                             ObjetoCot.setNumero(n);
                             System.out.println("Ingrese la nueva descripción: ");
                             in.nextLine();
                             d=in.nextLine();
                             ObjetoCot.setDescripción(d);
                             System.out.println("Ingrese el nuevo precio: ");
                             p=in.nextFloat();
                             ObjetoCot.setPrecio(p);
                             System.out.println("Ingrese el nuevo porcentaje inicial: ");
                             po=in.nextFloat();
                             ObjetoCot.setPorcentaje(po);
                             System.out.println("Ingrese número de plazos mensuales: ");
                             pl=in.nextInt();
                             ObjetoCot.setPlazo(pl);    
                             break;
                        }
                        case 2:
                        {
                            System.out.println("Ingrese el nuevo número de cotización: ");
                            n=in.nextInt();
                            ObjetoCot.setNumero(n);
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Ingrese la nueva descripción: ");
                            in.nextLine();
                            d=in.nextLine();
                            ObjetoCot.setDescripción(d);
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Ingrese el nuevo precio: ");
                            p=in.nextFloat();
                            ObjetoCot.setPrecio(p);
                            break;
                        }
                        case 5:
                        {
                            System.out.println("Ingrese el nuevo porcentaje inicial: ");
                            po=in.nextInt();
                            ObjetoCot.setPorcentaje(po);
                            break;
                        }
                        case 6:
                        {
                           System.out.println("Ingrese el nuevo número de plazos mensuales: ");
                           pl=in.nextInt();
                           ObjetoCot.setPlazo(pl);
                           break;
                        }
                    }
                    break;
                 }
                case 4:
                {
                    System.out.println("El pago inicial es de: ");
                    pi=ObjetoCot.calcularPagoInicial();
                    System.out.println(pi);
                    break;
                }
                case 5:
                {
                    System.out.println("El pago mensual es: ");
                    pm=ObjetoCot.calcularPagoMensual();
                    System.out.println(pm);
                    break;
                }
                case 6:
                {
                    System.out.println("El total a pagar es de: ");
                    t=ObjetoCot.calcularTotal();
                    System.out.println(t);
                    break;
                }
                case 7:
                    break;
                
             }
        }while(o!=7);
    }
    
}
 