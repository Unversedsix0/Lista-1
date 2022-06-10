package appcalculos;

public class Disciplina {

//Métodos de acesso
    private String nome;
    private int cargaHoraria;

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
    public int FaltasPermitidas(){
        int faltas=cargaHoraria*25/100;
        return faltas;
    }
}
