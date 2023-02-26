package br.com.agryo.loops;

import javax.sound.midi.Soundbank;

public class Vetor {
    public static void main(String[] args) {
        //O vetor ou array inicia na posição 0 e segue até 5, Ex. 0,1,2,3,4,5
        //Que nesse caso abaixo tem 6 posições pois o 0 é contado.
        int[] vetor = {59, 12, 48, 99, 15, 85};
        int contador = 0;

        System.out.println("O tamanho do vetor é: " + vetor.length); //Exibe o tamanho do vetor que nesse exemplo é 6
        System.out.print("Os números dentro do vetor são: ");
        //Usando o While
        while (contador < vetor.length){
            System.out.print(vetor[contador] + " ");
            contador++;
        }
        //Usando For
        System.out.print("\nA ordem invertida do vetor são: "); //O "\n" serve para quebrar uma linha
        for (int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
