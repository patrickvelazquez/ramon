/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1corte2;
import javax.swing.JOptionPane;

/**
 *
 * @author Drago
 */
public class Practica1Corte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numBomba = 0;
        Gasolina nuevaGasolina = new Gasolina();
        float capacidad = 0.0f, litrosVendidos = 0.0f;
        
        Gasolina magna = new Gasolina(1, "Pemex", 2, 15.43f);
        Gasolina premium = new Gasolina(2, "Pemex", 3, 17.36f);
        Gasolina diesel = new Gasolina(3, "Pemex", 1, 16.20f);
        BombaGasolina nuevaBomba = new BombaGasolina();
        
        Object menu[] = {"1) Iniciar bomba", "2) Realizar una venta", "3) Revisar inventario", "4) Total de venta", "5) Salir"};
        Object defOptions[] = {"1) Magna", "2) Premium", "3) Diesel"};
        String opcMenu = "", selGasolina = "";
        
        do{
            opcMenu = (String) JOptionPane.showInputDialog(null, "Elije una opción", "Menu", JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
            switch(opcMenu){
                case "1) Iniciar bomba":
                    numBomba = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el numero de la bomba", "Bomba de gasolina", JOptionPane.QUESTION_MESSAGE));
                    int reply = JOptionPane.showConfirmDialog(null, "¿Deseas añadir un tipo especifico de gasolina? \n(El seleccionar no dara opciones de gasolinas)", "Bomba de gasolina", JOptionPane.YES_NO_OPTION);
                    if(reply == JOptionPane.YES_OPTION){
                        nuevaGasolina.setIdGasolina(Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el id de la gasolina", "Gasolina", JOptionPane.QUESTION_MESSAGE)));
                        nuevaGasolina.setMarca(JOptionPane.showInputDialog(null, "Dame la marca de la gasolina", "Gasolina", JOptionPane.QUESTION_MESSAGE));
                        do{
                            nuevaGasolina.setTipo(Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el tipo de gasolina \n1)10% aumento 2)20% Aumento 3) 25% aumento", "Gasolina", JOptionPane.QUESTION_MESSAGE)));
                        }while(nuevaGasolina.getTipo() >= 4  || nuevaGasolina.getTipo() <= 0);
                        nuevaGasolina.setPrecioBase(Float.parseFloat(JOptionPane.showInputDialog(null, "Dame el precio base", "Gasolina", JOptionPane.QUESTION_MESSAGE)));
                    }
                    else{
                        selGasolina = (String) JOptionPane.showInputDialog(null, "Seleccione una gasolina", "Bomba Gasolina", JOptionPane.QUESTION_MESSAGE, null, defOptions, defOptions[0]);
                    }
                    
                    capacidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame la capacidad de la bomba de gasolina", "Bomba de gasolina", JOptionPane.QUESTION_MESSAGE));
                    litrosVendidos = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame los litros vendidos por la bomba", "Bomba de gasolina", JOptionPane.QUESTION_MESSAGE));
                    
                    if(reply == JOptionPane.YES_OPTION){
                        nuevaBomba.setTipoGasolina(nuevaGasolina);
                    }
                    else{
                        switch(selGasolina){
                            case "1) Magna":
                                nuevaBomba.setTipoGasolina(magna);
                                break;
                            case "2) Premium":
                                nuevaBomba.setTipoGasolina(premium);
                                break;
                            case "3) Diesel":
                                nuevaBomba.setTipoGasolina(diesel);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No es una opción valida");
                        }
                    }
                    
                    nuevaBomba.setNumBomba(numBomba);
                    nuevaBomba.setCapacidad(capacidad);
                    nuevaBomba.setLitrosVendidos(litrosVendidos);
                    
                    break;
                case "2) Realizar una venta":
                    litrosVendidos = Float.parseFloat(JOptionPane.showInputDialog(null, "Dame los litros a vender", "Venta de gasolina", JOptionPane.QUESTION_MESSAGE));
                    if(litrosVendidos != 0 && nuevaBomba.revisarInventario() > litrosVendidos ){
                        JOptionPane.showMessageDialog(null, "Se vendieron: " + litrosVendidos + " Litros \ncosto: $" + nuevaBomba.realizarVenta(litrosVendidos));
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Hubo un error con la venta, revise el inventario o la cantidad a vender");
                    }
                    break;
                case "3) Revisar inventario":
                    JOptionPane.showMessageDialog(null, "Quedan: " + nuevaBomba.revisarInventario() + " litros");
                    break;
                case "4) Total de venta":
                    JOptionPane.showMessageDialog(null, "Se vendieron " + nuevaBomba.getLitrosVendidos() + " Con un valor de $" + nuevaBomba.calcularVentaTotal());
                    break;
                case "5) Salir":
                    JOptionPane.showMessageDialog(null, "Gracias por usar este programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No es una opción valida");
            }
        }while(!"5) Salir".equals(opcMenu));
    }   
}
