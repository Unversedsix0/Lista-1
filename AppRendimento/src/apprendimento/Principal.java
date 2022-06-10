
package apprendimento;


public class Principal {

    
    public static void main(String[] args) {
      Conta objConta = new Conta();
      
      objConta.setValorDepositado(valorTaxadeJuros);
      objConta.setTaxaDeJuros(ValorDepositado);
      
      JoptionPane.showMessageDialog(null,"Banco para Todos S.A"+"\nValor Aplicado = R$"+objConta.getValorDepositado()+"\nTaxa de Juros = R$"+objConta.getTaxaDeJuros()+"\nRendimento = R$"+objConta.ValorRendimento()+"\nValor Final = R$"+objConta.valorTotal(),"APPFinanceiro",1);
      
      
      
    }
    
}
