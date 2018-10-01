/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;
import java.util.Scanner;
/**
 *
 * @author SAMANTHA
 */
public class BMain {
    
    public static void main(String[] args)
    {
       Scanner in=new Scanner(System.in);
       Boleto ObjetoBo = new Boleto();
       int n,t,con,cond,e=18;
       String c,d,f;
       float p,s,i,des,total;
       
       do
       {
            System.out.println("BOLETO\n");
            System.out.println("1. Ingresar información nueva");
            System.out.println("2. Consultar información actual");
            System.out.println("3. Modificar información actual");
            System.out.println("4. Obtener subtotal");
            System.out.println("5. Obtener impuesto");
            System.out.println("6. Obtener descuento");
            System.out.println("7. Obtener total a pagar");
            System.out.println("8. Salir");
            con=in.nextInt();
            switch(con)
            {
                case 1:
                {
                    System.out.println("Ingrese el número: ");
                    n=in.nextInt();
                    ObjetoBo.setNumero(n);
                    System.out.println("Ingrese el nombre del cliente: ");
                    in.nextLine();
                    c=in.nextLine();
                    ObjetoBo.setCliente(c);
                    System.out.println("Ingrese el destino: ");
                    in.nextLine();
                    d=in.nextLine();
                    ObjetoBo.setDestino(d);
                    System.out.println("Ingrese el el número segun su tipo de viaje(1: sencillo, 2:VIP)");
                    t=in.nextInt();
                    ObjetoBo.setTipo(t);
                    System.out.println("Ingrese el precio por boleto: ");
                    p=in.nextFloat();
                    ObjetoBo.setPrecio(p);
                    System.out.println("Ingrese la fecha: ");
                    in.nextLine();
                    f=in.nextLine();
                    ObjetoBo.setFecha(f);
                    System.out.println("Ingrese su edad: ");
                    e=in.nextInt();
                    break;
                }
                case 2:
                {
                    System.out.print("No.boleto: ");
                    n=ObjetoBo.getNumero();
                    System.out.println(n);
                    System.out.print("Nombre de Cliente: ");
                    c=ObjetoBo.getCliente();
                    System.out.println(c);
                    System.out.print("Destino: ");
                    d=ObjetoBo.getDestino();
                    System.out.println(d);
                    System.out.print("Tipo de viaje: ");
                    t=ObjetoBo.getTipo();
                    System.out.println(t);
                    System.out.print("Precio: ");
                    p=ObjetoBo.getPrecio();
                    System.out.println(p);
                    System.out.print("Fecha: ");
                    f=ObjetoBo.getFecha();
                    System.out.println(f);
                    break;
                }
                case 3:
                {
                    System.out.println("MODIFICACIÓN");
                    System.out.println("1. Todos los datos");
                    System.out.println("2. Número");
                    System.out.println("3. Nombre del cliente");
                    System.out.println("4. Destino ");
                    System.out.println("5. Tipo de Viaje");
                    System.out.println("6. Precio");
                    System.out.println("7. Fecha");
                    cond=in.nextInt();
                    switch(cond)
                    {
                        case 1:
                        {
                            System.out.println("Ingrese el nuevo número: ");
                             n=in.nextInt();
                             ObjetoBo.setNumero(n);
                             System.out.println("Ingrese el nuevo nombre del cliente: ");
                             in.nextLine();
                             c=in.nextLine();
                             ObjetoBo.setCliente(c);
                             System.out.println("Ingrese el nuevo destino: ");
                             in.nextLine();
                             d=in.nextLine();
                             ObjetoBo.setDestino(d);
                             System.out.println("Ingrese el nuevo número segun su tipo de viaje(1: sencillo, 2:VIP)");
                             t=in.nextInt();
                             ObjetoBo.setTipo(t);
                             System.out.println("Ingrese el nuevo precio por boleto: ");
                             p=in.nextFloat();
                             ObjetoBo.setPrecio(p);
                             System.out.println("Ingrese la nueva fecha: ");
                             in.nextLine();
                             f=in.nextLine();
                             ObjetoBo.setFecha(f);
                             break;
                        }
                        case 2:
                        {
                            System.out.println("Ingrese el nuevo número: ");
                             n=in.nextInt();
                             ObjetoBo.setNumero(n);
                             break;
                        }
                        case 3:
                        {
                            System.out.println("Ingrese el nuevo nombre del cliente: ");
                            in.nextLine();
                            c=in.nextLine();
                            ObjetoBo.setCliente(c);
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Ingrese el nuevo destino: ");
                            in.nextLine();
                            d=in.nextLine();
                            ObjetoBo.setDestino(d);
                            break;
                        }
                        case 5:
                        {
                            System.out.println("Ingrese el nuevo número segun su tipo de viaje(1: sencillo, 2:VIP)");
                            t=in.nextInt();
                            ObjetoBo.setTipo(t); 
                            break;
                        }
                        case 6:
                        {
                           System.out.println("Ingrese el nuevo precio por boleto: ");
                           p=in.nextFloat(); 
                           ObjetoBo.setPrecio(p);
                           break;
                        }
                        case 7:
                        {
                           System.out.println("Ingrese la nueva fecha: ");
                           in.nextLine();
                           f=in.nextLine(); 
                           ObjetoBo.setFecha(f);
                           break;
                        }
                    }
                    break;
                }
                case 4:
                {
                    System.out.print("El subtotal es: ");
                    s=ObjetoBo.calcularSubtotal();
                    System.out.println(s);
                    break;
                }
                case 5:
                {
                    System.out.print("El impuesto es: ");
                    i=ObjetoBo.calcularImpuesto();
                    System.out.println(i);
                    break;
                }
                case 6:
                {
                    System.out.print("El descuento es: ");
                    des=ObjetoBo.obtenerDescuento(e);
                    System.out.println(des);
                    break;
                }
                case 7:
                {
                    System.out.print("El total es: ");
                    total=(ObjetoBo.calcularSubtotal()+ObjetoBo.calcularImpuesto())-ObjetoBo.obtenerDescuento(e);
                    System.out.println(total);
                    break;
                }
                case 8:
                {
                    break;
                }
            }
       }while (con!=8);       
    }
}
    


