/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_capitulo10;

/**
 *
 * @author Darwin W. Diaz Simon
 */
public class ScentedCandle extends Candle{
    private Escencia scent;

    
    public Escencia getScent() {
        return scent;
    }

    public void setScent(Escencia scent) {
        this.scent = scent;
    }
    
    
    @Override
    public void setAltura(Double altura){
        super.setAltura(altura);
		
		precio = altura * 3;
        
        
        
    }
    
    
}
