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
public class Billing {
                static final double TAX=.08;
                double pricePhotoBok=23.50;
		int numPhotoBooks=1;
		double cuponDiscount=2;
		
                public void sol(){
                    double totalPlusTax = pricePhotoBok +(pricePhotoBok*TAX);
                System.out.println("Total computeBill para un Album: "+totalPlusTax);
                
                double subtotalPlusTax = (pricePhotoBok*numPhotoBooks);
		double totalPlusTax2 = subtotalPlusTax+(subtotalPlusTax*TAX);
                System.out.println("Total computeBill para un Album: "+totalPlusTax2);
                
                
                double subtotalPlusTax3 = (pricePhotoBok*numPhotoBooks);
		double totalPlusTax3 = subtotalPlusTax+(subtotalPlusTax*TAX);
                System.out.println("Total computeBill para un Album: "+totalPlusTax3);
                
                }
 	
	}
	
	

