/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author PC16
 */
public class ReciboMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int numRecibo, diasTrabajados,nivel, opcion, hijos=0, puesto;
        float sueldoBase;
        String nombreTrabajador;
        Scanner in = new Scanner(System.in);
        Recibo re = new Recibo();
        do
        {
            System.out.println("1.Ingresar información");
            System.out.println("2. Calcular sueldo");
            System.out.println("3. Calcular impuesto");
            System.out.println("4. Calcular bono");
            System.out.println("5. Calcular total a pagar");
            System.out.println("6. Salir");
            System.out.println("Elija una opción");
            opcion= in.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Ingrese numero de recibo");
                    numRecibo=in.nextInt();
                    re.setNumRecibo(numRecibo);
                    
                    System.out.println("Ingrese nombre de trabajador");
                    nombreTrabajador=in.next();
                    re.setNombreTrabajador(nombreTrabajador);
                
                   
                   
                    System.out.println("Ingrese puesto");
                    System.out.println("1. Auxiliar");
                    System.out.println("2. Albañil");
                    System.out.println("3. Ing. Obra");
                    puesto=in.nextInt();
                    re.setPuesto(puesto);
                   
        
                    System.out.println("Ingrese dias trabajados");
                    diasTrabajados=in.nextInt();
                    re.setDiasTrabajados(diasTrabajados);
                    
                    System.out.println("Ingrese sueldo base");
                    sueldoBase=in.nextFloat();
                    re.setSueldoBase(sueldoBase);
                    
                  
                    System.out.println("Ingrese nivel");
                    System.out.println("1. Base");
                    System.out.println("2. Eventual");
                    nivel=in.nextInt();
                 re.setNivel(nivel);
                   
                    
                    System.out.println("Ingrese en número de hijos");
                    hijos=in.nextInt();
                    break;
                case 2:
                    System.out.println("El sueldo es: $ "+re.calcularSueldo());
                    break;
                case 3:
                    System.out.println("El Impuesto es: $ "+re.calcularImpuesto());
                    break;
                case 4:
                    System.out.println("El bono es: $ "+re.calcularBono(hijos));
                    break;
                case 5:
                    System.out.println("El total a pagar es: $ "+re.calcularTotal(hijos));
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
                                       
        }while(opcion!=6);
    }
    
}
