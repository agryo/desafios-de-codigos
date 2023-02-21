package br.com.agryo.loops;

import java.util.Scanner;

/*
Faça um programa que receba dois valores de dados no teclado,
o primeiro representa um nome de aluno e o outro a idade do aluno,
e ele irá repetir enquanto o usuario desejar.
(O programa só para quando o campo nome recebet o numero 0 a desejo do usuario)
 */
public class Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Digite o Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Digite a Idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Continuaria daqui...");
    }
}
