/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_1;

import java.util.Scanner;

/**
 *
 * @author alex0
 */
public class NumPositivo {
    
    Scanner sc;
    
    public void NumPositivo(){
        
        sc =new Scanner (System.in);
        
        int num1=PedirNum();
        
        if (num1>0){
            System.out.println(num1+ " es positivo");
        }
        else if (num1<0){
            System.out.println(num1+ " es negativo");
        }
            
        
    }
    
    public int PedirNum(){
        System.out.println("Teclea el número:");
        int num=sc.nextInt();
        return num;
        
        
    }
}
