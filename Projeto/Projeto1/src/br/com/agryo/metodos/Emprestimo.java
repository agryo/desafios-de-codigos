package br.com.agryo.metodos;

public class Emprestimo {
    private static int getDuasParcelas(){
        return 2;
    }
    //Esse método abaixo foi usado como público para ser usado como exemplo direto no parametro do calcularEmprestimo
    public static int getTresParcelas(){ return 3; }
    private static double getTaxaDuasParcelas(){
        return 0.65;
    }
    private static double getTaxaTresParcelas(){
        return 0.95;
    }
    public static void calcularEmprestimo(double valor, int parcela){
        if (parcela == 2){
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("O valor final do empréstimo de " + valor + " em 2 parcelas será: " + valorFinal);
        } else if (parcela == 3){
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("O valor final do empréstimo de " + valor + " em 3 parcelas será: " + valorFinal);
        }else {
            System.out.println("Não aceita essa quantidade de parcelas.");
        }
    }
}
