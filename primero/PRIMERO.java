/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author PC15
 */
public class PRIMERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Object menu[] ={"1. INICIAR OBJETO","2. CONSULTAR FECHA","3. ¿CUANTOS DIAS TIENE EL MES?",
        "4. ES AÑO BISIESTO","5. MODIFICAR","6. SALIR"};
        Object subMenu [] ={"1. DIA", "2. MES", "3. AÑO"};
        int dia=0, mes=0, año=0;
        
        Fecha hoy = new Fecha();//OBJETO FECHA, "HOY" ES EL NOMBRE DEL OBJETO
       
        String opcMenu = (String) JOptionPane.showInputDialog(null, 
                "ELIGE UNA OPCION", "MENU", JOptionPane.QUESTION_MESSAGE,null, menu, menu[0]);
       do{
        switch(opcMenu){
            case (String)"1. INICIAR OBJETO":
                dia = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "DAME EL DIA", "FECHA", JOptionPane.QUESTION_MESSAGE));
                    
                mes = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "DAME EL MES", "FECHA", JOptionPane.QUESTION_MESSAGE));                   

                año = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "DAME EL AÑO", "FECHA", JOptionPane.QUESTION_MESSAGE));                             
                hoy.setDia(dia);
                hoy.setAño(año);
                hoy.setMes(mes);
                break;
            case (String) "2. CONSULTAR FECHA":
                JOptionPane.showMessageDialog(null, "LA FECHA ES" + hoy.fechaConFormato());
                
                break;
            case (String) "3. ¿CUÁNTOS DÍAS TIENE EL MES":
                JOptionPane.showMessageDialog(null, "EL MES TIENE" + hoy.diasDelMes() + "DÍAS");
                break;
            case "4. ES AÑO BISIESTO": 
                if(hoy.esBisiesto()){
                    JOptionPane.showMessageDialog(null, "EL AÑO" + hoy.getAño() + "ES BISIESTO");
                }
                else {
                    JOptionPane.showMessageDialog(null, "EL AÑO" + hoy.getAño() + "NO ES BISIESTO");
                }
                break;
            case (String) "5. MODIFICAR FECHA":
                
                
                String opcSubMenu="";
                   opcSubMenu = (String) JOptionPane.showInputDialog(null, 
                           "ELIGE UNA OPCIÓN", "MODIFICAR FECHA",
                           JOptionPane.QUESTION_MESSAGE, null, subMenu, subMenu[0]);
                do{
                   
                switch(opcSubMenu){
                    case (String) "1. DIA":
                        dia = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "DAME EL DIA", "SUB MENU", JOptionPane.QUESTION_MESSAGE)); 
                        hoy.setDia(dia);
                        break;
                        
                    case (String) "2. MES":
                        mes = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "DAME EL MES", "SUB MENU", JOptionPane.QUESTION_MESSAGE));
                        hoy.setMes(mes);
                        break;
                        
                    case (String) "3. AÑO":
                        año = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "DAME EL AÑO", "SUB MENU", JOptionPane.QUESTION_MESSAGE)); 
                        hoy.setAño(año);
                        break;
                        
                    case (String) "4. REGRESAR":
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "OPCIÓN NO VÁLIDA");
                }
                    /*
                System.out.println("ELIJA EL DATO A MODIFICAR");
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
            */
                
                
           
           
        
     
       
            }while(!opcSubMenu.equals("REGRESAR"));
        }
    
}while(opcMenu!="SALIR");
       }
}
       