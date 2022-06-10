
package appautoheranca;

public class AutomovelPlus extends Automovel {
    private boolean gps;
    private boolean bluetooth;
    private boolean sensorEstacionameto;
    private boolean cadeirinhaBebe;

    public AutomovelPlus(boolean gps, boolean bluetooth, boolean sensorEstacionameto, boolean cadeirinhaBebe, String marca, String cor, String modelo, String combustivel, float precoCusto) {
        super(marca, cor, modelo, combustivel, precoCusto);
        this.gps = gps;
        this.bluetooth = bluetooth;
        this.sensorEstacionameto = sensorEstacionameto;
        this.cadeirinhaBebe = cadeirinhaBebe;
    }

    public AutomovelPlus(boolean gps, boolean bluetooth, boolean sensorEstacionameto, boolean cadeirinhaBebe, String marca, String cor, String modelo, String combustivel, int ano, float precoCusto) {
        super(marca, cor, modelo, combustivel, ano, precoCusto);
        this.gps = gps;
        this.bluetooth = bluetooth;
        this.sensorEstacionameto = sensorEstacionameto;
        this.cadeirinhaBebe = cadeirinhaBebe;
    }


    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public boolean isSensorEstacionameto() {
        return sensorEstacionameto;
    }

    public void setSensorEstacionameto(boolean sensorEstacionameto) {
        this.sensorEstacionameto = sensorEstacionameto;
    }

    public boolean isCadeirinhaBebe() {
        return cadeirinhaBebe;
    }

    public void setCadeirinhaBebe(boolean cadeirinhaBebe) {
        this.cadeirinhaBebe = cadeirinhaBebe;
    }
     
    @Override
     public double valorVenda(){
      double valorVenda = super.valorVenda();
      
      if(isGps()){
          valorVenda+= 780;
      }
     
       if(isBluetooth()){
           valorVenda+= 450;
       }
      
       if(isSensorEstacionameto()){
           valorVenda+= 1180;
       }
       
       if(isCadeirinhaBebe()){
           valorVenda+=380;
       }
       return valorVenda;
     }   
     
     @Override
     public String toString(){
         String dados="Acessorios Adicionais";
         
         if(isGps()){
             dados+="\nGPS:Sim";
         }else{
             dados+="\nGPS:Não";
         }
         
          if(isBluetooth()){
           dados+="\nBluetooth:Sim";
       }else{
             dados+="\nBluetooth:Não";
         }

      
       if(isSensorEstacionameto()){
           dados+="\nSensor de Estacionamento:Sim";
       }else{
             dados+="\nSensor de Estacionamento:Não";
         }
       
       if(isCadeirinhaBebe()){
           dados+="\nCadeirinha de Bebê:Sim";
       }else{
             dados+="\nCadeirinha de Bebê:Não";
         }
       return super.toString() + "\n" + dados;
     }

    
}

