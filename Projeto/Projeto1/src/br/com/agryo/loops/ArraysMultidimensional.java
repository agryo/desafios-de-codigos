package br.com.agryo.loops;

import java.awt.*;
import java.util.Random;

public class ArraysMultidimensional {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int[][] multi = new int[4][4];

        for (int i = 0; i < multi.length; i++){
            for (int c = 0; c < multi[i].length; c++){
                multi[i][c] = aleatorio.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : multi) {
            for (int itemDaColuna : linha) {
                System.out.print(itemDaColuna + " ");
            }
            System.out.println();
        }
    }
}
