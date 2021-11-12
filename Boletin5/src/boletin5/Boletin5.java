/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5;

import java.util.Scanner;

/**
 *
 * @author alex0
 */
public class Boletin5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float km;
        float vMed;
        float litros;
        
        Scanner datos=new Scanner(System.in);
        
        System.out.println("Introduce los kilómetros recorridos:" );
        km=datos.nextFloat();
        
        System.out.println("Introduce la velocidad media:" );
        vMed=datos.nextFloat();
        
        System.out.println("Introduce los litros consumidos:" );
        litros=datos.nextFloat();
        
        Consumo consume=new Consumo();
        consume.setLitros(50);
        consume.setPgas(1.57f);
        
        Consumo consumo=new Consumo();
        consumo.setKm(km);
        consumo.setVmed(vMed);
        consumo.setLitros(litros);
        consumo.ConsumoT();
        
            

    }
    
}
