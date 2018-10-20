package controlador;
import modelo.Factura;
import modelo.NoPerecedero;
import modelo.Perecedero;

import vista.GenerarFactura;
import vista.ProductoNoPerecedero;
import vista.ProductoPerecedero;
import vista.menuPrincipal;

import javax.swing.JFrame;

public class Main
{
    public static void main(String[] args) 
    {
        Perecedero productoP = new Perecedero();
        NoPerecedero productoNP = new NoPerecedero();
        Factura facturaNueva = new Factura();
        
        GenerarFactura vistaFactura = new GenerarFactura();
        ProductoNoPerecedero vistaNoPerecedero = new ProductoNoPerecedero();
        ProductoPerecedero vistaPerecedero = new ProductoPerecedero();
        menuPrincipal vistaPrincipal = new menuPrincipal();
       
       Controlador controlador = new  Controlador(productoP, productoNP, facturaNueva, vistaFactura, vistaNoPerecedero, vistaPerecedero,vistaPrincipal);
    }    
}
