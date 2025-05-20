package main.java.com;

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número:");
        double numero = scanner.nextDouble();

        System.out.println("O resultado deste número ao quadrado é:");
        System.out.println(numero * numero);
    }
}
