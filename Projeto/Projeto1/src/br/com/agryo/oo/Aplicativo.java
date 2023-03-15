package br.com.agryo.oo;

public class Aplicativo {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("Vermelho");
        carro1.setModelo("Sedan");
        carro1.setCapacidadeTanque(56);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(5.89));

        Carro carro2 = new Carro("Preto", "Ret", 49);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.25));
    }
}
