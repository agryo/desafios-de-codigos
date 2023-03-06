package br.com.agryo.listaduplamenteencadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaListaEncadeadaDupla = new ListaDuplamenteEncadeada<>();

        minhaListaEncadeadaDupla.add("Brasil");
        minhaListaEncadeadaDupla.add("Argentina");
        minhaListaEncadeadaDupla.add("Bulgaria");
        minhaListaEncadeadaDupla.add("Alemanha");
        minhaListaEncadeadaDupla.add("Chile");
        minhaListaEncadeadaDupla.add("Uruguai");
        minhaListaEncadeadaDupla.add("Bolivia");
        minhaListaEncadeadaDupla.add("Espanha");

        System.out.println(minhaListaEncadeadaDupla);

        minhaListaEncadeadaDupla.remove(3);
        minhaListaEncadeadaDupla.add(3, "Malasia");

        System.out.println(minhaListaEncadeadaDupla);
        System.out.println(minhaListaEncadeadaDupla.get(3));
    }
}
