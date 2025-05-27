package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio01 {
    public static final int MAIORIDADE = 18;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        if (idade >= MAIORIDADE){
            System.out.println("Você é maior de idade.");
        }else{
            System.out.println("Você é menor de idade.");
        }
    }
}
