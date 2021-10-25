/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo.proyecto.pkg2;

import java.util.Scanner;
/*Ejer 3

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
       long numbilletes100;
       long numbilletes20;
       long numbilletes5;
       long nummonedas1;
       Scanner sc=new Scanner(System.in);
       System.out.println("Introduce la cantidad de billetes de 100");
       numbilletes100=sc.nextInt();
       System.out.println("Introduce la cantidad de billetes de 20");
       numbilletes20=sc.nextInt();
       System.out.println("Introduce la cantidad de billetes de 5");
       numbilletes5=sc.nextInt(); 
       System.out.println("Introduce la cantidad de monedas de 1");
       nummonedas1=sc.nextInt();
       System.out.println("Tu cantidad total de euros es de"+(100*numbilletes100+20*numbilletes20+5*numbilletes5+nummonedas1));
    }  
}
