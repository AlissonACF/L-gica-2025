package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        int contador = 1;

        while (contador <= 20) {
            int proximoNumero = numero + contador;
            if (!(proximoNumero % 2 == 0)) {
                System.out.println(proximoNumero);
            }
            contador++;
        }
    }
}
