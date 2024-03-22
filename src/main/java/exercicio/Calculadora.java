package exercicio;

import javax.swing.*;
import java.awt.*;

import static java.lang.Integer.parseInt;

public class Calculadora extends JFrame {

    private JTextField campoValor1;
    private  JTextField campoValor2;
    private JButton botaoSomar;

    public Calculadora(){
        setTitle("Somadora");
        setSize(400, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel painel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5,5,5,5);

        campoValor1 = new JTextField(10);
        constraints.gridx = 0;
        constraints.gridy = 0;
        painel.add(campoValor1,constraints);

        campoValor2 = new JTextField(10);
        constraints.gridx = 1;
        constraints.gridy = 0;
        painel.add(campoValor2,constraints);

        botaoSomar = new JButton("Somar");
        botaoSomar.addActionListener(e -> somar());
        constraints.gridx = 2;
        constraints.gridy = 0;
        painel.add(botaoSomar,constraints);


        add(painel);
        setLocationRelativeTo(null);

    }

    private void somar(){
        int resultado;
        int valor1;
        int valor2;
        valor1 = parseInt(campoValor1.getText());
        valor2 = parseInt(campoValor2.getText());
        resultado = valor1 + valor2;
//        System.out.println(resultado);
        JOptionPane.showMessageDialog(this,
                valor1+" + "+valor2+" = "+resultado);

    }
}
