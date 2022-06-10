/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appoperacoes;

public class Calculadora {

    private float num1;
    private float num2;

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float soma() {
        return num1 + num2;
    }

    public float divisao() {
        return num1 / num2;
    }

    public float multiplicacao() {
        return num1 * num2;
    }

    public float subtracao() {
        return num1 - num2;
    }
    
  
}
