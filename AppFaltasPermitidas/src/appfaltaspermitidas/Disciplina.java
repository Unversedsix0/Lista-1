package appfaltaspermitidas;

public class Disciplina {
    //atributos

    private String nome;
    private int cargaHoraria;

//Métodos de acesso 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int faltasPermitidas() {
        int faltas = cargaHoraria * 25 / 100;

        return faltas;
    }
}
