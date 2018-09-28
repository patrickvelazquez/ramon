/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;
import java.util.Scanner;/**
/**
 *
 * @author Luis Espinoza
 */
public class CuentaAhorroMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int numero, opcion, edad;
        float cantidad;
        String fechaA, fechaN, sucursal,nombreCliente,domicilioCliente;
        CuentaAhorro cuenta = new CuentaAhorro();
        
        do
        {  
        System.out.println("1. Aperturar");
        System.out.println("2. Depositar");
        System.out.println("3. Retirar");
        System.out.println("4. Consultar Saldo");
        System.out.println("5. Salir");
        System.out.println("Elija una opción");
        opcion = in.nextInt();
        switch(opcion)
        {
            case 1:
               
                System.out.println("Ingrese edad");
                edad = in.nextInt();
                System.out.println("Ingrese cantidad");
                cantidad = in.nextFloat();
                if(cuenta.aperturar(cantidad, edad))
                {
                    System.out.println("Ingresa numero de cuenta");
                    numero = in.nextInt();
                    cuenta.setNumero(numero);
                    
                    cuenta.depositar(cantidad);
                    
                    System.out.println("Ingresa fecha de apertura");
                    fechaA = in.next();
                    cuenta.setFechaApertura(fechaA);
                    
                    System.out.println("Ingresa sucursal");
                    sucursal= in.next(); 
                    cuenta.setSucursal(sucursal);
                    
                    System.out.println("Ingresa nombre del cliente");
                    nombreCliente = in.next();
                    cuenta.setNombreCliente(nombreCliente);
                    
                    System.out.println("Ingresa domicilio del cliente");
                    domicilioCliente = in.next();
                    cuenta.setDomicilioCliente(domicilioCliente);
                    
                    System.out.println("Ingresa fecha de nacimiento");
                    fechaN = in.next();
                    cuenta.setFechaNacimiento(fechaN);
                }
                else
                    System.out.println("No se puede realizar apertura");
                break;
            case 2:
            
                System.out.println("Ingrese cantidad");
                cantidad = in.nextFloat();
                cuenta.depositar(cantidad);
                break;
            case 3:
                 System.out.println("Ingrese cantidad");
                cantidad = in.nextFloat();
                if(cuenta.retirar(cantidad))
                {
                    cuenta.setSaldo(cuenta.getSaldo()-cantidad);
                    System.out.println("Retiro exitoso");
                }
                else
                    System.out.println("No se puede realizar retiro");
                break;
            case 4:
                System.out.println("El saldo es: $" +cuenta.consultarSaldo());
                break;
            default:
                System.out.println("Ingrese una opción valida");
        }
        }while(opcion!=5);
    }
    
}
