/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_1;

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
        
        int velocidade;
        int acelerado;
        int frenado;
        Scanner datos=new Scanner(System.in);
        System.out.println("Introduce la aceleración: ");
        acelerado=datos.nextInt();
        System.out.println("Introduce la deceleración: ");
        frenado=datos.nextInt();
   
        Coche cambioV=new Coche();
        cambioV.acelerar(acelerado);
        cambioV.frenado(frenado);
    }
    
}
