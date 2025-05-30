package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        int multiplicacao = numero2 * numero1;

        if (numero1 != numero2) {
            if (numero1 > numero2) {
                System.out.println("O resultado é: " + soma);
            }else {
                System.out.println("O resultado é: " + multiplicacao);
            }
        }
    }
}
