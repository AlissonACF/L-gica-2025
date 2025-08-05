package main.java.com.estruturarepeticaofor;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantia de notas:");
        int quantiaNotas = scanner.nextInt();
        double soma = 0;

        for (int i = 1; i <= quantiaNotas; i++) {
            System.out.println("Digite a nota:");
            double nota = scanner.nextDouble();

            soma = soma + nota;
        }
        double media = soma / quantiaNotas;
        System.out.println("A média das notas é: " + media);
    }
}
