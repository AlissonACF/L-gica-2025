package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Você não tem idade para votar.");
        } else if ((idade == 16) || (idade == 17)) {
            System.out.println("Seu voto é opcional.");
        } else if ((idade >= 18) && (idade <= 60)) {
            System.out.println("Seu voto é obrigatório.");
        } else if (idade > 60) {
            System.out.println("Seu voto é opcional.");
        }
    }
}
