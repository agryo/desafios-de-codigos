package br.com.agryo.loops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);

        int nota;

        // Esse foi o modo que eu encontrei para resolver esse problema
        while (true){
            System.out.println("Digite uma nota de 0 a 10: ");
            nota = digitar.nextInt();
            if (nota >=0 && nota <=10){
                System.out.println(("Muito bem, a nota foi: ") + nota);
                break;
            }
            else System.out.println("Nota inexistente, escolha entre 0 e 10.");
        }
        System.out.println("Continua daqui. Agora a forma da resolução do exercicio...");

        System.out.println("Digite uma nota de 0 a 10: ");
        nota = digitar.nextInt();

        /* Essa foi a forma da resolução do exercicio,
           bem melhor que a que eu fiz
        */
        while (nota < 0 | nota > 10){
            System.out.println("Nota inválida! Digite notamente: ");
            nota = digitar.nextInt();
        }
        System.out.println("Muito bem, a nota foi: " + nota);
        System.out.println("Continuaria daqui...");
    }
}
