package main.java.com.atividades1;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();

        System.out.println("Digite o valor de compra do produto:");
        double valorDeCompra = scanner.nextDouble();

        System.out.println("Digite o valor de venda do produto");
        double valorDeVenda = scanner.nextDouble();

        System.out.println("Seu lucro vendendo " + nome + " foi:");
        System.out.println(valorDeVenda - valorDeCompra);
    }
}
