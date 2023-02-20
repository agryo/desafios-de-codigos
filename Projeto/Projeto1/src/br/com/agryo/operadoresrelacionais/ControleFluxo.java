package br.com.agryo.operadoresrelacionais;

import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) {
        //Primeiro exercucio sobre o IF
        //Importando Objeto Scanner que serve para receber o número dugitado
        Scanner scan = new Scanner(System.in);
        //Criação da variaverel
        int escolherMes;
        //Exibir os meses do ano de acordo com seu numero
        System.out.println("Primeiro exercicio sobre IF!");
        System.out.println("Digite um numero de 1 a 12 para achar o mês correspondente: ");
        //Chama o objeto scanner para ser digitado o número
        escolherMes = scan.nextInt();
        //Chama o metodo criado abaixo com o numero já escolhido
        ifFlecha(escolherMes); //Esse método deve ser evitado pois dificulta a solução de problemas nessa flecha
        bonus(escolherMes);
    }
    //Método para escolher o mês
    public static void ifFlecha(int numeroMes){
        if (numeroMes == 1){
            System.out.println("O mês correspondente ao numero: " + numeroMes + " é Janeiro!");
        }else {
            if (numeroMes == 2){
                System.out.println("O mês correspondente ao numero: " + numeroMes + " é Fevereiro!");
            }else {
                if (numeroMes == 3){
                    System.out.println("O mês correspondente ao numero: " + numeroMes + " é Março!");
                }else {
                    if (numeroMes == 4){
                        System.out.println("O mês correspondente ao numero: " + numeroMes + " é Abril!");
                    }else {
                        if (numeroMes == 5){
                            System.out.println("O mês correspondente ao numero: " + numeroMes + " é Maio!");
                        }else {
                            if (numeroMes == 6){
                                System.out.println("O mês correspondente ao numero: " + numeroMes + " é Junho!");
                            }else {
                                if (numeroMes == 7){
                                    System.out.println("O mês correspondente ao numero: " + numeroMes + " é Julho!");
                                }else {
                                    if (numeroMes == 8){
                                        System.out.println("O mês correspondente ao numero: " + numeroMes + " é Agosto!");
                                    }else {
                                        if (numeroMes == 9){
                                            System.out.println("O mês correspondente ao numero: " + numeroMes + " é Setembro!");
                                        }else {
                                            if (numeroMes == 10){
                                                System.out.println("O mês correspondente ao numero: " + numeroMes + " é Outubro!");
                                            }else {
                                                if (numeroMes == 11){
                                                    System.out.println("O mês correspondente ao numero: " + numeroMes + " é Novembro!");
                                                }else {
                                                    if (numeroMes == 12){
                                                        System.out.println("O mês correspondente ao numero: " + numeroMes + " é Dezembro!");
                                                    }else
                                                        System.out.println("Esse número não corresponde a nenhum mês!");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    //Método para informar se o mês é de Férias
    public static void bonus(int mes){
        if ((mes == 1) || (mes == 7) || (mes == 12)){
            System.out.println("Você está de FERIAS!!!");
        }
    }
}
