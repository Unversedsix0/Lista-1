package com.mycompany.appcalculatabuada;

import javax.swing.JOptionPane;

public class AppCalculaTabuada {

    public static void main(String[] args) {
        Tabuada Tabuada = new Tabuada();

        byte num = Byte.parseByte(JOptionPane.showInputDialog(null, "Digite o n°", "Tabuada", 3));
        Tabuada.setNumero(num);
        
        JOptionPane.showMessageDialog(null,Tabuada.tabuada(),"Tabuada do n°"+ num,-1);
    }
}
