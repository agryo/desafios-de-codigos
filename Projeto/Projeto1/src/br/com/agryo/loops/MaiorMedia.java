package br.com.agryo.loops;

import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);

        int contador = 5;
        double numero;
        double soma = 0d;
        double maior = 0d;

        System.out.println("----------------------------------------------------------");
        System.out.println("Digite 5 numeros que vou informar o Maior e a Média deles.");
        System.out.println("----------------------------------------------------------");

        do {
            System.out.println("Faltam " + contador + ", digite o numero: ");
            numero = digitar.nextDouble();
            contador--;
            soma = soma + numero;
            if (numero > maior) maior = numero;
        } while (contador != 0);

        System.out.println("O maior numéro foi: " + maior);
        System.out.println("E a Média dos números foi: " + (soma/5));
        System.out.println("Finalizado!");
    }
}
