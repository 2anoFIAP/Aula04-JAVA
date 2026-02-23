package br.com.fiap;

import java.util.Scanner;

public class IdadeComDado {
     public static void main(String[] args) {
         int ano_atual, ano_nascimento, idade;
         Scanner scan;
         try {
             scan = new Scanner(System.in);
             System.out.println("Digite o ano atual: ");
             ano_atual = scan.nextInt();
             System.out.println("Digite o seu ano de nascimento");
             ano_nascimento = scan.nextInt();
             idade =  ano_atual-ano_nascimento;
             System.out.println("Ano Atual: " + ano_atual + " Ano que nasceu: " + ano_nascimento + " Sua idade: " + idade);
         } catch (Exception e) {
             System.out.println("Formato de numero incorreto");
         }
     }
}
