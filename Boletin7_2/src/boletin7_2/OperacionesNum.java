/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_2;

import java.util.Scanner;

/**
 *
 * @author alex0
 */
public class OperacionesNum {
    
    Scanner sc;
    
    public void OperacionesNum(){
        
        sc=new Scanner(System.in);
        
        short num1=PedirNum1();
        short num2=PedirNum2();
        
        if (num1>=num2){
            System.out.print("El resultado de la resta es: "+(num1-num2));
        }
            System.out.println("  El resultado de su suma es: "+(num1+num2));    
    }
    
    public short PedirNum1(){
        System.out.println("Introduzca el primer número:");
        short num1= sc.nextShort();
        return num1;
    }
    
    public short PedirNum2(){
        System.out.println("Introduzca el segundo número:");
        short num2=sc.nextShort();
        return num2;
    }
}
