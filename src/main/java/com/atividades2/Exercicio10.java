package main.java.com.atividades2;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de casos favoráveis:");
        double casosFavoraveis = scanner.nextDouble();

        System.out.println("Agora digite os casos possíveis (possam vir a acontecer):");
        double casosPossiveis = scanner.nextDouble();

        double probabilidade = (casosFavoraveis * 100) / casosPossiveis;
        System.out.println("A probabilidade está entre: " + probabilidade + "% de chance de acontecimento.");
    }
}
