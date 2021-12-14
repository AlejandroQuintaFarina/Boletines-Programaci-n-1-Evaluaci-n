/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

/**
 *
 * @author alex0
 */
public class Multimedia {
    
    private String titulo;
    private String autor;
    private String formato;
    private float duracion;

    public Multimedia() {
    }

    public Multimedia(String titulo, String autor, String formato, float duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public float getDuración() {
        return duracion;
    }

    public void setDuración(float duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", autor=" + autor + ", formato=" + formato + ", duracion=";
    }
    
    
    
}
