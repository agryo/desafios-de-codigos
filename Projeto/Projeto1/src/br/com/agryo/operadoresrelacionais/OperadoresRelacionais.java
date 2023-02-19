package br.com.agryo.operadoresrelacionais;
public class OperadoresRelacionais {
    public static void main(String[] args) {
        //EXERCICIO 1
        //Todos os tipos de variavéis declaradas neste exemplo
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Cicrano";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597L;
        long l2 = 8997L;
        byte y1 = 1;
        short h1 = 25;

        //Aqui mostra os valores das variavéis i1 e i2
        System.out.println("i1 é: " + i1);
        System.out.println("i2 é: " + i2);
        //Aqui faz as compareções logicas entre i1 e i2
        System.out.println("i1 é igual a i2? " + (i1 == i2));
        System.out.println("i1 é diferente de i2? " + (i1 != i2));
        System.out.println("i1 é maior a i2? " + (i1 > i2));
        System.out.println("i1 é menor ou igual a i2? " + (i1 <= i2));
        //Valores de f1, f2 e d1
        System.out.println("f1 é: " + f1);
        System.out.println("f2 é: " + f2);
        System.out.println("d1 é: " + d1);
        //Comparações entre f1, f2 e d1
        System.out.println("f1 é igual a f2? " + (f1 == f2));
        System.out.println("f1 é igual a f1? " + (f1 == f1));
        System.out.println("f1 é diferente de d1? " + (f1 != d1));
        System.out.println("f1 é maior que f2? " + (f1 > f2));
        System.out.println("f1 é menor ou igual a f2? " + (f1 <= f2));
        //Valores de c1 e c2
        System.out.println("c1 é: " + c1);
        System.out.println("c2 é: " + c2);
        //Comparações entre c1 e c2
        System.out.println("c1 é igual a c2? " + (c1 == c2));
        System.out.println("c1 é diferente de c2? " + (c1 != c2));
        System.out.println("c1 é maior que c2? " + (c1 > c2));
        System.out.println("c1 é menor ou igual a c2? " + (c1 <= c2));
        //Valores de s1 e s2
        System.out.println("s1 é: " + s1);
        System.out.println("s2 é: " + s2);
        //Comparações entre s1 e s2
        //Formas corretas de comparação Strings!
        System.out.println("s1 é igual a s2? " + (s1 == s2));
        System.out.println("s1 é igual a s1? " + (s1 == s1));
        System.out.println("s1 é diferente de s3? " + (s1 != s3));
        //Forma erradas de comparação String!!!
        //System.out.println("s1 é maior que s2? " + (s1 > s2));
        //System.out.println("s1 é menor ou igual a s2? " + (s1 <= s2));
        //Comparações entre b1 e b2
        //Formas corretas de comparação Booleanas!
        System.out.println("b1 é igual a b2? " + (b1 == b2));
        System.out.println("b1 é diferente de b2? " + (b1 != b2));
        //Forma erradas de comparação Booleanas!!!
        //System.out.println("b1 é maior que b2? " + (b1 > b2));
        //System.out.println("b1 é menor ou igual a b2? " + (b1 <= b2));
        //Comparações possíveis entre variáveis de tipos diferentes, pois ambas são numeros
        System.out.println("i2 é maior que f2? " + (i2 > f1));
    }
}