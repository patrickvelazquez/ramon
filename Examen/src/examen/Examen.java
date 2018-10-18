package examen;
import javax.swing.JOptionPane;

public class Examen 
{
    public static void main(String[] args) 
    {
        Object menuPrincipal[]={"","Captura de empleado docente","Captura de Puesto","Cálculo de pago de docente",
            "Cálculo de persecciones","Cálculo de impuesto","Total a pagar","Salir"};
        String opcMenu;
        Docente docente = new Docente();
        int horas = 0;
        boolean salida = false;
        
        do
        {
            opcMenu = (String) JOptionPane.showInputDialog(null,"Seleccione una opción","Colegio Patria",JOptionPane.INFORMATION_MESSAGE,null,menuPrincipal,menuPrincipal[0]);
            switch(opcMenu)
            {
                case (String) "":
                    JOptionPane.showMessageDialog(null, "Seleccione una opción","Error",JOptionPane.ERROR_MESSAGE);
                    break;
                case (String) "Captura de empleado docente":
                    horas = capturaDocente(docente,horas);
                    break;
                case (String) "Captura de Puesto":
                    horas = capturaPuesto(docente,horas);
                    break;
                case (String) "Cálculo de pago de docente":
                    if(horas == 0)
                        JOptionPane.showMessageDialog(null, "Necesitas capturar docente","Pago docente",JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, "El cálculo de su pago es: "+docente.calculoPago(horas),"Pago docente",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case (String) "Cálculo de persecciones":
                    if(horas == 0)
                        JOptionPane.showMessageDialog(null, "Necesitas capturar docente","Pago docente",JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, "El cálculo de persecciones es: "+docente.pagoPersecion(horas),"Persecciones",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case (String) "Cálculo de impuesto":
                    if(horas == 0)
                        JOptionPane.showMessageDialog(null, "Necesitas capturar docente","Pago docente",JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, "El impuesto es: "+docente.impuesto(horas),"Impuesto",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case (String) "Total a pagar":
                    float total;
                    if(horas == 0)
                        JOptionPane.showMessageDialog(null, "Necesitas capturar docente","Pago docente",JOptionPane.INFORMATION_MESSAGE);
                    else
                    {
                        total = (docente.calculoPago(horas)+docente.pagoPersecion(horas)) - docente.impuesto(horas);
                        JOptionPane.showMessageDialog(null, "El total a pagar es: "+total,"Total a pagar",JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case (String) "Salir":
                    JOptionPane.showMessageDialog(null, "Adiós :)");
                    salida = true;
                    break;
            }
        }while(salida == false);
    }
    
    private static int capturaDocente(Docente docente,int horas)
    {
        int numeroEmpleado=0;
        String nombre,fechaIngreso,aux;
        int numeroMaterias,pass;
        float pagoHora;
        
        numeroEmpleado++;
        nombre = (String) JOptionPane.showInputDialog(null,"Ingrese nombre del docente","Captura de Docente",JOptionPane.INFORMATION_MESSAGE);
        fechaIngreso = (String) JOptionPane.showInputDialog(null,"Ingrese fecha de ingreso","Captura de Docente",JOptionPane.INFORMATION_MESSAGE);
        aux = (String) JOptionPane.showInputDialog(null,"Ingrese número de materias","Captura de Docente",JOptionPane.INFORMATION_MESSAGE);
        numeroMaterias = Integer.parseInt(aux);
        aux = (String) JOptionPane.showInputDialog(null,"Ingrese pago por hora","Captura de Docente",JOptionPane.INFORMATION_MESSAGE);
        pagoHora = Float.parseFloat(aux);
        aux = (String) JOptionPane.showInputDialog(null,"Ingrese horas a trabajar","Captura de Docente",JOptionPane.INFORMATION_MESSAGE);
        horas = Integer.parseInt(aux);
        
        docente.setFechaIngreso(fechaIngreso);
        docente.setNombre(nombre);
        docente.setNumeroEmpleado(numeroEmpleado);
        docente.setNumeroMaterias(numeroMaterias);
        docente.setPagoHora(pagoHora);
        
        pass = JOptionPane.showConfirmDialog(null, "¿Desea capturar el puesto?");
        if(pass == JOptionPane.YES_OPTION)
        {
            capturaPuesto(docente,horas);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Docente capturado con éxito :)");
        }
       return horas;
    }
    private static int capturaPuesto(Docente docente,int horas)
    {
        int numeroPuesto=0;
        String descripcion,funciones,nivelAcademico,tipoPuesto,aux;
        Object nivel[]={"Técnico","Lic e Ing","Maestría","Doctorado"};
        Object tipo[] = {"Eventual","Base"};
        numeroPuesto++;
        
        descripcion = (String) JOptionPane.showInputDialog(null,"Ingrese descripción del puesto","Captura de Puesto",JOptionPane.INFORMATION_MESSAGE);
        funciones = (String) JOptionPane.showInputDialog(null,"Ingrese función del puesto","Captura de Puesto",JOptionPane.INFORMATION_MESSAGE);
        nivelAcademico = (String) JOptionPane.showInputDialog(null,"Seleccione su nivel de estudios","Captura de Puesto",JOptionPane.INFORMATION_MESSAGE,null,nivel,nivel[0]);
        tipoPuesto = (String) JOptionPane.showInputDialog(null,"Seleccione el tipo de puesto","Captura de Puesto",JOptionPane.INFORMATION_MESSAGE,null,tipo,tipo[0]);
        
        docente.getPuesto().setDescripcion(descripcion);
        docente.getPuesto().setFunciones(funciones);
        docente.getPuesto().setNivelAcademico(nivelAcademico);
        docente.getPuesto().setNumeroPuesto(numeroPuesto);
        docente.getPuesto().setTipoPuesto(tipoPuesto);
        
        JOptionPane.showMessageDialog(null, "Captura éxitosa :)");
        return horas;
    }
}