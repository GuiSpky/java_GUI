package exercicio;

import javax.swing.*;
import java.awt.*;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showMessageDialog;

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

        JLabel labelNome1 = new JLabel("Campo1:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        painel.add(labelNome1, constraints);

        JLabel labelNome2 = new JLabel("Campo 2:");
        constraints.gridx = 1;
        constraints.gridy = 0;
        painel.add(labelNome2, constraints);

        campoValor1 = new JTextField(10);
        constraints.gridx = 0;
        constraints.gridy = 1;
        painel.add(campoValor1,constraints);


        campoValor2 = new JTextField(10);
        constraints.gridx = 1;
        constraints.gridy = 1;
        painel.add(campoValor2,constraints);

        botaoSomar = new JButton("Somar");
        botaoSomar.addActionListener(e -> somar());
        constraints.gridx = 2;
        constraints.gridy = 0;
        painel.add(botaoSomar,constraints);


        add(painel);
        setLocationRelativeTo(null);

    }


    private void validarCampo1()throws NumberFormatException{
        if (campoValor1.getText().isEmpty())
            throw new RuntimeException("Campo 1 não pode ser vazio!");
            var numero = Integer.parseInt(campoValor1.getText());

//            throw new NumberFormatException("Campo 1 deve conter um valor numérico");

    }

    private void validarCampo2()throws NumberFormatException{
        if (campoValor2.getText().isEmpty())
            throw new RuntimeException("Campo 2 não pode ser vazio!");
        var numero = Integer.parseInt(campoValor2.getText());

    }
    private void somar(){ // Feito 2 try-catch, um para validar cada campo
        try{
            validarCampo1();
        }catch (NumberFormatException e){ //valida se o campo contem apenas numeros
            showMessageDialog(this,
                    "Campo 1 deve ser numerico");
        }catch (RuntimeException re) { //valida se o campo esta vazio
            showMessageDialog(this,
                    re.getMessage());
        }

        try{
            validarCampo2();
        }catch (NumberFormatException e){ //valida se o campo contem apenas numeros
            showMessageDialog(this,
                    "Campo 2 deve ser numerico");
        }catch (RuntimeException re) { //valida se o campo esta vazio
            showMessageDialog(this,
                    re.getMessage());
        }


        int resultado;
        int valor1 = parseInt(campoValor1.getText()); //pega os valres dos campos Jtext e passa para numerico
        int valor2 = parseInt(campoValor2.getText());
        resultado = valor1 + valor2;
//        System.out.println(resultado);
        JOptionPane.showMessageDialog(this,
                valor1+" + "+valor2+" = "+resultado);
    }


}
