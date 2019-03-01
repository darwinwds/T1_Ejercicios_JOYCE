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
public class SandwichFilling {
    public SandwichFilling(String typeFilling,int calorias){
		this.typeFilling=typeFilling;
		this.calorias=calorias;
		
	}
	
	private String typeFilling;
	private int calorias;
	
	
	
	public String getTypeFilling() {
		return typeFilling;
	}
	public int getCalorias() {
		return calorias;
	}
}
