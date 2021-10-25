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
        float euros;
        float dolar;
        float dolares;
        System.out.println("Teclee la cantidad de euros que desea cambiar:");
        euros=sc.nextFloat();
        System.out.println("Inroduzca el valor actual del dolar");
        dolar=sc.nextFloat();
        dolares=euros*dolar;
        System.out.println("Va a recibir="+dolares);
        
        
        
        
    }
    
}
