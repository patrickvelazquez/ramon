package programa1;
import java.util.Scanner;
/*
                                     |####`--|#|---|##|---|#|--'##|#|
   _                                 |____,--|#|---|##|---|#|--.__|_|
 _|#)_____________________________________,--'EEEEEEEEEEEEEE'_=-.
((_____((_________________________,-Programing by CarlosSant47 ==)        _________
                               .--|##,----o  o  o  o  o  o  o__|/`---,-,-'=========`=+==.
                               |##|_Y__,__.-._,__,  __,-.___/ J \ .----.#############|##|
                               |##|              `-.|#|##|#|`===l##\   _\############|##|
                              =======-===l          |_|__|_|     \##`-"__,=======.###|##|
                                                                  \__,"          '======'
*/
public class BoletoMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numBoleto = 0, tipoViaje = 0, op = 0, edad;
        String nombre = "", destino = "", fecha = "";
        float precio = 0.0f;

        Boleto boleto = new Boleto();
        do{
            printf("1 - Crear Boleto");
            printf("2 - Calcular Subtotal");
            printf("3 - Calcular Descuento");
            printf("4 - Calcular Total a pagar");
            printf("5 - Modificar Boleto");
            printf("6 - Mostrar Informacion del Boleto");
            printf("7 - Salir");
            printf("Elige una opccion");
            op = in.nextInt();
            
            switch(op)
            {
                case 1:
                    printf("Introduzca el numero de Boleto");
                    numBoleto = in.nextInt();
                    printf("Intduzca el nombre");
                    nombre = in.next();
                    printf("Introduzca el destino");
                    destino = in.next();
                    printf("Introduce la fecha");
                    fecha = in.next();
                    printf("Introduce el precio del boleto $");
                    precio = in.nextFloat();

                    do{
                        printf("Introduce el tipo de boleto");
                        printf("1 - Simple");
                        printf("2 - Redondo");

                        tipoViaje = in.nextInt();


                    }while(tipoViaje > 2 || tipoViaje < 1);
                    boleto.setDestino(destino);
                    boleto.setFecha(fecha);
                    boleto.setTipoViaje(tipoViaje);
                    boleto.setNombreCliente(nombre);
                    boleto.setNoBoleto(numBoleto);
                    boleto.setPrecio(precio);
                    break;
                case 2:

                    printf("El subototal a pagar es $" + boleto.calcularSubtotal() + " MXN");
                    break;
                case 3:

                    printf("Introduce la edad");
                    edad = in.nextInt();

                    printf("El descuento por edad es de $"+ boleto.calcularDescuento(edad) + " MXN");
                    break;
                case 4:
                    printf("Introduce la edad");
                    edad = in.nextInt();
                    printf("El total a pagar es de $" + boleto.calcularTotal(edad) + " MXN");
                    break;
                case 5:
                    do{
                        printf("1 - Modificar numero de boleto");
                        printf("2 - Modificar nombre de cliente");
                        printf("3 - Modificar destino");
                        printf("4 - Modificar tipo de viaje");
                        printf("5 - Modificar precio del boleto");
                        printf("6 - Modificar fecha");
                        printf("7 - Salir");
                        op = in.nextInt();
                        switch (op)
                        {
                            case 1:
                                printf("Introduzca el numero de Boleto");
                                numBoleto = in.nextInt();
                                boleto.setNoBoleto(numBoleto);
                                break;
                            case 2:
                                printf("Intduzca el nombre");
                                nombre = in.next();
                                boleto.setNombreCliente(nombre);
                                break;
                            case 3:
                                printf("Introduzca el destino");
                                destino = in.next();
                                boleto.setDestino(destino);
                                break;
                            case 4:
                                do{
                                    printf("Introduce el tipo de boleto");
                                    printf("1 - Simple");
                                    printf("2 - Redondo");
                                    tipoViaje = in.nextInt();
                                    boleto.setTipoViaje(tipoViaje);

                                }while(tipoViaje > 2 || tipoViaje < 1);
                                break;
                            case 5:
                                printf("Introduce el precio del boleto $");
                                precio = in.nextFloat();
                                boleto.setPrecio(precio);
                                break;
                            case 6:
                                printf("Introduzca la fecha");
                                fecha = in.next();
                                boleto.setFecha(fecha);
                                break;
                            case 7:
                                break;
                            default: printf("Opccion invalida");
                        }
                    }while(op != 7);
                    op = 0;
                    break;
                case 6:
                    printf(boleto.mostrarInformacion());
                    break;
                case 7:
                    printf("Adios uwu");
                    break;
                default: printf("Esta opccion es invalida");
            }
            printf("Presione cualquier tecla para continuar");
            in.next();

        }while(op != 7);


    }
    
    
    private static void printf(String s)
    {
        System.out.println(s);
    }
    
}
