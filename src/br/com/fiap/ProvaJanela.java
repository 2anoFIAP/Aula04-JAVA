package br.com.fiap;

import javax.swing.*;

public class ProvaJanela {
    public static void main(String[] args) {
        float prova1, prova2, prova3, prova4, media;
        String auxiliar;

        try {
            auxiliar = JOptionPane.showInputDialog("Digite a nota da primeira prova: ");
            prova1 = Float.parseFloat(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite a nota da segunda prova: ");
            prova2 = Float.parseFloat(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite a nota da terceira prova: ");
            prova3 = Float.parseFloat(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite a nota da quarta prova: ");
            prova4 = Float.parseFloat(auxiliar);

            media = (prova1 + prova2 + prova3 + prova4) / 4;
            String mensagem = "Nota 1: " + prova1 +
                    "\nNota 2: " + prova2 +
                    "\nNota 3: " + prova3 +
                    "\nNota 4: " + prova4 +
                    "\n\nMédia: " + media;

            JOptionPane.showMessageDialog(null, mensagem);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Notas inválidas! Certifique-se de digitar apenas números (use ponto para decimais).");
        }
    }
}