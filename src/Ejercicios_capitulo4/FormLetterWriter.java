/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_capitulo4;

/**
 *
 * @author Darwin W. Diaz Simon
 */
public class FormLetterWriter {
    public  void displaySalutation(String lastName){
		System.out.println("Dear Mr. "+lastName);
	}
	
	public  void displaySalutation(String firstName, String lastName){
		System.out.println("Dear "+firstName +" "+ lastName);
	}
	
	public  void restBussinesLetter(){
		System.out.println("Than you for you recent order!!");
	}
}
