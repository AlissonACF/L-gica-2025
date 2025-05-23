package main.java.com.atividades2;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite agora seu peso:");
        double peso = scanner.nextDouble();

        System.out.println("Agora digite sua altura:");
        double altura = scanner.nextDouble();

        double indiceDeMassaCorporal = peso / (altura * altura);
        System.out.println("Seu IMC (Índice de Massa Corporal é: " + indiceDeMassaCorporal);
    }
}
