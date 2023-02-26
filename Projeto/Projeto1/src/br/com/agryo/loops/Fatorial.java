package br.com.agryo.loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);

        int numero;
        int multiplicacao = 1;

        System.out.println("Digite um número e mostrarei a Fatorial desse número.");
        System.out.println("Digite o número: ");
        numero = digitar.nextInt();
        System.out.println("O fatorial de " + numero + " é:");
        System.out.print(numero + "! = ");

        for (int i = numero; i >= 1; i--){
            multiplicacao = multiplicacao*i;
            System.out.print(i);
            if (i > 1) System.out.print(" x ");
        }
        System.out.println(" = " + multiplicacao);
    }
}
