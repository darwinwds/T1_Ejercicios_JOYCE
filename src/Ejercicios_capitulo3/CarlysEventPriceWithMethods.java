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
public class CarlysEventPriceWithMethods {
    public static int solicitud() {
		Scanner in = new Scanner(System.in);

		System.out.println("Introduzca cuantas personas asistiran: ");
		int invitados = in.nextInt();
		
		return invitados;
	}

	 public static void display() {

			System.out.println("***********************************************");
			System.out.println("* Carly�s makes the food that makes it  party.* ");
			System.out.println("***********************************************");
			
	 }
	 
	 public static void logica(int invitados) {
		 boolean x; 
			
			System.out.println("Cantidad de inviados: " +invitados);
			System.out.println("Precio por huesped  : $35");
			System.out.println("Precio total :   "+(invitados*35));
			if(invitados>=50) x =true;
			else x= false;
			
			System.out.println("Este evento esta claficado como GRANDE: "+x);
	 }
    
}
