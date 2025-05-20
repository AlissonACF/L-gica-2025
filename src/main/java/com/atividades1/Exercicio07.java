package main.java.com.atividades1;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        Integer primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        Integer segundoNumero = scanner.nextInt();

        System.out.println("Digite o terceiro número:");
        Integer terceiroNumero = scanner.nextInt();

        Integer soma = primeiroNumero + segundoNumero + terceiroNumero;

        System.out.println("O resultado da média aritmética entre esses três números é: " + soma /3);
    }
}
