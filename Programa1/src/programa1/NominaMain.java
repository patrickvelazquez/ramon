package programa1;

import java.util.Scanner;

public class NominaMain {

    public static void main(String[] args)
    {
        //2017030777
        int numNomina = 0, diasTrabajados=0, nivel= 0, puesto = 0, op = 0, numHijos = 0;
        String nombre = "";
        float sueldo = 0.0f;
        Scanner in = new Scanner(System.in);
        Nomina nomina = new Nomina();

        do{
            System.out.println("1 - Crear Nomina");
            System.out.println("2 - Calcular Sueldo");
            System.out.println("3 - Calcular Bono");
            System.out.println("4 -Calcular Total a pagar");
            System.out.println("5 - Modificar Nomina");
            System.out.println("6 - Salit");
            System.out.println("Elige una opccion");
            op = in.nextInt();

            switch (op)
            {
                case 1:
                    System.out.println("Dame el numero de nomina");
                    numNomina = in.nextInt();
                    System.out.println("Dame el nombre del empleado");
                    nombre = in.next();
                    System.out.println("Dame los dias trabajados");
                    diasTrabajados = in.nextInt();
                    System.out.println("Dame el sueldo");
                    sueldo = in.nextFloat();
                    do {
                        System.out.println("Dame el puesto 1 -Auxiliar 2-Albañil 3 - Ing de Obra");
                        puesto = in.nextInt();
                    }while (puesto < 1 || puesto > 3);

                    do{
                        System.out.println("Dame el nivel 1 - base 2 - Eventual");
                        nivel = in.nextInt();
                    }while (nivel < 1 || nivel > 2);

                    nomina.setNombreEmpleado(nombre);
                    nomina.setDiasTrabajados(diasTrabajados);
                    nomina.setNumNomina(numNomina);
                    nomina.setSueldo(sueldo);
                    nomina.setPuesto(puesto);
                    nomina.setNivel(nivel);
                    break;
                case 2:
                    System.out.println("El sueldo total es de $" + nomina.calcularSueldo()+ "\n\n");
                    break;
                case 3:
                    System.out.println("Introduce el numero de hijos");
                    numHijos = in.nextInt();
                    System.out.println(" El bono es de $" + nomina.calcularBono(numHijos));

                    break;
                case 4:
                    System.out.println("Introduce el numero de hijos para el bono");
                    numHijos = in.nextInt();
                    System.out.println("Empleado " + nomina.getNombreEmpleado());
                    System.out.println("Dias trabajados " + nomina.getDiasTrabajados());
                    System.out.println("Sueldo Base " + nomina.getSueldo());
                    System.out.println("El sueldo total es de $" + nomina.calcularSueldo());
                    System.out.println(" El bono es de $" + nomina.calcularBono(numHijos));
                    System.out.println("Impuesto es de $" + nomina.calcularImpuesto());
                    float total = (nomina.calcularSueldo() + nomina.calcularBono(numHijos)) - nomina.calcularImpuesto();
                    System.out.println("El total a pagat es de $" + total + "\n\n");
                    break;
                case 5:
                    do{
                        System.out.println("1 - Editar Numero de nomina");
                        System.out.println("2 - Editar Nombre");
                        System.out.println("3 - Editar Sueldo Base");
                        System.out.println("4 - Editar Dias Trabajados");
                        System.out.println("5 - Editar Nivel");
                        System.out.println("6 - Editar Puesto");
                        System.out.println("7 - Salir");
                        System.out.println("Elige una opccion");
                        op = in.nextInt();
                        switch (op)
                        {
                            case 1:
                                System.out.println("Dame el numero de nomina");
                                numNomina = in.nextInt();
                                nomina.setNumNomina(numNomina);
                                break;
                            case 2:
                                System.out.println("Dame el nombre del empleado");
                                nombre = in.next();
                                nomina.setNombreEmpleado(nombre);
                                break;
                            case 3:
                                System.out.println("Dame el sueldo");
                                sueldo = in.nextFloat();
                                nomina.setSueldo(sueldo);
                                break;
                            case 4:
                                System.out.println("Dame los dias trabajados");
                                diasTrabajados = in.nextInt();
                                nomina.setDiasTrabajados(diasTrabajados);
                                break;
                            case 5:
                                do{
                                    System.out.println("Dame el nivel 1 - base 2 - Eventual");
                                    nivel = in.nextInt();
                                }while (nivel < 1 || nivel > 2);
                                nomina.setNivel(nivel);
                                break;
                            case 6:
                                do {
                                    System.out.println("Dame el puesto 1 -Auxiliar 2-Albañil 3 - Ing de Obra");
                                    puesto = in.nextInt();
                                }while (puesto < 1 || puesto > 3);
                                nomina.setPuesto(puesto);
                                break;
                            case 7:
                                break;
                            default: System.out.println("Opccion lnvalida");

                        }

                    }while (op != 7);
                    op = 0;
                    break;
                case 6:
                    System.out.println("Adios uwu");
                    break;
                default: System.out.println("Opccion invalida");

            }
            System.out.println("Presione cualquier tecla");
            in.next();//PRESIONE UNA TECLA Y DESPUES ENTER
        }while (op != 6);


    }



}
