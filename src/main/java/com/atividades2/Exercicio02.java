package main.java.com.atividades2;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua temperatura em graus Celcius:");
        double temperaturaCelcius = scanner.nextDouble();

        double conversao = temperaturaCelcius * 9/5 + 32;
        System.out.println("Sua temperatura em graus Fahrenheit é: " + conversao);
    }
}
