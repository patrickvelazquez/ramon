/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletos;
import java.util.Scanner;
/**
 *
 * @author software 19
 */
public class CuentaDeAhorroMain 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int opcion;
        int mes;
        int dia;
        int año;
        int numero=1;
        int edad=0;
        int depositos=0;
        String domicilio;
        String fechaDeNacimiento;
        String fechaDeApertura;
        String nombreDeLaSucursal;
        String nombre = null;
        double saldo=8763;
        double nuevoSaldo=0;
        double retiro=0;
        CuentaDeAhorro Nuevo = new CuentaDeAhorro();
            do
            {
                System.out.println("1. Nuevo usuario");
                System.out.println("2. Depositos");
                System.out.println("3: Retiros");
                System.out.println("4. Consultar Cuenta");
                System.out.println("5. Salir");
                System.out.println("");
                System.out.print("Opcion: ");
                /*REGISTRO*/
                opcion =in.nextInt();

                switch(opcion)
                {
                    case 1:
                        System.out.println("Fecha: "+Nuevo.fechaConFormato());
                        System.out.println("Fecha de Nacimiento");
                        System.out.print("Dia de Nacimineto: ");
                        dia=in.nextInt();
                        Nuevo.fechaNacimiento();
                        System.out.print("Mes de Nacimiento: ");
                        mes=in.nextInt();
                        Nuevo.fechaNacimiento();
                        System.out.print("Año de Nacimiento: ");
                        año=in.nextInt();
                        Nuevo.fechaNacimiento();
                        Nuevo.setAñoNacimiento(año);
                        System.out.println("Edad: "+Nuevo.edad());
                        if(Nuevo.edad()>=18)
                        {
                            System.out.println("Numero: "+numero);
                            numero=numero+1;
                            System.out.print("Nombre: ");
                            nombre=in.nextLine();
                            Nuevo.setNombreDelCliente(nombre);
                            System.out.print("Domicilio: ");
                            domicilio=in.nextLine();
                            Nuevo.setDomicilio(domicilio);
                            System.out.print("Saldo: $"+saldo);
                            System.out.println("Fecha de Apertura: ");
                            System.out.print("Dia: ");
                            dia=in.nextInt();
                            Nuevo.fechaDeApertura();
                            System.out.print("Mes: ");
                            mes=in.nextInt();
                            Nuevo.fechaDeApertura();
                            System.out.print("Año: ");
                            año=in.nextInt();
                            Nuevo.fechaDeApertura();
                            System.out.print("Nombre de la Surcursal: ");
                            nombreDeLaSucursal=in.nextLine();
                            Nuevo.setNombreDeLaSucursal(nombreDeLaSucursal);
                            System.out.println("");
                        }
                        else
                        {
                            System.out.println("edad insuficiente");
                        }
                        break;
                    case 2:
                        System.out.println("Depositos");
                        System.out.println("Señor "+nombre+" su saldo es de: $"+saldo);
                        System.out.print("¿Cuanto desea depositar?: $");
                        nuevoSaldo=in.nextFloat();
                        Nuevo.setNuevoSaldo(nuevoSaldo);
                        System.out.println("Sus saldo nuevo es de $"+Nuevo.Depositos());
                        saldo=Nuevo.Depositos();
                        Nuevo.setSaldo(saldo);
                        break;
                    case 3:
                         System.out.println("Retiros");
                        System.out.println("Señor "+nombre+" su saldo es de: $"+saldo);
                        System.out.print("¿Cuanto desea depositar?: ");
                        retiro=in.nextFloat();
                        Nuevo.setRetiro(retiro);
                        System.out.println("Sus saldo nuevo es de $"+Nuevo.Retiros());
                        saldo=Nuevo.Retiros();
                        Nuevo.setSaldo(saldo);
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println("");
                        System.out.println("Fecha de Apertura: "+Nuevo.getFechaDeApertura());
                        System.out.println("Numero: "+Nuevo.getNumero());
                        System.out.println("Nombre: "+Nuevo.getNombreDelCliente());
                        System.out.println("Fecha de Nacimiento: "+Nuevo.fechaNacimiento());
                        System.out.println("Edad: "+Nuevo.edad());
                        System.out.println("Domicilio: "+Nuevo.getDomicilio());
                        System.out.println("Sucursal: "+Nuevo.getNombreDeLaSucursal());
                        System.out.println("Saldo: "+Nuevo.getSaldo());
                        System.out.println("");
                        break;
                    case 5:
                        break;
                }
            }while(opcion!=5);
    }
}
