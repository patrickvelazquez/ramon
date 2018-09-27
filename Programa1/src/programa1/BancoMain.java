package programa1;

import java.util.Scanner;

public class BancoMain {



    public static void main(String[] agrs)
    {
        int numCuenta = 0, monto = 0, edad = 0, op = 0;
        String nombre, sucursal, fechaAper, fechaNac, domicilio = "";
        float saldo = 0.0f;

        Scanner in = new Scanner(System.in);
        CuentaBanco cuenta = new CuentaBanco();


        do{
            System.out.println("1 - Crear Cuenta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Retirar");
            System.out.println("4 - Consultar Saldo");
            System.out.println("5 - Editar Cuenta");
            System.out.println("6 - Mostrar informacion del cliente");
            System.out.println("7 - Salir");
            System.out.println("Elige una opccion");

            op = in.nextInt();
            switch (op)
            {
                case 1:
                    System.out.println("Introduce el numero de la cuenta");
                    numCuenta = in.nextInt();
                    System.out.println("Introduce la sucursal");
                    sucursal = in.next();
                    System.out.println("Introduce la fecha de apertura");
                    fechaAper = in.next();
                    System.out.println("Introduce el nombre");
                    nombre = in.next();
                    System.out.println("Introduce la fecha de nacimiento");
                    fechaNac = in.next();
                    System.out.println("Introduce el deposito de 1000 MXN o  mas");
                    monto = in.nextInt();
                    System.out.println("Introduce la edad (mayor de 18)");
                    edad = in.nextInt();
                    System.out.println("Introduce el domicilio");
                    domicilio = in.next();
                    if(cuenta.crearCuenta(nombre, monto, fechaAper, edad, fechaNac, domicilio))
                    {
                        cuenta.setNumCueta(numCuenta);
                        cuenta.setSucursal(sucursal);
                    }
                    else
                    {
                        System.out.println("Error al crear la cuenta");
                    }

                    break;
                case 2:
                    System.out.println("Introduce la cantidad a depositar");
                    saldo = in.nextInt();
                    cuenta.depositarFondos(saldo);
                    break;
                case 3:
                    System.out.println("Introduce la cantidad a retirar");
                    monto = in.nextInt();
                    if(!cuenta.retirarFondos(monto))
                    {
                        System.out.println("No hay suficientes fondos");
                    }
                    break;
                case 4:
                    System.out.println("El saldo es de $" + cuenta.consultarSaldo() + " MXN");
                    break;
                case 5:
                    do {
                        System.out.println("1 - Editar nombre");
                        System.out.println("2 - Editar fecha de apertura");
                        System.out.println("3 - Editar fecha de nacimiento");
                        System.out.println("4 - Editar sucursal");
                        System.out.println("5 - Editar numero de cuenta");
                        System.out.println("6 - Editat domicilio");
                        System.out.println("7 - Salir");
                        System.out.println("Elige una opccion");
                        op = in.nextInt();
                        switch (op)
                        {
                            case 1:
                                System.out.println("Introduce el nombre del cliente de la cuenta");
                                nombre = in.next();
                                cuenta.setNombreCliente(nombre);
                                break;
                            case 2:
                                System.out.println("Introduce la fecha de apertura");
                                fechaAper = in.next();
                                cuenta.setFechaApertura(fechaAper);
                                break;
                            case 3:
                                System.out.println("Introduce la fecha de nacimiento");
                                fechaNac = in.next();
                                cuenta.setFechaNacimiento(fechaNac);
                                break;
                            case 4:
                                System.out.println("Introduce la sucursal");
                                sucursal = in.next();
                                cuenta.setSucursal(sucursal);
                                break;
                            case 5:
                                System.out.println("Introduce el numero de la cuenta");
                                numCuenta = in.nextInt();
                                cuenta.setNumCueta(numCuenta);
                                break;
                            case 6:
                                System.out.println("Introduce el domicilio");
                                domicilio = in.next();
                                cuenta.setDomicilio(domicilio);
                                break;
                            case 7:
                                break;
                            default: System.out.println("Opccion invalida");
                        }
                    }while (op != 7);
                    op = 0;
                    break;
                case 6:
                    System.out.println(cuenta.getNombreCliente() + " Nacio el " + cuenta.getFechaNacimiento() + " con domicilio en " + cuenta.getDomicilio());
                    break;
                case 7:
                    System.out.println("Adios 7u7");
                    break;
                default: System.out.println("Opccion invalida");
            }

        }while (op != 7);

    }
}
