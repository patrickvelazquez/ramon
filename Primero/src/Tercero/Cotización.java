package Tercero;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cotización 
{ 
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) 
    {
        Object menuPrincipal[]={"Nueva Cotización","Consultar Cotización","Modificar Cotización","Salir"};
        Object eleccionAuto[]={"Frius","Yaris","Corolla","Camry"};
        String opcMenu;
        Scanner in = new Scanner(System.in);
        int opcion,respuesta;
        cotizacionAutomovil nuevoCliente = new cotizacionAutomovil();
        do
        {
            opcMenu = (String) JOptionPane.showInputDialog(null,"Selecciona una opción","Automoviles Toyota",JOptionPane.INFORMATION_MESSAGE,null,menuPrincipal,menuPrincipal[0]);
            switch(opcMenu)
            {
                case (String) "Nueva Cotización":
                    cotizacionAuto(nuevoCliente,eleccionAuto);
                    break;
                case (String) "Consultar Cotización":
                    JOptionPane.showMessageDialog(null,"Datos de la compra\n---------------------\n" + nuevoCliente.datosCompra());
                    break;
                case (String) "Modificar Cotización":
                    respuesta = JOptionPane.showConfirmDialog(null, "Detalles de la compra\n---------------------------\n "+nuevoCliente.datosCompra()+"\n\n¿Seguro que deseas modificar?");
                    if(respuesta == JOptionPane.YES_OPTION)
                    {
                        cotizacionAuto(nuevoCliente,eleccionAuto);
                    }    
                    else
                        break;
            }
        }while(!opcMenu.equals("Salir"));
    }  
       
    
    private static void cotizacionAuto(cotizacionAutomovil nuevoCliente,Object menu[])
    {
        
        String opcMenu;
        int numeroCotizacion=0;
        String descripcionAutomovil = null;
        float costo = 0;
        int plazo,respuesta;
        String aux;
        boolean salida=false;
        do
        {
            numeroCotizacion++;
            opcMenu = (String) JOptionPane.showInputDialog(null,"Opción 1:\nModelo: Frius 2018     Costo: $383,400 M.N.\n\nOpción 2:\nModelo: Yaris R 2018     Costo: $254,400 M.N.\n\n" +
                    "Opción 3:\nModelo: Corolla 2018     Costo: $288,400 M.N.\n\nOpción 4:\nModelo: Camry 2018     Costo: $409,900 M.N.\n\n¿Cuál coche desea?","Cotización",JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
            switch (opcMenu) 
            {
                case (String) "Frius":
                
                    costo = 383400;
                    descripcionAutomovil = "Frius";
                    break;
                case (String) "Yaris":
                    costo = 254400;
                    descripcionAutomovil = "Yaris";
                    break;
                case (String) "Corolla":
                    costo = 288400;
                    descripcionAutomovil = "Corolla";
                    break;
                case (String) "Camry":
                    costo = 409900;
                    descripcionAutomovil = "Camry";
                    break;
            }
             aux = JOptionPane.showInputDialog(null,"Introduzca el plazo","Plazo",JOptionPane.QUESTION_MESSAGE);
             plazo = Integer.parseInt(aux);
            
            nuevoCliente.setCosto(costo);
            nuevoCliente.setDescripcionAutomovil(descripcionAutomovil);
            nuevoCliente.setNumeroCotizacion(numeroCotizacion);
            nuevoCliente.setPlazo(plazo);
            
            respuesta = JOptionPane.showConfirmDialog(null, "Detalles de la compra\n---------------------------\n "+nuevoCliente.datosCompra()+"\n\n¿Son estos datos correctos?");
            if(respuesta == JOptionPane.YES_OPTION)
                salida = true;
        }while(salida !=true); 
    }
}