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
public class RentalDemo {
    private static Scanner input = new Scanner(System.in);

	public static int minutes() {
		// Scanner input = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de minutos que uso el equipo  :");
		Integer minutos = input.nextInt();
		return minutos;
	}

	public static String contractNnumber() {
		System.out.println("Ingrese el numero de contrato :  ");
		input.nextLine();
		String contractNumber = input.nextLine();
		return contractNumber;
	}

	public static void main(String[] args) {
		 Integer minutoos = minutes();
		 String contractNnumber = contractNnumber();
		Rental object = new Rental();
		object.setContractNnumber(contractNnumber);
		object.setHoursAndMinutes(minutoos);
		new SammysRentalPriceWithMethods().lemaBorde();
		System.out.println(object.toString()); 
	}
    
}
