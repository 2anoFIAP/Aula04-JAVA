package br.com.fiap;

import javax.swing.*;

public class AreaComJanela {
    public static void main(String[] args) {
        try {
            String auxiliar = JOptionPane.showInputDialog("Digite o valor do raio do circulo: ");
            double raio = Double.parseDouble(auxiliar);
            double area = Math.PI * Math.pow(raio, 2);
            String mensagemMelhorada = String.format("A area do circulo vai ser: %.2f", area);
            JOptionPane.showMessageDialog(null, mensagemMelhorada);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato numerico invalido!");
        }
    }
}
