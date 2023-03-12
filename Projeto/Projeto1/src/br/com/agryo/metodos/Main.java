package br.com.agryo.metodos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);

        double emprestimo, valor1, valor2;
        int parcela, hora;

        System.out.println("----------------------------------------------");
        System.out.println("        USO DO MÉTODO DA CALCULADORA!");
        System.out.println("----------------------------------------------");
        System.out.println("Digite dois números para realizar as operações");
        System.out.println("Digite o primeiro número: ");
        valor1 = digitar.nextDouble();
        System.out.println("Digite o segundo número: ");
        valor2 = digitar.nextDouble();

        Calculadora.somar(valor1, valor2);
        Calculadora.subtrair(valor1, valor2);
        Calculadora.multiplicar(valor1, valor2);
        Calculadora.dividir(valor1, valor2);

        System.out.println("------------------------------------------------------------------------");
        System.out.println("                   AGORA USO DO MÉTODO DE EMPRÉSTIMO!");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Digite quanto quer de empréstimo e quantas parcelas, em 2 ou 3 parcelas");
        System.out.println("Digite quanto quer de empréstimo: ");
        emprestimo = digitar.nextDouble();
        System.out.println("Digite em quantas parcelas quer dividir (2 ou 3 parcelas): ");
        parcela = digitar.nextInt();

        Emprestimo.calcularEmprestimo(emprestimo, parcela);
        //Aqui foi usado diretamente o método que pega 3 parcelas
        Emprestimo.calcularEmprestimo(emprestimo, Emprestimo.getTresParcelas());

        System.out.println("----------------------------------------------------------");
        System.out.println("               AGORA USO DO MÉTODO MENSAGEM!!");
        System.out.println("----------------------------------------------------------");
        System.out.println("Digite apenas a hora sem os minutos e receba uma mensagem.");
        System.out.println("Digite somente a hora: ");
        hora = digitar.nextInt();

        Mensagem.obterMensagem(hora);
    }
}
