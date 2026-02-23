package br.com.fiap;

import javax.swing.*;

public class IdadeComJanela {
    public static void main(String[] args) {
        int ano_atual, ano_nascimento, idade;
        String auxiliar;
        try {
            auxiliar = JOptionPane.showInputDialog("Digite o ano Atual: ");
            ano_atual = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite o ano q voce nasceu: ");
            ano_nascimento = Integer.parseInt(auxiliar);
            idade = ano_atual - ano_nascimento;
            JOptionPane.showMessageDialog(null, "Ano atual: " + ano_atual + " Ano que nasceu: " + ano_nascimento + " idade atual: " + idade);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato numerico incorreto");
        }
    }
}
