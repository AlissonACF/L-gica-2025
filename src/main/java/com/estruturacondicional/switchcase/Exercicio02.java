package main.java.com.estruturacondicional.switchcase;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int n2 = scanner.nextInt();

        System.out.println("Qual operação devo realizar?");
        System.out.println("Digite (A) para adição; (S) para subtração; (M) para multiplicação; ou (D) para divisão");
        String operacao = scanner.next();

        switch (operacao) {
            case "A":
                System.out.println(n1 + n2);
                break;
            case "S":
                System.out.println(n1 - n2);
                break;
            case "M":
                System.out.println(n1 * n2);
                break;
            case "D":
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}



