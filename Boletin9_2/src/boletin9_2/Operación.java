/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

/**
 *
 * @author alex0
 */
public class Operación {
    
     int suma=0;
    double producto=1;
    
    public void Suma(){
        for(int i=10; i<=90; i++ ){
            suma=i+suma;
            
        }
        System.out.println(suma);
    }
    public void Producto(){
        for(int i=10; i<=90; i++){
            producto=i*producto;
        }
        System.out.println(producto);
    }
    
}
