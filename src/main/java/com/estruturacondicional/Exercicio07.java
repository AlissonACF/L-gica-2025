package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diga-me a idade do nadador:");
        int idade = scanner.nextInt();

        if ((idade >= 6) && (idade <=10)) {
            System.out.println("O nadador é infantil.");
        } else if ((idade >= 11) && (idade <= 17)) {
            System.out.println("O nadador é juveníl.");
        }else if (idade >=18){
            System.out.println("O nadador é adulto.");
        }
    }
}
