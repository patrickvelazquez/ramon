/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;
import java.util.Scanner;/**
 *
 * @author Luis Espinoza
 */
public class BoletoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int id, opcion, tipoViaje, edad = 0;
        float precio;
        String nombreCliente, fecha, destino;
        Boleto bol = new Boleto();
        do
        {
            System.out.println("1. Inicializar objeto");
            System.out.println("2. Modificar");
            System.out.println("3. Calcular Subtotal");
            System.out.println("4. Calcular Impuesto");
            System.out.println("5. Calcular Descuento");
            System.out.println("6. Calcular Total a pagar");
            System.out.println("7. Salir");

            opcion= in.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Ingresa el Id");
                    id = in.nextInt();
                    bol.setId(id);

                    
                    System.out.println("Ingresa el nombre del cliente");
                    nombreCliente=in.next();
                    bol.setNombreCliente(nombreCliente);
                    
                    System.out.println("Ingresa la edad del cliente");
                    edad=in.nextInt();
                    
                    System.out.println("Ingresa el precio del boleto");
                    precio=in.nextFloat();
                    bol.setPrecio(precio);
                    
                    System.out.println("Ingresa el tipo de viaje");
                    System.out.println("1. Sencillo");
                    System.out.println("2. Redondo");
                    tipoViaje = in.nextInt();
                    bol.setTipoViaje(tipoViaje);
                    
                    System.out.println("Ingrese la fecha");
                    fecha = in.next();
                    bol.setFecha(fecha);
                    
                    System.out.println("Ingrese el destino");
                    destino = in.next();
                    bol.setDestino(destino);
                    break;
                case 2:
                    do
                    {
                        System.out.println("¿Qué desea modificar?");
                        System.out.println("1. ID");
                        System.out.println("2. Nombre del Cliente");
                        System.out.println("3. Edad del Cliente");
                        System.out.println("4. Precio del boleto");
                        System.out.println("5. Tipo de viaje");
                        System.out.println("6. Fecha");
                        System.out.println("7. Destino");
                        System.out.println("8. Regresar");
                        opcion = in.nextInt();
                        switch(opcion)
                        {
                            case 1:
                                System.out.println("Ingresa nuevo Id");
                                id = in.nextInt();
                                bol.setId(id);
                                break;
                            case 2:
                                System.out.println("Ingresa nuevo nombre del cliente");
                                nombreCliente=in.next();
                                bol.setNombreCliente(nombreCliente); 
                                break;
                            case 3:
                                System.out.println("Ingresa nueva edad del cliente");
                                edad=in.nextInt();
                                break;
                            case 4: 
                                System.out.println("Ingresa nuevo precio del boleto");
                                precio=in.nextFloat();
                                bol.setPrecio(precio);
                                break;
                            case 5:
                                System.out.println("Ingresa nuevo tipo de viaje");
                                System.out.println("1. Sencillo");
                                System.out.println("2. Redondo");
                                tipoViaje = in.nextInt();
                                bol.setTipoViaje(tipoViaje);
                                break;
                            case 6:
                                System.out.println("Ingrese nueva fecha");
                                fecha = in.next();
                                bol.setFecha(fecha);
                                break;
                            case 7:
                                System.out.println("Ingrese nuevo destino");
                                destino = in.next();
                                bol.setDestino(destino);
                                break;
                            default:
                                System.out.println("Ingrese opcion valida");
                        }
                    }while(opcion!=8);
                    break;
                case 3:
                    System.out.println("El subtotal es: $ "+ bol.calcularSubtotal());
                    break;
                case 4:
                    System.out.println("El impuesto es: $ "+bol.calcularImpuesto());
                    break;
                case 5:
                    System.out.println("El descuento es: $"+bol.calcularDescuento(edad));
                    break;
                case 6:
                    float res;
                    res=bol.calcularSubtotal()+bol.calcularImpuesto()-bol.calcularDescuento(edad);
                    System.out.println("El total a pagar es: $ "+res);
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
            }while(opcion!=7);
}
        }