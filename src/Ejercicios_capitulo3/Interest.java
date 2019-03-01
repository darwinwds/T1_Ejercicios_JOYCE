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
public class Interest {
        static final double INTERES_FIJO=.05;
	static final double INTERES_DOCE_MESES=12;
    
        public void calcularInversion(double inversionInicial){
		
            
            
                double interesMensual=inversionInicial*INTERES_FIJO;
		double interesAnual=interesMensual*INTERES_DOCE_MESES;
		double total=inversionInicial+interesAnual;
                System.out.println("La inversion inicial es de "+inversionInicial+" con tasa de interes de 5% a 12 meses tu tendrias "+total);

	}
	
}
