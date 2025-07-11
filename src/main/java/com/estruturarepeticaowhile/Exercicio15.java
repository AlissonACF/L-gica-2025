package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (contador <= 10) {
            System.out.println("Digite um número:");
            int numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            contador++;
        }
        System.out.println("Maior número inserido: " + maior);
        System.out.println("Menor número inserido: " + menor);
    }
}
