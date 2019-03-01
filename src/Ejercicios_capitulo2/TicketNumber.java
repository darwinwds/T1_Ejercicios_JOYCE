/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_capitulo2;

import java.util.Scanner;

/**
 *
 * @author Darwin W. Diaz Simon
 */
public class TicketNumber {
    
 
   
    public void Ticket(String codigo){
        
		int Intcodigo = Integer.parseInt(codigo.substring(0, codigo.length()-1));
		int ultimoDigito = Integer.parseInt(codigo.substring((codigo.length()-1)));
		int resto = Intcodigo%7;
		System.out.println(Intcodigo);
		System.out.println(resto);
		
		if(resto == ultimoDigito) {
                    
			System.out.println("Ticket Valido");
		}else {
			System.out.println("Ticket Invalido");
    }
    }
}
    

