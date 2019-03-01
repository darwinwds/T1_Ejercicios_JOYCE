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
public class MetricConversion {
        static final double PULGADAS_TO_CENTIMETROS=2.54;
	static final double GALON_TO_LITROS=3.7854;
         public  void inchesTocentimeters(int num){
		
		double conversion=num*PULGADAS_TO_CENTIMETROS;
		System.out.println("El valor ingresado en centimetros es: "+conversion);
	}
	
	public  void gallonsToLiters(int num){
		double conversion=num*PULGADAS_TO_CENTIMETROS;
		System.out.println("El valor ingresado en litros es: "+conversion);
	}
}
