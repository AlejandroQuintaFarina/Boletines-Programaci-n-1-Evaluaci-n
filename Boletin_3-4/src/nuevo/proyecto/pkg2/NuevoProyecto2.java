/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo.proyecto.pkg2;

import java.util.Scanner;
/*Ejer 4

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
       long euros;
       Scanner sc=new Scanner(System.in);
       System.out.println("Introduce el número entero total de euros");
       euros=sc.nextInt();
       long resto1=euros%100;
       long resto2=resto1%20;
       long resto3=resto2%5;
       System.out.println("Tu cantidad entera total de euros se dividirá en\n"+(euros/100)+" billetes de 100€\n"+(resto1/20)+" billetes de 20€\n"+(resto2/5)+" billetes de 5€\n"+(resto3/1)+" monedas de 1€");
               
               }
               }
