
package appcontacorrentesimples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gabri
 */
public class ContaCorrente {
    private Pessoa titular;
    private String conta;
    float saldo;

    public ContaCorrente(Pessoa titular, String conta) {
        this.titular = titular;
        this.conta = conta;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public float getSaldo() {
        return saldo;
    }
    
    public boolean saque(float vlUsuario){
        if(saldo >= vlUsuario){  
            saldo -= vlUsuario;
            return true;
        }
        return false;
    }
    
    public float deposito(float vlUsuario){
            saldo +=vlUsuario;
            return saldo;
    }
    
    public String dadosConta(){
        DateTimeFormatter mascaraData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataHoje=LocalDate.now();
        
        String dadosTitular=titular.nomeCompleto();
        if(titular.getCpf() !=null){
            dadosTitular+= "\nCPF n° "+titular.getCpf();
        }
        return "Banco de Todos S.A. \n "+ mascaraData.format(dataHoje)+ "-Conta N° "+conta + "\nTitular:" +dadosTitular;
    }
        
    }
           
    

