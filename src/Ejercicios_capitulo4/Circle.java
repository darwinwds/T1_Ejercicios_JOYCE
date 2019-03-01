



























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
public class Circle {
    static final double PI=Math.PI;
	
 
	

	private double radius;
	private double diameter;
	private double area;
	
	public Circle(){
		this.radius=1;
		this.diameter=2*radius;
		this.area=PI*(radius*radius);
		
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		
		this.diameter=2*radius;
		this.area=PI*(radius*radius);
		this.radius = radius;
	}

	

	public void setArea(double area) {
		this.area = area;
	}
	
}
