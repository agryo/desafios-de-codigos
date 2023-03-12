package br.com.agryo.metodos;

public class Mensagem {
    public static void obterMensagem(int hora){
        switch (hora){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                msgBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                msgBoaTarde();
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                msgBoaNoite();
                break;
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                msgBoaMadrugada();
                break;
        }
    }
    private static void msgBomDia(){
        System.out.println("Bom dia! Tenha um ótimo dia hoje.");
    }
    private static void msgBoaTarde(){
        System.out.println("Boa tarde! Tenha um ótimo dia hoje, espero que não esteja muito quente agora.");
    }
    private static void msgBoaNoite(){
        System.out.println("Boa noite! Caso vá dormir agora, tenha um bom sono.");
    }
    private static void msgBoaMadrugada(){
        System.out.println("Boa madrugada! Vá dormir para não ter sono durante o dia.");
    }
}
