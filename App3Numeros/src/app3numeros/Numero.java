package app3numeros;

public class Numero {

    private int num1;
    private int num2;
    private int num3;

    public Numero(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int numeroMaior() {
        int maiorNum = 0;

        if (num1 > num2) {
            maiorNum = num1;
        } else if (num3 > maiorNum) {  
            maiorNum = num3;
        }
      
        return maiorNum;

    }

    public int numeroMenor() {
        int menorNum = 0;

        if (num1 < num2) {
            menorNum = num1;
        }
        else if (num3 < menorNum) {
            menorNum = num3;
        }
        return menorNum;
    }

    public String ordemCrescente() {
        int maiorNum = 0;
        int numeroMeio = 0;
        int menorNum = 0;
           
        //maior numero
        if (num1 > num2) {
            maiorNum = num1;
        } else {
            maiorNum= num2;
        }
        if (num3 > maiorNum) {
            maiorNum = num3;
        }
        //menor numero 
        if (num1 < num2) {
            menorNum = num1;
        } else {
            menorNum = num2;
        }
        if (num3 < menorNum) {
            menorNum = num3;
        }
        //numero do meio
        if (num1 > menorNum && num1 < maiorNum) {
            numeroMeio = num1;
        } else if (num2 > menorNum && num2 < maiorNum) {
            numeroMeio = num2;
        }else if (num3 > menorNum && num3 < maiorNum) {
            numeroMeio = num3;
        }
        String resultado = "1°: " + menorNum+ " " + "2°: " + numeroMeio + " " + "3°: " + maiorNum ;

        return resultado;

    }

    public int somaProduto() {
        int result = 0;
        if (num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 == 0) {
            result = num1 + num2 + num3;
        } else if (num1 % 2 != 0 && num2 % 2 != 0 || num2 % 2 != 0 && num3 % 2 != 0 || num2 % 2 != 0 && num1 % 2 != 0 || num3 % 2 != 0 && num1 % 2 != 0) {
            result = num1 * num2 * num3;
        }
        return result;
    }
}
