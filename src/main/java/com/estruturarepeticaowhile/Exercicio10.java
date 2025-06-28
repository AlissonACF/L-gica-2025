package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        int contador = 1;

        if (numero % 2 == 0) {
            numero = numero + 2;
        }else {
            numero++;
        }

        while (contador <= 5) {
            System.out.println(numero);
            numero = numero + 2;
            contador++;
        }
    }
}
