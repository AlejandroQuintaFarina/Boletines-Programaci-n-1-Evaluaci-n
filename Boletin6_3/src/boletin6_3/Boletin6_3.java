/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_3;

import java.util.Scanner;

/**
 *
 * @author alex0
 */
public class Boletin6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         double radio;
        
        Scanner datos=new Scanner(System.in);
        System.out.println("Introduce el radio de la circunferencia: ");
        radio=datos.nextDouble();
        
        Circulo calculo=new Circulo();
        calculo.getRadio();
        calculo.setRadio(radio);
        calculo.getPi();
        calculo.calcularArea();
        calculo.calcularLongitud();

    }
    }
    

