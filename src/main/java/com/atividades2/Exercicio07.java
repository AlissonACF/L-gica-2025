package main.java.com.atividades2;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite agora o peso da primeira nota:");
        double pesoNota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite agora o peso da segunda nota:");
        double pesoNota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();
        System.out.println("Digite agora o peso da terceira nota:");
        double pesoNota3 = scanner.nextDouble();

        double media = (nota1 * pesoNota1 + nota2 * pesoNota2 + nota3 * pesoNota3)
        / (pesoNota1 + pesoNota2 + pesoNota3);
        System.out.println("Sua média é: " + media);

    }
}
