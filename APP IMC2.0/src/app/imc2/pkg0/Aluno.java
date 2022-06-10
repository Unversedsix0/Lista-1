package app.imc2.pkg0;

public class Aluno {

    private String nome;
    private float altura;
    private float peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double imc() {
        return peso / Math.pow(altura, 2);
    }

    public String situacao() {
        double imc = imc();
        if (imc < 18.6) {
            return "Abaixo do peso";
        } else if (imc > 18.6 & imc < 24.9) {
            return "Peso Normal";
        } else if (imc > 24.9 & imc <= 30) {
            return "Excesso de peso";
        } else {
            return "Obesidade";
        }

    }

    public String telaFinal() {
        double imc = imc();
        String dados = nome + "\nIMC:" + String.format("%.2f", imc) + "\nSituacao:" + situacao();
        return dados;
    }
}
