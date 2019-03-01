/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_capitulo10;

/**
 *
 * @author Darwin W. Diaz Simon
 */
public class Car extends Vehicle{

    public Car(Integer w, Double miles) throws CarWheelInvalidException {
		super(4, miles);
		
		if( getnWheels() != 4 ) {
			
			throw new CarWheelInvalidException(" \nEl Auto Solo Puede Tener 4 Llantas!. \n " );
			
		}
		
	}

   
    
}
