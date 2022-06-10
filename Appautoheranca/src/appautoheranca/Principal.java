package appautoheranca;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String operacoes[] = {"Cadastrar dados do automovel", "Visualizar informações", "Reajustar valor do automovel", "Sair"};
        String combustiveis[] = {"Gasolina", "Alcool", "Diesel", "GNV", "Flex"};
        String cores[] = {"Preto", "Branco", "Vermelho", "Prata"};
        String marcas[] = {"Fiat", "Ford", "Hyundai", "Honda", "Cherry", "Dodge"};

        Automovel auto = null;
        AutomovelPlus autoPlus = null;
        boolean gps = false;
        boolean sensor = false;
        boolean cadeirinha = false;
        boolean bluetooth = false;

        String marca = (String) JOptionPane.showInputDialog(null, "Selecione a marca do automovel", "Cadastro", 3, null, marcas, marcas[0]);
        String modelo = JOptionPane.showInputDialog(null, "Informe o modelo", "Cadastro", 3);
        String cor = (String) JOptionPane.showInputDialog(null, "Selecione a marca do automovel", "Cadastro", 3, null, cores, cores[0]);
        String combustivel = (String) JOptionPane.showInputDialog(null, "Selecione a marca do automovel", "Cadastro", 3, null, combustiveis, combustiveis[0]);
        float custo = Float.parseFloat(JOptionPane.showInputDialog(null, "Preço de custo", "Cadastro", 3));
        int acessorios = JOptionPane.showConfirmDialog(null, "O automevel tem acessorios?", "Cadastro", JOptionPane.YES_NO_OPTION, 3);

        if (acessorios == 0) {
            if (JOptionPane.showConfirmDialog(null, "O automevel tem GPS?", "Cadastro", JOptionPane.YES_NO_OPTION, 3) == 0) {
                gps = true;
            }
            if (JOptionPane.showConfirmDialog(null, "O automevel tem sensor?", "Cadastro", JOptionPane.YES_NO_OPTION, 3) == 0) {
                sensor = true;
            }

            if (JOptionPane.showConfirmDialog(null, "O automevel tem cadeirinha?", "Cadastro", JOptionPane.YES_NO_OPTION, 3) == 0) {
                cadeirinha = true;
            }

            if (JOptionPane.showConfirmDialog(null, "O automevel tem bluetooth?", "Cadastro", JOptionPane.YES_NO_OPTION, 3) == 0) {
                bluetooth = true;

                System.exit(0);

            }
        }
        
        if(JOptionPane.showConfirmDialog(null, "O automevel e desse ano", "Cadastro", JOptionPane.YES_NO_OPTION, 3) == 0){
            if(acessorios == 0){
                autoPlus = new AutomevelPlus(gps,bluetooth,sensor,cadeirinha,marca,modelo,cor,combustivel,custo);
            }
            JOptionPane.showMessageDialog(null, autoPlus,"Infomações",1);
        }else

    }
}
