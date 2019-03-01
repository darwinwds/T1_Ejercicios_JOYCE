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
public class Salary {
    public  void pagoHorasExtras(double tarifaPorHora, double horasRegulares, double horasExtras){
		
		double pagoTotalRegular= horasRegulares*tarifaPorHora;
		double pagoTotalExtra= horasExtras*(1.5*tarifaPorHora);
		double pagoFinal=pagoTotalRegular+pagoTotalExtra;
		 System.out.println("El pago semanal para el empleado es: "+pagoFinal);
		
		
	}
    
}
