package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número positivo:");
        int numero = scanner.nextInt();

        if ((numero < 10) && (numero > 0)) {
            System.out.println("Unidade.");
        } else if ((numero >= 10) && (numero < 100)) {
            System.out.println("Dezena.");
        } else if ((numero >= 100) && (numero < 1000)) {
            System.out.println("Centena.");
        }
    }
}
