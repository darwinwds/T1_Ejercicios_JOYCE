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
public class Sandwich {
    static final int NUM_SLIDE_SANDWICH=2;
	
	private Bread bread;
	private SandwichFilling sandwichFill;
	
	
	public Sandwich(Bread bread, SandwichFilling sandwichFill){
		
		this.bread=bread;
		this.sandwichFill=sandwichFill;
		
		
	}


	public Bread getBread() {
		return bread;
	}


	public SandwichFilling getSandwichFill() {
		return sandwichFill;
	}
	
    
}
