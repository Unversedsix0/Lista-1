

package com.mycompany.appcalculacirculo;

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class AppCalculaCirculo {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        
        float raio=Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor do raio", "App Calcula Circulo", 3));
        circulo.setRaio(raio);
        
         JOptionPane.showMessageDialog(null,"Area:"+circulo.area()+"\nPerimetro:"+circulo.perimetro()+"\nDiametro:"+circulo.diametro(),"App Calcula Circulo",-1);
    }
}
