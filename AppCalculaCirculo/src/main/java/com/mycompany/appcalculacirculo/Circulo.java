package com.mycompany.appcalculacirculo;

import java.lang.Math;


/**
 *
 * @author gabri
 */
public class Circulo {
    private float raio;
  

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    public double area(){
        return Math.pow(raio,2)* Math.PI;
    }
    
      public double perimetro(){
        return  raio*2* Math.PI;
    }
      
        public double diametro(){
        return raio*2;
    }
        
       
            
}
