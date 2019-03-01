/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_capitulo3;

import java.util.Scanner;

/**
 *
 * @author Darwin W. Diaz Simon
 */
public class SammysRentalPriceWithMethods {
    public static int minutes() {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de minutos que uso el equipo  :");
		Integer minutos = input.nextInt();
		return minutos;
	}

	public static void lemaBorde() {

		System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
		System.out.println("Ss Sammy�s makes it fun in the sun. Ss");
		System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
		System.out.println();
	}
	public static void logica(Integer minutos) {
		Integer horas =(int) (minutos/60);
		Integer minutosRestantes = (minutos%60);
		final Integer costoAlquiler = 40;
		int costoTotal = (horas*costoAlquiler) + minutosRestantes;
		System.out.println("Se ocupa el equipo por la siguiente cantidad de  Horas: "+ horas +" minutos: "+ minutosRestantes);
		System.out.println("Costo Total: "+ costoTotal);
	}
	public void estanciaRentalDemo() {
		SammysRentalPriceWithMethods objectoo = new SammysRentalPriceWithMethods();
		objectoo.lemaBorde();
	}
    
}
