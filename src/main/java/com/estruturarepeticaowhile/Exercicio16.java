package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clientes = 0;
        double totalValores = 0;
        double maiorValor = 0;

        while (clientes < 5) {
            System.out.println("Digite o valor da compra:");
            double valorCompras = scanner.nextDouble();
            totalValores = totalValores + valorCompras;

            if (valorCompras > maiorValor) {
                maiorValor = valorCompras;
            }
            clientes++;
        }
        System.out.println("A compra de maior valor é: " + maiorValor);
        double media = totalValores / clientes;
        System.out.println("A média entre os valores das compras é: " + media);
    }
}
