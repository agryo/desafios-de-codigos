package br.com.agryo.projetono;

public class Main {
    public static void main(String[] args) {

        //O Generic serve para entrar com qualquer tipo de dado (int, String, double, etc)
        No<String> no1 = new No<>("Conteudo No1"); //Esse sinal <> representa o Generic do Java

        No<String> no2 = new No<>("Conteudo No2");
        no1.setProximoNo(no2);

        No<String> no3 = new No<>("Conteudo No3");
        no2.setProximoNo(no3);

        No<String> no4 = new No<>("Conteudo No4");
        no3.setProximoNo(no4);

        //no1 -> no2 -> no3 -> no4 -> null

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);

        System.out.println("--------------------------");
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());


    }
}
