package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cliente = 1;
        double valores = 0.0;
        int exederam100 = 0;

        while (cliente <= 10) {
            System.out.println("Digite o valor em reais:");
            double valor = scanner.nextDouble();

            if (valor > 100) {
                exederam100++;
            }

            valores = valores + valor;
            cliente++;
        }
        double media = valores / 10;
        System.out.println("A média entre todas as compras é: " + media);

        System.out.println(exederam100 + " Clientes exederam 100R$ em compras.");
    }
}