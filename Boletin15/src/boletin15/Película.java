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
public class Película {
    
    private String actorP;
    private String actrizP;

    public String getActorP() {
        return actorP;
    }

    public String getActrizP() {
        return actrizP;
    }

    @Override
    public String toString() {
        return super.toString()+"actorP=" + actorP + ", actrizP=" + actrizP;
    }
    
    
}
