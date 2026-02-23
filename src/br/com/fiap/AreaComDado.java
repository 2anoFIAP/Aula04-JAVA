package br.com.fiap;

import java.util.Scanner;

public class AreaComDado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("digite o valor do raio do circulo: ");
            double raio = scan.nextDouble();
            double area = Math.PI * Math.pow(raio, 2);
            System.out.printf("A Area do circulo vai ser: %.2f%n", area);
        } catch (Exception e) {
            System.out.println("Formato de numero invalido!");
        }
    }
}
