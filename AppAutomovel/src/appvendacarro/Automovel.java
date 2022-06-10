package appvendacarro;

import java.time.LocalDate;

public class Automovel {

    private String marca;
    private String cor;
    private String modelo;
    private String combustivel;
    private int ano;
    private float precoCusto;
    private float precoVenda;

    //Construtores sobrecarregados
    public Automovel(String marca, String cor, String modelo, String combustivel, float precoCusto, int ano) {
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.combustivel = combustivel;
        this.ano = ano;
        this.precoCusto = precoCusto;
        definePrecoVenda();
    }

    public Automovel(String marca, String cor, String modelo, String combustivel, float precoCusto) {
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.combustivel = combustivel;
        this.precoCusto = precoCusto;
        ano = LocalDate.now().getYear();
        definePrecoVenda();
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public int getAno() {
        return ano;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    private float definePrecoVenda() {
        switch (combustivel) {
            case "Gasolina":
                precoVenda =  (precoCusto + (precoCusto * 0.05f));
                break;
            case "Alcool":
                precoVenda =  (precoCusto + (precoCusto * 0.07f));
                break;
            case "Diesel":
                precoVenda =  (precoCusto + (precoCusto * 0.15f));
                break;
            case "GNV":
                precoVenda =  (precoCusto + (precoCusto * 0.03f));
                break;
            case "Flex":
                precoVenda =  (precoCusto + (precoCusto * 0.10f));
                break;
        }//fim switch
        return precoVenda;
    }
    
    public float definePrecoVenda(float percentual){
        precoVenda = precoVenda + (percentual/100 * precoVenda);
        return precoVenda;
    }
    
    public String infoAutomovel(){
        String info = "Marca: "+ marca + "\nModelo: "+ modelo +"\nCor: " + cor + "\nAno: "+ ano + "\nTipo de Combustivel: "+ combustivel +"\nPreco de Venda:R$ " + precoVenda + "\nPreco de Custo:R$ "+ precoCusto;
        return info;
    }
    
    

}
