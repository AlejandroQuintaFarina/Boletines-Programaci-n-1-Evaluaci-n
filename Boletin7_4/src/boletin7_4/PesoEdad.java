/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_4;

import java.util.Scanner;

/**
 *
 * @author alex0
 */
public class PesoEdad {
    
    Scanner sc;
    
    public void PesoEdad(){
        
        sc =new Scanner (System.in);
        
        int nombre1=PedirNombre1();
        int nombre2=PedirNombre2();
        short peso1=PedirPeso1();
        short peso2=PedirPeso2();
        
        if (peso1>peso2){
            System.out.println("La persona que más pesa es: "+nombre1+ " y su diferencia de peso es: "+ (peso1-peso2));
        }
        else if (peso1<peso2){
            System.out.println("La persona que más pesa es: "+nombre2+ " y su diferencia de peso es: "+ (peso2-peso1));
        }
    }
    
    
    
    public int PedirNombre1(){
        System.out.println("Introduce el nombre de la primera persona: ");
        int nombre1=sc.nextInt();
        return nombre1;
    }
    
    public short PedirPeso1(){
        System.out.println("Introduce el peso de la primera persona: ");
        short peso1=sc.nextShort();
        return peso1;
        
    }
    
    public int PedirNombre2(){
        System.out.println("Introduce el nombre de la segunda persona: ");
        int nombre2=sc.nextInt();
        return nombre2;
    }
    
    public short PedirPeso2(){
         System.out.println("Introduce el peso de la segunda persona: ");
        short peso2=sc.nextShort();
        return peso2;
    }
}
