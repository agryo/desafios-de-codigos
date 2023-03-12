package br.com.agryo.quadrilateroreturn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);

        double altura, largura, bMenor, bMaior;
        float diagonal1, diagonal2;

        System.out.println("----------------------------------------------");
        System.out.println("        USO DO MÉTODO DA QUADRILATERO!");
        System.out.println("----------------------------------------------");
        System.out.println("Primeiro o cálculo da área do Quadrado.");
        System.out.println("Digite a largura dos lados do Quadrado.");
        largura = digitar.nextDouble();

        //O retorno já pode ser adicionado diretamente na variável
        double areaQuadrado = Quadrilatoro.area(largura);
        System.out.println("A área do Quadrado é: " + areaQuadrado);

        System.out.println("\nAgora o cálculo da área do Retângulo.");
        System.out.println("Digite a base do retângulo: ");
        bMaior = digitar.nextDouble();
        System.out.println("Digite a altura do retângulo: ");
        altura = digitar.nextDouble();

        //O retorno já pode ser adicionado diretamente na variável
        double areaRetangulo = Quadrilatoro.area(bMaior, altura);
        System.out.println("A área do Retângulo é: " + areaRetangulo);

        System.out.println("\nAgora o cálculo da área do Trapézio.");
        System.out.println("Digite a base maior do trapézio: ");
        bMaior = digitar.nextDouble();
        System.out.println("Digite a base menor do trapézio: ");
        bMenor = digitar.nextDouble();
        System.out.println("Digite a altura do trapézio: ");
        altura = digitar.nextDouble();

        //O retorno já pode ser adicionado diretamente na variável
        double areaTrapezio = Quadrilatoro.area(bMaior, bMenor, altura);
        System.out.println("A área do Trapézio é: " + areaTrapezio);

        System.out.println("\nAgora o cálculo da área do Lozango.");
        System.out.println("Digite a primeira diagonal do lozango: ");
        diagonal1 = digitar.nextFloat();
        System.out.println("Digite a segunda diagonal do lozango: ");
        diagonal2 = digitar.nextFloat();

        //O retorno já pode ser adicionado diretamente na variável
        float areaLozango = Quadrilatoro.area(diagonal1, diagonal2);
        System.out.println("A área do Lozango é: " + areaLozango);
    }
}
