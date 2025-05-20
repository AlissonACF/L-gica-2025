package main.java.com;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double segundoNumero = scanner.nextDouble();

        System.out.println("O resultado da adição desses números é:");
        System.out.println(primeiroNumero + segundoNumero);
    }
}
