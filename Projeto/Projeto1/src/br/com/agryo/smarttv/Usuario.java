package br.com.agryo.smarttv;
public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Está ligada? " + smartTv.ligada);
        System.out.println("Qual o canal? " + smartTv.canal);
        System.out.println("Qual volume atual? " + smartTv.volume);

        //smartTv.ligar();
        //System.out.println("Novo Status -> Está ligada? " + smartTv.ligada);
        smartTv.power();

        smartTv.aumentarVolume();
        smartTv.baixarVolume();

        smartTv.mudarCanal(15);
        smartTv.subirCanal();
        smartTv.descerCanal();
        smartTv.mudarCanal(8);

        //smartTv.desligar();
        //System.out.println("Novo Status -> Está ligada? " + smartTv.ligada);
        smartTv.power();
    }
}
