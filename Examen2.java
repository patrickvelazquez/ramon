/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;
import javax.swing.JOptionPane;
/**
 *
 * @author SAMANTHA
 */
public class Examen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroDeEmpleado,numeroDeMaterias, numeroDePuesto,nivelAcademico,tipoPuesto;
        float pagoHora;
        String descripcionPuesto,funcionesRealizar,nombreEmpleado,fechaIngreso;
        Puesto puestoEmpleado=null;

        
        Object menu[]={"1. Captura de empleado docente","2. Captura de puesto","3. Calculo de pago docente","4. Calculo de persecciones","5. Calcular impuesto","6. Salir"};
        String opcMenu;
        Docente ObjetoD = new Docente();
        //Empleado ObjetoE= new Empleado();
        //Puesto ObjetoP= new Puesto();
        do{
            opcMenu=(String)JOptionPane.showInputDialog(null,"Elige una opción","Menu",JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
            switch(opcMenu)
            {
                case (String)"1. Captura de empleado docente":
                    
                    numeroDeEmpleado=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número de empleado: ","Nuevo empleado",JOptionPane.QUESTION_MESSAGE));
                    ObjetoD.setNumeroDeEmpleado(numeroDeEmpleado);
                    
                    nombreEmpleado=JOptionPane.showInputDialog(null,"Ingrese el nombre del empleado: ","Nuevo empleado",JOptionPane.QUESTION_MESSAGE);
                    ObjetoD.setNombreEmpleado(nombreEmpleado);
                    
                    fechaIngreso=JOptionPane.showInputDialog(null,"Ingrese la fecha de ingreso: ","Nuevo empleado",JOptionPane.QUESTION_MESSAGE);
                    ObjetoD.setFechaIngresoE(fechaIngreso);
                    
                    numeroDeMaterias=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número de materias impartidas","Nuevo empleado",JOptionPane.QUESTION_MESSAGE));
                    ObjetoD.setNumeroMaterias(numeroDeMaterias);
                    
                    pagoHora=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el pago por hora: ","Nuevo empleado",JOptionPane.QUESTION_MESSAGE));
                    ObjetoD.setPagoHoras(pagoHora);
                    break;
                    
                case (String)"2. Captura de puesto":
                    
                    numeroDePuesto=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número de puesto: ","Nuevo Puesto",JOptionPane.QUESTION_MESSAGE));
                    ObjetoD.puestoEmpleado.setNumeroDePuesto(numeroDePuesto);
                    
                    descripcionPuesto=JOptionPane.showInputDialog(null,"Ingrese la descripcion del puesto: ","Nuevo puesto",JOptionPane.QUESTION_MESSAGE);
                    ObjetoD.puestoEmpleado.setDescripcionPuesto(descripcionPuesto);
                    
                    funcionesRealizar=JOptionPane.showInputDialog(null,"Ingrese las funciones a realizar: ","Nuevo puesto",JOptionPane.QUESTION_MESSAGE);
                    ObjetoD.puestoEmpleado.setFuncionesRealizar(funcionesRealizar);
                    
                    nivelAcademico=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número segun el nivel academico(1. Tecnico, 2. Lic e Ing, 3. Maestria, 4. Doctorado): ","Nuevo puesto",JOptionPane.QUESTION_MESSAGE));
                    ObjetoD.puestoEmpleado.setNivelAcademico(nivelAcademico);
                    
                    tipoPuesto=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número según el tipo de puesto(1. Eventual, 2. Base): ","Nuevo Puesto",JOptionPane.QUESTION_MESSAGE));
                    ObjetoD.puestoEmpleado.setTipoPuesto(tipoPuesto);
                    break;
                case (String)"3. Calculo de pago docente":
                    JOptionPane.showMessageDialog(null,"El pago es de: "+ObjetoD.calcularPago());
                    break;
                case (String)"4. Calculo de persecciones":
                    JOptionPane.showMessageDialog(null,"La perseccion es de: "+ObjetoD.calcularPerseccion());
                    break;
                case (String)"5. Calcular impuesto":
                    JOptionPane.showMessageDialog(null,"El impuesto es: "+ObjetoD.calcularImpuesto());
                    break;
            }
            
        }while(!opcMenu.equals("6. Salir"));
    }
    
}
