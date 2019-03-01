/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.buildings;

/**
 *
 * @author Darwin W. Diaz Simon
 */
public class House extends Building {

	private Integer numeroDormitorios;
	private Integer numeroBaños;
	
	
	public House(Integer np, Double pc, Integer dor, Integer ba ) {
		super(np, pc);

		numeroDormitorios = dor;
		numeroBaños = ba;
		
		
	}


	public Integer getNumeroDormitorios() {
		return numeroDormitorios;
	}


	public void setNumeroDormitorios(Integer numeroDormitorios) {
		this.numeroDormitorios = numeroDormitorios;
	}


	public Integer getNumeroBaños() {
		return numeroBaños;
	}


	public void setNumeroBaños(Integer numeroBaños) {
		this.numeroBaños = numeroBaños;
	}
    
    
}
