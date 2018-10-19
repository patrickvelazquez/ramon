package practicaparaexamen;
import javax.swing.JOptionPane;

public class PracticaParaExamen 
{
    public static void main(String[] args) 
    {
        Perecedero productoP = new Perecedero();
        Factura facturaNueva = new Factura();
        NoPerecedero productoNP = new NoPerecedero();
        boolean salida = false;
        String menuOpc,aux;
        Object perecederos[] = {"Perecedero","No Perecedero"};
        Object menuPrincipal[] = {"Crear Producto","Generar Factura", "Mostrar factura","Calcular Subtotal", "Calcular Total", "Salir"};
        do
        {
            menuOpc = (String) JOptionPane.showInputDialog(null,"¿Qué deseas hacer?","Pollo loco",JOptionPane.QUESTION_MESSAGE,null,menuPrincipal,menuPrincipal[0]);
            switch(menuOpc)
            {
                case (String) "Crear Producto":
                    crearProducto(facturaNueva,productoP,productoNP);
                    break;
                case (String) "Generar Factura":
                    generarFactura(facturaNueva,productoP,productoNP);
                    break;
                case (String) "Mostrar factura":
                    aux = (String) JOptionPane.showInputDialog(null,"El producto es...","Crear producto",JOptionPane.QUESTION_MESSAGE,null,perecederos,perecederos[0]);
                    JOptionPane.showMessageDialog(null, factura(facturaNueva,productoP,productoNP,comprobadorPerecedero(aux)));
                    break;
                case (String) "Calcular Subtotal":
                    aux = (String) JOptionPane.showInputDialog(null,"El producto es...","Crear producto",JOptionPane.QUESTION_MESSAGE,null,perecederos,perecederos[0]);
                    if(comprobadorPerecedero(aux)==true)
                    {
                        JOptionPane.showMessageDialog(null, "El subtotal es: $"+productoP.precioProducto()*facturaNueva.getCantidad());
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "El subtotal es: $"+productoNP.precioProducto()*facturaNueva.getCantidad());
                    }
                    break;
                case (String) "Calcular Total":
                     aux = (String) JOptionPane.showInputDialog(null,"El producto es...","Crear producto",JOptionPane.QUESTION_MESSAGE,null,perecederos,perecederos[0]);
                    if(comprobadorPerecedero(aux)==true)
                    {
                        float iva = productoP.precioProducto()*facturaNueva.getIva();
                        float total = (productoP.precioProducto()*facturaNueva.getCantidad())+iva;
                        JOptionPane.showMessageDialog(null, "El subtotal es: $"+productoP.precioProducto()*facturaNueva.getCantidad()+"\nEl impuesto es: $"+productoP.precioProducto()*facturaNueva.getIva()+
                                "\nTotal a pagar es: $"+total);
                    }
                    else
                    {
                        float iva = productoNP.precioProducto()*facturaNueva.getIva();
                        float total = (productoNP.precioProducto()*facturaNueva.getCantidad())+iva;
                        JOptionPane.showMessageDialog(null, "El subtotal es: $"+productoNP.precioProducto()*facturaNueva.getCantidad()+"\nEl impuesto es: $"+productoNP.precioProducto()*facturaNueva.getIva()+
                                "\nTotal a pagar es: $"+total);
                    }
                    break;
                case (String) "Salir":
                    JOptionPane.showMessageDialog(null, "           Vuelva pronto :)");           
                    salida = true;
                    break;
            }
        }while(salida == false);
    }
    
    private static void crearProducto(Factura facturaNueva,Perecedero productoP,NoPerecedero productoNP)
    {
        Object perecederos[] = {"Perecedero","No Perecedero"};
        Object unidad[] = {"Kilogramos","Litros","Piezas"};
        int idProducto,unidadProducto=1,facturas;
        String nombreProducto,loteFabricacion,aux,fechaCaducidad;
        float precioUnitario, temperatura=0;

        aux = (String) JOptionPane.showInputDialog(null,"Ingrese ID del Producto","Crear producto",JOptionPane.QUESTION_MESSAGE);
        idProducto = Integer.parseInt(aux);
        aux = (String) JOptionPane.showInputDialog(null,"Ingrese unidad del producto","Crear producto",JOptionPane.QUESTION_MESSAGE,null,unidad,unidad[0]);
        switch(aux)
        {
            case (String) "Kilogramos":
                unidadProducto = 1;
                break;
            case (String) "Litros":
                unidadProducto = 2;
                break;
            case (String) "Piezas":
                unidadProducto = 3;
                break;
        }
        nombreProducto = (String) JOptionPane.showInputDialog(null,"Ingrese nombre del producto","Crear producto",JOptionPane.QUESTION_MESSAGE);
        aux = (String) JOptionPane.showInputDialog(null,"Ingrese el precio unitario","Crear producto",JOptionPane.QUESTION_MESSAGE);
        precioUnitario = Float.parseFloat(aux);
        
        aux = (String) JOptionPane.showInputDialog(null,"El producto es...","Crear producto",JOptionPane.QUESTION_MESSAGE,null,perecederos,perecederos[0]);
        if(comprobadorPerecedero(aux)==true)
        {
            fechaCaducidad = (String) JOptionPane.showInputDialog(null,"Introduzca fecha de caducidad","Crear producto",JOptionPane.QUESTION_MESSAGE);
            aux = (String) JOptionPane.showInputDialog(null,"Introduzca la temperatura","Crear producto",JOptionPane.QUESTION_MESSAGE);
            temperatura = Float.parseFloat(aux);
            productoP.setFechaCaducidad(fechaCaducidad);
            productoP.setIdProducto(idProducto);
            productoP.setNombreProducto(nombreProducto);
            productoP.setPrecioUnitario(precioUnitario);
            productoP.setTemperatura(temperatura);
            productoP.setUnidadProducto(unidadProducto);
        }
        else
        {
            loteFabricacion = (String )JOptionPane.showInputDialog(null,"Ingrese el lote del producto.","Crear producto",JOptionPane.QUESTION_MESSAGE);
            productoNP.setIdProducto(idProducto);
            productoNP.setLoteFabricacion(loteFabricacion);
            productoNP.setNombreProducto(nombreProducto);
            productoNP.setPrecioUnitario(precioUnitario);
            productoNP.setUnidadProducto(unidadProducto);
        }
        facturas = JOptionPane.showConfirmDialog(null, "¿Desea generar factura?");
        if(facturas == JOptionPane.YES_OPTION)
            generarFactura(facturaNueva,productoP,productoNP);
        JOptionPane.showMessageDialog(null, "Producto creado con éxito");
    }
    private static void generarFactura(Factura facturaNueva,Perecedero productoP,NoPerecedero productoNP)
    {
        String rfc,nombreCliente,domicilio,aux;
        float iva;
         int numeroNota=0,cantidad,tipoPago=1;
        String  fecha,concepto; 
        
        numeroNota++;
        Object perecederos[] = {"Perecedero","No Perecedero"};
        Object Pago[]={"Tarjeta de crédito","Efectivo"};
        rfc = (String) JOptionPane.showInputDialog(null,"Introduzca su RFC","Generar factura",JOptionPane.QUESTION_MESSAGE);
        nombreCliente = (String) JOptionPane.showInputDialog(null,"Introduzca su nombre","Generar factura",JOptionPane.QUESTION_MESSAGE);
        domicilio = (String) JOptionPane.showInputDialog(null,"Introduzca su domicilio","Generar factura",JOptionPane.QUESTION_MESSAGE);
        aux = (String) JOptionPane.showInputDialog(null,"Introduzca IVA","Generar factura",JOptionPane.QUESTION_MESSAGE);
        iva = Float.parseFloat(aux);
        aux = (String) JOptionPane.showInputDialog(null,"Ingrese cantidad de producto","Generar factura",JOptionPane.QUESTION_MESSAGE);
        cantidad = Integer.parseInt(aux);
        aux = (String) JOptionPane.showInputDialog(null,"Seleccione método de pago","Crear producto",JOptionPane.QUESTION_MESSAGE,null,Pago,Pago[0]);
        switch(aux)
        {
            case "Tarjeta de crédito":
                tipoPago = 2;
                break;
            case "Efectivo":
                tipoPago = 1;
                break;
        }
        fecha = (String) JOptionPane.showInputDialog(null,"Introduzca fecha","Generar factura",JOptionPane.QUESTION_MESSAGE);
        concepto = JOptionPane.showInputDialog(null,"Introduzca concepto","Generar factura",JOptionPane.QUESTION_MESSAGE);
        facturaNueva.setCantidad(cantidad);
        facturaNueva.setConcepto(concepto);
        facturaNueva.setDomicilio(domicilio);
        facturaNueva.setFecha(fecha);
        facturaNueva.setIva(iva);
        facturaNueva.setNombreCliente(nombreCliente);
        facturaNueva.setNumeroNota(numeroNota);
        facturaNueva.setNumeroNota(numeroNota);
        facturaNueva.setRfc(rfc);
        facturaNueva.setTipoPago(tipoPago);
          
        aux = (String) JOptionPane.showInputDialog(null,"El producto es...","Crear producto",JOptionPane.QUESTION_MESSAGE,null,perecederos,perecederos[0]);
        JOptionPane.showMessageDialog(null, factura(facturaNueva,productoP,productoNP,comprobadorPerecedero(aux)));
    }
    private static String factura(Factura facturaNueva,Perecedero productoP,NoPerecedero productoNP,boolean perecederos)
    {
        String aux;
  
        if(perecederos == true)
        {
            if(facturaNueva.getTipoPago()==1)
            {
                aux = "Datos de la factura\n--------------\n\n"+"Número nota: "+facturaNueva.getNumeroNota()+"\nCantidad: "+facturaNueva.getCantidad()+"\nTipo de pago: Efectivo"+"\nFecha: "+facturaNueva.getFecha()+"\nConcepto: "+facturaNueva.getConcepto()+
                    "\nRFC: "+facturaNueva.getRfc()+"\nNombre del cliente: "+facturaNueva.getNombreCliente()+"\nDomicilio fiscal: "+facturaNueva.getDomicilio()+
                "\nIVA: "+facturaNueva.getIva()+"\nDatos del producto\n----------------------\nTipo de producto: Perecedero"+"\nID Producto: "+productoP.getIdProducto()+"'\nUnidad del producto: "+productoP.getUnidadProducto()+
                     "\nNombre del producto: "+productoP.getNombreProducto()+"\nFecha caducidad: "+productoP.getFechaCaducidad()+"\nTemperatura: "+productoP.getTemperatura()+"\nPrecio del producto: " + productoP.precioProducto();
            }
            else
            {
                aux = "Datos de la factura\n--------------\n\n"+"Número nota: "+facturaNueva.getNumeroNota()+"\nCantidad: "+facturaNueva.getCantidad()+"\nTipo de pago: Tarjeta de crédito"+"\nFecha: "+facturaNueva.getFecha()+"\nConcepto: "+facturaNueva.getConcepto()+
                    "\nRFC: "+facturaNueva.getRfc()+"\nNombre del cliente: "+facturaNueva.getNombreCliente()+"\nDomicilio fiscal: "+facturaNueva.getDomicilio()+
                "\nIVA: "+facturaNueva.getIva()+"\nDatos del producto\n----------------------\nTipo de producto: Perecedero"+"\nID Producto: "+productoP.getIdProducto()+"'\nUnidad del producto: "+productoP.getUnidadProducto()+
                     "\nNombre del producto: "+productoP.getNombreProducto()+"\nFecha caducidad: "+productoP.getFechaCaducidad()+"\nTemperatura: "+productoP.getTemperatura()+"\nPrecio del producto: " + productoP.precioProducto();
            }
        }
        else
        {
            if(facturaNueva.getTipoPago()==1)
            {
                aux = "Datos de la factura\n--------------\n\n"+"Número nota: "+facturaNueva.getNumeroNota()+"\nCantidad: "+facturaNueva.getCantidad()+"\nTipo de pago: Efectivo"+"\nFecha: "+facturaNueva.getFecha()+"\nConcepto: "+facturaNueva.getConcepto()+
                    "\nRFC: "+facturaNueva.getRfc()+"\nNombre del cliente: "+facturaNueva.getNombreCliente()+"\nDomicilio fiscal: "+facturaNueva.getDomicilio()+
                "\nIVA: "+facturaNueva.getIva()+"\nDatos del producto\n----------------------\nTipo de producto: No Perecedero"+"\nID Producto: "+productoNP.getIdProducto()+"\nUnidad del producto: "+productoNP.getUnidadProducto()+
                    "\nNombre del producto: "+productoNP.getNombreProducto()+"\nLote de Fabricación: "+productoNP.getLoteFabricacion()+"\nPrecio del producto: "+productoNP.precioProducto();
            }
            else
            {
                aux = "Datos de la factura\n--------------\n\n"+"Número nota: "+facturaNueva.getNumeroNota()+"\nCantidad: "+facturaNueva.getCantidad()+"\nTipo de pago: Tarjeta de crédito"+"\nFecha: "+facturaNueva.getFecha()+"\nConcepto: "+facturaNueva.getConcepto()+
                    "\nRFC: "+facturaNueva.getRfc()+"\nNombre del cliente: "+facturaNueva.getNombreCliente()+"\nDomicilio fiscal: "+facturaNueva.getDomicilio()+
                "\nIVA: "+facturaNueva.getIva()+"\nDatos del producto\n----------------------\nTipo de producto: No Perecedero"+"\nID Producto: "+productoNP.getIdProducto()+"\nUnidad del producto: "+productoNP.getUnidadProducto()+
                    "\nNombre del producto: "+productoNP.getNombreProducto()+"\nLote de Fabricación: "+productoNP.getLoteFabricacion()+"\nPrecio del producto: "+productoNP.precioProducto();
            }
        }
        return aux;
    }
    private static boolean comprobadorPerecedero(String aux)
    {
        boolean salida = false;
        if(aux.equals("Perecedero"))
            salida = true;
        return salida;
    }
}
