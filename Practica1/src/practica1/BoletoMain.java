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
public class BoletoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        int numId = 0, tipo = 0, opcion = 0, edad = 0;
        String cliente = "", destino = "", fecha = "";
        float precio = 0.0f;
        Object menu[] = {"1.- Iniciar Objeto", "2.- Calcular Subtotal", "3.- Calcular Impuesto", "4.- Calcular Descuento", "5.- Calcular Total", "6.- Consultar Boleto", "7.- Imprimir", "8.- Modificar Boleto", "9.- Salir"};
        Object primerSubMenu[] = {"1.- Obtener numero identificador", "2.- Obtener nombre del cliente", "3.- Obtener destino del boleto", "4.- Obtener tipo de boleto", "5.- Obtener precio del boleto", "6.- Obtener fecha del boleto", "7.- Salir al menu"};
        Object segundoSubMenu[] = {"1.- Modificar numero identificador", "2.- Modificar nombre del cliente", "3.- Modificar destino del boleto", "4.- Modificar tipo de boleto", "5.- Modificar precio del boleto", "6.- Modificar fecha del boleto", "7.- Modificar la edad del cliente", "8.- Salir al menu"};
        
        String opcMenu = "";
        
        Boleto nuevo = new Boleto();
        do{
            opcMenu = (String) JOptionPane.showInputDialog(null, "Elije una opción", "Menu", JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
                        
            switch(opcMenu){
                case "1.- Iniciar Objeto":
                    /*"Dame el numero de identificacion"*/;
                    numId = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el numero identificador", "Boleto", JOptionPane.QUESTION_MESSAGE));
                    cliente = JOptionPane.showInputDialog(null, "Dame el nombre del cliente", "Boleto", JOptionPane.QUESTION_MESSAGE);
                    destino = JOptionPane.showInputDialog(null, "Dame el destino del cliente", "Boleto", JOptionPane.QUESTION_MESSAGE);
                    tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el tipo de boleto (1- Simple / 2- Redondo)", "Boleto", JOptionPane.QUESTION_MESSAGE));
                    precio = Float.parseFloat(JOptionPane.showInputDialog(null, "Dame el precio", "Boleto", JOptionPane.QUESTION_MESSAGE));
                    fecha = JOptionPane.showInputDialog(null, "Dame la fecha", "Boleto", JOptionPane.QUESTION_MESSAGE);
                    edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame la edad del cliente", "Boleto", JOptionPane.QUESTION_MESSAGE));
                    
                    nuevo.setNumId(numId);
                    nuevo.setCliente(cliente);
                    nuevo.setDestino(destino);
                    nuevo.setTipo(tipo);
                    nuevo.setFecha(fecha);
                    nuevo.setPrecio(precio);
                    
                    break;
                case "2.- Calcular Subtotal":
                    JOptionPane.showMessageDialog(null, "El subtotal es de: $" + nuevo.calcularSubtotal());
                    break;
                case "3.- Calcular Impuesto":
                    JOptionPane.showMessageDialog(null, "El impuesto es de: $" + nuevo.calcularImpuesto());
                    break;
                case "4.- Calcular Descuento":
                    JOptionPane.showMessageDialog(null, "El descuento es de: $" + nuevo.calcularDescuento(edad));
                    break;
                case "5.- Calcular Total":
                    JOptionPane.showMessageDialog(null, "El total es de: $" + nuevo.calcularTotal(edad));
                    break;
                case "6.- Consultar Boleto":
                    do{
                        opcMenu = (String) JOptionPane.showInputDialog(null, "Elije una opción", "Menu", JOptionPane.QUESTION_MESSAGE, null, primerSubMenu, primerSubMenu[0]);
                        
                        switch(opcMenu){
                            case "1.- Obtener numero identificador":
                                JOptionPane.showMessageDialog(null, "El numero identificador del boleto es: " + nuevo.getNumId());
                                break;
                            case "2.- Obtener nombre del cliente":
                                JOptionPane.showMessageDialog(null, "El nombre del cliente es: " + nuevo.getCliente());
                                break;
                            case "3.- Obtener destino del boleto":
                                JOptionPane.showMessageDialog(null, "El destino del boleto es: " + nuevo.getDestino());
                                break;
                            case "4.- Obtener tipo de boleto":
                                JOptionPane.showMessageDialog(null, "El tipo del boleto es: " + nuevo.getTipo());
                                break;
                            case "5.- Obtener precio del boleto":
                                JOptionPane.showMessageDialog(null, "El precio del boleto es: $" + nuevo.getPrecio());
                                break;
                            case "6.- Obtener fecha del boleto":
                               JOptionPane.showMessageDialog(null, "La fecha del boleto es: " + nuevo.getFecha());
                                break;
                            case "7.- Salir al menu":
                                break;
                            default:
                                JOptionPane.showMessageDialog(null ,"No es una opción valida");
                        }
                    }while(!"7.- Salir al menu".equals(opcMenu));
                    break;
                case "7.- Imprimir":
                    JOptionPane.showMessageDialog(null,nuevo.imprimirBoleto(nuevo, edad));
                    break;
                case "8.- Modificar Boleto":
                    do{
                        opcMenu = (String) JOptionPane.showInputDialog(null, "Elije una opción", "Menu", JOptionPane.QUESTION_MESSAGE, null, segundoSubMenu, segundoSubMenu[0]);
                        
                        switch(opcMenu){
                            case "1.- Modificar numero identificador":
                                numId = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el numero identificador", "Modificar boleto", JOptionPane.QUESTION_MESSAGE));
                                nuevo.setNumId(numId);
                                break;
                            case "2.- Modificar nombre del cliente":
                                cliente = JOptionPane.showInputDialog(null, "Dame el nombre del cliente", "Modificar boleto", JOptionPane.QUESTION_MESSAGE);
                                nuevo.setCliente(cliente);
                                break;
                            case "3.- Modificar destino del boleto":
                                destino = JOptionPane.showInputDialog(null, "Dame el destino del cliente", "Modificar boleto", JOptionPane.QUESTION_MESSAGE);
                                nuevo.setDestino(destino);
                                break;
                            case "4.- Modificar tipo de boleto":
                                tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el tipo de boleto (1- Simple / 2- Redondo)", "Modificar boleto", JOptionPane.QUESTION_MESSAGE));
                                nuevo.setTipo(tipo);
                                break;
                            case "5.- Modificar precio del boleto":
                                precio = Float.parseFloat(JOptionPane.showInputDialog(null, "Dame el precio", "Modificar boleto", JOptionPane.QUESTION_MESSAGE));
                                nuevo.setPrecio(precio);
                                break;
                            case "6.- Modificar fecha del boleto":
                                fecha = JOptionPane.showInputDialog(null, "Dame la fecha", "Modificar boleto", JOptionPane.QUESTION_MESSAGE);
                                nuevo.setFecha(fecha);
                                break;
                            case "7.- Modificar la edad del cliente":
                                edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame la edad del cliente", "Modificar boleto", JOptionPane.QUESTION_MESSAGE));
                                break;
                            case "8.- Salir al menu":
                                break;
                            default:
                                JOptionPane.showMessageDialog(null ,"No es una opción valida");
                        }
                    }while(!"8.- Salir al menu".equals(opcMenu));
                    break;
                case "9.- Salir":
                    JOptionPane.showMessageDialog(null ,"Gracias...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No es una opción valida");
                }
        }while(!"9.- Salir".equals(opcMenu)); 
    }
}
