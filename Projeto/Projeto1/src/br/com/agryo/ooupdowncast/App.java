package br.com.agryo.ooupdowncast;

public class App {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        //Upcasts implicito
        Funcionario faxineiro = new Faxineiro();
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();

        //Gerente gerente_ = new Funcionario(); //aqui sem explicitar
        //Downcast explicito tem que dizer qual
        Vendedor vendedor_ = (Vendedor) new Funcionario(); //Da erro pois nem tudo que tem em Vendedor tem em Funcionario.
    }
}
