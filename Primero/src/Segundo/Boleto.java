package Segundo;
import javax.swing.JOptionPane;


public class Boleto 
{
    public static void main(String[] args) 
    {    
        Object menu[]={"Nuevo Viaje","Modificar viaje","Consulta viaje","Salir"};
        Object subMenu[]={"Nombre","Edad","Tipo de Boleto","Fecha","Destino"};
        Object tipoViaje[]={"Económico","Premier"};
        CostoBoleto nuevoCliente = new CostoBoleto();    
        String aux;
        String opcMenu;
        do
        {
            opcMenu = (String) JOptionPane.showInputDialog(null,"Elija una opción:","Central de Autobuses Mazatlán",JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);  
            switch(opcMenu)
            {
                case (String) "Nuevo Viaje":
                    viajes(nuevoCliente,tipoViaje);
                    break;
                case (String) "Modificar viaje":
                    modificar(nuevoCliente,tipoViaje,subMenu);
                    break;
                case (String) "Consulta viaje":
                    JOptionPane.showMessageDialog(null,"Datos de la compra\n---------------------\n" + nuevoCliente.datosCompra());
                    break;
            }  
        }while(!opcMenu.equals("Salir"));
    }
    private static void modificar(CostoBoleto nuevoCliente,Object tipoViaje[],Object subMenu[])
    {
        boolean salida = false;
        int confirmacion = 0;
        String opcMenu,aux;
        confirmacion = JOptionPane.showConfirmDialog(null, "Datos de la compra\n---------------------\n" + nuevoCliente.datosCompra()+ "\n\n¿Está seguro que desea modificar el viaje?");

        if(confirmacion  == JOptionPane.YES_OPTION)
        {
            opcMenu = (String) JOptionPane.showInputDialog(null,"¿Qué desea modificar?","Modificación del Viaje",JOptionPane.QUESTION_MESSAGE,null,subMenu,subMenu[0]);
            switch(opcMenu)
            {
                case (String) "Nombre":
                    salida = false;
                    String nombre;
                    do
                    {
                        nombre = JOptionPane.showInputDialog(null,"¿Cuál es su nombre?","Nombre",JOptionPane.QUESTION_MESSAGE);
                        if(nombre.length()>0)
                        {
                            confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro que "+ nombre + " es su nombre?");
                            if(confirmacion == JOptionPane.YES_OPTION)
                            {
                                nuevoCliente.setNombreCliente(nombre);
                                salida = true;
                            }    
                        }
                    }while(salida != true);
                    break;

                case (String) "Edad":
                    salida = false;
                    int edad;

                    do
                    {
                        aux = JOptionPane.showInputDialog(null,"¿Cuál es su nombre?","Nombre",JOptionPane.QUESTION_MESSAGE);
                        if(aux.length()>0)
                        {
                            edad = Integer.parseInt(aux);
                            confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro que "+ edad + " es su edad?");
                            if(confirmacion == JOptionPane.YES_OPTION)
                            {
                                nuevoCliente.setEdad(edad);
                                salida = true;
                            }    
                        }
                    }while(salida != true);
                    break;

                     case (String) "Tipo de Boleto":
                        salida = false;

                        String tipoBoleto;
                        do
                        {
                            tipoBoleto = (String) JOptionPane.showInputDialog(null,"Elija una opción","Tipo de Boleto",JOptionPane.QUESTION_MESSAGE,null,tipoViaje,tipoViaje[0]);
                            if(tipoBoleto.length()>0)
                            {
                                confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro que "+ tipoBoleto + " es el tipo de boleto que desea?");
                                if(confirmacion == JOptionPane.YES_OPTION)
                                {
                                    if("Económico".equals(tipoBoleto))
                                        nuevoCliente.setCosto(500);
                                    else if("Premier".equals(tipoBoleto))
                                        nuevoCliente.setCosto(900);
                                    nuevoCliente.setTipoBoleto(tipoBoleto);
                                    salida = true;
                                }    
                            }
                        }while(salida != true);
                         break;

                        case (String) "Fecha":
                        salida = false;

                        int año,dia,mes;
                        do
                        {
                            aux = JOptionPane.showInputDialog(null,"Introduzca el día","Modificar fecha",JOptionPane.INFORMATION_MESSAGE);
                            if(aux.length()>0)
                            {
                                dia = Integer.parseInt(aux);
                                aux = JOptionPane.showInputDialog(null,"Introduzca el mes","Modificar fecha",JOptionPane.INFORMATION_MESSAGE);
                                if(aux.length()>0)
                                {
                                    mes = Integer.parseInt(aux);
                                    aux = JOptionPane.showInputDialog(null,"Introduzca el año","Modificar fecha",JOptionPane.INFORMATION_MESSAGE);
                                    if(aux.length()>0)
                                    {
                                        año = Integer.parseInt(aux);
                                        confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro que "+ fechaFormato(dia,mes,año) + " es la fecha que desea?");
                                        if(confirmacion == JOptionPane.YES_OPTION)
                                        {
                                            nuevoCliente.setAño(año);
                                            nuevoCliente.setDia(dia);
                                            nuevoCliente.setMes(mes);
                                            salida = true;
                                        }
                                    }
                                    else
                                        salida = true;
                                }
                                else
                                    salida = true;
                            }
                            else
                                salida = true;
                        }while(salida != true);
                         break;

                    case (String) "Destino":
                    salida = false;
                    String destino;
                    do
                    {
                        destino = JOptionPane.showInputDialog(null,"¿A dónde quiere ir?","Destino",JOptionPane.QUESTION_MESSAGE);
                        if(destino.length()>0)
                        {
                            confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro que "+destino + " es su destino?");
                            if(confirmacion == JOptionPane.YES_OPTION)
                            {
                                nuevoCliente.setDestino(destino);
                                salida = true;
                            }    
                        }
                    }while(salida != true);
                    break;
            }
        }  
    }
    private static void viajes(CostoBoleto nuevoCliente,Object tipoViaje[])
    {
        int dia,mes,año,edad,numeroBoleto=0,confirmacion;
        float costo = 0;
        String aux,nombreCliente,tipoBoleto,destino;
        boolean salida = false;
        
        do
        {
            numeroBoleto++;

            nombreCliente = JOptionPane.showInputDialog(null,"¿Cuál es su nombre?","Nombre",JOptionPane.INFORMATION_MESSAGE);
            if(nombreCliente.length()>0)
            {
                aux = (JOptionPane.showInputDialog(null,"¿Cuál es su edad?","Edad",JOptionPane.INFORMATION_MESSAGE));
                if(aux.length()>0)
                {
                    edad = Integer.parseInt(aux);
                    destino = JOptionPane.showInputDialog(null,"¿A dónde desea ir?","Destino",JOptionPane.INFORMATION_MESSAGE);
                    if(destino.length()>0)
                    {
                        aux = JOptionPane.showInputDialog(null,"Introduzca el día","Fecha del Viaje",JOptionPane.INFORMATION_MESSAGE);
                        if(aux.length()>0)
                        {
                            dia = Integer.parseInt(aux);
                            aux = JOptionPane.showInputDialog(null,"Introduzca el mes","Fecha del Viaje",JOptionPane.INFORMATION_MESSAGE);
                            if(aux.length()>0)
                            {
                                mes = Integer.parseInt(aux);
                                aux = JOptionPane.showInputDialog(null,"Introduce el año","Fecha del Viaje",JOptionPane.INFORMATION_MESSAGE);
                                if(aux.length()>0)
                                {
                                    año = Integer.parseInt(aux);
                                    tipoBoleto = (String) JOptionPane.showInputDialog(null,"Elija una opción","Tipo de Boleto",JOptionPane.QUESTION_MESSAGE,null,tipoViaje,tipoViaje[0]);
                                    if(tipoBoleto.length()>0)
                                    {
                                        if("Económico".equals(tipoBoleto))
                                            nuevoCliente.setCosto(500);
                                        else if("Premier".equals(tipoBoleto))
                                            nuevoCliente.setCosto(900);
                                        
                                        nuevoCliente.setEdad(edad);
                                        nuevoCliente.setAño(año);
                                        nuevoCliente.setDestino(destino);
                                        nuevoCliente.setDia(dia);
                                        nuevoCliente.setMes(mes);
                                        nuevoCliente.setNombreCliente(nombreCliente);
                                        nuevoCliente.setNumeroBoleto(numeroBoleto);
                                        nuevoCliente.setTipoBoleto(tipoBoleto);
                                        
                                        confirmacion = JOptionPane.showConfirmDialog(null, "Datos de la compra\n---------------------\n" + nuevoCliente.datosCompra()+ "\n\n¿Son estos datos correctos?");
                                        if(confirmacion  == JOptionPane.YES_OPTION)
                                        {
                                            salida = true;
                                        }
                                    }
                                    else
                                        salida = true;
                                }
                                else
                                    salida = true;
                            }
                            else
                                salida = true;
                        }
                        else
                            salida = true;
                    }
                    else
                        salida = true;
                }
                else
                    salida = true;
            }
            else
                salida = true;

        }while(salida!=true);
    }   
    private static String fechaFormato(int dia,int mes,int año)
    {
        return dia + "/" + mes + "/"+año;
    }  
}