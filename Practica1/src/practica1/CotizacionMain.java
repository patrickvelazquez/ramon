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
 * @author Konakun
 */
public class CotizacionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int opcion = 0, numeroCotizacion = 0, porcentajePagoInicial = 0, plazo = 0;
        float precio = 0.0f;
        String descripcion = "", opcMenu = "";
        Object menu[] = {"1.- Iniciar Objeto", "2.- Calcular pago inicial", "3.- Calcular total a financiar", "4.- Calcular pago mensual", "5.- Modificar cotización", "6.- Imprimir cotización","7.- Salir"};
        Object subMenu[] = {"1.- Cambiar numero de cotización", "2.- Cambiar descripción", "3.- Cambiar precio", "4.- Cambiar porcentaje de pago inicial", "5.- Cambiar plazo de pago", "6.- Salir al menu"};
        Cotizacion nueva = new Cotizacion();
        do{
            opcMenu = (String) JOptionPane.showInputDialog(null, "Elija una opción", "Menu", JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
            
            switch(opcMenu){
                case "1.- Iniciar Objeto":
                    numeroCotizacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame numero de cotización", "Cotización", JOptionPane.QUESTION_MESSAGE));
                    descripcion = JOptionPane.showInputDialog(null, "Dame la descripción", "Cotización", JOptionPane.QUESTION_MESSAGE);
                    precio = Float.parseFloat(JOptionPane.showInputDialog(null, "Dame el precio", "Cotización", JOptionPane.QUESTION_MESSAGE));
                    porcentajePagoInicial = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el porcentaje de pago inicial", "Cotización", JOptionPane.QUESTION_MESSAGE));
                    plazo = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el plazo de pagos", "Cotización", JOptionPane.QUESTION_MESSAGE));
                    
                    nueva.setNumeroCotizacion(numeroCotizacion);
                    nueva.setDescripcion(descripcion);
                    nueva.setPrecio(precio);
                    nueva.setPorcentajePagoInicial(porcentajePagoInicial);
                    nueva.setPlazo(plazo);
                    
                    break;
                case "2.- Calcular pago inicial":
                    JOptionPane.showMessageDialog(null, "El pago inicial es de: $" + nueva.calcularPagoInicial());
                    break;
                case "3.- Calcular total a financiar":
                    JOptionPane.showMessageDialog(null, "El total a financiar es de: $" + nueva.calcularTotalFinanciar());
                    break;
                case "4.- Calcular pago mensual":
                    JOptionPane.showMessageDialog(null, "El pago menusal es de: $" + nueva.calcularPagoMensual());
                    break;
                case "5.- Modificar cotización":
                    do{
                        opcMenu = (String) JOptionPane.showInputDialog(null, "Elija una opción", "Menu", JOptionPane.QUESTION_MESSAGE, null, subMenu, subMenu[0]);
                        
                        switch(opcMenu){
                            case "1.- Cambiar numero de cotización":
                                System.out.println("Dame el numero de cotización");
                                numeroCotizacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el numero de cotización", "Modificar cotización"));
                                nueva.setNumeroCotizacion(numeroCotizacion);
                                break;
                            case "2.- Cambiar descripción":
                                descripcion = JOptionPane.showInputDialog(null, "Dame la descripción", "Modificar cotización");
                                nueva.setDescripcion(descripcion);
                                break;
                            case "3.- Cambiar precio":
                                precio = Float.parseFloat(JOptionPane.showInputDialog(null, "Dame el precio", "Modificar cotización"));
                                nueva.setPrecio(precio);
                                break;
                            case "4.- Cambiar porcentaje de pago inicial":
                                porcentajePagoInicial = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el porcentaje de pago inicial", "Modificar cotización"));
                                nueva.setPorcentajePagoInicial(porcentajePagoInicial);
                                break;
                            case "5.- Cambiar plazo de pago":
                                plazo = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el plazo de pago", "Modificar cotización"));
                                nueva.setPlazo(plazo);
                                break;
                            case "6.- Salir al menu":
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No es una opción valida");
                        }
                    }while(!"6.- Salir al menu".equals(opcMenu));
                    break;
                case "6.- Imprimir cotización":
                    JOptionPane.showMessageDialog(null, nueva.imprimirCotizacion(nueva));
                    break;
                case "7.- Salir":
                    JOptionPane.showMessageDialog(null, "Gracias...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No es una opción valida");
            }
        }while(!"7.-Salir".equals(opcMenu));
    }
    
}
