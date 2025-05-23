package main.java.com.atividades2;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Preciso que me diga agora seu salário atual:");
        double salarioAtual = scanner.nextDouble();

        System.out.println("Agora me diga a porcentagem de aumento do seu salário:");
        double porcentagemAumento = scanner.nextDouble();

        double novoSalario = salarioAtual + (salarioAtual * porcentagemAumento /100);
        System.out.println("Seu novo salário é de: " + novoSalario + "R$");

    }
}
