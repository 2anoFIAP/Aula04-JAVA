package br.com.fiap;

import java.util.Scanner;

public class EntradaDeDado {
    public static void main(String[] args) {
        int num1 = 0;
        // declaração de objeto
        Scanner scan;
        // instanciando um objeto
        scan = new Scanner(System.in);
        // Scanner scan new Scanner(System.in);
        try {
            System.out.println("Digite um número inteiro:\n->");
            num1 = scan.nextInt();
            System.out.println("Você digitou: " + num1);
        } catch (Exception e) {
            System.out.println("Fomato de número incorreto.");;
        }

    }
}
