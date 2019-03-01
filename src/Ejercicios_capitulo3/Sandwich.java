/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_capitulo3;

import Ejercicios_capitulo4.Bread;
import Ejercicios_capitulo4.SandwichFilling;
import java.util.Scanner;

/**
 *
 * @author Darwin W. Diaz Simon
 */
public class Sandwich {
        private static Scanner input = new Scanner(System.in);
    public static int NUM_SLIDE_SANDWICH;
	private String mainIngredient;
	private String breadType;
	private double price;

    public Sandwich(Bread bread, SandwichFilling sandwichFill) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Sandwich() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	public String getMainIngredient() {
		return mainIngredient;
	}

	public void setMainIngredient(String mainIngredient) {
		this.mainIngredient = mainIngredient;
	}

	public String getBreadType() {
		return breadType;
	}

	public void setBreadType(String breadType) {
		this.breadType = breadType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

    public Object getSandwichFill() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getBread() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
