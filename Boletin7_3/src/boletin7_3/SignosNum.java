/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_3;

import java.util.Scanner;

/**
 *
 * @author alex0
 */
public class SignosNum {
    
     Scanner sc;
    
    public void SignosNum(){
        
        sc =new Scanner (System.in);
        
        int num=PedirNumSignos();
        
        if (num>0){
            System.out.println("+");
    }
        else if (num<0){
            System.out.println("-");
        }   
}
    public int PedirNumSignos(){
        System.out.println("Teclea el número:");
        int num=sc.nextInt();
        return num;
}
}
