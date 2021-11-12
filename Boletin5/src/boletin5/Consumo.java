/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5;

/**
 *
 * @author alex0
 */
public class Consumo {
    
    //atributos
    
    public float km;
    public float litros;
    public float vMed;
    public float pGas;
    
    //constructores
    
    public void consumo(){
    }
    
    public void consumo (float km, float litros, float vMed, float pGas){
        this.km=km;
        this.litros=litros;
        this.vMed=vMed;
        this.pGas=pGas;
    }
        
    public float getTiempo(){
        return km/vMed;
    }
 
    public float consumoMedio(){
        return 100*litros/km;
    }
    
    public float consumoEuros(){
        return litros*pGas*100/km;
    }
    
    public void setKm(float km){
        this.km=km;
    }
 
    public void setLitros(float vMed){
        this.litros=litros;
    }
    
    public void setVmed(float vMed){
        this.vMed=vMed;
    }
    
    public void setPgas(float pGas){
        this.pGas=pGas;
    }
    
    public void ConsumoT(){
        System.out.println("El consumo medio cada 100km fué de:" +100*litros/km+ "litros y la velocidad media fué de:" +vMed);
    }
    
}
