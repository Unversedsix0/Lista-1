package appfaltaspermitidas;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Disciplina objDisciplina = new Disciplina(); //declaração e instanciação objeto

        String nomeDisc = JOptionPane.showInputDialog(null, "Informe o nome da disciplina", "AppFaltasPermitidas 1.0", JOptionPane.QUESTION_MESSAGE);
        objDisciplina.setNome(nomeDisc);

        int ch = Integer.parseInt(JOptionPane.showInputDialog(null, "Carga Hóraria de" + objDisciplina.getNome(), "AppFaltasPermitidas 1.0", 2));

        objDisciplina.setCargaHoraria(ch);

        JOptionPane.showMessageDialog(null, " A Disciplina de " + objDisciplina.getNome() + " permite " + objDisciplina.faltasPermitidas()+" faltas!", " AppFaltasPermitidas 1.0", -1);

        System.exit(0);
    }

}
