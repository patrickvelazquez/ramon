/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;
import java.util.Scanner;
/**
 *
 * @author Kennyswh
 */
public class CuentaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        boolean verificar;
        int numero = 0, opcion = 0, edad = 0;
        float saldo =  0.0f;
        String nombreCliente, domicilio, fechaNacimiento, fechaApertura, nombreSucursal;
        Cuenta cuenta = new Cuenta();
        do{
            System.out.println("1. Crear Cuenta");
            System.out.println("2. Consultar Saldo");
            System.out.println("3. Depositar");
            System.out.println("4. Retirar");
            System.out.println("5. Mostrar Datos de la Cuenta");
            System.out.println("6. Modificar Datos");
            System.out.println("7. Salir");
            
            opcion = in.nextInt();
            
            switch(opcion){
                case 1:
                    do{
                        System.out.println("Ingresa la edad");
                        edad = in.nextInt();
                        System.out.println("Ingresa el saldo");
                        saldo = in.nextFloat();
                        verificar = cuenta.crearCuenta(saldo, edad);
                        if(!verificar){
                            System.out.println("La persona tiene que ser mayor de edad y el saldo minimo es de 1000 MXN");
                        }
                    }while(!verificar);
                    System.out.println("Ingresa el numero de cuenta");
                    numero = in.nextInt();
                    in.nextLine();
                    System.out.println("Ingresa el nombre del cliente");
                    nombreCliente = in.nextLine();
                    System.out.println("Ingresa el domicilio");
                    domicilio = in.nextLine();
                    System.out.println("Ingresa su fecha de nacimiento");
                    fechaNacimiento = in.nextLine();
                    System.out.println("Ingresa la fecha de apertura");
                    fechaApertura = in.nextLine();
                    System.out.println("Ingresa el nombre de la sucursal");
                    nombreSucursal = in.nextLine();
                    cuenta.setNumeroCuenta(numero);
                    cuenta.setNombreCliente(nombreCliente);
                    cuenta.setDomicilio(domicilio);
                    cuenta.setFechaNacimiento(fechaNacimiento);
                    cuenta.setSaldo(saldo);
                    cuenta.setFechaApertura(fechaApertura);
                    cuenta.setNombreSucursal(nombreSucursal);
                    break;
                case 2:
                    System.out.println("El Saldo es: " + cuenta.consultarSaldo() + " MXN");
                    break;
                case 3:
                    System.out.println("Ingresa la cantidad a depositar");
                    saldo = in.nextFloat();
                    cuenta.depositar(saldo);
                    break;
                case 4:
                    do{
                        System.out.println("Ingresa la cantidad a retirar");
                        saldo = in.nextFloat();
                        verificar = cuenta.retirar(saldo);
                        if(!verificar){
                            System.out.println("La cantidad retirada no puede superar el saldo de la cuenta");
                        }
                        else{
                            System.out.println("Operacion exitosa");
                        }
                    }while(!verificar);
                    break;
                case 5:
                    System.out.println("Numero de Cuenta: " + cuenta.getNumeroCuenta() + "\nNombre del Cliente: " 
                            + cuenta.getNombreCliente() + "\nFecha de Nacimiento: " + cuenta.getFechaNacimiento()
                            + "\nDomicilio: " + cuenta.getDomicilio() + "\nFecha de Apertura: " + cuenta.getFechaApertura()
                            + "\nNombre de la Sucursal: " +cuenta.getNombreSucursal());
                    break;    
                case 6:
                    do{
                        System.out.println("Elija la opcion deseada:");
                        System.out.println("1. Modificar Número de Cuenta");
                        System.out.println("2. Modificar Nombre del Cliente");
                        System.out.println("3. Modificar Domicilio");
                        System.out.println("4. Modificar Fecha de Nacimiento");
                        System.out.println("5. Modificar Fecha de Apertura");
                        System.out.println("6. Modificar Nombre de la Sucursal");
                        System.out.println("7. Regresar");
                        opcion = in.nextInt();
                        switch(opcion){
                            case 1:
                                System.out.println("Ingresa el numero de cuenta");
                                numero = in.nextInt();
                                cuenta.setNumeroCuenta(numero);
                                break;
                            case 2:
                                in.nextLine();
                                System.out.println("Ingresa el nombre del cliente");
                                nombreCliente = in.nextLine();
                                cuenta.setNombreCliente(nombreCliente);
                                break;
                            case 3:
                                in.nextLine();
                                System.out.println("Ingresa el domicilio");
                                domicilio = in.nextLine();
                                cuenta.setDomicilio(domicilio);
                                break;
                            case 4:  
                                in.nextLine();
                                System.out.println("Ingresa la fecha de nacimiento");
                                fechaNacimiento = in.nextLine();
                                cuenta.setFechaNacimiento(fechaNacimiento);
                                break;
                            case 5:
                                in.nextLine();
                                System.out.println("Ingresa la fecha de apertura");
                                fechaApertura = in.nextLine();
                                cuenta.setFechaApertura(fechaApertura);
                                break;
                            case 6:
                                in.nextLine();
                                System.out.println("Ingresa el nombre de la sucursal");
                                nombreSucursal = in.nextLine();
                                cuenta.setNombreSucursal(nombreSucursal);
                                break;
                            case 7:
                                break;
                            default:
                                System.out.println("No es una opción válida");
                        }
                    }while(opcion != 7);
                    opcion = 0;
                    break;
                case 7:
                    System.out.println("Gracias, hasta la vista");
                    break;
                default:
                    System.out.println("No es una opción válida");
            }
        System.out.println("Oprima cualquier tecla para continuar");
            in.nextInt();
        } while(opcion != 7);
        // TODO code application logic here
    }
}
