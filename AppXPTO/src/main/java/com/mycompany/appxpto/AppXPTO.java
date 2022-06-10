/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.appxpto;

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class AppXPTO {

    public static void main(String[] args) {
        Terreno terrenoA = new Terreno();
        
        float comprimento =Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor do comprimento do terreno", "App AppXPTO", 3));
        terrenoA.setBase(comprimento);
        
        float largura =Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor da largura do terreno", "App AppXPTO", 3));
        terrenoA.setAltura(largura);
        
         JOptionPane.showMessageDialog(null,"\"A area do terreno é"+terreno.area()+"),"App AppXPTO",-1);
    }
}
