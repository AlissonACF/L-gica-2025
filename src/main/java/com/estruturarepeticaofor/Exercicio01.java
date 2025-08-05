package main.java.com.estruturarepeticaofor;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
}
