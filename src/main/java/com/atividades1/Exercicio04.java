package main.java.com.atividades1;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        Integer primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        Integer segundoNumero = scanner.nextInt();

        System.out.println("O quociente da divisão é: " + primeiroNumero / segundoNumero);
        System.out.println("O resto da divisão é: " + primeiroNumero % segundoNumero);
    }
}
