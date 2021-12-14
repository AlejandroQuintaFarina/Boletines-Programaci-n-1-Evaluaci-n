/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

/**
 *
 * @author alex0
 */
public class Revistas extends Publicacion{
    
    private int numero;

    public Revistas() {
    }

    public Revistas(int numero) {
        super();
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "numero=" + numero;
    }
    
    
    
}
