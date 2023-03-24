/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Validaciones {
    public String validarEnteros(String numero){
        
   for(int x=0; x < numero.length(); x++){
    //JOptionPane.showMessageDialog(null,numero.charAt(x));
    int c=0;
    String a="";
    if (numero.charAt(x)=='.'){
    c++;
       
   }
    if (c == 1){
      a= "decimal";
    }else if(c == 1){
        a= "entero";
    }
    return a;
}
}
}



   
