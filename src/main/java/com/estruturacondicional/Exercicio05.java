package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite a primeira nota do aluno:");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota do aluno:");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota do aluno:");
        double nota3 = scanner.nextDouble();

        double soma = (nota1 + nota2 + nota3);
        double media = soma /3;

        if (media >= 7) {
            System.out.println(nome + " Está aprovado! " + "Sua média é: " + media);
        }else {
            System.out.println(nome + " Está reprovado. " + "Sua média é: " + media);
        }
    }
}
