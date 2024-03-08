package com.uniAlfa;

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->{
            JFrame tela = new cadastroPessoa();
            tela.setVisible(true);
        });
    }
}
