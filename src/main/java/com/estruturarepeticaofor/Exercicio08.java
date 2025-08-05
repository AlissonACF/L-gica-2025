package main.java.com.estruturarepeticaofor;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();

        int resultado = 0;

        for (int i = 0; i < numero2; i++) {
            resultado = resultado + numero1;
        }
        System.out.println("Resultado da operação: " + resultado);
    }
}
