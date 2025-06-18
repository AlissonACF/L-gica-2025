package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sair = 0;
        String nome = "";
        int quantidadeAlunos = 0;

        while (sair != 1) {
            System.out.println("Digite um nome:");
            nome = scanner.next();
            quantidadeAlunos = quantidadeAlunos + 1;
            System.out.println("Digite o número 1 para sair");
            sair = scanner.nextInt();
        }
        System.out.println("A quantia de alunos é: " + quantidadeAlunos);
    }
}
