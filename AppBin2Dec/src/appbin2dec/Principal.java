package appbin2dec;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Binario num = new Binario();
        String operacoes[] = {"Decimal para Binario", "Binario para Decimal", "Sair"};
        String opUsr = "";

        while (!opUsr.equals("Sair")) {
            opUsr = (String) JOptionPane.showInputDialog(null, "Selecione a operação desejada", "Bin", 3, null, operacoes, operacoes[0]);

            switch (opUsr) {
                case "Decimal para Binario":
                    int dec = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero(Decimal)", "Bin2Dec", 3));
                    num.setNumDec(dec);
                    JOptionPane.showMessageDialog(null, num.dec2Bin(), "Bin", -1);
                    break;
                    
                case "Binario para Decimal":
                    int bin = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero(Binario)", "Bin2Dec", 3));
                    num.setNumBin(bin);
                    JOptionPane.showMessageDialog(null, num.bin2Dec(), "Dec", -1);
                    break;
            }
        }

    }

}
