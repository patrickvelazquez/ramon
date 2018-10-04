package recuperacion;
//Autor: Marco Camacho
import java.util.Scanner;

public class Recuperacion 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        float precioVenta=10000;
        Empleados vendedor = new Empleados();
        
        int opcion;
        do
        {
            printf("\n\n\n");
            printf("Tienda de Cosméticos");
            printf("------------------------------------");
            printf("Seleccione una opción:");
            printf("1) Vendedor   2) Ganancias   3) Salir");
            printf("Respuesta: ");
            opcion=in.nextInt();
            switch(opcion)
            {
                case 1:
                    printf("\n\n\n");
                    precioVenta=vendedor(vendedor,precioVenta);
                    break;
                case 2:
                    printf("\n\n\n");
                    ganancias(vendedor,precioVenta);
                    break;
                default:
                    printf("\n\n\n");
                    printf("Seleccione una opción válida");
                    break;
            }
        }while(opcion!=3);
    }
    
    private static float vendedor(Empleados vendedor,float precioVenta)
    {
        Scanner in = new Scanner(System.in);
        Scanner Nombre = new Scanner(System.in);
        int numeroEmpleado=1,nivel = 0,numeroVentas;
        String nombre,domicilio;
        float sueldoBase,comision = 0;
        int opcion = 0; 
        boolean salida = false;
        do
        {
            printf("Vendedor");
            printf("--------------");
            numeroEmpleado++;
            printf("Digite su nombre: ");
            nombre = Nombre.nextLine();
            printf("Digite su domicilio: ");
            domicilio = in.nextLine();
            printf("Seleccione su nivel:\n1.- Vendedor de piso   2.- Vendedor foráneo\n\nRespuesta: ");
            opcion = in.nextInt();
            switch(opcion)
            {
                case 1:
                    nivel = 1;
                    comision = 0.05f;
                    break;
                case 2:
                    nivel = 2;
                    comision = 0.10f;
                    break;
                default:
                    printf("Seleccione una opción válida");
                    break;
            }
            printf("Digite su cantidad de ventas realizadas: ");
            numeroVentas = in.nextInt();
            printf("Digite su sueldo base: ");
            sueldoBase=in.nextFloat();
            printf("Digite el precio de la venta: ");
            precioVenta = in.nextFloat();
            
            vendedor.setComision(comision);
            vendedor.setDomicilio(domicilio);
            vendedor.setNivel(nivel);
            vendedor.setNombre(nombre);
            vendedor.setNumeroEmpleado(numeroEmpleado);
            vendedor.setNumeroVentas(numeroVentas);
            vendedor.setSueldoBase(sueldoBase);
            salida = true;
        }while(salida != true);
        return (float) precioVenta;
    }
    
    private static void ganancias(Empleados vendedor,float precioVenta)
    {
        printf("Ganancias");
        printf("--------------");
        printf("Número de empleado: "+vendedor.getNumeroEmpleado());
        printf("Nombre de empleado: "+vendedor.getNombre());
        printf("Domicilio de empleado: "+vendedor.getDomicilio());
        printf("Sueldo base del empleado: $"+vendedor.getSueldoBase());
        printf("Nivel del empleado: "+vendedor.getNivel());
        printf("Porcentaje de comisión: %"+vendedor.getComision());
        printf("Número de ventas: "+vendedor.getNumeroVentas());
        printf("Precio de las ventas: $"+precioVenta);
        printf("Comisión por ventas: $"+vendedor.calcularPagoComision(precioVenta));
        printf("Bono: $"+vendedor.calcularBonoVenta());
        printf("Pago total: $"+vendedor.calcularPago(precioVenta));
    }
    
    private static void printf(String texto)
    {
        System.out.println(texto);
    }
}
