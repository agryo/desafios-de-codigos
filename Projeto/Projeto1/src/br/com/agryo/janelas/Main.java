package br.com.agryo.janelas;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame janelaPrincipal = new JFrame("Programa");
        final JLabel mensagem = new JLabel("\n-------- Teste de Programa Gráfico! --------\n", SwingConstants.CENTER);
        janelaPrincipal.getContentPane().add(mensagem, BorderLayout.CENTER);
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPrincipal.pack();
        janelaPrincipal.setVisible(true);
    }
}
