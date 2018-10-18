/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;
import javax.swing.JOptionPane;
/**
 *
 * @author Luis Espinoza
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Object menu[]={"Capturar docente","Capturar puesto","Calcular pago","Calcular persección","Calcular impuesto","Calcular total a pagar","Salir"};
        int horas = 0, numPuesto, nivel, tipo, numEmpleado,numMaterias;
        float pagoHora;
        String descripcion,funcion,nombre,fechaIngreso;
        String opc="";
        Puesto pu = new Puesto();
        Docente doc = new Docente();
        do{
            opc=(String)JOptionPane.showInputDialog(null,"Elija opción","Menú",JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
            
            switch(opc){
                case (String)"Capturar docente":
                    numEmpleado=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa numero de empleado","Empleado",JOptionPane.QUESTION_MESSAGE));
                    doc.setNumEmpleado(numEmpleado);
                    
                    nombre=JOptionPane.showInputDialog(null,"Ingresa nombre de empleado","Empleado",JOptionPane.QUESTION_MESSAGE);
                    doc.setNombre(nombre);
                    
                    doc.setPuesto(pu);
                    
                    fechaIngreso=JOptionPane.showInputDialog(null,"Ingresa fecha de ingreso","Empleado",JOptionPane.QUESTION_MESSAGE);
                    doc.setFechaIngreso(fechaIngreso);
                    
                    numMaterias=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa numero de materias impartidas","Empleado",JOptionPane.QUESTION_MESSAGE));
                    doc.setNumMaterias(numMaterias);
                    
                    pagoHora=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingresa el pago por hora","Empleado",JOptionPane.QUESTION_MESSAGE));
                    doc.setPagoHora(pagoHora);
                    
                    horas=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa numero de horas trabajadas","Empleado",JOptionPane.QUESTION_MESSAGE));
                    
                    break;
                case (String)"Capturar puesto":
                    numPuesto=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa número de puesto","Enpleado",JOptionPane.QUESTION_MESSAGE));
                    pu.setNumPuesto(numPuesto);
                    
                    descripcion=JOptionPane.showInputDialog(null,"Ingresa descripción","Puesto",JOptionPane.QUESTION_MESSAGE);
                    pu.setDescripcion(descripcion);
                    
                    funcion=JOptionPane.showInputDialog(null,"Ingresa función","Puesto",JOptionPane.QUESTION_MESSAGE);
                    pu.setFuncion(funcion);
                    
                    nivel=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa nivel academico \n1. Técnico\n2. Lic e Ing \n3. Maestria\n4. Doctorado","Puesto",JOptionPane.QUESTION_MESSAGE));
                    pu.setNivel(nivel);
                   
                    tipo=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa tipo \n1. Eventual\n2. Base","Puesto",JOptionPane.QUESTION_MESSAGE));
                    pu.setTipo(tipo);
                    
                    
                    break;
                case (String)"Calcular pago":
                    JOptionPane.showMessageDialog(null,"El pago es: $ "+doc.calcularPago(horas));
                    break;
                case (String)"Calcular persección":
                    JOptionPane.showMessageDialog(null,"El pago de persección es: $ "+doc.calcularPagoP(horas));
                    break;
                case (String)"Calcular impuesto":
                    JOptionPane.showMessageDialog(null,"EL impuesto es: $ "+doc.calcularImpuesto(horas));
       
                    break;
                    
                 case(String)"Calcular total a pagar":
                     JOptionPane.showMessageDialog(null,"el total a pagar es: $ "+doc.calcularTotal(horas));
                     break;
                            
            }
            }while(!opc.equals("Salir"));
        }
    
    
}
