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
public class cuentaAhorroMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        cuentaAhorro cuentah = new cuentaAhorro();
        int opcion=0;
        double saldo=0.0, cantidad=0.0;
        String nombre, apertura, domicilio, sucursal, nacimiento;
        
        do
        {
            System.out.println("1. Aperturar cuenta");
            System.out.println("2. Mostrar cuenta");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Depositar dinero");
            System.out.println("5. Retirar dinero");
            System.out.println("6. Salir");
            opcion = in.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Ingrese fecha de nacimiento (DD/MM/AÑO)");
                    nacimiento=in.next();
                    cuentah.setFechaNacimiento(nacimiento);
                    if(cuentah.isMayorEdad())
                    {
                        System.out.println("Ingrese saldo incial");
                        saldo=in.nextDouble();
                        cuentah.setSaldo(saldo);
                        System.out.println("Ingrese nombre");
                        nombre=in.next();
                        cuentah.setNombre(nombre);
                        System.out.println("Ingrese domicilio");
                        domicilio = in.next();
                        cuentah.setDomicilio(domicilio);
                        System.out.println("Ingrese fecha de apertura (DD/MM/AÑO)");
                        apertura = in.next();
                        cuentah.setFechaApertura(apertura);
                        System.out.println("Ingrse nombre de la sucursal");
                        sucursal=in.next();
                        cuentah.setNomSucursal(sucursal);
                    }
                    else
                    {
                        System.out.println("Es menor de edad");
                    }
                    break;
                case 2:
                    System.out.println("Nombre " + cuentah.getNombre());
                    System.out.println("Fecha de nacimiento " + cuentah.getFechaNacimiento());
                    System.out.println("Domicilio " + cuentah.getDomicilio());
                    System.out.println("Fecha de apertura " + cuentah.getFechaApertura());
                    System.out.println("Sucursal " + cuentah.getNomSucursal());
                    break;
                case 3:
                    cuentah.consultarSaldo();
                    break;
                case 4:
                    System.out.println("Ingrese cantidad a depositar");
                    cantidad = in.nextDouble();
                    cuentah.depositarDinero(cantidad);
                    break;
                case 5:
                    System.out.println("Ingrese Cantidad a retirar");
                    cantidad = in.nextDouble();
                    if(cuentah.isRetirarDinero(cantidad))
                    {
                        System.out.println("Se hizo el retiro");
                    }
                    else
                    {
                        System.out.println("No se pudo hacer el retiro");
                    }
                    break;
                case 6:
                    break;
                
                default: System.out.println("Ingrese una opcion valida");
            }
        }while(opcion!=6);
    }
    
}
