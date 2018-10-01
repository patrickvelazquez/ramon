/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletos;
import java.util.Scanner;
/**
 *
 * @author MULTIMEDIA 12
 */
public class BoletoMain
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int opcion=0;
        int Edad;
        int NumeroDelBoleto = 2035;
        int dia;
        int mes;
        int año;
        double aumento, precio, Total;
        String fecha;
        int tipoDeViaje = 0;
        String destino;
        String nombreDelCliente;
        Boletos Nuevo = new Boletos();
        do
        {
            System.out.println("1. Nuevo Viaje");
            System.out.println("2. Consultar Viaje");
            System.out.println("3. Modicar Viaje");
            System.out.println("4. Salir");
         
            opcion =in.nextInt();
            
            switch(opcion)
            {
                case 1:
                    System.out.println("Fecha de Tramite");
                    System.out.print("Dia: ");
                    dia=in.nextInt();
                    Nuevo.fechaConFormato();
                    System.out.print("Mes: ");
                    mes=in.nextInt();
                    Nuevo.fechaConFormato();
                    System.out.print("Año: ");
                    año=in.nextInt();
                    Nuevo.fechaConFormato();
                    System.out.println("Numero De Boleto: " +NumeroDelBoleto);
                    NumeroDelBoleto = NumeroDelBoleto+1;
                    System.out.println("Nombre Del Cliente: ");
                    in.nextLine();
                    nombreDelCliente = in.nextLine();
                    System.out.println("Edad: ");
                    Edad = in.nextInt();
                    System.out.println("Destino: ");
                    in.nextLine();
                    destino = in.nextLine();
                    System.out.println("Tipo De Viaje: ");
                    System.out.println("1. Sencillo\n2. Doble");
                    tipoDeViaje = in.nextInt();
                    if(tipoDeViaje == 2)
                    {
                       System.out.println("Cantidad a Pagar: ");
                       precio = in.nextDouble();
                       System.out.println("Aumento:");
                       in.nextDouble();
                       aumento = in.nextDouble();
                       Total = precio*aumento;
                       Total = precio+Total;
                       System.out.println("Total A Pagar: "+Total);
                    }
                   else
                    {
                       System.out.println("Cantidad a Pagar: ");
                       Total = in.nextDouble();
                       System.out.println("Total A Pagar: "+Total);
                    }
                    break;
             case 2:
                 System.out.println("Nombre: "+Nuevo.getNombreDelCliente());
                 System.out.println("Destino: "+Nuevo.getDestino());
                 System.out.println("Tipo De Viaje: "+Nuevo.getTipoDeViaje());
                 System.out.println("Fecha: "+Nuevo.getFecha());
                 System.out.println("Total a Pagar: "+Nuevo.getPrecio());
                 break;
             case 3:
                do
                {
                    System.out.println("Elija la opcion que desee modificar: ");
                    System.out.println("1. Modificar Nombre");
                    System.out.println("2. Modificar Destino");
                    System.out.println("3. Modificar Fecha");
                    System.out.println("4. Modificar Tipo De Viaje");
                    System.out.println("5. Modificar Precio");
                    System.out.println("6. Regresar");
                    opcion = in.nextInt();
                    switch (opcion)
                    {
                        case 1:
                           System.out.println("Nombre: ");
                           nombreDelCliente = in.nextLine();
                           Nuevo.setNombreDelCliente(nombreDelCliente);
                           break;
                       case 2:
                           System.out.println("Destino: ");
                           destino = in.nextLine();
                           Nuevo.setDestino(destino);
                           break;
                       case 3:
                           System.out.println("Fecha: ");
                           fecha = in.nextLine();
                           Nuevo.setFecha(fecha);
                           break;
                       case 4:
                           System.out.println("Tipo De Viaje: ");
                           tipoDeViaje = in.nextInt();
                           if(tipoDeViaje == 2)
                            {
                               System.out.println("Cantidad a Pagar: ");
                               precio = in.nextDouble();
                               System.out.println("Aumento:");
                               in.nextDouble();
                               aumento = in.nextDouble();
                               Total = precio*aumento;
                               Total = precio+Total;
                               System.out.println("Total A Pagar: "+Total);
                            }
                           else
                            {
                               System.out.println("Cantidad a Pagar: ");
                               Total = in.nextDouble();
                               System.out.println("Total A Pagar: "+Total);
                            }
                           Nuevo.setTipoDeViaje(tipoDeViaje);
                           break;
                       case 5:
                           System.out.println("Cantidad a Pagar: ");
                           precio = in.nextFloat();
                           Nuevo.setPrecio(precio);
                           break;
                       case 6:
                           break;
                       default:
                           System.out.println("No es una Opcion Valida");
                    }
                }while(opcion != 4);
                break;
                case 4:
                    System.out.println("Gracias por su visita");
                break;
            default:    
                System.out.println("No es una Opcion Valida");
            }
         
            System.out.println("Oprima cualquier tecla para continuar");
            in.nextInt();
         
        }while(opcion!=6);
    }
    
}
