package main.java.com.atividades2;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do produto:");
        double precoInicial = scanner.nextDouble();

        System.out.println("Agora o desconto que deseja atribuir:");
        double desconto = scanner.nextDouble();

        double precoFinal = precoInicial - (precoInicial * desconto /100);
        System.out.println("O valor final do produto é: " + precoFinal + "R$");
    }
}
