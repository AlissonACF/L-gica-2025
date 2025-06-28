package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cidades = 1;
        double totalTemperaturas = 0.0;
        int temperaturaMenor10 = 0;

        while (cidades <=5) {
            System.out.println("Digite a temperatura da cidade:");
            double temperatura = scanner.nextDouble();

            if (temperatura < 10) {
                temperaturaMenor10++;
            }

            totalTemperaturas = totalTemperaturas + temperatura;
            cidades++;
        }
        double media = totalTemperaturas / 5;
        System.out.println("A média entre as cidades é: " + media + "°C");

        System.out.println(temperaturaMenor10 + " Cidades abaixo de 10°C");
    }
}
