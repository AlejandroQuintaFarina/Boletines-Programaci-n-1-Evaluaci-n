/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo.proyecto.pkg2;

import java.util.Scanner;

/**
 *
 * @author alex0
 */
public class NuevoProyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int entero;
        String frase;
        //para leer instancio un objeto tipo escaner, utilizando un constructor
        Scanner sc = new   Scanner(System.in);
        /*System.out.println("teclea un número entero:");
        entero= sc.nextInt();
        System.out.println("entero="+entero);
        
        System.out.println("teclea un número decimal:");
        float decimal=sc.nextFloat();
        System.out.println("decimal="+decimal)*/

        System.out.println("teclea una frase:");
        frase=sc.nextLine();
        System.out.println("con next line()--->"+frase);
        frase=sc.next();
        System.out.println("con next()--->"+frase);
        
        
    }
    
}
