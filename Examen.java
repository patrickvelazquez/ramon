package examen;
import java.util.Scanner;

public class Examen 
{
    public static void main(String[] args) 
    {
        BombaGasolina bomba=new BombaGasolina(),bomba2 = new BombaGasolina(),bomba3 = new BombaGasolina();
       
        bomba2.setPrecioGasolina(17.0f);
        bomba2.setTipoGasolina(2);
        bomba2.setNumeroBomba(2);
        
        bomba3.setPrecioGasolina(18.0f);
        bomba3.setTipoGasolina(3);
        bomba3.setNumeroBomba(3);
        
        Scanner in = new Scanner(System.in);
        int opcion=0;
        do
        {
            printf("\n\n\n");
            printf("Bienvenido a la Gasolinera NISPU");
            printf("------------------------------------");
            printf("Seleccione una opción:");
            printf("1) Comprar gasolina   2) Ganancias   3) Salir");
            printf("Respuesta: ");
            opcion=in.nextInt();
            switch(opcion)
            {
                case 1:
                    printf("\n\n\n");
                    CompraGasolina(bomba,bomba2,bomba3);
                    break;
                case 2:
                    printf("\n\n\n");
                    ganancias(bomba,bomba2,bomba3);
                    break;
                default:
                    printf("\n\n\n");
                    printf("Seleccione una opción válida");
                    break;
                    
            }
        }while(opcion!=3);
    }
    
    private static void ganancias(BombaGasolina bomba,BombaGasolina bomba2,BombaGasolina bomba3)
    {
        Scanner in = new Scanner(System.in);
        int opcion = 0; 
        boolean salida = false;
        do
        {
            printf("Ganancias");
            printf("------------------");
            printf("Seleccione el tipo de gasolina que desea: ");
            printf("1) Tipo 1      2) Tipo 2      3) Tipo 3      4) Salir");
            printf("Respuesta: ");
            opcion = in.nextInt();
            switch(opcion)
            {
                case 1:
                    printf("Bomba número: "+bomba.getNumeroBomba());
                    printf("La cantidad de gasolina disponible es: 1000 / " + bomba.inventario());
                    printf("Litros vendidos: "+bomba.getLitrosVendidos()/2);
                    printf("Ganancia: $"+bomba.totalVenta());
                    salida = true;
                    break;
                case 2:
                    printf("Bomba número: "+bomba2.getNumeroBomba());
                    printf("La cantidad de gasolina disponible es: 1000 / " + bomba2.inventario());
                    printf("Litros vendidos: "+bomba2.getLitrosVendidos());
                    printf("Ganancia: $"+bomba2.totalVenta());
                    salida = true;
                    break;
                case 3:
                    printf("Bomba número: "+bomba3.getNumeroBomba());
                    printf("La cantidad de gasolina disponible es: 1000 / " + bomba3.inventario());
                    printf("Litros vendidos: "+bomba3.getLitrosVendidos());
                    printf("Ganancia: $"+bomba3.totalVenta());
                    salida = true;
                    break;
                case 4:
                    salida = true;
                    break;
            }
        }while(salida != true);
    }
    
    private static void CompraGasolina(BombaGasolina bomba, BombaGasolina bomba2,BombaGasolina bomba3)
    {
        Scanner in = new Scanner(System.in);
        int opcion;
        float litros=0;
        boolean salida = false;
        
        do
        {
            printf("Compra de Gasolina");
            printf("-----------------------");
            printf("Seleccione el tipo de gasolina que desea: ");
            printf("1) Tipo 1      2) Tipo 2      3) Tipo 3      4) Salir");
            printf("Precio: $"+ bomba.getPrecioGasolina()+ "  Precio: $"+ bomba2.getPrecioGasolina()+ "  Precio: $"+ bomba3.getPrecioGasolina());
            printf("Respuesta: ");
            opcion = in.nextInt();
            switch(opcion)
            {
                case 1:
                    haciendoVenta(bomba);
                    salida = true;
                    break;
                case 2:
                    haciendoVenta(bomba2);
                    salida = true;
                    break;
                case 3:
                    haciendoVenta(bomba3);
                    salida = true;
                    break;
                case 4:
                    salida = true;
                    break;
                default:
                    printf("\n\n\n");
                    printf("Seleccione una opción válida");
                    break;
            }
        }while(salida!=true);
    }
    
    private static void haciendoVenta(BombaGasolina bomba)
    {
        Scanner in = new Scanner(System.in);
        float litros=0;
        printf("¿Cuántos litros de gasolina desea? ");
        litros = in.nextFloat();
        if(bomba.venta(litros)==0)
            printf("No contamos con esa cantidad de gasolina");
        else
        {
            printf("Total a pagar: "+bomba.venta(litros));
        }
            
    }
    
    private static void printf(String texto)
    {
        System.out.println(texto);
    }
}
