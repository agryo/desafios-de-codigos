package br.com.agryo.listacircular;

import java.lang.management.MonitorInfo;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("Jony");
        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("Deppy");
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("Petter");
        minhaListaCircular.add("Parker");
        System.out.println(minhaListaCircular);

        /*System.out.println(minhaListaCircular.get(0));
        System.out.println(minhaListaCircular.get(1));
        System.out.println(minhaListaCircular.get(2));
        System.out.println(minhaListaCircular.get(3));
        System.out.println(minhaListaCircular.get(4));*/
        for (int i =0; i < 20; i++){
            System.out.println(minhaListaCircular.get(i));
        }
    }
}
