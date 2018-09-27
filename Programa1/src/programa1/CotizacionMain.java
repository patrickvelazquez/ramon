package programa1;

import java.util.Scanner;

public class CotizacionMain {
    public static void main(String[] args)
    {
        Cotizacion cotizacion = new Cotizacion();
        int numCotizacion = 0, plazo = 0, porcentaje = 0, op = 0;
        float precio = 0.0f;
        String descripcion = "";
        Scanner in = new Scanner(System.in);

        do{

            System.out.println("1 - Crear Cotizacion");
            System.out.println("2 - Calcular Pago Inicial");
            System.out.println("3 - Calcular Pago Final");
            System.out.println("4 - Calcular Pago Mensual");
            System.out.println("5 - Modificar Cotizacion");

            System.out.println("6 - Salir");
            System.out.println("Elije una opccion");
            op = in.nextInt();

            switch (op)
            {
                case 1:
                    System.out.println("Introduce el numero de cotizacion");
                    numCotizacion = in.nextInt();
                    System.out.println("Introduce el precio");
                    precio = in.nextFloat();
                    System.out.println("Introduce el plazo a pagar");
                    plazo = in.nextInt();
                    System.out.println("Introduce el porcentaje de pago inicial");
                    porcentaje = in.nextInt();
                    System.out.println("Introduce la descripcion");
                    in.next();
                    cotizacion.setPrecio(precio);
                    cotizacion.setDescripcion(descripcion);
                    cotizacion.setPorcentajePagIn(porcentaje);
                    cotizacion.setPlazo(plazo);
                    cotizacion.setNumCotizacion(numCotizacion);
                    break;
                case 2:
                    System.out.println("El pago inicial es de $" + cotizacion.calcularPagoInicial());
                    break;
                case 3:
                    System.out.println("El pago final es de %" + cotizacion.calcularPagoFinal());
                    break;
                case 4:
                    System.out.println("El pago por el pazo de " + cotizacion.getPlazo() + " Meses es de $" +
                            cotizacion.calcularPagoMensual());
                    break;
                case 5:
                    do {
                        System.out.println("1- Modificar NumCotizacion");
                        System.out.println("2 - Modificar Descripcion");
                        System.out.println("3 - Modificar Porcentaje de pago inicial");
                        System.out.println("4 - Modifcar precio");
                        System.out.println("5 - Modificar Plazo");
                        System.out.println("6 - Salir");
                        System.out.println("Elige una opccion");
                        op = in.nextInt();
                        switch (op)
                        {
                            case 1:
                                System.out.println("Introduce el numero de cotizacion");
                                numCotizacion = in.nextInt();
                                cotizacion.setNumCotizacion(numCotizacion);
                                break;
                            case 2:
                                System.out.println("Introduce la descripcion");
                                in.next();
                                cotizacion.setDescripcion(descripcion);
                                break;
                            case 3:
                                System.out.println("Introduce el porcentaje de pago inicial");
                                porcentaje = in.nextInt();
                                cotizacion.setPorcentajePagIn(porcentaje);
                                break;
                            case 4:
                                System.out.println("Introduce el precio");
                                precio = in.nextFloat();
                                cotizacion.setPrecio(precio);
                                break;
                            case 5:
                                System.out.println("Introduce el plazo a pagar");
                                plazo = in.nextInt();
                                cotizacion.setPlazo(plazo);
                                break;
                            case 6:
                                break;
                            default: System.out.println("Opccion invalida");
                        }
                    }while (op != 6);
                    op = 0;
                    break;
                case 6:
                    System.out.println("Adios 7u7");
                    break;
                default: System.out.println("Opccion invalida");
            }
        }while (op != 6);

    }

}
