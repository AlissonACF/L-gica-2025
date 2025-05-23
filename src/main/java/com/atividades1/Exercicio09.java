package main.java.com.atividades1;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantia de dias que deseja converter:");
        int dias = scanner.nextInt();

        System.out.println("Digite a quantia de horas que deseja converter:");
        int horas = scanner.nextInt();

        System.out.println("Digite a quantia de minutos que deseja converter:");
        int minutos = scanner.nextInt();

        System.out.println("Digite a quantia de segundos que deseja converter:");
        int segundos = scanner.nextInt();

        int diasHoras = dias * 24 * 60 * 60;
        int horasMinutos = horas * 60 * 60;
        int minutosSegundos = minutos * 60;

        System.out.println("O resultado da conversão é: " + (diasHoras + horasMinutos + minutosSegundos + segundos));

    }
}
