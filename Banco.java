package Cuarto;

import java.util.Scanner;

public class Banco 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Scanner nombre1 = new Scanner(System.in);
        int opcion,respuesta;
        cuentaBanco nuevoCliente = new cuentaBanco();
        do
        {
            System.out.println("Banco UPSIN");
            System.out.println("---------------------------------------");
            printf("\nSelecciona una opción:");
            printf("\n[1] Nueva cuenta");
            printf("[2] Consultas");
            printf("[3] Modificar");
            printf("[4] Depositar");
            printf("[5] Retirar");
            printf("[6] Salir");
            printf("\nRespuesta");
            opcion = in.nextInt();
            switch(opcion)
            {
                case 1:
                    printf("Nueva Cuenta");
                    printf("------------------------");
                    cuenta(nuevoCliente);
                    break;
                case 2:
                    menuConsultas(nuevoCliente);
                    break;
                case 3:
                    boolean salida=false;
                    String nombre,domicilio,numeroCelular;
                    int edad,diaN,mesN,añoN,diaA,mesA,añoA;
                    do
                    {
                        printf("Modificación de la cuenta");
                        printf("-----------------------------");
                        printf("Información del cliente\n"+nuevoCliente.informacionCliente());
                        printf("¿Está seguro que desea modificar los datos?");
                        printf("1) Si    2) No\nRespuesta: ");
                        respuesta = in.nextInt();
                        if(respuesta == 1)
                        {
                            do
                            {
                                printf("¿Cuál es tu nombre?");
                                nombre = nombre1.nextLine();
                                printf("¿Dónde vives?");
                                domicilio = in.next();
                                printf("Fecha de nacimiento");
                                printf("Dia: ");
                                diaN=in.nextInt();
                                printf("Mes: ");
                                mesN=in.nextInt();
                                printf("Año: ");
                                añoN=in.nextInt();
                                printf("Número de celular: ");
                                numeroCelular = in.next();
                                printf("¿Cuál es tu edad?");
                                edad = in.nextInt();    

                                printf("\n\nConfirmación de la cuenta");
                                printf("Información del ciente: ");
                                printf("Nombre: "+nombre+" Domicilio: "+domicilio+" Edad: "+edad+" Fecha nacimiento: "+fecha(diaN,mesN,añoN));
                                printf("\n¿Son estos datos correctos?");
                                printf("1) Si    2) No\nRespuesta: ");
                                respuesta = in.nextInt();
                                if(respuesta == 1)
                                {
                                    nuevoCliente.setAñoN(añoN);
                                    nuevoCliente.setDiaN(diaN);
                                    nuevoCliente.setDomicilio(domicilio);
                                    nuevoCliente.setMesN(mesN);
                                    nuevoCliente.setNombre(nombre);
                                    nuevoCliente.setNumeroCelular(numeroCelular);
                                    salida = true;
                                }
                            }while(salida!=true);
                        }
                        else
                            salida = true;
                    }while(salida !=true);
                    break;
                case 4:
                    printf("Depósito");
                    printf("------------");
                    printf("Digite la cantidad a depositar: ");
                    float deposito;
                    deposito = in.nextFloat();
                    nuevoCliente.hacerDeposito(deposito);
                    printf("Saldo actual: "+nuevoCliente.getSaldo());
                    break;
                case 5:
                    printf("Retiro");
                    printf("------------");
                    printf("Digite la cantifad a retirar: ");
                    float retiro;
                    retiro = in.nextFloat();
                    if(nuevoCliente.hacerRetiro(retiro)== true)
                    {
                        printf("La cantidad de saldo actual es de: "+nuevoCliente.getSaldo());
                    }
                    else
                    {
                        printf("No dispones de esa cantidad de dinero");
                    }
                    break;
                default:
                    printf("Selecciona una opción válida");
                    break;
            }
        }while(opcion!=6);
    } 
    
    private static void cuenta(cuentaBanco nuevoCliente)
    {
        boolean salida = false;
        Scanner in = new Scanner(System.in);
        String nombre,domicilio,numeroCelular;
        int edad,diaN,mesN,añoN,diaA,mesA,añoA;
        float saldo;
        int respuesta=0,opcion;
        do
        {
            printf("¿Cuál es tu nombre?");
            nombre = in.nextLine();
            printf("¿Dónde vives?");
            domicilio = in.next();
            printf("Fecha de nacimiento");
            printf("Dia: ");
            diaN=in.nextInt();
            printf("Mes: ");
            mesN=in.nextInt();
            printf("Año: ");
            añoN=in.nextInt();
            printf("Número de celular: ");
            numeroCelular = in.next();
            printf("¿Cuál es tu edad?");
            edad = in.nextInt();
            printf("¿De cuánto es el monto en la cuenta?");
            saldo = in.nextFloat();
            if(nuevoCliente.aperturaCuenta(saldo, edad) == true)
            {
                String nombreSucursal=null;
                printf("Selecciona sucursal:");
                printf("1) Banamex    2) Santander   3) UPSIN");
                printf("Respuesta: ");
                opcion = in.nextInt();
                switch(opcion)
                {
                    case 1:
                        nombreSucursal = "Banamex";
                        break;
                    case 2:
                        nombreSucursal = "Santander";
                        break;
                    case 3:
                        nombreSucursal = "UPSIN";
                        break;
                    default:
                        printf("Selecciona una opción válida");
                        break;
                }
                printf("Fecha de apertura de la cuenta: ");
                printf("Dia: ");
                diaA=in.nextInt();
                printf("Mes: ");
                mesA=in.nextInt();
                printf("Año: ");
                añoA=in.nextInt();
                printf("\n\nConfirmación de la cuenta");
                printf("Información del ciente: ");
                printf("Nombre: "+nombre+" Domicilio: "+domicilio+" Edad: "+edad+"\nSaldo: "+saldo+" Fecha nacimiento: "+fecha(diaN,mesN,añoN));
                printf("Información de la cuenta: ");
                printf("Nombre de la sucursal: " + nombreSucursal + "  Saldo: "+saldo+ "Fecha de apertura: "+fecha(diaA,mesA,añoA));
                printf("\n¿Son estos datos correctos?");
                printf("1) Si    2) No\nRespuesta: ");
                respuesta = in.nextInt();
                if(respuesta == 1)
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
                    salida = true;
                }
            }
            else
            {
                printf("No cumples con los requisitos para abrir una cuenta");
                salida = true;
            }
        }while(salida != true);  
    }
    private static String fecha(int diaN,int mesN,int añoN)
    {
        return diaN + "/" + mesN + "/" + añoN;
    }
    private static void menuConsultas(cuentaBanco nuevoCliente)
    {
        Scanner in = new Scanner(System.in);
        int opcion;
        do
        {
            printf("Menú de Consultas");
            printf("------------------------");
            printf("\nSelecciona una opción:\n");
            printf("1) Consulta de Saldo   2) Consulta de Información del Cliente   3) Salir");
            printf("Respuesta:");
            opcion=in.nextInt();
            switch(opcion)
            {
                case 1:
                    printf("Su saldo actual es de: $"+nuevoCliente.getSaldo());
                    break;
                case 2:
                    printf("\nInformación del Cliente:\n"+nuevoCliente.informacionCliente());
                    printf("\nInformación de la Cuenta:\n"+nuevoCliente.informacionCuenta());
                    printf("\n");
                    break;
                default:
                    printf("Selecciona una opción válida");
            }   
        }while(opcion!=3);
    }
    
    private static void printf(String texto) 
    {
        System.out.println(texto);
    } 
}

  