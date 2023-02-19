package br.com.agryo.operadoresrelacionais;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        int i1 = 1;
        int i2 = 2;
        float f1 = 5.5f;
        float f2 = 8.6f;

        //Valores das variavéis b1, b2, b3 e b4
        System.out.println("b1 é: " + b1);
        System.out.println("b2 é: " + b2);
        System.out.println("b3 é: " + b3);
        System.out.println("b4 é: " + b4);
        System.out.println("Valores da variaveis para exemplos de expressões");
        System.out.println("i1 é: " + i1);
        System.out.println("i2 é: " + i2);
        System.out.println("f1 é: " + f1);
        System.out.println("f2 é: " + f2);
        //Operações Lógicas conectivo E (and)
        System.out.println("b1 e b2 é: " + (b1 && b2));
        System.out.println("b1 e b3 é: " + (b1 && b3));
        //Operações Lógicas conectivo OU (or)
        System.out.println("b2 ou b3 é: " + (b2 && b3));
        System.out.println("b2 ou b4 é: " + (b2 && b4));
        //Operações Lógicas conectivos OU EXCLUSIVO (xor)
        System.out.println("ou b1 ou b3 não ambas é: " + (b1 ^ b3));
        System.out.println("ou b4 ou b1 não ambas é: " + (b4 ^ b1));
        //Operações Lógicas conectivos NEGAÇÃO (-)
        System.out.println("Negação de b1 é: " + (!b1));
        System.out.println("Negação de b2 é: " + (!b2));
        //Expressões usando Operações Lógicas
        System.out.println("Resultado lógico de (i1 é maior que i2) OU (resultado de f2 é menor que f1) é: " + ((i1 > i2) || (f2 < f1)));
        System.out.println("Resultado lógico da (soma de i1 + i2) MENOR QUE o (resultado da subtração de f2 - f1) E o valor lógico VERDADE é: " + ((((i1 + i2) < (f2 - f1)) && true)));

        //Exemplos de simplificação de expressões
        //Exemplo de uso de lógica para ver qyem recebe ayxílio alimentação
        double salarioMensal = 1623.50d;
        double salarioMedio = 2787.50d;
        int quantidadeDependentes = 9;
        int mediaDependentes = 5;
        //Exemplos de lógicas
        System.out.println("------------------------------------");
        System.out.println("Exemplo do calculo do Auxílio Brasil");
        System.out.println("Salário Mensal: " + salarioMensal);
        System.out.println("Média Salarial: " + salarioMedio);
        System.out.println("Quantidade de dependentes da família: " + quantidadeDependentes);
        System.out.println("Média de dependentes por família: " + mediaDependentes);
        System.out.println("------------------------------------");
        //Primeira lógica de expressão
        System.out.println("Primeira lógica");
        System.out.println("Recebe Auxílio: " + ((salarioMensal < salarioMedio) && (quantidadeDependentes >= mediaDependentes)));
        //Segunda lógica
        System.out.println("Segunda lógica");
        //Cria variaveis para serem apriveitadas
        boolean salarioBaixo = salarioMensal < salarioMedio;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
        //Já diminui bastante a segunda lógica
        System.out.println("Recebe Auxílio: " + ((salarioBaixo) && (muitosDependentes)));
        //Terceira lógica aproveitando as variavéis criando uma nova variável
        System.out.println("Terceira lógica");
        boolean recebeAuxilio = salarioBaixo && muitosDependentes;
        //Toda a primeira expressão foi reduzida a uma variável
        System.out.println("Recebe Auxílio: " + recebeAuxilio);
        }
}
