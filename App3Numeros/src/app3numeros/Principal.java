package app3numeros;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String operacoes[] = {"Declare os valores", "Ordem Crescente", "Mostrar maior numero", "Mostrar menor numero", "Impar(produto) ou Par(soma)", "Sair"};
        String opUsr = "";
        Numero num = null;
        while (!opUsr.equals("Sair")) {
            opUsr = (String) JOptionPane.showInputDialog(null, "Selecione a operação desejada", "3 numeros", 3, null, operacoes, operacoes[0]);
            switch (opUsr) {
                case "Declare os valores":
                    int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero 1", "3 numeros", 3));
                    int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero 2", "3 numeros", 3));
                    int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero 3", "3 numeros", 3));
                    num = new Numero(num1, num2, num3);

                    break;
                case "Ordem Crescente":
                    if (num != null) {
                        JOptionPane.showMessageDialog(null, num.ordemCrescente(), "3 numeros", -1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Declare os valores", "Banco de Todos", 0);
                    }
                    break;
                case "Mostrar maior numero":
                    if (num != null) {
                        JOptionPane.showMessageDialog(null, num.numeroMaior(), "3 numeros", -1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Declare os valores", "Banco de Todos", 0);
                    }
                    break;
                case "Mostrar menor numero":
                    if (num != null) {
                        JOptionPane.showMessageDialog(null, num.numeroMenor(), "3 numeros", -1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Declare os valores", "Banco de Todos", 0);
                    }
                    break;
                case "Impar(produto) ou Par(soma)":
                    if (num != null) {
                        JOptionPane.showMessageDialog(null, num.somaProduto(), "3 numeros", -1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Declare os valores", "Banco de Todos", 0);
                    }
                    break;

            }

        }

    }

}
