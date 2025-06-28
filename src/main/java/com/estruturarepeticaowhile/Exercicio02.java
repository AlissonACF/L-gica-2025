package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int totalNumero = 0;
        int quantiaNumeros = 0;
        String sair = "N";

        while (!(sair.equals("S"))) {
            System.out.println("Digite um número:");
            numero = scanner.nextInt();
            totalNumero = totalNumero + numero;
            quantiaNumeros = quantiaNumeros + 1;
            System.out.println("Digite S para sair.");
            sair = scanner.next();
        }
        double media = (double) totalNumero / quantiaNumeros;
        System.out.println("A média é: " + media);
    }
}

