package appcalculapotencia;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Potencia pot = new Potencia();

        float base = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a base", "Calcula Potencia", 3));
        int expoente = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o expoente", "Calcula Potencia", 3));
        pot.setBase(base);
        pot.setExpoente(expoente);
        
          JOptionPane.showMessageDialog(null, pot.calPotencia(), "Calcula Potencia", -1);
          System.exit(0);
    }

}
