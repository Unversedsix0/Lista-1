package app.imc2.pkg0;

import javax.swing.JOptionPane;


public class Principal {

   
    public static void main(String[] args) {
         Aluno Aluno = new Aluno();
         
         
        String nome = JOptionPane.showInputDialog(null, "Nome do Aluno", "APP IMC 2.0", 3);
        float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a altura do aluno ", "APP IMC 2.0", 3));
        float peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o peso do aluno ", "APP IMC 2.0", 3)); 
        
        Aluno.setNome(nome);
        Aluno.setAltura(altura);
        Aluno.setPeso(peso);
        
         JOptionPane.showMessageDialog(null,Aluno.telaFinal(),"APP IMC 2.0",-1);
        
        
        
    }
    
}
