package main.java.com.estruturarepeticaofor;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerosPositivos = 0;
        int numerosNegativos = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite um número:");
            int numero = scanner.nextInt();

            if (numero < 0) {
                numerosNegativos++;
            }else {
                numerosPositivos++;
            }
        }
        System.out.println("Quantia de números negativos: " + numerosNegativos);
        System.out.println("Quantia de números positivos: " + numerosPositivos);
    }
}
