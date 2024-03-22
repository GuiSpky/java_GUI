package exercicio;

import com.uniAlfa.cadastroPessoa;

import javax.swing.*;

public class App  {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame tela = new Calculadora();
            tela.setVisible(true);

        });
    }
}
