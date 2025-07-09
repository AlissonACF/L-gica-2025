package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de 'X':");
        int valorX = scanner.nextInt();

        int contador = 1;
        int valorY = 0;

        while (contador <= 20) {
            valorY += contador * valorX;
            contador++;
        }
        System.out.println("O valor de Y é: " + valorY);
    }
}
