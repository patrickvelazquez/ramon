/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;
import java.util.Scanner;
/**
 *
 * @author JOSHYEL
 */
public class BoletoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Boleto boleto = new Boleto();
        String nombre, destino, fecha;
        int opcion=0, nBoleto=0, tipo=0, edad =0 ;
        float precio=0.0f, descuento=0.0f, subtotal=0.0f, impuesto=0.0f;
        do
        {
            System.out.println("1. Ingresar datos del boleto");
            System.out.println("2. Ver boleto");
            System.out.println("3. Modificar datos");
            System.out.println("4. Calcular Subtotal");
            System.out.println("5. Calcular Impuesto");
            System.out.println("6. Calcular Descuento");
            System.out.println("7. Calcular Total a Pagar");
            System.out.println("8. Salir");
            opcion = in.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Ingrese numero de boleto");
                    nBoleto = in.nextInt();
                    boleto.setNoBoleto(nBoleto);
                    System.out.println("Ingrese nombre del cliente");
                    nombre = in.next();
                    boleto.setNomCliente(nombre);
                    System.out.println("Ingrese destino");
                    destino = in.next();
                    boleto.setDestino(destino);
                    System.out.println("Ingrese fecha (dd/mm/año)");
                    fecha = in.next();
                    boleto.setFecha(fecha);
                    System.out.println("Ingrese tipo de boleto (1 o 2)");
                    tipo = in.nextInt();
                    boleto.setTipo(tipo);
                    System.out.println("Ingrese precio del boleto");
                    precio = in.nextFloat();
                    boleto.setPrecio(precio);
                    break;
                case 2:
                    System.out.println("No. Boleto " + boleto.getNoBoleto());
                    System.out.println("Nombre " + boleto.getNomCliente());
                    System.out.println("Fecha " + boleto.getFecha());
                    System.out.println("Destino " + boleto.getDestino());
                    System.out.println("Tipo de boleto " + boleto.getTipo());
                    System.out.println("Precio " + boleto.getPrecio());
                    break;
                case 3:
                    System.out.println("Que desea modificar?");
                    System.out.println("1. Nombre");
                    System.out.println("2. Destino");
                    System.out.println("3. Tipo");
                    System.out.println("4. Precio");
                    System.out.println("5. Salir");
                    opcion = in.nextInt();
                    switch(opcion)
                    {
                        case 1:
                            System.out.println("Ingrese nombre");
                            nombre = in.next();
                            boleto.setNomCliente(nombre);
                            break;
                        case 2:
                            System.out.println("Ingrese destino");
                            destino = in.next();
                            boleto.setDestino(destino);
                            break;
                        case 3:
                            System.out.println("Ingrese tipo de boleto (1 o 2)");
                            tipo = in.nextInt();
                            boleto.setTipo(tipo);
                            break;
                        case 4:
                            System.out.println("Ingrese precio");
                            precio = in.nextFloat();
                            boleto.setPrecio(precio);
                            break;
                        case 5:
                            break;
                            
                        default:System.out.println("Ingrese una opciobn valida");
                    }
                    break;
                case 4:
                    System.out.println("Subtotal " + boleto.calcularSubTotal());
                    break;
                case 5:
                    System.out.println("Impuesto " + boleto.calcularImpuesto());
                    break;
                case 6:
                    System.out.println("Ingrese edad");
                    edad = in.nextInt();
                    System.out.println("Descuento " + boleto.calcularDescuento(edad));
                    break;
                case 7:
                    System.out.println("Ingrese edad del cliente");
                    edad = in.nextInt();
                    descuento=boleto.calcularDescuento(edad);
                    System.out.println("Total a pagar " + boleto.calcularTotalPagar(descuento));
                    break;
                case 8:
                    break;
                
                default: System.out.println("Ingrese una opcion valida");
            }
            System.out.println("Oprima cualquier tecla para continuar");
            in.nextInt();
        }while(opcion!=8);
    }
    
}
