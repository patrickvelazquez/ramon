package Segundo;
import java.util.Scanner;

public class Boleto 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner (System.in);
        Scanner nombre = new Scanner (System.in);
        int respuesta;
        int dia,mes,año,edad;
        int opcion;
        int numeroBoleto=0;
        float costo = 0;
        String nombreCliente,tipoBoleto = null,destino;
        CostoBoleto nuevoCliente = new CostoBoleto();     
        do
        {
            System.out.println("Central de autobuses Mazatlán");
            System.out.println("-------------------------------\n");
            System.out.println("Elija una opción:\n");
            System.out.println("[1] Nuevo viaje ");
            System.out.println("[2] Modificar viaje");
            System.out.println("[3] Consulta viaje");
            System.out.println("[4] Salir");
            System.out.println("\n\nRespuesta: ");
            opcion=in.nextInt();
            
            switch(opcion)
            {
                case 1:
                    
                    numeroBoleto++;
                    
                    do
                    {
                        System.out.println("\nNuevo viaje");
                        System.out.println("--------------------------");
                        System.out.println("¿Cuál es su nombre?");
                        nombreCliente = nombre.nextLine();

                        System.out.println("¿Cuál es su edad?");
                        edad = in.nextInt();

                        System.out.println("¿A dónde desea ir?");
                        destino = in.next();

                        System.out.println("Digite la fecha de su viaje");
                        System.out.println("Dia: ");
                        dia = in.nextInt();
                        System.out.println("Mes: ");
                        mes = in.nextInt();
                        System.out.println("Año: ");
                        año = in.nextInt();
                        System.out.println("Seleccione el tipo de boleto que desee\n");
                        System.out.println("[1] Económico");
                        System.out.println("[2] Premium \nRespuesta:");
                        respuesta = in.nextInt();

                        nuevoCliente.setEdad(edad);
                        nuevoCliente.setAño(año);
                        nuevoCliente.setCosto(costo);
                        nuevoCliente.setDestino(destino);
                        nuevoCliente.setDia(dia);
                        nuevoCliente.setMes(mes);
                        nuevoCliente.setNombreCliente(nombreCliente);
                        nuevoCliente.setNumeroBoleto(numeroBoleto);
                        nuevoCliente.setTipoBoleto(tipoBoleto);

                        nuevoCliente.determinaTipoBoleto(respuesta);
                        System.out.println("¿Son estos datos correctos?\nDatos del cliente\n"+nuevoCliente.datosCompra()+"\nFecha: "+nuevoCliente.fechaConFormato());
                        System.out.println("\nDatos de la compra\n"+nuevoCliente.pago());
                        System.out.println("\n1) Si  2) No\nRespuesta: ");
                        respuesta = in.nextInt();
                    }while(respuesta !=1);
            
                    break;
                case 2:
                    
                    do
                    {
                        System.out.println("Modificar viaje");
                        System.out.println("\n-------------------");
                        System.out.println("\nDatos del cliente\n" + nuevoCliente.datosCompra()+"\nFecha: " + nuevoCliente.fechaConFormato());
                        System.out.println("\nDatos de la compra\n"+nuevoCliente.pago());
                        System.out.println("\n¿Está seguro que desea modificar?\n[1] Si   [2] No\nRespuesta:");
                        respuesta = in.nextInt();
                        
                        switch(respuesta)
                        {
                            case 1:
                                
                                System.out.println("¿Cuál es su nombre?");
                                nombreCliente = nombre.nextLine();

                                System.out.println("¿Cuál es su edad?");
                                edad = in.nextInt();

                                System.out.println("¿A dónde desea ir?");
                                destino = in.next();

                                System.out.println("Digite la fecha de su viaje");
                                System.out.println("Dia: ");
                                dia = in.nextInt();
                                System.out.println("Mes: ");
                                mes = in.nextInt();
                                System.out.println("Año: ");
                                año = in.nextInt();
                                System.out.println("Seleccione el tipo de boleto que desee\n");
                                System.out.println("[1] Económico");
                                System.out.println("[2] Premium \nRespuesta:");
                                respuesta = in.nextInt();

                                nuevoCliente.setEdad(edad);
                                nuevoCliente.setAño(año);
                                nuevoCliente.setCosto(costo);
                                nuevoCliente.setDestino(destino);
                                nuevoCliente.setDia(dia);
                                nuevoCliente.setMes(mes);
                                nuevoCliente.setNombreCliente(nombreCliente);
                                nuevoCliente.setNumeroBoleto(numeroBoleto);
                                nuevoCliente.setTipoBoleto(tipoBoleto);

                                nuevoCliente.determinaTipoBoleto(respuesta);
                                break;
                            case 2:
                                System.out.println("Regresando al menú principal...");
                                respuesta = 2;
                                break;
                            default:
                                System.out.println("Elija una opción válida");
                                break;                
                        }
                    }while(respuesta !=2);
                    break;
                
                case 3:
                    System.out.println("Consulta viaje");
                    System.out.println("\n-------------------");
                    System.out.println("\nDatos del cliente\n" + nuevoCliente.datosCompra()+"\nFecha: " + nuevoCliente.fechaConFormato());
                    System.out.println("\nDatos de la compra\n"+nuevoCliente.pago());
                    break;
                default:
                    System.out.println("Elija una opción válida");
                    break;
            }
           
        }while(opcion!=4);
    }
}
