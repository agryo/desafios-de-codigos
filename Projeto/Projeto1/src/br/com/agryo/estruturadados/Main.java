package br.com.agryo.estruturadados;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = a;

        System.out.println("Variável A = " + a + " - Variável B = " + b);

        a = 2;
        System.out.println("Variável A = " + a + " - Variável B = " + b);

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("Objeto A = " + objA + " - Objeto B = " + objB);

        objA.setNum(2);
        System.out.println("Objeto A = " + objA + " - Objeto B = " + objB);
    }
}
