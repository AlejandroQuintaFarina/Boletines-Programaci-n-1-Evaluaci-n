/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_5;

import java.util.Scanner;

/**
 *
 * @author alex0
 */
public class VerNumeroMayor {
    
    Scanner sc;
    
    public void VerNumeroMayor (){
        
        sc= new Scanner (System.in);
        
        int num1= PedirNum1();
        int num2= PedirNum2();
        int num3= PedirNum3();
        
         
        //parte derecha del ordinograma
        if (num1>num2 & num1>num3){
            System.out.println("El número mayor es:" +num1);    
        }
        
        else if (num1>num2 & num1<num3){
            System.out.println("El número mayor es:" +num3);
        }
        //parte izquierda del ordinograma
        else if (num1<num2 & num2>num3){
            System.out.println("El número mayor es:" +num2);
        } 
        
        else if (num1<num2 & num2<num3){
            System.out.println("El número mayor es:" +num3);
        }
     
    }
    
    public int PedirNum1(){
       System.out.println("Inroduzca el primer número:"); 
       int num1=sc.nextInt();
       return num1;   
    }
    
    public int PedirNum2(){
        System.out.println ("Introduzca el segundo número:");
        int num2=sc.nextInt();
        return num2;
    }
    
    public int PedirNum3(){
        System.out.println("Introduzca el tercer número:");
        int num3=sc.nextInt();
        return num3;
    }
}
