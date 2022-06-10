package com.mycompany.appcalculatabuada;

import java.util.Arrays;

public class Tabuada {

    private byte numero;

    public byte getNumero() {
        return numero;
    }

    public void setNumero(byte numero) {
        this.numero = numero;
    }

    public String tabuada() {
        String resultado[] = new String[11];
        for (int i = 0; i <11; i++) {
            resultado[i] = numero + "X" + i + "=" + numero * i + "\n";
        }
        return Arrays.toString(resultado).replace("[", "").replace("]", "").replace(",", "").replace(" ", "");

    }
    
      public String tabuadaB() {
        String resultado = "";
        for (int i = 0; i <= 10; i++) {
            resultado += numero + "X" + i + "=" + numero * i + "\n";
        }
        return resultado;

    }
}
