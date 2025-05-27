package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Atribua um valor para a letra 'A'");
        double valorA = scanner.nextDouble();

        System.out.println("Atribua agora um valor para a letra 'B'");
        double valorB = scanner.nextDouble();

        double soma = valorA + valorB;
        double subtracao = valorA - valorB;
        double multiplicacao = valorA * valorB;
        double divisao = valorA / valorB;

        System.out.println("A soma entre os valores é: " + soma);
        System.out.println("A subtração entre os valores é: " + subtracao);
        System.out.println("A multiplicação entre os valores é: " + multiplicacao);
        System.out.println("A divisão entre os valores é: " + divisao);
    }
}
