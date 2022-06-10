package com.mycompany.appop3numeros;

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class AppOp3Numeros {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero: ", "Calculadora", 3));
        calculadora.setNum1(numero1);

        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero: ", "Calculadora", 3));
        calculadora.setNum2(numero2);

        int numero3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero: ", "Calculadora", 3));
        calculadora.setNum3(numero3);
        
         JOptionPane.showMessageDialog(null,calculadora.resultado(),"Calculadora",-1);

    }
}
