/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo.proyecto.pkg2;

import java.util.Scanner;
/*Ejer 2

*/
/**
 *
 * @author alex0
 */
public class NuevoProyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double celsius;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la temperatura en Celsius que quieras convertir:");
        celsius=sc.nextDouble();
        System.out.println(celsius+"Celsius equivalen a"+(celsius*1.8+32)+"Fº y a"+(celsius+273)+"Kº");
        
        
    }  
}
