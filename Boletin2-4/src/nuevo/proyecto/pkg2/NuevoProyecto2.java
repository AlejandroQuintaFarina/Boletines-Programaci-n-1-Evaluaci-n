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
        float n1;
        float n2;
        
        System.out.println("introduzca el valor a sumar:");
        n1=sc.nextFloat();
        System.out.println("introduzca el otro valor a sumar:");
        n2=sc.nextFloat();
        float suma=n1+n2;
        System.out.println("El resultado de la suma es="+suma);
        
        System.out.println("introduzca uno de los valores a restar:");
        n1=sc.nextFloat();
        System.out.println("introduzca el otro valor a restar:");
        n2=sc.nextFloat();
        float resta=n1-n2;
        System.out.println("El resultado es ="+resta);
        
        System.out.println("introduzca uno de los valores a restar:");
        n2=sc.nextFloat();
        System.out.println("introduzca el otro valor a restar:");
        n1=sc.nextFloat();
        float restas=n1-n2;
        System.out.println("El resultado es ="+restas);
        
        System.out.println("introduzca uno de los valores a multiplicar:");
        n1=sc.nextFloat();
        System.out.println("introduzca el otro valor a multiplicar:");
        n2=sc.nextFloat();
        float solucion=n1*n2;
        System.out.println("el resultado de la multiplicacion es="+solucion);
        
        System.out.println("introduzca uno de los dividendos:");
        n1=sc.nextFloat();
        System.out.println("Introduzca el otro dividendo:");
        n2=sc.nextFloat();
        float cociente=n1/n2;
        System.out.println("El cociente es="+cociente);
        
         System.out.println("introduzca uno de los dividendos:");
        n2=sc.nextFloat();
        System.out.println("Introduzca el otro dividendo:");
        n1=sc.nextFloat();
        float cocientes=n1/n2;
        System.out.println("El cociente es="+cocientes);
        
                
                
                
        
        
        
                
        
        
    }
    
}
