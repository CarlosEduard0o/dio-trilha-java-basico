package edu.carlos.variaveis.smarttv;

public class SmartTv {
    private boolean estado;
    private int canal;
    private int volume;

    public SmartTv(boolean estado, int canal, int volume) {
        this.estado = estado;
        this.canal = canal;
        this.volume = volume;
    }

    public boolean ligarTv(){
        return this.estado = true;
    }

    public boolean desligarTv(){
        return this.estado = false;
    }

    public int aumentarVolume(){
        return this.volume += 1;
    }

    public int diminuirVolume(){
        return this.volume -= 1;
    }

    public int subirCanal(){
        return this.canal += 1;
    }

    public int diminuirCanal(){
        return this.canal -= 1;
    }

    public void mudarCanal(int canal){
        this.canal = canal;
        System.out.println("Canal alterado para: " + this.canal);
    }

}
