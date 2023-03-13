package br.com.agryo.somahden;
// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.
import java.util.Scanner;
public class Main {
    public static void main(String[] Args) {

        double h = 0;
        double n = new java.util.Scanner(System.in).nextDouble();

        //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
        for (int i = 1; i <= n; h += (1.0 / i), i++);
        //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
        System.out.println(Math.round(h));
    }
}