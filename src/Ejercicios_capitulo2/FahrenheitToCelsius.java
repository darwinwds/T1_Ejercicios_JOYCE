/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_capitulo2;

/**
 *
 * @author Darwin W. Diaz Simon
 */
public class FahrenheitToCelsius {
        float a;
        float b;
        private Integer fahrenheit;
        
        public void conversion(Integer fahrenheit){
            a = (fahrenheit-32);
            b = (float) (a/1.80000);
             System.out.println("Los grados a convertir fueron "+fahrenheit+ " es igual a "+b);
        }
        
    
}
