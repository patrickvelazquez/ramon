package Cuarto;

import javax.swing.JOptionPane;

public class Banco 
{
    public static void main(String[] args) 
    {
        Object menu[]={"Nueva Cuenta","Consultas","Modificar","Depositar","Retirar","Salir"};
        Object bancos[]={"Banamex","Santander","UPSIN"};
        Object subMenu[]={"Saldo","Información del Cliente","Salir"};
        Object modificar[]={"Nombre","Domicilio","Fecha de Nacimiento","Número de celular","Salir"};
        String opcMenu;
        
        String aux;
        cuentaBanco nuevoCliente = new cuentaBanco();
        do
        {
            opcMenu = (String) JOptionPane.showInputDialog(null,"Selecciona una opción","Banco UPSIN",JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
            
            switch(opcMenu)
            {
                case (String) "Nueva Cuenta":
                    cuenta(nuevoCliente,bancos);
                    break;
                case (String) "Consultas":
                    menuConsultas(nuevoCliente,subMenu);
                    break;
                case (String) "Modificar":
                    modificar(nuevoCliente,modificar);
                    break;
                case (String)"Depositar":
                    float deposito;
                    aux = JOptionPane.showInputDialog(null,"Digite la cantidad a depositar","Depósitos",JOptionPane.INFORMATION_MESSAGE);
                    deposito = Float.parseFloat(aux);
                    nuevoCliente.hacerDeposito(deposito);
                    JOptionPane.showMessageDialog(null, "Su saldo actual es de: $"+nuevoCliente.getSaldo());
                    break;
                case (String)"Retirar":
                    float retiro;
                    aux = JOptionPane.showInputDialog(null,"Digite la cantidad a retirar","Retiros",JOptionPane.INFORMATION_MESSAGE);
                    retiro = Float.parseFloat(aux);
                    if(nuevoCliente.hacerRetiro(retiro)== true)
                    {
                        JOptionPane.showMessageDialog(null, "Su saldo actual es de: $"+nuevoCliente.getSaldo());
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "No dispones de esa cantidad");
                    }
                    break;
            }
        }while(!opcMenu.equals("Salir"));
    } 
    
    private static void cuenta(cuentaBanco nuevoCliente,Object banco[])
    {
        boolean salida = false;
        String nombre,domicilio,numeroCelular,aux,nombreSucursal;
        int edad,diaN,mesN,añoN,diaA,mesA,añoA,respuesta;
        float saldo;
        
        do
        {
            nombre = JOptionPane.showInputDialog(null, "¿Cuál es su nombre?","Nombre",JOptionPane.INFORMATION_MESSAGE);
            domicilio = JOptionPane.showInputDialog(null,"¿Dónde vives?","Domicilio",JOptionPane.INFORMATION_MESSAGE);
            aux = JOptionPane.showInputDialog(null,"Introduzca el día","Fecha de Nacimiento",JOptionPane.INFORMATION_MESSAGE);
            diaN = Integer.parseInt(aux);
            aux = JOptionPane.showInputDialog(null,"Introduzca el mes","Fecha de Nacimiento",JOptionPane.INFORMATION_MESSAGE);
            mesN = Integer.parseInt(aux);
            aux = JOptionPane.showInputDialog(null,"Introduzca el año","Fecha de Nacimiento",JOptionPane.INFORMATION_MESSAGE);
            añoN = Integer.parseInt(aux);
            numeroCelular = JOptionPane.showInputDialog(null,"¿Cuál es su número de celular?","Número de celular",JOptionPane.INFORMATION_MESSAGE);
            aux = JOptionPane.showInputDialog(null,"¿Cuál es tu edad?","Edad",JOptionPane.INFORMATION_MESSAGE);
            edad = Integer.parseInt(aux);
            aux = JOptionPane.showInputDialog(null,"Introduzca el monto","Monto",JOptionPane.INFORMATION_MESSAGE);
            saldo = Float.parseFloat(aux);
            if(nuevoCliente.aperturaCuenta(saldo, edad) == true)
            {
                nombreSucursal = (String) JOptionPane.showInputDialog(null,"Seleccione sucursal:","Bancos",JOptionPane.QUESTION_MESSAGE,null,banco,banco[0]);
                aux = JOptionPane.showInputDialog(null,"Introduzca el día","Fecha de Apertura",JOptionPane.INFORMATION_MESSAGE);
                diaA = Integer.parseInt(aux);
                aux = JOptionPane.showInputDialog(null,"Introduzca el mes","Fecha de Apertura",JOptionPane.INFORMATION_MESSAGE);
                mesA = Integer.parseInt(aux);
                aux = JOptionPane.showInputDialog(null,"Introduzca el año","Fecha de Apertura",JOptionPane.INFORMATION_MESSAGE);
                añoA = Integer.parseInt(aux);
                
                respuesta = JOptionPane.showConfirmDialog(null, "Información del Cliente\n\n" + 
                        "Nombre: "+nombre+" Domicilio: "+domicilio+" Edad: "+edad+"\nSaldo: "+saldo+" Fecha nacimiento: "+fecha(diaN,mesN,añoN) + 
                        "\n\nInformación de la cuenta\n\n"+"Nombre de la sucursal: " + nombreSucursal + "  Saldo: "+saldo+ "Fecha de apertura: "+fecha(diaA,mesA,añoA)+
                        "\n\n¿Son estos datos correctos?");
                if(respuesta == JOptionPane.YES_OPTION)
                {
                    nuevoCliente.setAñoA(añoA);
                    nuevoCliente.setAñoN(añoN);
                    nuevoCliente.setDiaA(diaA);
                    nuevoCliente.setDiaN(diaN);
                    nuevoCliente.setDomicilio(domicilio);
                    nuevoCliente.setImporte(saldo);
                    nuevoCliente.setMesA(mesA);
                    nuevoCliente.setMesN(mesN);
                    nuevoCliente.setNombre(nombre);
                    nuevoCliente.setNombreSucursal(nombreSucursal);
                    nuevoCliente.setNumeroCelular(numeroCelular);
                    nuevoCliente.setSaldo(saldo);
                    JOptionPane.showMessageDialog(null, "La cuenta se creó con éxito");
                    salida = true;
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No cumples con los requisitos para abrir la cuenta");
                salida = true;
            }
        }while(salida != true);  
    }
    private static String fecha(int diaN,int mesN,int añoN)
    {
        return diaN + "/" + mesN + "/" + añoN;
    }
    private static void menuConsultas(cuentaBanco nuevoCliente,Object menu[])
    {
        String opcMenu;
        do
        {
            opcMenu = (String) JOptionPane.showInputDialog(null,"Seleccione una opción","Consultas",JOptionPane.INFORMATION_MESSAGE,null,menu,menu[0]);
            switch(opcMenu)
            {
                case (String) "Saldo":
                    JOptionPane.showMessageDialog(null, "Su saldo actual es de : $"+nuevoCliente.getSaldo());
                    break;
                case (String) "Información del Cliente":
                    JOptionPane.showMessageDialog(null,"Información del Cliente\n"+nuevoCliente.informacionCliente()+"\n\nInformación de la cuenta\n"+nuevoCliente.informacionCuenta());
                    break;
            }   
        }while(!opcMenu.equals("Salir"));
    }
    private static void modificar(cuentaBanco nuevoCliente,Object modificar[])
    {
        boolean salida=false;
        String nombre,domicilio,numeroCelular,opcMenu,aux;
        int edad,diaN,mesN,añoN;
        int respuesta;
        do
        {
            respuesta = JOptionPane.showConfirmDialog(null, "Información del Cliente\n"+nuevoCliente.informacionCliente()+"\n\n¿Está seguro que desea modificar los datos?");

            if(respuesta == JOptionPane.YES_OPTION)
            {
                do
                {
                    opcMenu = (String) JOptionPane.showInputDialog(null,"¿Qué desea modificar?","Modificar datos",JOptionPane.QUESTION_MESSAGE,null,modificar,modificar[0]);
                    switch(opcMenu)
                    {
                        case (String) "Nombre":
                            nombre = JOptionPane.showInputDialog(null,"¿Cuál es su nombre?","Nombre",JOptionPane.QUESTION_MESSAGE);
                            respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea modificar el nombre "+nuevoCliente.getNombre()+" por "+nombre+"?");
                            if(respuesta == JOptionPane.YES_OPTION)
                                nuevoCliente.setNombre(nombre);
                            JOptionPane.showMessageDialog(null, "Se realizó el cambio con éxito");
                            break;
                        case (String) "Domicilio":
                            domicilio = JOptionPane.showInputDialog(null,"¿Cuál es su domicilio?","Domicilio",JOptionPane.QUESTION_MESSAGE);
                            respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea modificar el domiclio: ´"+nuevoCliente.getDomicilio()+"´ por ´"+domicilio+"´ ?");
                            if(respuesta == JOptionPane.YES_OPTION)
                                nuevoCliente.setDomicilio(domicilio);
                            JOptionPane.showMessageDialog(null, "Se realizó el cambio con éxito");
                            break;
                        case (String) "Fecha de Nacimiento":
                            aux = JOptionPane.showInputDialog(null,"Introduzca el día","Fecha de Nacimiento",JOptionPane.INFORMATION_MESSAGE);
                            diaN = Integer.parseInt(aux);
                            aux = JOptionPane.showInputDialog(null,"Introduzca el mes","Fecha de Nacimiento",JOptionPane.INFORMATION_MESSAGE);
                            mesN = Integer.parseInt(aux);
                            aux = JOptionPane.showInputDialog(null,"Introduzca el año","Fecha de Nacimiento",JOptionPane.INFORMATION_MESSAGE);
                            añoN = Integer.parseInt(aux);
                            respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea modificar la fecha: ´"+nuevoCliente.fechaNacimiento()+"´ por ´"+fecha(diaN,mesN,añoN)+"´ ?");
                            if(respuesta == JOptionPane.YES_OPTION)
                            {
                                nuevoCliente.setAñoN(añoN);
                                nuevoCliente.setDiaN(diaN);
                                nuevoCliente.setMesN(mesN);
                                
                            }
                            JOptionPane.showMessageDialog(null, "Se realizaron los cambios con éxito");
                            break;
                        case (String) "Número de celular":
                            numeroCelular = JOptionPane.showInputDialog(null,"Introduce tu número de celular","Número de celular",JOptionPane.INFORMATION_MESSAGE);
                            respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea modificar el número de celular: "+nuevoCliente.getNumeroCelular()+" por "+numeroCelular);
                            if(respuesta == JOptionPane.YES_OPTION)
                                nuevoCliente.setNumeroCelular(numeroCelular);
                            JOptionPane.showMessageDialog(null, "Se realizó el cambio con éxito");
                            break;
                        case (String)"Salir":
                            salida = true;
                            JOptionPane.showMessageDialog(null, "Regresando al menú principal");
                            break;
                    }
                }while(!opcMenu.equals("Salir"));
            }
            else
                salida = true;
        }while(salida !=true);
    }
}