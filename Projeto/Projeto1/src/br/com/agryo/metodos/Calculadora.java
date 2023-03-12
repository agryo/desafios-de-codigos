package br.com.agryo.metodos;
public class Calculadora {
    public static void somar(double valor1, double valor2){
        double resultado = valor1 + valor2;
        System.out.println("A soma dos valores: " + valor1 + " mais " + valor2 + " é igual a: " + resultado);
    }
    public static void subtrair(double valor1, double valor2){
        double resultado = valor1 - valor2;
        System.out.println("A subtração dos valores: " + valor1 + " menos " + valor2 + " é igual a: " + resultado);
    }
    public static void multiplicar(double valor1, double valor2){
        double resultado = valor1 * valor2;
        System.out.println("A multiplicação dos valores: " + valor1 + " vezes " + valor2 + " é igual a: " + resultado);
    }
    public static void dividir(double valor1, double valor2){
        double resultado = valor1 / valor2;
        System.out.println("A divisão dos valores: " + valor1 + " dividido por " + valor2 + " é igual a: " + resultado);
    }
}
