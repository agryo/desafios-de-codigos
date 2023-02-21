package br.com.agryo.operadoresrelacionais;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String diaSemana;
        int numero;
        System.out.println("Segundo exercicio sobre SWITCH!");
        System.out.println("Digite o dia da semana para informar o número correspondente: ");
        diaSemana = scan.nextLine();
        numeroDia(diaSemana);
        numero = pegaNumero(diaSemana);
        System.out.println("Dia: " + numero);
        bonus(numero);
        ferias(numero);
    }
    public static void numeroDia(String diaSemana){
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
    public static int pegaNumero(String dia){
        int numero = 0;
        switch (dia) {
            case ("Domingo"):
                numero = 1;
                break;
            case ("Segunda"):
                numero = 2;
                break;
            case ("Terça"):
                numero = 3;
                break;
            case ("Quarta"):
                numero = 4;
                break;
            case ("Quinta"):
                numero = 5;
                break;
            case ("Sexta"):
                numero = 6;
                break;
            case ("Sábado"):
                numero = 7;
                break;
        }
        return numero;
    }
    public static void bonus(int numero){
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo!");
                break;
            case 4:
                System.out.println("Errado!");
                break;
            case 5:
                System.out.println("Talvez!");
                break;
            default:
                System.out.println("Valor indefinido!");
        }

    }
    public static void ferias(int numero){
        switch (numero){
            case 1:
            case 6:
            case 7:
                System.out.println("Você está de FERIAS!");
                break;
            default:
                System.out.println("Você está trabalhando...");
                break;
        }
    }
}
