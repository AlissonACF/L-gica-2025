package main.java.com.atividades1;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantia de dias que deseja converter:");
        double dias = scanner.nextDouble();

        System.out.println("Digite a quantia de horas que deseja converter:");
        double horas = scanner.nextDouble();

        System.out.println("Digite a quantia de minutos que deseja converter:");
        double minutos = scanner.nextDouble();

        System.out.println("Digite a quantia de segundos que deseja converter:");
        double segundos = scanner.nextDouble();

        double diasHoras = dias * 24 * 60 * 60;
        double horasMinutos = horas * 60 * 60;
        double minutosSegundos = minutos * 60;

        System.out.println("O resultado da conversão é: " + (diasHoras + horasMinutos + minutosSegundos + segundos));

    }
}
