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
public class Eggs {
                double dato;
	        double a;
	        double b;
	        double c;
	        double d;
	        double e;
    
                public double egg(double dato){
                a= (int)(dato/12);
	        b= dato%12;
	        c= 3.25*a;
	        d= .45*b;
	        e= c+d;                    
                System.out.println("Ordenaste "+dato+" eso es " +a+ " docenas de a $3.25 y "+b+" unidades de .45 centavos por un totoal de "+e );

                return 0;
                }
}
