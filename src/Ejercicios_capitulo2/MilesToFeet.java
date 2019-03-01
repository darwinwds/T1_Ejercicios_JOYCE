/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_capitulo2;

/**
 *
 * @author Darwin W. Diaz Simon
 */
public class MilesToFeet {
            
    private float pies=5280;
    private float dato;
    private float milla=(float) 8.5;

    
    
    public float Miles(){
        dato=milla*pies;
                System.out.println("La Distancia a la casa de mi t�o es de "+milla+"millas o " +dato+"pies");

        return 0;
    }
    

}
    

