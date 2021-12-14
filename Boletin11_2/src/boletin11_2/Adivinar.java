/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11_2;

import javax.swing.JOptionPane;

/**
 *
 * @author alex0
 */
public class Adivinar {
    
    public void Adivina(){
    int numOculto;
    int numPosible;
    int continuar;
    int intentos;
do{
numOculto=(int)(Math.random()*50);
intentos=Integer.parseInt(JOptionPane.showInputDialog(null, "Teclea el número de intentos: "));
for (int i=0;i<intentos;i++){
numPosible=Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe el número que creas entre 0-50: "));
if (numOculto==numPosible){
    JOptionPane.showMessageDialog(null, "Has acertado");
    break;
}
else{
    if (numOculto<numPosible){
        JOptionPane.showMessageDialog(null, "El número  adivinar es menor");
    }
    else{
        JOptionPane.showMessageDialog(null, "El número a adivinar es mayor");
    }
}
}
continuar= Integer.parseInt(JOptionPane.showInputDialog("Deseas volver a Jugar? \n SI=1     NO=0"));
}while(continuar==1);
JOptionPane.showMessageDialog(null, "Gracias por jugar.");
}
    
}
