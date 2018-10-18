/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 *
 * @author Kenneth Wilson
 */
import javax.swing.JOptionPane;

public class Examen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object menu[] = {"1. Captura de empleado docente","2. Captura de Puesto", "3. Calculo de pago de docente", 
        "4. Calculo de percepciones", "5. Calculo de impuesto", "6. Total a pagar", "7. Salir"};
        Object menuNivel[] = {"1 Tecnico", "2 Lic e Ing", "3 Maestria" , "4 Doctorado"};
        Object menuTipo[] = {"1 Eventual","2 Base"};
        Puesto puesto = new Puesto();
        Docente prof = new Docente();
        int num = 0, numMaterias = 0, nivelAcad = 0, tipoPuesto = 0;
        float pagoHora= 0.0f;
        String desc = "", func = "", nombre = "", fecha = "", nivel = "", tipo = "";
        String opcMenu = "";
        do{
            opcMenu = (String) JOptionPane.showInputDialog(null,"Elija una Opción","Colegio Patria - Menú",
                    JOptionPane.QUESTION_MESSAGE,null, menu,menu[0]);
            switch(opcMenu){
                case "1. Captura de empleado docente":
                    num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Número de Empleado",
                            "Capturar Docente", JOptionPane.QUESTION_MESSAGE));
                    nombre = JOptionPane.showInputDialog(null,"Ingrese el Nombre","Capturar Docente",JOptionPane.QUESTION_MESSAGE);
                    fecha = JOptionPane.showInputDialog(null,"Ingrese la Fecha de Ingreso","Capturar Docente",JOptionPane.QUESTION_MESSAGE);
                    numMaterias = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Número de Materias",
                            "Capturar Docente", JOptionPane.QUESTION_MESSAGE));
                    pagoHora = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el pago por hora",
                            "Capturar Docente", JOptionPane.QUESTION_MESSAGE));
                    prof.setNumEmpleado(num);
                    prof.setNombre(nombre);
                    prof.setFechaIngreso(fecha);
                    prof.setNumMaterias(numMaterias);
                    prof.setPagoHora(pagoHora);
                    break;
                case "2. Captura de Puesto":
                    num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Número de Puesto",
                            "Capturar Puesto", JOptionPane.QUESTION_MESSAGE));
                    desc = JOptionPane.showInputDialog(null,"Ingrese la Descrición","Capturar Puesto",JOptionPane.QUESTION_MESSAGE);
                    func = JOptionPane.showInputDialog(null,"Ingrese las Funciones","Capturar Puesto",JOptionPane.QUESTION_MESSAGE);
                    nivel = (String) JOptionPane.showInputDialog(null,"Elija el Nivel Academico","Capturar Puesto",
                            JOptionPane.QUESTION_MESSAGE,null,menuNivel,menuNivel[0]);
                    tipo = (String) JOptionPane.showInputDialog(null,"Elija el Tipo de Empleado","Capturar Puesto",
                            JOptionPane.QUESTION_MESSAGE,null,menuTipo,menuTipo[0]);
                    if(nivel.equals(menuNivel[0])){
                        nivelAcad = 1;
                    }else if(nivel.equals(menuNivel[1])){
                        nivelAcad = 2;
                    }else if(nivel.equals(menuNivel[2])){
                        nivelAcad = 3;
                    }else if(nivel.equals(menuNivel[3])){
                        nivelAcad = 4;
                    }
                    if(tipo.equals(menuTipo[0])){
                        tipoPuesto = 1;
                    }else if(tipo.equals(menuTipo[1])){
                        tipoPuesto = 2;
                    }
                    puesto.setNumPuesto(num);
                    puesto.setDescripcion(desc);
                    puesto.setFunciones(func);
                    puesto.setNivelAcad(nivelAcad);
                    puesto.setTipoPuesto(tipoPuesto);
                    break;
                case "3. Calculo de pago de docente":
                    JOptionPane.showMessageDialog(null, "El pago al docente es de: "+prof.calcularPago(),"Calculo de Pago",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "4. Calculo de percepciones":
                    JOptionPane.showMessageDialog(null, "Las Percepciones del docente son de: "+prof.calcularPercepcion(),"Calculo de Percepcion",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "5. Calculo de impuesto":
                    JOptionPane.showMessageDialog(null, "El impuesto es de: "+prof.calcularImpuesto(),"Calculo de Impuesto",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "6. Total a pagar":
                    JOptionPane.showMessageDialog(null, "El pago al docente es de: "+(prof.calcularPago()+prof.calcularPercepcion()-prof.calcularImpuesto()),
                            "Calculo de Pago",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "7. Salir":
                    JOptionPane.showMessageDialog(null, "Adios", "Salir",JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        }while(!opcMenu.equals(menu[6]));
        
    }
    
}
