package main.java.com.atividades2;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância de Kripton até a Terra, em KM:");
        double distanciaKripton = scanner.nextDouble();

        System.out.println("Digite agora a distância de Namek até a Terra, em KM:");
        double distanciaNamek = scanner.nextDouble();

        double soma = distanciaKripton + distanciaNamek;
        System.out.println("A soma das distâncias é: " + soma);

        double diferenca = distanciaKripton - distanciaNamek;
        System.out.println("E a diferença entre as distâncias é: " + diferenca);
    }
}
