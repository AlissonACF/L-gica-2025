package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro número:");
        int numero2 = scanner.nextInt();

        if ((numero1 == 0) || (numero2 == 0)) {
            System.out.println("Z");
        } else if ((numero1 > 0) && (numero2 > 0)) {
            System.out.println("M");
        } else if ((numero1 < 0) && (numero2 < 0)) {
            System.out.println("M");
        } else if ((numero1 > 0) && (numero2 < 0)) {
            System.out.println("O");
        } else if ((numero2 > 0) && (numero1 < 0)) {
            System.out.println("O");

        }
    }
}
