/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;
import java.util.Scanner;

/**
 *
 * @author SAMANTHA
 */
public class CMain {
    public static void main(String[] args){
    Scanner in=new Scanner(System.in);//declarar scanf
    Cuenta ObjetoCue=new Cuenta();
    String c, d, f, s;
    int n, e,o,op;
    float sa, can;
    
    do
    {
    
        System.out.println("CUENTA DE BANCO\n");
        System.out.println("1. Aperturar nueva cuenta");
        System.out.println("2. Información de la cuenta");
        System.out.println("3. Modificar información");
        System.out.println("4. Depositar");
        System.out.println("5. Retirar");
        System.out.println("6. Consultar saldo");
        System.out.println("7. Salir");
        o=in.nextInt();
        switch(o)
        {
            case 1:
            {
                System.out.println("Ingrese nombre de cliente: ");
                in.nextLine();
                c=in.nextLine();
                System.out.println("Ingrese domicilio: ");
                in.nextLine();
                d=in.nextLine();
                System.out.print("Ingrese fecha de nacimiento: ");
                in.nextLine();
                f=in.nextLine();
                System.out.print("Ingrese número de cuenta: ");
                n=in.nextInt();
                System.out.print("Ingrese el saldo inicial: ");
                sa=in.nextFloat();
                System.out.print("Ingrese edad: ");
                e=in.nextInt();
                System.out.print("Ingrese sucursal: ");
                in.nextLine();
                s=in.nextLine();
                if(ObjetoCue.permitirApertura(sa, e)==true)
                {
                    ObjetoCue.setCliente(c);
                    ObjetoCue.setDomicilio(d);
                    ObjetoCue.setFechaNacimiento(f);
                    ObjetoCue.setNumero(n);
                    ObjetoCue.setSaldo(sa);
                    ObjetoCue.setSucursal(s);
                }
                else
                    System.out.println("--¡Apertura no permitida!--");
                break;
            }
            case 2:
            {
               System.out.print("Cliente: ");
               c=ObjetoCue.getCliente();
               System.out.println(c);
               System.out.print("Domicilio: ");
               d=ObjetoCue.getDomicilio();
               System.out.println(d);
               System.out.print("Fecha de Nacimiento: ");
               f=ObjetoCue.getFechaNacimiento();
               System.out.println(f);
               System.out.print("Numero de cuenta: ");
               n=ObjetoCue.getNumero();
               System.out.println(n);
               System.out.print("Saldo actual: ");
               sa=ObjetoCue.getSaldo();
               System.out.println(sa);
               System.out.print("Sucursal: ");
               s=ObjetoCue.getSucursal();
               System.out.println(s);
               break;
            }
            case 3:
            {
                System.out.println("MODIFICACIÓN");
                System.out.println("1. Todos los datos");
                System.out.println("2. Cliente");
                System.out.println("3. Domicilio");
                System.out.println("4. Fecha de nacimiento ");
                System.out.println("5. Número de cuenta");
                System.out.println("6. Sucursal");
                op=in.nextInt();
                switch(op)
                {
                    case 1:
                    {
                        System.out.println("Ingrese el nuevo cliente: ");
                         in.nextLine();
                         c=in.nextLine();
                         ObjetoCue.setCliente(c);
                         System.out.println("Ingrese el nuevo domicilio: ");
                         in.nextLine();
                         d=in.nextLine();
                         ObjetoCue.setDomicilio(d);
                         System.out.println("Ingrese la nueva fecha de nacimiento: ");
                         in.nextLine();
                         f=in.nextLine();
                         ObjetoCue.setFechaNacimiento(f);
                         System.out.println("Ingrese el nuevo número de cuenta: ");
                         n=in.nextInt();
                         ObjetoCue.setNumero(n);
                         System.out.println("Ingrese la nueva sucursal: ");
                         in.nextLine();
                         s=in.nextLine();
                         ObjetoCue.setSucursal(s);
                         break;
                    }
                    case 2:
                    {
                        System.out.println("Ingrese el nuevo cliente: ");
                        in.nextLine();
                        c=in.nextLine();
                        ObjetoCue.setCliente(c);
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Ingrese el nuevo domicilio: ");
                        in.nextLine();
                        d=in.nextLine();
                        ObjetoCue.setDomicilio(d);
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Ingrese la nueva fecha de nacimiento: ");
                        in.nextLine();
                        f=in.nextLine();
                        ObjetoCue.setFechaNacimiento(f);
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Ingrese el nuevo número de cuenta: ");
                        n=in.nextInt();
                        ObjetoCue.setNumero(n);
                        break;
                    }
                    case 6:
                    {
                        System.out.println("Ingrese la nueva sucursal: ");
                        in.nextLine();
                        s=in.nextLine();
                        ObjetoCue.setSucursal(s);
                        break;
                    }
                }
                break;
             }
            case 4:
            {
                System.out.println("Ingrese la cantidad a depositar: ");
                can=in.nextFloat();
                ObjetoCue.recibirDeposito(can);
                System.out.println("Deposito realizado.");   
                break;
            }
            case 5: 
            {
                System.out.println("Ingrese la cantidad a retirar: ");
                can=in.nextFloat();
                ObjetoCue.retirar(can);
                System.out.println("Retiro realizado.");
                break;
            }
            case 6:
            {
                System.out.print("El saldo actual es: ");
                sa=ObjetoCue.getSaldo();
                System.out.println(sa);
                break;
            }
            case 7:
                break;     
         }
    }while(o!=7);
  }
}
