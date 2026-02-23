package br.com.fiap;

import java.util.Scanner;

public class ProvaConsole {
    public static void main(String[] args) {
        float prova1, prova2, prova3, prova4, media;
        Scanner scan;
        try {
            scan = new Scanner(System.in);
            System.out.println("Digite os valores de cada prova:");
            prova1 = scan.nextFloat();
            prova2 = scan.nextFloat();
            prova3 = scan.nextFloat();
            prova4 = scan.nextFloat();
            media = (prova1 + prova2 + prova3 + prova4)/4;
            System.out.println("Nota 1: " + prova1 + "\nNote 2: " + prova2 + "\nNota 3: " + prova3 + "\nNota 4: " + prova4 + "\nmedia: " + media);
        } catch (Exception e) {
            System.out.println("Valores incorretos burro.");
        }
    }
}
