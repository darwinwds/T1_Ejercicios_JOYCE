/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_capitulo3;

/**
 *
 * @author Darwin W. Diaz Simon
 */
public class ArithmeticMethods {
    
                private Integer x= 25;
                private Integer y = 9;
                private Integer resultado;
                public   void displayNumberPlus10() {
			 resultado = y + x + 10;
			System.out.println("El resultado de la suma es: "+ resultado);
		}
		
		public  void displayNumberPlus100() {
			 resultado = x + y + 100;
			System.out.println("El resultado de la suma es: "+ resultado);
		}
		
		public  void displayNumberPlus1000() {
			resultado = x + y + 1000;
			System.out.println("El resultado de la suma es: "+ resultado);
		}
}
