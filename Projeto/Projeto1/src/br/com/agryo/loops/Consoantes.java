package br.com.agryo.loops;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeCosoantes = 0;
        int contador = 0;

        System.out.println("O tamanho do vetor é: " + consoantes.length);

        do{
            System.out.print("Digite uma letra: ");
            String letra = digitar.next();

            if ( !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) ){
                consoantes[contador] = letra;
                quantidadeCosoantes++;
            }
            contador++;
        }while (contador < consoantes.length);

        System.out.println("\nA quantidade de consoantes foi: " + quantidadeCosoantes);
        System.out.println("As consoantes desse vetor são: ");
        for ( String consoante : consoantes ){
            if (consoante != null)
                System.out.print(consoante + " ");
        }

    }
}
