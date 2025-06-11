package main.java.com.estruturacondicional.switchcase;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de X entre 1 a 5:");
        int valorX = scanner.nextInt();
        System.out.println("Digite o valor de A:");
        double valorA = scanner.nextDouble();
        System.out.println("Digite o valor de B:");
        double valorB = scanner.nextDouble();

        switch (valorX) {
            case 1:
                System.out.println(valorA + valorB);
                break;
            case 2:
                System.out.println(valorA / valorB);
                break;
            case 3:
                if (valorA > valorB) {
                    System.out.println(valorB + " > " + valorA);
                }else {
                    System.out.println(valorA + " > " + valorB);
                }
            case 4:
                System.out.println(valorA - valorB);
                break;
            case 5:
                System.out.println((valorA + valorB) /2);
                break;
            default:
                System.out.println("Erro! valor de X inválido, escolha entre as opções dadas.");
                break;
        }
    }
}

