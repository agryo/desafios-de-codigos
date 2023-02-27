package br.com.agryo.loops;

import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++){
            int numero = aleatorio.nextInt(100 );
            numerosAleatorios[i] = numero;
        }

        System.out.println("---------------------------------");
        System.out.println("  Gerador de números aleatorios");
        System.out.println("---------------------------------");

        System.out.print("Sequência dos números aleatórios : ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nAntecessor dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }

        System.out.print("\nSucessores dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }

    }
}
