package br.com.agryo.filafifo;

public class Main {
    public static void main(String[] args) {
        //Fila<T> minhaFila = new Fila(); //Geerics = <T> generico, geral ´pode
        Fila<String> minhaFila = new Fila<>(); //Geerics = <String> só recebe String, outro da erro

        //minhaFila.enqueue(new No("Primeiro")); //enqueue = enfileirar, adicionar na fila. MODO RUIM!
        minhaFila.enqueue("Primeiro"); //enqueue = enfileirar, adicionar na fila. MODO BOM!
        //minhaFila.enqueue(true); //Booleano - Recebe tudo
        minhaFila.enqueue("Segundo");
        minhaFila.enqueue("Terceiro");//String
        //minhaFila.enqueue(4); //Inteiro
        minhaFila.enqueue("Quarto");
        minhaFila.enqueue("Quinto");
        minhaFila.enqueue("Sexto");
        minhaFila.enqueue("Sétimo");


        System.out.println("A fila está assim...");
        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue() + " - Sai da fila."); //dequeue = desenfileirar, tirar da fila.
        System.out.println("Ficam na fila...");
        System.out.println(minhaFila);

        minhaFila.enqueue("ÚLtimo"); //Adiciona na fila.
        System.out.println("Entrou alguém na fila!\nFicam na fila...");
        System.out.println(minhaFila);

        System.out.println(minhaFila.first() + " é o primeiro. -> está sendo atendido..."); //first = primeiro, apenas retorna o valor do primero da fila

        System.out.println(minhaFila.dequeue() + " - Sai da fila."); //dequeue = desenfileirar, tirar da fila, quem é atendido, sai
        System.out.println("Ficam na fila...");
        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue() + " - Sai da fila."); //dequeue = desenfileirar, tirar da fila, quem é atendido, sai
        System.out.println("Ficam na fila...");
        System.out.println(minhaFila);
        System.out.println(minhaFila.first() + " é o primeiro. -> Está sendo atendido...");
    }
}
