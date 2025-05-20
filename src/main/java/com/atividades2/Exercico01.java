package main.java.com.atividades2;

import java.util.Scanner;

public class Exercico01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do motorista:");
        String nomeMotorista = scanner.nextLine();

        System.out.println("Agora digite a distância percorrida por ele em Km:");
        double distanciaKm = scanner.nextDouble();

        System.out.println("Agora digite o tempo em horas que ele percorreu essa quilometragem:");
        double tempoHoras = scanner.nextDouble();

        double velocidadeMedia = distanciaKm / tempoHoras;

        System.out.println();
    }
}
