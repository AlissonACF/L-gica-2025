package main.java.com.atividades2;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância a percorrer (KM):");
        double distancia = scanner.nextDouble();

        System.out.println("Agora digite a velocidade média do veículo (KM/h):");
        double velocidadeMedia = scanner.nextDouble();

        double tempo = distancia / velocidadeMedia;
        System.out.println("O tempo que você demorou para chegar ao local é: " + tempo);
    }
}
