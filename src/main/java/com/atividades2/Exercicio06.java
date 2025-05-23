package main.java.com.atividades2;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Me diga o valor total da conta a pagar:");
        double conta = scanner.nextDouble();

        System.out.println("Agora preciso saber, entre quantos amigos deseja dividir essa conta:");
        double numeroDeAmigos = scanner.nextDouble();

        double valorPorPessoa = conta / numeroDeAmigos;
        System.out.println("Cada um deve pagar: " + valorPorPessoa + "R$");
    }
}
