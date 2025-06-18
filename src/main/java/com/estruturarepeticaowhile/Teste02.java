package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Teste02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        while (numero != 5){
            System.out.println("Digite 5 para sair");
            numero = scanner.nextInt();
        }
    }
}
