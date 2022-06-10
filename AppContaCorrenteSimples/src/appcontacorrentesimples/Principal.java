package appcontacorrentesimples;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Principal {

    public static void main(String[] args) {
        String operacoes[] = {"Abertura de conta", "Atualização cadastral - CPF", "Dados da Conta", "Movimentação Bancaria", "Sair"};
        String nOperacoes[] = {"Saldo", "Saque", "Depósito"};
        String opUsr = "";
        String opUsrN = "";
        Pessoa sujeito = null;
        ContaCorrente conta = null;
        int ctrl;
        int nCtrl = 0;

        while (!opUsr.equals("Sair")) {
            opUsr = (String) JOptionPane.showInputDialog(null, "Selecione a operação desejada", "Banco de Todos", 3, null, operacoes, operacoes[0]);
            switch (opUsr) {
                case "Abertura de conta":
                    String nome = JOptionPane.showInputDialog(null, "Informe o seu nome", "Banco de Todos", 3);
                    String sobrenome = JOptionPane.showInputDialog(null, "Informe seu sobrenome", "Banco de Todos", 3);
                    String nConta = JOptionPane.showInputDialog(null, "Informe o numero da seu conta", "Banco de Todos", 3);
                    ctrl = JOptionPane.showConfirmDialog(null, "Deseja informar seu CPF?", "Banco de Todos", JOptionPane.YES_NO_OPTION, 3);
                    if (ctrl == 0) {
                        String cpf = JOptionPane.showInputDialog(null, "Informe seu CPF", "Banco de Todos", 3);
                        sujeito = new Pessoa(nome, sobrenome, cpf);
                    }
                    else{
                         sujeito = new Pessoa(nome, sobrenome);
                    }

                    conta = new ContaCorrente(sujeito, nConta);
                    break;
                case "Atualização cadastral - CPF":
                    if (conta != null) {
                        String cpf = JOptionPane.showInputDialog(null, "Informe seu CPF", "Banco de Todos", 3);
                        conta.getTitular().setCpf(cpf);

                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhuma conta foi criada", "Banco de Todos", 0);
                    }
                    break;
                case "Dados da Conta":
                    if (conta != null) {
                        JOptionPane.showMessageDialog(null, conta.dadosConta(), "Banco de Todos", -1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhuma conta foi criada", "Banco de Todos", 0);
                    }
                    break;
                case "Movimentação Bancaria":
                    if (conta != null) {
                        while (nCtrl == 0) {
                            opUsrN = (String) JOptionPane.showInputDialog(null, "Selecione a operação desejada", "Banco de Todos", 3, null, nOperacoes, nOperacoes[0]);
                            switch (opUsrN) {
                                case "Saldo":
                                    JOptionPane.showMessageDialog(null, conta.dadosConta() + "\nSaldo:R$ " + conta.getSaldo(), "Banco de Todos", -1);
                                    break;
                                case "Saque":
                                    float vlSaque = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor do saque", "Banco de Todos", 3));
                                    if(conta.saque(vlSaque)!=true){
                                         JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Banco de Todos", 0);
                                    }
                                    break;
                                case "Depósito":
                                    float vlDeposito = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor do deposito", "Banco de Todos", 3));
                                    conta.deposito(vlDeposito);
                                    break;

                            }//fim switch 2
                            nCtrl = JOptionPane.showConfirmDialog(null, "Deseja realizar outra operação", "Banco de Todos", JOptionPane.YES_NO_OPTION, 3);
                        }//fim while 2

                    }//fim if
                    else {
                        JOptionPane.showMessageDialog(null, "Nenhuma conta foi criada", "Banco de Todos", 0);
                        break;
                    }

            }//fim switch

        }//fim while
        System.exit(0);

    }
}
