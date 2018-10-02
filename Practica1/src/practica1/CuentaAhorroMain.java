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
public class CuentaAhorroMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        boolean apertura = false;
        int numeroDeCuenta = 0, edad = 0;
        float saldo, montoDeEfectivo = 0;
        String opcMenu = "", nombre = "", fechaDeNacimiento = "", domicilio = "", fechaDeApertura = "", sucursalDeBanco = "";
        Object menu[] = {"1.- Crear cuenta de ahorro","2.- Depositar efectivo","3.- Retirar efectivo","4.- Consultar saldo","5.- Modificar cuenta de ahorro","6.- Salir"};
        Object subMenu[] = {"1.- Cambiar numero de cuenta", "2.- Cambiar nombre", "3.- Cambiar fecha de nacimiento", "4.- Cambiar domicilio", "5.- Cambiar saldo", "6.- Cambiar fecha de apertura", "7.- Cambiar sucursal de banco", "8.- Salir"};
        
        CuentaAhorro nueva = new CuentaAhorro();
        
        nueva.aperturaCuenta(edad, montoDeEfectivo);
        
        do{
            opcMenu = (String) JOptionPane.showInputDialog(null, "Elije una opción", "Menu", JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
            switch(opcMenu){
                case "1.- Crear cuenta de ahorro":
                    numeroDeCuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el numero de cuenta", "Cuenta de Ahorro", JOptionPane.QUESTION_MESSAGE));
                    nombre = JOptionPane.showInputDialog(null, "Dame el nombre del cliente", "Cuenta de Ahorro", JOptionPane.QUESTION_MESSAGE);
                    fechaDeNacimiento = JOptionPane.showInputDialog(null, "Dame la fecha de nacimiento del cliente", "Cuenta de Ahorro", JOptionPane.QUESTION_MESSAGE);
                    edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame la edad del cliente", "Cuenta de Ahorro", JOptionPane.QUESTION_MESSAGE));
                    domicilio = JOptionPane.showInputDialog(null, "Dame el domicilio del cliente", "Cuenta de Ahorro", JOptionPane.QUESTION_MESSAGE);
                    montoDeEfectivo = Float.parseFloat(JOptionPane.showInputDialog(null, "Dame el saldo inicial del cliente", "Cuenta de Ahorro", JOptionPane.QUESTION_MESSAGE));
                    fechaDeApertura = JOptionPane.showInputDialog(null, "Dame la fecha de apertura de la cuenta", "Cuenta de Ahorro", JOptionPane.QUESTION_MESSAGE);
                    sucursalDeBanco = JOptionPane.showInputDialog(null, "Dame la sucursal de banco", "Cuenta de Ahorro", JOptionPane.QUESTION_MESSAGE);
                                        
                    if(nueva.aperturaCuenta(edad,montoDeEfectivo)){
                        nueva.setNumeroDeCuenta(numeroDeCuenta);
                        nueva.setNombre(nombre);
                        nueva.setFechaDeNacimiento(fechaDeNacimiento);
                        nueva.setDomicilio(domicilio);
                        nueva.setSaldo(montoDeEfectivo);
                        nueva.setFechaDeApertura(fechaDeApertura);
                        nueva.setSucursalDeBanco(sucursalDeBanco);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No se cumplen los requisitos para crear una cuenta");
                    }
                    break;
                case "2.- Depositar efectivo":
                    montoDeEfectivo = Float.parseFloat(JOptionPane.showInputDialog(null, "Cantidad a depositar", "Deposito", JOptionPane.QUESTION_MESSAGE));
                    nueva.depositoDeEfectivo(montoDeEfectivo);
                    break;
                case "3.- Retirar efectivo":
                    montoDeEfectivo = Float.parseFloat(JOptionPane.showInputDialog(null, "Cantidad a retirar", "Retiro", JOptionPane.QUESTION_MESSAGE));
                    nueva.retiroDeEfectivo(montoDeEfectivo);
                    break;
                case "4.- Consultar saldo":
                    JOptionPane.showMessageDialog(null, nueva.consultaDeSaldo());
                    break;
                case "5.- Modificar cuenta de ahorro":
                    do{
                        opcMenu = (String) JOptionPane.showInputDialog(null, "Elije una opción", "Menu", JOptionPane.QUESTION_MESSAGE, null, subMenu, subMenu[0]);
                        
                        switch(opcMenu){
                            case "1.- Cambiar numero de cuenta":
                                numeroDeCuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el numero de cuenta", "Modificación de Cuenta", JOptionPane.QUESTION_MESSAGE));
                                nueva.setNumeroDeCuenta(numeroDeCuenta);
                                break;
                            case "2.- Cambiar nombre":
                                nombre = JOptionPane.showInputDialog(null, "Dame el nombre del cliente", "Modificación de Cuenta", JOptionPane.QUESTION_MESSAGE);
                                nueva.setNombre(nombre);
                                break;
                            case "3.- Cambiar fecha de nacimiento":
                                fechaDeNacimiento = JOptionPane.showInputDialog(null, "Dame la fecha de nacimiento", "Modificación de Cuenta", JOptionPane.QUESTION_MESSAGE);
                                nueva.setFechaDeNacimiento(fechaDeNacimiento);
                                break;
                            case "4.- Cambiar domicilio":
                                domicilio = JOptionPane.showInputDialog(null, "Dame el domicilio del cliente", "Modificación de Cuenta", JOptionPane.QUESTION_MESSAGE);
                                nueva.setDomicilio(domicilio);
                                break;
                            case "5.- Cambiar saldo":
                                saldo = Float.parseFloat(JOptionPane.showInputDialog(null, "Dame el saldo de la cuenta", "Modificación de Cuenta", JOptionPane.QUESTION_MESSAGE));
                                nueva.setSaldo(saldo);
                                break;
                            case "6.- Cambiar fecha de apertura":
                                fechaDeApertura = JOptionPane.showInputDialog(null, "Dame la fecha de apertura de la cuenta", "Modificación de Cuenta", JOptionPane.QUESTION_MESSAGE);
                                nueva.setFechaDeApertura(fechaDeApertura);
                                break;
                            case "7.- Cambiar sucursal de banco":
                                sucursalDeBanco = JOptionPane.showInputDialog(null, "Dame la sucursal de banco", "Modificación de Cuenta", JOptionPane.QUESTION_MESSAGE);
                                nueva.setSucursalDeBanco(sucursalDeBanco);
                                break;
                            case "8.- Salir":
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No es una opción valida");
                        }
                    }while(!"8.- Salir a Menu".equals(opcMenu));
                    break;
                case "6.- Salir":
                    JOptionPane.showMessageDialog(null, "Gracias...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No es una opción valida");
            }
        }while(!"6.- Salir".equals(opcMenu));
    }
}
