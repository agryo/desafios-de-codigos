package br.com.agryo.operadoresrelacionais;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String diaSemana;
        System.out.println("Segundo exercicio sobre SWITCH!");
        System.out.println("Digite o dia da semana para informar o número correspondente: ");
        diaSemana = scan.nextLine();
        numeroDia(diaSemana);

    }

    public static void numeroDia(String diaSemana) {
        switch (diaSemana) {
            case ("Domingo"):
                System.out.println("O dia " + diaSemana + " corresponde ao número 1!");
                break;
            case ("Segunda"):
                System.out.println("O dia " + diaSemana + " corresponde ao número 2!");
                break;
            case ("Terça"):
                System.out.println("O dia " + diaSemana + " corresponde ao número 3!");
                break;
            case ("Quarta"):
                System.out.println("O dia " + diaSemana + " corresponde ao número 4!");
                break;
            case ("Quinta"):
                System.out.println("O dia " + diaSemana + " corresponde ao número 5!");
                break;
            case ("Sexta"):
                System.out.println("O dia " + diaSemana + " corresponde ao número 6!");
                break;
            case ("Sábado"):
                System.out.println("O dia " + diaSemana + " corresponde ao número 7!");
                break;
            default:
                System.out.println("Digite corretamente o dia com acentuação e apenas a primeira letra maiuscula!");
                break;
        }

    }
}
