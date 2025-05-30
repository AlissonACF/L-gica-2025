package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();

        double maior = 0.0;

        maior = (numero1 > numero2) ? numero1 : numero2;
        System.out.println("O número maior é: " + maior);
    }
}
