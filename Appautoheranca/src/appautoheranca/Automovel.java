package appautoheranca;

import java.time.LocalDate;

public class Automovel {

    protected String marca;
    protected String cor;
    protected String modelo;
    protected String combustivel;
    protected int ano;
    protected float precoCusto;

    public Automovel(String marca, String cor, String modelo, String combustivel, float precoCusto) {
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.combustivel = combustivel;
        this.precoCusto = precoCusto;
        ano = LocalDate.now().getYear();

    }

    public Automovel(String marca, String cor, String modelo, String combustivel, int ano, float precoCusto) {
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.combustivel = combustivel;
        this.ano = ano;
        this.precoCusto = precoCusto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public String toString() {
        String dados = "Marca - " + marca + "\nCor - " + cor + "\nModelo - " + modelo + "\nCombustivel - " + combustivel + "\nAno - " + ano + "\nPreco de Custo - " + precoCusto;
        return dados;
    }
public double valorVenda() {
    
        double valorVenda=0;
    switch (combustivel) {
            case "Gasolina":
                valorVenda =  (precoCusto + (precoCusto *7.5/100));
                break;
            case "Alcool":
                valorVenda =  (precoCusto + (precoCusto * 10/100));
                break;
            case "Diesel":
                valorVenda = (precoCusto + (precoCusto * 17.5/100));
                break;
            case "GNV":
                valorVenda = (precoCusto + (precoCusto * 23/100));
                break;
            case "Flex":
                valorVenda = (precoCusto + (precoCusto * 15/100));
                break;
        }//fim switch
        return valorVenda;
}
}
