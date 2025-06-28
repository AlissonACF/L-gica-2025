package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        int contador = 1;

        while (contador <= 5) {
            System.out.println(numero + contador);
            contador++;
        }
    }
}
