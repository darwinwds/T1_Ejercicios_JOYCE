/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.buildings;

import Ejercicios_capitulo11.Grades;

/**
 *
 * @author Darwin W. Diaz Simon
 */
public class School extends Building {
	
	private Integer classRooms;
	private Grades grades;
	
	public School(Integer np, Double pc, Integer cr, Grades grades ) {
		super(np, pc);

		classRooms = cr;
		this.grades = grades;
		
	}

	public Integer getClassRooms() {
		return classRooms;
	}

	public void setClassRooms(Integer classRooms) {
		this.classRooms = classRooms;
	}

	public Grades getGrades() {
		return grades;
	}

	public void setGrades(Grades grades) {
		this.grades = grades;
	}
}
