package br.com.fiap;

import java.util.Scanner;

public class EntradaDeDado {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, resultado = 0;
        // declaração de objeto
        Scanner scan; // Scanner scan new Scanner(System.in);
        try {
            // instanciando um objeto
            scan = new Scanner(System.in);
            System.out.println("Digite um número inteiro:");
            num1 = scan.nextInt();
            System.out.println("Digite outro numero inteiro:");
            num2 = scan.nextInt();
            resultado = num1 + num2;
            System.out.println("Valor 1: " + num1 + "\nValor 2: " + num2 + "\nSomatório: " + resultado);
        } catch (Exception e) {
            System.out.println("Fomato de número incorreto.");;
        }

    }
}
