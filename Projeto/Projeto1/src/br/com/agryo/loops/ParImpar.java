package br.com.agryo.loops;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);

        int numero;
        int par = 0;
        int impar = 0;
        int contador = 10;

        System.out.println("Digite 10 números inteiros");
        System.out.println("e vou dizer quantos são Par e quantos são Impar.");

        do {
            System.out.println("Digite um numero: ");
            numero = digitar.nextInt();
            contador--;
            if (numero % 2 == 0) par++;
            else impar++;
        } while (contador != 0);
        System.out.println("O total de números PAR foi: " + par);
        System.out.println("O total de números IMPAR foi: " + impar);
        System.out.println("Finalizado!");
    }
}
