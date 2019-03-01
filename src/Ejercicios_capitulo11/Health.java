/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_capitulo11;

/**
 *
 * @author Darwin W. Diaz Simon
 */
public class Health extends Insurance{
    private Double cost;
	
	public Health(String ins) {
		super(ins);
		setMonthCost(36.00);
		
	}


	@Override
	public void setMonthCost(Double monthCost) {
		cost = monthCost;
		
	}


	@Override
	public void display() {
	
		System.out.println( " \n Tipo de Seguro : \t " + getClass().getSimpleName()  );
		System.out.println( " Costo Mensual : \t $ " + cost );
		
	}
	
	
    
}
