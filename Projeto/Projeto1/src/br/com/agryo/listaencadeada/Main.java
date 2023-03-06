package br.com.agryo.listaencadeada;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("Primeiro");
        minhaListaEncadeada.add("David");
        minhaListaEncadeada.add("Myke");
        minhaListaEncadeada.add("Naruto");
        minhaListaEncadeada.add("Final");

        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));
        System.out.println(minhaListaEncadeada.get(4));

        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.remove(3));
        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.remove(0));
        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.size());

        System.out.println(minhaListaEncadeada.remove(0));
        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.remove(1));
        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.remove(0));
        System.out.println(minhaListaEncadeada);
        System.out.println(minhaListaEncadeada.remove(0));
    }
}
