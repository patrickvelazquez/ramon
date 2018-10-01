package boletos;

import java.util.Scanner;


public class CotizaciónMain 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int opcion=0;
        int numeroDeCotizacion;
        String descripcion;
        double porcentajeDePagoIncial;
        double precio, Total, Ade;
        int plazo;
        Cotización N = new Cotización();
        do
        {
            System.out.println("1. Nuevo Cotizacion");
            System.out.println("2. Consultar Cotizacion");
            System.out.println("3. Modicar Cotizacion");
            System.out.println("4. Salir");
         
            opcion =in.nextInt();
            
            switch(opcion)
            {
                case 1:
                 System.out.println("Numero De Cotizacion: " +N.getNumeroDeCotizacion());
                 System.out.println("descripcion: ");
                 in.nextLine();
                 descripcion = in.nextLine();
                 System.out.println("Precio: ");
                 precio = in.nextDouble();
                 System.out.println("Porcentaje De Pago Inicial: "+N.getPorcentajeDePagoIncial());
                 System.out.println("Plazo: ");
                 System.out.println("1. 12 Meses\n2. 24 Meses\n3. 32 Meses");
                 in.nextLine();
                 plazo = in.nextInt();
                 break;
             case 2:
                 System.out.println("Numero De Cotizacion: " +N.getNumeroDeCotizacion());
                 System.out.println("descripcion: "+N.getDescripcion());
                 System.out.println("Precio: "+N.getPrecio());
                 System.out.println("Plazo: "+N.getPlazo());
                 break;
             case 3:
                do
                {
                    System.out.println("Elija la opcion que desee modificar: ");
                    System.out.println("1. Modificar Descripcion");
                    System.out.println("2. Modificar Precio");
                    System.out.println("3. Modificar Plazo");
                    System.out.println("4. Regresar");
                    opcion = in.nextInt();
                    switch (opcion)
                    {
                        case 1:
                           System.out.println("Nueva Descripcion: ");
                           in.nextLine();
                           descripcion = in.nextLine();
                           N.setDescripcion(descripcion);
                           break;
                       case 2:
                           System.out.println("Nuevo Precio: ");
                           in.nextDouble();
                           precio = in.nextDouble();
                           N.setPrecio(precio);
                           break;
                       case 3:
                           System.out.println("Nuevo Plazo: ");
                           in.nextInt();
                           plazo = in.nextInt();
                           N.setPlazo(plazo);
                           break;
                       case 4:
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
         
        }while(opcion!=4);
    }
}
