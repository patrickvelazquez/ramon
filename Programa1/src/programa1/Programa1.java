package programa1;
import java.util.Scanner;
/*
                                     |####`--|#|---|##|---|#|--'##|#|
   _                                 |____,--|#|---|##|---|#|--.__|_|
 _|#)_____________________________________,--'EEEEEEEEEEEEEE'_=-.
((_____((_________________________,-Programing by CarlosSant47 ==)        _________
                               .--|##,----o  o  o  o  o  o  o__|/`---,-,-'=========`=+==.
                               |##|_Y__,__.-._,__,  __,-.___/ J \ .----.#############|##|
                               |##|              `-.|#|##|#|`===l##\   _\############|##|
                              =======-===l          |_|__|_|     \##`-"__,=======.###|##|
                                                                  \__,"          '======'
*/
public class Programa1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int day = 0, month = 0, year = 0, op = 0;
        Fecha hoy = new Fecha();
        do{
            System.out.println("1 - Iniciar objeto");
            System.out.println("2 - Consultar fecha");
            System.out.println("3 - Cuantos dias tiene el mes");
            System.out.println("4 - Es año biciesto");
            System.out.println("5 - Modificar Fecha");
            System.out.println("6 - Salir");
            System.out.println("Elige una opccion \n -> ");
            op = in.nextInt();
            
            switch(op)
            {
                case 1:
                    System.out.println("Dame el dia");
                    day = in.nextInt();
                    System.out.println("Dame el mes");
                    month = in.nextInt();
                    System.out.println("Dame el año");
                    year = in.nextInt();
                    hoy.setDia(day);
                    hoy.setMes(month);
                    hoy.setAño(year);
                    break;
                case 2:
                    System.out.println("La fecha es " + hoy.fechaConFormato());
                    break;
                case 3:
                    System.out.println("Los el mes numero" + hoy.getMes() + " tiene " + hoy.diasMes());
                    break;
                case 4:
                    if(hoy.isBiciesto())
                    {
                        System.out.println("El año " + hoy.getAño() + " es biciesto");
                    }
                    else
                    {
                        System.out.println("El año " + hoy.getAño() + " no es biciesto");
                    }
                    break;
                case 5:
                    do{
                        System.out.println("1 - Modificar Dia");
                        System.out.println("2 - Modificar Mes");
                        System.out.println("3 - Modificar Año");
                        System.out.println("4 - Salir");
                        System.out.println("Elige una opccion");
                        op = in.nextInt();
                        
                        switch(op)
                        {
                            case 1:
                                System.out.println("Dame el dia");
                                day = in.nextInt();
                                hoy.setDia(day);
                                break;
                            case 2:
                                System.out.println("Dame el mes");
                                month = in.nextInt();
                                hoy.setMes(month);
                                break;
                            case 3:
                                System.out.println("Dame el año");
                                year = in.nextInt();
                                hoy.setAño(year);
                            case 4:
                                break;
                            default: System.out.println("Opccion invalida");
                        }
                       
                    }while(op != 4);
                    break;
                case 6:
                    System.out.printf("Adios :) oxoxoxoxo");
                    break;
                default: System.out.println("Opccion invalida");
            }
            System.out.println("Presione cualquier boton para continuar");
            in.nextInt();
        }while(op != 6);
    }
    
}
