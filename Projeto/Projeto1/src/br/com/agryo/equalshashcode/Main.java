package br.com.agryo.equalshashcode;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Ferrari"));
        listaCarros.add(new Carro("Audi"));

        System.out.println(listaCarros.contains(new Carro("Audi")));
        System.out.println(listaCarros.contains(new Carro("Fiat")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford1").hashCode());

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Fiat");
        Carro carro3 = new Carro("Ford");

        System.out.println(carro1.equals(carro2));
        System.out.println(carro1.equals(carro3));

    }
}
