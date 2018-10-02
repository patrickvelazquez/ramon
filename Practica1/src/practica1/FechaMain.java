/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Drago
 */
public class FechaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Object menu[] = {"1.- Iniciar Objeto","2.- Consultar Fecha","3.- Cuantos dias tiene el mes","4.- Es año bisiesto","5.- Modificar Fecha","6.- Salir"};
        Object subMenu[] = {"1.- Dia", "2.- Mes", "3.- Año", "Regresar"};
        String opcMenu = "";
        int dia=0, mes=0, año=0;
        Fecha hoy = new Fecha();
        do{
            opcMenu = (String) JOptionPane.showInputDialog(null,"Elije una opción", "Menu", JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
            
            switch(opcMenu){
                case "1.- Iniciar Objeto":
                    dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el dia", "Fecha", JOptionPane.QUESTION_MESSAGE));
                    mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el mes", "Fecha", JOptionPane.QUESTION_MESSAGE));
                    año = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el año", "Fecha", JOptionPane.QUESTION_MESSAGE));
                    
                    hoy.setDia(dia);
                    hoy.setMes(mes);
                    hoy.setAño(año);
                    break;
                case "2.- Consultar Fecha":
                    JOptionPane.showMessageDialog(null, "La fecha es: " + hoy.fechaConFormato());
                    break;
                case "3.- Cuantos dias tiene el mes":
                    JOptionPane.showMessageDialog(null, "El mes numero tiene " + hoy.diasMeses() + " dias");
                    break;
                case "4.- Es año bisiesto":
                    if(hoy.isBisiesto()){
                        JOptionPane.showMessageDialog(null, "El año " + hoy.getAño() + " es bisiesto");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "El año " + hoy.getAño() + "no es bisiesto");
                    }
                    break;
                case "5.- Modificar Fecha":
                    String opcSubMenu = "";
                    do{
                        opcSubMenu = (String) JOptionPane.showInputDialog(null, "Seleccione la opcion a modificar", "Modificar fecha", JOptionPane.QUESTION_MESSAGE, null, subMenu,subMenu[0]);
                        
                        switch(opcSubMenu){
                            case "1.- Dia":
                                dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el dia", "Modificar fecha", JOptionPane.QUESTION_MESSAGE));
                                hoy.setDia(dia);
                                break;
                            case "2.- Mes":
                                mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el mes", "Modificar fecha", JOptionPane.QUESTION_MESSAGE));
                                hoy.setMes(mes);
                                break;
                            case "3.- Año":
                                año = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el año", "Modificar fecha", JOptionPane.QUESTION_MESSAGE));
                                hoy.setAño(año);
                                break;
                            case "Regresar":
                                break;
                            default:
                                JOptionPane.showMessageDialog(null ,"No es una opción valida");
                        }
                    }while(!"Regresar".equals(opcSubMenu));
                    break;
                case "6.- Salir":
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar este programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null ,"No es una opción valida");
            }
        }while(!"6.- Salir".equals(opcMenu));
    }
    
}
