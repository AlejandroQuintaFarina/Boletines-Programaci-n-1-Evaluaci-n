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
    Scanner sc = new   Scanner(System.in);
        
    float millanautica;
    float metros;
    float operacion;
    
    
    metros=1852;
    System.out.println("Introduzca las millas:");
    millanautica=sc.nextFloat();
    operacion=millanautica*metros;
    System.out.println(millanautica+"millas equivalen a " +operacion+"metros");
    
                
                
                
        
        
        
                
        
        
    }
    
}
