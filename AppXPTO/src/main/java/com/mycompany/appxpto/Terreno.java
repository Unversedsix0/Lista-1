
package com.mycompany.appxpto;

/**
 *
 * @author gabri
 */
public class Terreno {

    private float base;
    private float altura;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float area() {
        return base * altura;
    }

    public String telaFinal() {
        String resultado ="A area do terreno é "+area()+"m";
        return resultado;
    }
}
