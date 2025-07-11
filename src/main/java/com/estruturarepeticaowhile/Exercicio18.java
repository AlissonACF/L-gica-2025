package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int quantidadeNumerosPares = 0;
        int quantidadeNumerosImpares = 0;
        int somaNumerosImpares = 0;
        int maiorNumero = 0;

        while (contador < 10) {
            System.out.println("Digite um número:");
            int numero = scanner.nextInt();

            if ((contador == 0) || (numero > maiorNumero)) {
                maiorNumero = numero;
            }

            if (numero % 2 == 0) {
                quantidadeNumerosPares++;
            }else {
                quantidadeNumerosImpares++;
                somaNumerosImpares = somaNumerosImpares + numero;
            }
            contador++;
        }
        System.out.println("Quantidade de números pares: " + quantidadeNumerosPares);
        double media = (double) somaNumerosImpares / quantidadeNumerosImpares;
        System.out.println("Média de números ímpares: " + media);
        System.out.println("Maior número: " + maiorNumero);

        if (quantidadeNumerosPares > quantidadeNumerosImpares) {
            System.out.println("Números pares apareceram com maior frequência.");
        }else if (quantidadeNumerosPares == quantidadeNumerosImpares) {
                System.out.println("A quantidade de números ímpares e pares é igual.");
        } else {
            System.out.println("Números ímpares apareceram com maior frequência.");
        }
    }
}
