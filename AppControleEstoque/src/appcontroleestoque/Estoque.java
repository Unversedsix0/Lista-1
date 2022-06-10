package appcontroleestoque;

public class Estoque {

    private String descricao;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque(String descricao, int qtdAtual, int qtdMinima) {
        this.descricao = descricao;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void repor(int qtd) {
        qtdAtual+=qtd;
    }
    
    public void darBaixa(int qtd){
        if(qtd<=qtdAtual){
            qtdAtual-=qtd;
        }
       
      
    }
    
    public String dados(){
        String dados="Nome do produto: "+descricao+"\nQuantidade Atual: "+ qtdAtual+"\nQuantidade Minima: "+qtdMinima;
        return dados;
    }
    
    public boolean precisaRepor(){
        if(qtdAtual>=qtdMinima){
            return true;
        }else{
             return false;
        }
    }
}
