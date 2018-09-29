/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;
import java.util.Scanner;
/**
 *
 * @author Cicely
 */
public class cuent {
    public static void main(String [] args){
      Scanner in = new Scanner(System.in);
      String nombreCliente="", domicilio="", fechaNacimiento="", 
              fechaApertura="", nombreSucursal="";
      int numeroCuenta=0, opcion=0, edad;
      float saldo=0, cantidad;
      Cuenta cuent = new Cuenta();
      do{
          System.out.println("Bienvenido");
          System.out.println("1. Realizar Apertura de Cuenta");
          System.out.println("2. Depositar");
          System.out.println("3. Consultar Saldo");
          System.out.println("4. Retirar");
          System.out.println("5. Salir");
          opcion = in.nextInt();
          switch(opcion){
              case 1: 
                  System.out.println("Ingrese edad");
                  edad = in.nextInt();
                  if(edad < 18){
                      System.out.println("Edad mínima para abrir cuenta es 18 años");
                      break;
                  }
                  else{
                  System.out.println("Ingrese Nombre del Cliente");
                  nombreCliente = in.next();
                  System.out.println("Ingrese domicilio");
                  domicilio = in.next();
                  System.out.println("fecha Nacimiento");
                  fechaNacimiento = in.next();
                  System.out.println("Número de Cuenta");
                  numeroCuenta = in.nextInt();
                  System.out.println("Ingrese Saldo");
                  saldo = in.nextInt();
                  if(saldo < 1000){
                      System.out.println("El Saldo Mínimo Es De 1000");                    
                  }
                  else{
                      System.out.println("Teclee Fecha de Apertura");
                      fechaApertura = in.next();
                      System.out.println("Teclee Nombre de Sucursal");
                      nombreSucursal = in.next();
                  }
                  
          }
                  break;
              case 2: 
                  System.out.println("Ingrese Número de Cuenta");
                  numeroCuenta = in.nextInt();
                  cuent.setNumeroCuenta(numeroCuenta);
                  System.out.println("Ingrese Cantidad a Depositar");
                  cantidad = in.nextFloat();
                  cuent.setCantidad(cantidad);
                  saldo = saldo + cantidad;
                  break;
              case 3: 
                  System.out.println("Ingrese Número de Cuenta");
                  numeroCuenta = in.nextInt();
                  System.out.println("El Saldo de la cuenta " + numeroCuenta + "es: " + saldo);
                  break;
              case 4:
                  System.out.println("Inserte Cantidad a Retirar");
                  cantidad = in.nextFloat();
                  if(cantidad <= saldo){
                      System.out.println("Retiro exitoso");
                      saldo = saldo - cantidad;
                  }
                  else{
                      System.out.println("Saldo Insuficiente");
                      break;
                  }
      }
    }while(opcion != 5);
}
}
