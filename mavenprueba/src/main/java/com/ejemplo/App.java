package com.ejemplo;

import com.ControladorDNI;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ControladorDNI controlador = new ControladorDNI();
        
        boolean esValido1 = controlador.esValido("81440286T");
        System.out.println("81440286T -->" + esValido1);
        
        boolean esValido2 = controlador.esValido("81440286R");
        System.out.println("81440286R -->" + esValido2);
        
        
    }
}
