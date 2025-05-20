package main.java.com.atividades1;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base do triângulo:");
        double base = scanner.nextDouble();

        System.out.println("Agora digite a altura:");
        double altura = scanner.nextDouble();

        System.out.println("A área do triângulo é: " + base * altura /2);

    }
}
