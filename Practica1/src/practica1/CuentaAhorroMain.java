/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import java.util.Scanner;

/**
 *
 * @author Konakun
 */
public class CuentaAhorroMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        boolean apertura = false;
        int opcion = 0, numeroDeCuenta = 0, edad = 0;
        float saldo, montoDeEfectivo = 0;
        String nombre = "", fechaDeNacimiento = "", domicilio = "", fechaDeApertura = "", sucursalDeBanco = "";
        
        CuentaAhorro nueva = new CuentaAhorro();
        
        nueva.aperturaCuenta(edad, montoDeEfectivo);
        
        do{
            System.out.println("1.- Crear cuenta de ahorro");
            System.out.println("2.- Depositar efectivo");
            System.out.println("3.- Retirar efectivo");
            System.out.println("4.- Consultar saldo");
            System.out.println("5.- Modificar cuenta de ahorro");
            System.out.println("6.- Salir");
            
            opcion = in.nextInt();
            switch(opcion){
                case 1:
                    numeroDeCuenta = numeroDeCuenta + 1;
                    
                    System.out.println("Dame el nombre del cliente");
                    in.nextLine();
                    nombre = in.nextLine();
                    
                    System.out.println("Dame la fecha de nacimiento");
                    fechaDeNacimiento = in.nextLine();
                    
                    System.out.println("Dame la edad del cliente");
                    edad = in.nextInt();
                    
                    System.out.println("Dame el domicilio del cliente");
                    in.nextLine();
                    domicilio = in.nextLine();
                    
                    System.out.println("Dame el saldo inicial del cliente");
                    montoDeEfectivo = in.nextFloat();
                    
                    System.out.println("Dame la fecha de apertura de la cuenta");
                    in.nextLine();
                    fechaDeApertura = in.nextLine();
                    
                    System.out.println("Dame la sucursal de banco de apertura");
                    sucursalDeBanco = in.nextLine();
                    
                    if(nueva.aperturaCuenta(edad,montoDeEfectivo)){
                        nueva.setNumeroDeCuenta(numeroDeCuenta);
                        nueva.setNombre(nombre);
                        nueva.setFechaDeNacimiento(fechaDeNacimiento);
                        nueva.setDomicilio(domicilio);
                        nueva.setSaldo(montoDeEfectivo);
                        nueva.setFechaDeApertura(fechaDeApertura);
                        nueva.setSucursalDeBanco(sucursalDeBanco);
                    }
                    else{
                        System.out.println("No se cumplen los requisitos para crear una cuenta");
                    }
                    break;
                case 2:
                    System.out.println("Cantidad a depositar");
                    montoDeEfectivo = in.nextInt();
                    nueva.depositoDeEfectivo(montoDeEfectivo);
                    break;
                case 3:
                    System.out.println("Cantidad a retirar");
                    montoDeEfectivo = in.nextInt();
                    nueva.retiroDeEfectivo(montoDeEfectivo);
                    break;
                case 4:
                    System.out.println(nueva.consultaDeSaldo());
                    break;
                case 5:
                    do{
                        System.out.println("1.- Cambiar numero de cuenta");
                        System.out.println("2.- Cambiar nombre");
                        System.out.println("3.- Cambiar fecha de nacimiento");
                        System.out.println("4.- Cambiar domicilio");
                        System.out.println("5.- Cambiar saldo");
                        System.out.println("6.- Cambiar fecha de apertura");
                        System.out.println("7.- Cambiar sucursal de banco");
                        System.out.println("8.- Salir");
                        
                        opcion = in.nextInt();
                        
                        switch(opcion){
                            case 1:
                                System.out.println("Dame el numero de cuenta");
                                numeroDeCuenta = in.nextInt();
                                nueva.setNumeroDeCuenta(numeroDeCuenta);
                                break;
                            case 2:
                                System.out.println("Dame el nombre del cliente");
                                in.nextLine();
                                nombre = in.nextLine();
                                nueva.setNombre(nombre);
                                break;
                            case 3:
                                System.out.println("Dame la fecha de nacimiento");
                                in.nextLine();
                                fechaDeNacimiento = in.nextLine();
                                nueva.setFechaDeNacimiento(fechaDeNacimiento);
                                break;
                            case 4:
                                System.out.println("Dame el domicilio del cliente");
                                in.nextLine();
                                domicilio = in.nextLine();
                                nueva.setDomicilio(domicilio);
                                break;
                            case 5:
                                System.out.println("Dame el saldo inicial del cliente");
                                saldo = in.nextFloat();
                                nueva.setSaldo(saldo);
                                break;
                            case 6:
                                System.out.println("Dame la fecha de apertura de la cuenta");
                                in.nextLine();
                                fechaDeApertura = in.nextLine();
                                nueva.setFechaDeApertura(fechaDeApertura);
                                break;
                            case 7:
                                System.out.println("Dame la sucursal de banco de apertura");
                                in.nextLine();
                                sucursalDeBanco = in.nextLine();
                                nueva.setSucursalDeBanco(sucursalDeBanco);
                                break;
                            case 8:
                                break;
                            default:
                                System.out.println("No es una opción valida");
                        }
                    }while(opcion != 9);
                    break;
                case 6:
                    System.out.println("Gracias...");
                    break;
                default:
                    System.out.println("No es una opción valida");
            }
        }while(opcion != 6);
        System.out.println("Oprima cualquier tecla para continuar...");
        in.nextLine();
        in.nextLine();
    }
}
