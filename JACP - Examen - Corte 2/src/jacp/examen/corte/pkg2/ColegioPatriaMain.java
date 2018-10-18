/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jacp.examen.corte.pkg2;
import javax.swing.JOptionPane;
/**
 *
 * @author Drago
 */
public class ColegioPatriaMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int noEmpleado, matImpartidas, horasImpartidas = 0, numPuesto, tipoPuesto;
        String nombre, fechaIngreso, descripcion, funciones, nivelAcademico, opcMenu = "";
        float pagoHora;
        Puesto puesto = new Puesto();
        Docente nuevo = new Docente();
        
        Object menu[] = {"1) Captura de empleado docente", "2) Captura de puesto", "3) Calculo de pago de docente", "4) Calculo de persecciones", "5) Calculo de impuesto", "6) Total a pagar", "7) Salir"};
        Object opciones[] = {"1 - Tecnico", "2 - Lic. e Ing.", "3 - Maestria", "4 - Doctorado"};
        
        do{
            opcMenu = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Colegio Patria", JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
            switch(opcMenu){
                case "1) Captura de empleado docente":
                    noEmpleado = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el número de empleado", "Captura de empleado", JOptionPane.QUESTION_MESSAGE));
                    nombre = JOptionPane.showInputDialog(null, "Dame el nombre del empleado", "Captura de empleado", JOptionPane.QUESTION_MESSAGE);
                    fechaIngreso = JOptionPane.showInputDialog(null, "Dame la fecha de ingreso del empleado", "Captura de empleado", JOptionPane.QUESTION_MESSAGE);
                    do{
                        matImpartidas = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame la cantidad de materias impartidas del empleado", "Captura de empleado", JOptionPane.QUESTION_MESSAGE));    
                    }while(matImpartidas <= 0 && matImpartidas >= 6);
                    pagoHora = Float.parseFloat(JOptionPane.showInputDialog(null, "Dame el pago por hora del empleado", "Captura de empleado", JOptionPane.QUESTION_MESSAGE));
                    horasImpartidas = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame las horas impartidas del empleado", "Captura de empleado", JOptionPane.QUESTION_MESSAGE));
                    
                    nuevo.setNoEmpleado(noEmpleado);
                    nuevo.setNombre(nombre);
                    nuevo.setFechaIngreso(fechaIngreso);
                    nuevo.setPuesto(puesto);
                    nuevo.setMatImpartidas(matImpartidas);
                    nuevo.setPagoHora(pagoHora);
                    break;
                case "2) Captura de puesto":
                    numPuesto = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el numero de puesto", "Captura de puesto", JOptionPane.QUESTION_MESSAGE));
                    descripcion = JOptionPane.showInputDialog(null, "Dame la descripción del puesto", "Captura de puesto", JOptionPane.QUESTION_MESSAGE);
                    funciones = JOptionPane.showInputDialog(null, "Dame las funciones del puesto", "Captura de puesto", JOptionPane.QUESTION_MESSAGE);
                    nivelAcademico = (String) JOptionPane.showInputDialog(null, "Seleccione el nivel academico del puesto", "Captura de puesto", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                    do{
                        tipoPuesto = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el tipo de puesto \n(1) Eventual | 2) Base)", "Captura de puesto", JOptionPane.QUESTION_MESSAGE));
                    }while(tipoPuesto <= 0 && tipoPuesto >= 3);
                    
                    puesto.setNumPuesto(numPuesto);
                    puesto.setDescripcion(descripcion);
                    puesto.setFunciones(funciones);
                    puesto.setNivelAcademico(nivelAcademico);
                    puesto.setTipoPuesto(tipoPuesto);
                    
                    break;
                case "3) Calculo de pago de docente":
                    JOptionPane.showMessageDialog(null, "El pago del docente por " + horasImpartidas + " horas impartidas es: $" + nuevo.calcularPago(horasImpartidas));
                    break;
                case "4) Calculo de persecciones":
                    JOptionPane.showMessageDialog(null, "Persecciones por hora: $" + nuevo.calcularPerseccion() + "\nPersecciones por " + horasImpartidas + " horas impartidas: $" + nuevo.calcularPerseccion()*horasImpartidas);
                    break;
                case "5) Calculo de impuesto":
                    JOptionPane.showMessageDialog(null, "Impuestos por hora: $" + nuevo.calcularImpuestos() + "\nImpuesto por " + horasImpartidas + " horas impartidas: $" + nuevo.calcularImpuestos()*horasImpartidas);
                    break;
                case "6) Total a pagar":
                    float totalPagar = nuevo.calcularPago(horasImpartidas) + (nuevo.calcularPerseccion() * horasImpartidas) - (nuevo.calcularImpuestos() * horasImpartidas);
                    JOptionPane.showMessageDialog(null, "El total a pagar por " + horasImpartidas + " horas impartidas es de : $" + totalPagar);
                    break;
                case "7) Salir":
                    JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No es una opción valida");
            }
        }while(!"7) Salir".equals(opcMenu));
    }
    
}
