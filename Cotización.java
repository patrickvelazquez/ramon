
package Tercero;
import java.util.Scanner;

public class Cotización 
{ 
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int opcion,respuesta;
        cotizacionAutomovil nuevoCliente = new cotizacionAutomovil();
        do
        {
            System.out.println("Cotización de Automoviles - Toyota");
            System.out.println("---------------------------------------");
            printf("\nSelecciona una opción:");
            printf("\n[1] Nueva Cotización");
            printf("[2] Consultar Cotización");
            printf("[3] Modificar Cotización");
            printf("[4] Salir");
            printf("\nRespuesta");
            opcion = in.nextInt();
            switch(opcion)
            {
                case 1:
                    printf("Nueva Cotización");
                    printf("-------------------------");
                    cotizacionAuto(nuevoCliente);
                    break;
                case 2:
                    printf("Consulta de cotización");
                    printf("-------------------------\n"+nuevoCliente.datosCompra());
                    break;
                case 3:
                    printf("Modificar Cotización");
                    printf("-------------------------\n");
                    printf("Datos de la cotización\n-------------------------------\n"+nuevoCliente.datosCompra());
                    printf("\n¿Estás seguro que deseas modificar?");
                    printf("1) Si     2) No\nRespuesta: ");
                    respuesta = in.nextInt();
                    if(respuesta == 1)
                    {
                        printf("\nModificar Cotización"); 
                        cotizacionAuto(nuevoCliente);
                    }    
                    else
                        break;
                default:
                    printf("Selecciona una opción válida");
                    break;
            }
        }while(opcion!=4);
    }  
       
    private static void printf(String texto) 
    {
        System.out.println(texto);
    }  
    private static void cotizacionAuto(cotizacionAutomovil nuevoCliente)
    {
        Scanner in = new Scanner(System.in);
        int opcion = 0;
        int numeroCotizacion=0;
        String descripcionAutomovil = null;
        float costo = 0;
        int plazo,respuesta;
        
        do
        {
            numeroCotizacion++;
            printf("\nTe presentamos las siguientes opciones de automoviles:\n");
            printf("Opción 1\nModelo: Prius\nCosto: $383,400 M.N.\n");
            printf("Opción 2:\nModelo: Yaris R\nCosto: $254,400 M.N.\n");
            printf("Opción 3:\nModelo: Corolla\nCosto: $288,400 M.N.\n");
            printf("Opción 4:\nModelo: Camry\nCosto: $409,900 M.N.\n");
            printf("\nElija la opción que desee: ");
            opcion = in.nextInt();
            switch (opcion) 
            {
                case 1:
                
                    costo = 383400;
                    descripcionAutomovil = "Frius";
                    break;
                case 2:
                    costo = 254400;
                    descripcionAutomovil = "Yaris";
                    break;
                case 3:
                    costo = 288400;
                    descripcionAutomovil = "Corolla";
                    break;
                case 4:
                    costo = 409900;
                    descripcionAutomovil = "Camry";
                    break;
                default:
                    printf("Selecciona una opción válida");
                    break;
            }
            printf("\n¿A cuántos meses lo desea?");
            plazo = in.nextInt();

            nuevoCliente.setCosto(costo);
            nuevoCliente.setDescripcionAutomovil(descripcionAutomovil);
            nuevoCliente.setNumeroCotizacion(numeroCotizacion);
            nuevoCliente.setPlazo(plazo);

            printf("\nDetalles de la Compra");
            printf("---------------------------\n"+nuevoCliente.datosCompra());
            printf("\n¿Son estos datos correctos?");
            printf("\n1) Si     2) No\nResúesta");
            respuesta = in.nextInt();
        }while(respuesta!=1); 
    }
}
