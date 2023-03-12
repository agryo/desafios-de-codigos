package br.com.agryo.quadrilateros;

public class Quadrilateros {
    //Como proposto no exercício, foi usado a sobrecarga do método
    public static void area(double largura){
        double area = largura * largura;
        System.out.println("A área do quadrado com largura: " + largura + " é igual a " + area);
    }
    public static void area(double base, double altura){
        double area = base * altura;
        System.out.println("A área do retangulo com a base: " + base + " e altura: " + altura + " é igual a: " + area);
    }
    public static void area(double altura, double bMenor, double bMaior){
        double area = ((bMaior + bMenor) * altura) / 2;
        System.out.println("A área do trapezio com altura: " + altura + " base menor " + bMenor + " e base maior " + bMaior + " é igual a: " + area);
    }
    public static void area(float diagonal1, float diagonal2){
        double area = (diagonal1 * diagonal2) / 2;
        System.out.println("A área do lozango com a diagonal 1: " + diagonal1 + " e diagonal 2: " + diagonal2 + " é igual a: " + area);
    }
}
