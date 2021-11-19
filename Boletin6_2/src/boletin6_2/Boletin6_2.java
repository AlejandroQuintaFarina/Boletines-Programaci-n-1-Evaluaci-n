/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_2;

/**
 *
 * @author alex0
 */
public class Boletin6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Satelite verified=new Satelite();
        verified.getSatelite();
        verified.setSatelite(121.1, 45.6, 152.0);
        verified.verPosicion();
        
    }
}
