package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso do pacote:");
        double peso = scanner.nextDouble();
        System.out.println("Digite o tipo de entrega que deseja, digite 1 para SEDEX ou 2 para SEDEX 10:");
        int tipoEnvio = scanner.nextInt();
        System.out.println("Digite a região de entrega;");
        System.out.println("1 para Norte, 2 para Nordeste, 3 para Centro-Oeste");
        System.out.println("4 para Sudeste ou 5 para Sul:");
        int regiao = scanner.nextInt();

        double valorTotal = 0.0;

        if (peso <= 1) {
            valorTotal = 5;
        } else if (peso <= 5) {
            valorTotal = 10;
        }else {
            valorTotal = 15;
        }
        if (tipoEnvio == 1) {
            valorTotal = valorTotal + 9;
        }else {
            valorTotal = valorTotal + 11;
        }
        if (regiao == 1) {
            valorTotal = valorTotal + 4;
        } else if ((regiao == 2) || (regiao == 4)) {
            valorTotal = valorTotal + 2;
        } else if (regiao == 3) {
            valorTotal = valorTotal + 5;
        } else if (regiao == 5) {
            valorTotal = valorTotal + 3;
        }
        System.out.println("O valor total a pagar é: " + valorTotal);
    }
}
