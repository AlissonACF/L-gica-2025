package main.java.com.atividades1;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double primeiraNota = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double segundaNota = scanner.nextDouble();

        double soma = primeiraNota + segundaNota;
        double media = soma /2;

        System.out.println("Sua média é:");
        System.out.println(media);
    }
}
