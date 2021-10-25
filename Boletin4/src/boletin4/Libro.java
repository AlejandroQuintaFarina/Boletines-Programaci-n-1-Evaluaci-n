/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4;

/**
 *
 * @author alex0
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int año;
    private short numPaginas;
    private float valoracion;
    
    //Constructores
    public Libro(){    
    }
    public Libro (String tit, String aut, int a, short nump){
        titulo=tit;
        autor=aut;
        año=a;
        numPaginas=nump;
    } 
    
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public int getAño(){
        return año;
    }
    public void setAño(int año){
        this.año=año;
    }
    public short getNump(){
        return numPaginas;
    }
    public void setNump(short numPaginas){
        this.numPaginas=numPaginas;
    }
    
    public void amosar(){
        System.out.println("Titulo;"+titulo+"\n Autor:"+autor+"\n Año:"+año+"\n Número de páginas:"+numPaginas);
    }
        
      
    
    
   
}
