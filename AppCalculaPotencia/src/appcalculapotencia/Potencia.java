package appcalculapotencia;


public class Potencia {
    private float base;
    private int expoente;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public int getExpoente() {
        return expoente;
    }

    public void setExpoente(int expoente) {
        this.expoente = expoente;
    }
    
    public double calPotencia(){
        double resultado = 1;
       for(int i=0;i<expoente;i++){
           resultado*=base;
       }
       return resultado;
        
    
    }
}
