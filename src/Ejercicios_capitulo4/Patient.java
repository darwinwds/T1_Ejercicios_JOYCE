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
public class Patient {
    private int id;
	private int edad;
	private BloodData blood;
	
	public Patient(){
		this.edad=0;
		this.id=0;
		  BloodData blood = new BloodData();
		  blood.setBloodType("O");
		  blood.setFactorRH('+');
		this.blood=blood;
	}
	
	
	public Patient(int id, int edad, BloodData blood){
		this.edad=0;
		this.id=0;
		this.blood=blood;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public BloodData getBlood() {
		return blood;
	}
	public void setBlood(BloodData blood) {
		this.blood = blood;
	}
    
}
