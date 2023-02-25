package br.com.agryo.loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);

        int numeroTabuada = 0;
        int tabuada;

        System.out.println("Gerador de Tabuadas!");
        System.out.println("Digite 1 para Soma, 2 para Subtração, 3 para Multiplicação e 4 para Divisão:");
        while (numeroTabuada < 1 | numeroTabuada > 4){
            System.out.println("Digite um dos números listados acima.");
            numeroTabuada = digitar.nextInt();
        }
        System.out.println("Qual Tabuada você deseja gerar? ");
        tabuada = digitar.nextInt();

        for (int n = 1; n <= 10; n++)
            if (numeroTabuada == 1)
                System.out.println(tabuada + " + " + n + " = " + (tabuada+n));
            else if (numeroTabuada == 2)
                System.out.println(tabuada + " - " + n + " = " + (tabuada-n));
            else if (numeroTabuada == 3)
                System.out.println(tabuada + " x " + n + " = " + (tabuada*n));
            else if (numeroTabuada == 4) {
                double div = 0d, tab = 0d, d = 0d;
                tab = tabuada;
                d = n;
                div = tab/d;
                System.out.println(tabuada + " % " + n + " = " + div);
            }
        System.out.println("Termina aqui!");
    }
}
