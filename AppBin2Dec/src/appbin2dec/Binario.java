package appbin2dec;

public class Binario {

    private int numBin;
    private int numDec;

    public int getNumBin() {
        return numBin;
    }

    public void setNumBin(int numBin) {
        this.numBin = numBin;
    }

    public int getNumDec() {
        return numDec;
    }

    public void setNumDec(int numDec) {
        this.numDec = numDec;
    }
    
    public String dec2Bin() {
        String bin = "";
        int aux = numDec;
        while (aux > 0) {
            bin = aux % 2 + bin;
            aux = aux / 2;
        }
        return bin;
    }

    public int bin2Dec(){
        int decimal = 0;
        int potencia = 0;
        int aux = numBin;
        while(aux !=0 ){
            int rem = aux% 10;
            decimal = decimal +(int)(rem*Math.pow(2, potencia));
            potencia++;
            aux = aux/10;
        }

        return decimal;

    }
}
