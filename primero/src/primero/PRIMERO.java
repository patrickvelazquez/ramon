/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class PRIMERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int dia=0, mes=0, año=0, opcion=0;
        
        Fecha hoy = new Fecha();//OBJETO FECHA, "HOY" ES EL NOMBRE DEL OBJETO
        
        do{
        System.out.println("1 INICIAR OBJETO");
        System.out.println("2 CONSULTAR FECHA");
        System.out.println("3 ¿CUANTOS DIAS TIENE EL MES?");
        System.out.println("4 ES AÑO BISIESTO");
        System.out.println("5 MODIFICAR");
        System.out.println("6 SALIR");
        
        opcion = in.nextInt();
        
        switch(opcion){
            case 1: System.out.println("DAME EL DIA");
                dia = in.nextInt();

                System.out.println("DAME EL MES");
                mes = in.nextInt();

                System.out.println("DAME EL AÑO");
                año = in.nextInt();
                hoy.setDia(dia);
                hoy.setAño(año);
                hoy.setMes(mes);
                break;
            case 2:
                System.out.println("LA FECHA ES" + hoy.fechaConFormato());
                break;
            case 3:
                mes = hoy.getMes();
                System.out.println("EL MES NUM" + mes + "TIENE" + hoy.diasDelMes());
                break;
            case 4: 
                if(hoy.esBisiesto()){
                    System.out.println("EL AÑO" + hoy.getAño() + "ES BISIESTO");
                }
                else {
                    System.out.println("EL AÑO" + hoy.getAño() + "NO ES BISIESTO");
                }
                break;
            case 5: 
                do{
                System.out.println("ELIOJA EL DATO A MODIFICAR");
                System.out.println("1 MODIFICAR DIA");
                System.out.println("2 MODIFICAR MES");
                System.out.println("3 MODIFICAR AÑO");
                System.out.println("4 REGRESAR");
                
                
                
                switch(opcion){
                
                    case 1: 
                        System.out.println("DAME EL DIA");
                        dia = in.nextInt();
                        hoy.setDia(dia);
                        break;
                    case 2: 
                         System.out.println("DAME EL MES");
                         mes = in.nextInt();
                         hoy.setMes(mes);
                         break;
                    case 3: 
                         System.out.println("DAME EL AÑO");
                         año = in.nextInt();
                         hoy.setAño(año);
                         break; 
                    case 4: break;
                    default:
                         System.out.println("OPCION NO VALIDA");
                
                              
                }
                } while(opcion!=4);
            
                
                
            case 6: System.out.println("GRACIAS :) ");
                    break;
           
        }
       System.out.println("OPRIMA CUALQUIER TECLA PARA CONTINUAR");
        in.nextInt();
       
    }while(opcion!=6);
    
}
}