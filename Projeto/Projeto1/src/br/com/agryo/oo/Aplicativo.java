package br.com.agryo.oo;

public class Aplicativo {
    public static void main(String[] args) {
        //Forma de declarar objeto vazio
        Carro carro1 = new Carro();

        carro1.setCor("Vermelho");
        carro1.setModelo("Sedan");
        carro1.setCapacidadeTanque(56);

        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Tanque: " + carro1.getCapacidadeTanque() + " Litros.");
        System.out.println("Custo para encher Tanque: R$" + carro1.totalValorTanque(5.89));

        //Forma de declarar objeto adicionando já os atributos OBS: Foi criado outro construtor.
        Carro carro2 = new Carro("Preto", "Ret", 49);

        System.out.println("-----------------------------------------------");
        System.out.println("Cor: " + carro2.getCor());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Tanque: " + carro2.getCapacidadeTanque() + " Litros.");
        System.out.println("Custo para encher Tanque: R$" + carro2.totalValorTanque(6.25));
    }
}
