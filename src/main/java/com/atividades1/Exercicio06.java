package main.java.com.atividades1;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int segundoNumero = scanner.nextInt();

        int soma = primeiroNumero + segundoNumero;
        int subtracao = primeiroNumero - segundoNumero;
        int multiplicacao = primeiroNumero * segundoNumero;
        double divisao = primeiroNumero / segundoNumero;

        System.out.println("soma: " + soma + " subtração: " + subtracao + " multiplicação: " + multiplicacao + " divisão: " + divisao);
    }
}
