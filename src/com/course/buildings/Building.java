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
public class Building {
    private Integer nPisos;
	private Double piesCuadrados;
	
	public Building( Integer np, Double pc ) {
	
		
		nPisos = np;
		piesCuadrados = pc;
		
		
	}

	public Integer getnPisos() {
		return nPisos;
	}

	public void setnPisos(Integer nPisos) {
		this.nPisos = nPisos;
	}

	public Double getPiesCuadrados() {
		return piesCuadrados;
	}

	public void setPiesCuadrados(Double piesCuadrados) {
		this.piesCuadrados = piesCuadrados;
	}
}
