package appcalculos;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Disciplina objDisciplina = new Disciplina();

        String nomeDisc = JOptionPane.showInputDialog(null, "Discplina", "App faltas permitidas 1.0", JOptionPane.QUESTION_MESSAGE);
        objDisciplina.setNome(nomeDisc);

        int ch = Integer.parseInt(JOptionPane.showInputDialog(null, "Carga horario de " + objDisciplina.getNome(), "App Faltas permitidas 1.0", 1));
        
        objDisciplina.setCargaHoraria(ch);
        JOptionPane.showMessageDialog(null,"A disciplina de " +objDisciplina.getNome()+" permite "+objDisciplina.FaltasPermitidas()+" faltas", "App Faltas permitidas",-1);
    }
}
