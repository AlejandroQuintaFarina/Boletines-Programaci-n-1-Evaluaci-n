/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg6;

import java.util.Scanner;

/**
 *
 * @author alex0
 */
public class Boletin6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int velocidade;
       int acelerar;
       int frenar;
       
       System.out.println("Introduzca la velocidad:");
       velocidade=sc.nextInt();
       System.out.println("La velocidad es:"+velocidade);
       
       System.out.println("Introduzca la aceleración:");
       int valor=sc.nextInt();
       System.out.println("La velocidad actual es:"+(velocidade+valor));
       
       System.out.println("Introduzca la velocidad que quiere frenar:");
       int menos = sc.nextInt();
       System.out.println("La velocidad actual es de:"+((velocidade+valor)-menos));
      
    }
    
}
