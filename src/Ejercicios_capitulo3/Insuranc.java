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
public class Insuranc {
    public void CalcularPrima(Integer actual,Integer nacimiento){
        
                int aniosVida = actual - nacimiento;
		int decadas = ((int)aniosVida)/10;
		int prima = (decadas+15)*20;
		System.out.println("La prima es igual a : " + prima);
 }   
}
