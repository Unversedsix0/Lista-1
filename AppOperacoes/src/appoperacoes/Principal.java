package appoperacoes;

import javax.swing.JOptionPane;

//opUsr=(String)JOptionPane.showInputDialog(null,"Selecione a operação","Calculadora",3,null,operacoes,operacoes[0]);
public class Principal {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int control;
        int continua;

        do {
            float numero1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o 1° numero: ", "Calculadora", 3));
            calculadora.setNum1(numero1);

            float numero2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o 2° numero: ", "Calculadora", 3));
            calculadora.setNum2(numero2);

            control = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma operacao\n1 - Soma \n2 - Divisao \n3 - Multiplicacao \n4 - Subtracao", "Calculadora", 3));

            switch (control) {
                case 1:
                    JOptionPane.showMessageDialog(null, calculadora.soma(), "Calculadora", -1);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, calculadora.divisao(), "Calculadora", -1);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, calculadora.multiplicacao(), "Calculadora", -1);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, calculadora.subtracao(), "Calculadora", -1);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Erro opereçâo invalida :(", "Calculadora", 0);
                    break;

            }//fim switch

            continua = JOptionPane.showConfirmDialog(null, "Deseja realizar outra operacao?", "Calculadora", JOptionPane.YES_NO_OPTION, 3);
        } while (continua == 0);
        
        System.exit(0);

    }//fim main

}
