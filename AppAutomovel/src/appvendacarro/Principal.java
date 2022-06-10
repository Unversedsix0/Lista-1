package appvendacarro;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String operacoes[] = {"Cadastrar dados do automovel", "Visualizar informações", "Reajustar valor do automovel", "Sair"};
        String combustiveis[] = {"Gasolina", "Alcool", "Diesel", "GNV", "Flex"};
        String tpCombustivel = "";
        String opUsr = "";
        int ctrl;
        Automovel auto = null;

        while (!opUsr.equals("Sair")) {
            opUsr = (String) JOptionPane.showInputDialog(null, "Selecione a operação desejada", "Automoveis", 3, null, operacoes, operacoes[0]);

            switch (opUsr) {
                case "Cadastrar dados do automovel":
                    ctrl = JOptionPane.showConfirmDialog(null, "Seu veiculo foi lançado esse ano?", "Automoveis", JOptionPane.YES_NO_OPTION, 3);
                    if (ctrl == 0) {

                        String marca = JOptionPane.showInputDialog(null, "Informe a marca do seu automovel", "Automoveis", 3);

                        String cor = JOptionPane.showInputDialog(null, "Informe a cor do seu automovel", "Automoveis", 3);

                        String modelo = JOptionPane.showInputDialog(null, "Informe o modelo do seu automovel", "Automoveis", 3);

                        tpCombustivel = (String) JOptionPane.showInputDialog(null, "Selecione o tipo de combustivel usado no automovel", "Automoveis", 3, null, combustiveis, combustiveis[0]);

                        float vlCusto = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor de custo do automovel", "Automoveis", 3));

                        auto = new Automovel(marca, cor, modelo, tpCombustivel, vlCusto);

                    }//fim if
                    else {

                        String marca = JOptionPane.showInputDialog(null, "Informe a marca do seu automovel", "Automoveis", 3);

                        String cor = JOptionPane.showInputDialog(null, "Informe a cor do seu automovel", "Automoveis", 3);

                        String modelo = JOptionPane.showInputDialog(null, "Informe o modelo do seu automovel", "Automoveis", 3);

                        tpCombustivel = (String) JOptionPane.showInputDialog(null, "Selecione o tipo de combustivel usado no automovel", "Automoveis", 3, null, combustiveis, combustiveis[0]);

                        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano de fabricação do automovel", "Automoveis", 3));

                        float vlCusto = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor de custo do automovel", "Automoveis", 3));

                        auto = new Automovel(marca, cor, modelo, tpCombustivel, vlCusto, ano);

                    }//fim else
                    break;
                case "Visualizar informações":
                    if (auto != null) {
                        JOptionPane.showMessageDialog(null, auto.infoAutomovel(), "Automoveis", -1);
                    }//fim if
                    else {
                        JOptionPane.showMessageDialog(null, "Nenhum carro foi cadastrado", "Automoveis", 0);
                    }//fim else
                    break;
                case "Reajustar valor do automovel":
                     if (auto != null) {
                        float porcentagem = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a porcetagem do reajuste", "Automoveis", 3));
                         JOptionPane.showMessageDialog(null,"Valor antigo = R$ "+auto.getPrecoVenda()+ " Valor novo = R$ "+auto.definePrecoVenda(porcentagem),"Automoveis",-1);
                    }//fim if
                     else{
                         JOptionPane.showMessageDialog(null, "Nenhum carro foi cadastrado", "Automoveis", 0);
                     }
                    
                    break;
            }//fim switch
        }//fim while

        System.exit(0);

    }
}
