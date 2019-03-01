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
public class PaintCalculator {
  public void calcularArea(double longitud, double ancho, double altura) {
		double areaParedGrande = longitud * altura;
		double areaParedChica = ancho * altura;
		double AreaTotal = (areaParedChica + areaParedGrande) * 2;
		double galones= AreaTotal/350;
                
		double gal= AreaTotal*galones;
                System.out.println("La habitaci�n de "  + longitud + " por " + ancho + " pies con una altura de " + altura
				+ " pies cuesta $ " + (gal*32));
	}
      
        
        
}
