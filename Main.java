/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;
import java.util.Scanner;


/**
 *
 * @author Kennyswh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int dia = 0, mes = 0, año = 0, opcion = 0;
        Fecha hoy = new Fecha();
        do{
            System.out.println("1. Iniciar Objeto");
            System.out.println("2. Consultar Fecha");
            System.out.println("3. Cuantos dias tiene el mes ");
            System.out.println("4. Es año bisiesto ");
            System.out.println("5. Modificar Fecha");
            System.out.println("6. Salir");
            
            opcion = in.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Dame el dia");
                    dia = in.nextInt();
                
                    System.out.println("Dame el mes");
                    mes = in.nextInt();
                    
                    System.out.println("Dame el año");
                    año = in.nextInt();
                    
                    hoy.setDia(dia);
                    hoy.setMes(mes);
                    hoy.setAño(año);
                    break;
                case 2:
                    System.out.println("La fecha es "+hoy.fechaConFormato());
                    break;
                case 3:
                    mes = hoy.getMes();
                    System.out.println("El mes Num "+ mes + " Tiene " + hoy.diasMes() + " dias");
                    break;
                case 4:
                    año = hoy.getAño();
                    if(hoy.isBisiesto()){
                        System.out.println("El año "+ año + " es bisiesto");
                    }
                    else {
                        System.out.println("El año "+ año + " no es bisiesto");
                    }
                    break;
                case 5:
                    do{
                        System.out.println("Elija la opcion deseada:");
                        System.out.println("1. Modificar Dia");
                        System.out.println("2. Modificar Mes");
                        System.out.println("3. Modificar Año");
                        System.out.println("4. Regresar");
                        opcion = in.nextInt();
                        switch(opcion){
                            case 1:
                                System.out.println("Dame el dia");
                                dia = in.nextInt();
                                hoy.setDia(dia);
                                break;
                            case 2:
                                System.out.println("Dame el mes");
                                mes = in.nextInt();
                                hoy.setMes(mes);
                                break;
                            case 3:
                                System.out.println("Dame el año");
                                año = in.nextInt();
                                hoy.setAño(año);
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("No es una opción válida");
                        }
                    }while(opcion != 4);
                    break;
                case 6:
                    System.out.println("Gracias, hasta la vista");
                    break;
                default:
                    System.out.println("No es una opción válida");
            }
        System.out.println("Oprima cualquier tecla para continuar");
            in.nextInt();
        } while(opcion != 6);
        // TODO code application logic here
    }
}
