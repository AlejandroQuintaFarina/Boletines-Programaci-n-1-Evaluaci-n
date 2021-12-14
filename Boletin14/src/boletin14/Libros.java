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
public class Libros extends Publicacion{
    
    private boolean prestados;

    public Libros() {
    }

    public Libros(boolean prestados) {
        this.prestados = prestados;
    }

    public boolean getPrestados() {
        return prestados;
    }

    public void setPrestados(boolean prestados) {
        this.prestados = prestados;
    }

    @Override
    public String toString() {
        return "prestados=" + prestados;
    }
    
    
    
}
