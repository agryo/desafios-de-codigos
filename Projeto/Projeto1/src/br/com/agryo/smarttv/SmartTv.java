package br.com.agryo.smarttv;
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    public void subirCanal(){
        canal++;
        System.out.println("Mudou para o canal: " + canal);
    }
    public void descerCanal(){
        canal--;
        System.out.println("Mudou para o canal: " + canal);
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudou para o canal: " + canal);
    }
    public void power(){
        if (ligada == false) {
            ligada = true;
            System.out.println("A TV foi ligada!");
        }
        else {
            ligada = false;
            System.out.println("A TV foi desligada!");
        }
    }
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }
    public void baixarVolume(){
        volume--;
        System.out.println("Baixando volume para: " + volume);
    }
}
