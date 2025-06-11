package main.java.com.estruturacondicional.switchcase;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do livro que deseja comprar:");
        int codigo = scanner.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("O livro pertence a categoria: Ficção");
                break;
            case 2:
                System.out.println("O livro pertence a categoria: Não Ficção");
                break;
            case 3:
                System.out.println("O livro pertence a categoria: Romance");
                break;
            case 4:
                System.out.println("O livro pertence a categoria: Terror");
                break;
            case 5:
                System.out.println("O livro pertence a categoria: Mistério");
                break;
            default:
                System.out.println("Erro! Categoria inexistente.");
                break;
        }
    }
}
