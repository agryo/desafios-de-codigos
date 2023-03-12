package br.com.agryo.quadrilateroreturn;

public class Quadrilatoro {
    //Como proposto no exercício, foi usado a sobrecarga do método
    public static double area(double largura){
        return largura * largura;
    }
    public static double area(double base, double altura){
        return base * altura;
    }
    public static double area(double altura, double bMenor, double bMaior){
        return ((bMaior + bMenor) * altura) / 2;
    }
    public static float area(float diagonal1, float diagonal2){
        return (diagonal1 * diagonal2) / 2;
    }
}
