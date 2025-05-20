package main.java.com.atividades1;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de B:");
        double valorB = scanner.nextDouble();

        System.out.println("Agora digite o valor de A:");
        double valorA = scanner.nextDouble();

        System.out.println("Agora digite o valor de C:");
        double valorC = scanner.nextDouble();

        double baskara = (valorB * valorB - 4 * valorA * valorC) / (2 * valorA);
        System.out.println("O resultado da fórmula é: " + baskara);
    }
}
