/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;
import java.util.Scanner;
/**
 *
 * @author PC 14
 */
public class Primero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        int dia=0,mes=0,año=0,opcion=0;
        Fecha hoy=new Fecha();
        
        do{
            System.out.println("1. Iniciar Objeto");
            System.out.println("2. Consulta Fecha");
            System.out.println("3. Cuantos dias tiene el Mes");
            System.out.println("4. Es Año Bisiesto");
            System.out.println("5. Modificar Fecha");
            System.out.println("6. Salir");
            opcion=in.nextInt();
            
            switch(opcion)
            {
                case 1:
                    System.out.println("Dame el dia: ");
                    dia=in.nextInt();

                    System.out.println("Dame el mes: ");
                    mes=in.nextInt();

                    System.out.println("Dame el año: ");
                    año=in.nextInt();

                    hoy.setDia(dia);
                    hoy.setAño(año);
                    hoy.setMes(mes);
                    break;
                case 2:
                    System.out.println("La fecha es: " + hoy.fechaConFormato());
                    break;
                case 3:
                    mes = hoy.getMes();
                    System.out.println("El mes Num: " + mes + " Tiene: " + hoy.diasMes());
                    break;
                case 4:
                    if(hoy.isBisiesto()){
                        System.out.println("El año: " + hoy.getAño() + " El mes: " + hoy.getMes() + " El dia: " + hoy.getDia());
                    }
                    else{
                        System.out.println("El año: " + hoy.getAño() + " El mes: " + hoy.getMes() + " El dia: " + hoy.getDia());
                    }
                    break;
                case 5:
                    do{
                        System.out.println("Que desea Modificar");
                        System.out.println("1. Modificar Dia");
                        System.out.println("2. Modificar Mes");
                        System.out.println("3. Modificar Año");
                        System.out.println("4. Salir");
                        opcion=in.nextInt();
                        switch (opcion){
                            case 1:
                                System.out.println("Dame el dia: ");
                                dia=in.nextInt();
                                hoy.setDia(dia);
                                break;
                            case 2:
                                System.out.println("Dame el mes: ");
                                mes=in.nextInt();
                                hoy.setMes(mes);
                                break;
                            case 3:
                                System.out.println("Dame el año: ");
                                año=in.nextInt();
                                hoy.setAño(año);
                                break;
                            case 4:
                                break;
                            }
                        }while(opcion!=4);
                    break;
                case 6:
                    System.out.println("Gracias...");
                    break;
                default :
                    System.out.println("Hasta la proxima...");
                    break;
            }
           }while (opcion!=6);
    }
    
}
