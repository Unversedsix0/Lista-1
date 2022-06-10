package appcontroleestoque;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String operacoes[] = {"Informações do Estoque","Repor Estoque", "Retirar do Estoque", "Consultar Estoque", "Sair"};
        String opUsr = "";
        Estoque produto = null;

        while (!opUsr.equals("Sair")) {
            opUsr = (String) JOptionPane.showInputDialog(null, "Selecione a operação desejada", "Estoque", 3, null, operacoes, operacoes[0]);
            switch (opUsr) {
                case "Informações do Estoque":
                    String prod = JOptionPane.showInputDialog(null, "Informe o nome do produto", "Banco de Todos", 3);
                    int qtdAtual = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade atual do produto", "Estoque", 3));
                    int qtdMin = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade minima para ser mantida", "Estoque", 3));
                    produto = new Estoque(prod,qtdAtual,qtdMin);
                    break;
                case "Repor Estoque":
                    int qtdAdd = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de itens adicionados", "Estoque", 3));
                    produto.repor(qtdAdd);
                    break;
                case "Retirar do Estoque":
                    if (produto.precisaRepor() != true) {
                        JOptionPane.showMessageDialog(null, "Necessario repor o estoque", "Estoque", 0);
                    } else {
                        int qtdBaixa = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de itens para serem removidos", "Estoque", 3));
                        produto.darBaixa(qtdBaixa);
                    }
                    break;
                case "Consultar Estoque":
                    JOptionPane.showMessageDialog(null, produto.dados(), "Estoque", -1);
                    break;
            }
        }

        System.exit(0);
    }
}
