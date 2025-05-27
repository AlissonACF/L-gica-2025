package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número, seja ele positivo ou negativo:");
        int numero = scanner.nextInt();

        if (numero < 0){
            int conversao = numero * -1;
            System.out.println("Seu número convertido para positivo fica: " + conversao);
        }else{
            System.out.println("Seu número já é positivo.");
        }
        }
    }

