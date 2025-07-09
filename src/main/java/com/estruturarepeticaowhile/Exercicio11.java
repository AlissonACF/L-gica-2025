package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int multiplicador = 1;
        int contador = 1;

        while (contador < 20) {

            if (contador % 2 == 0) {
               multiplicador = multiplicador * contador;
            }
            contador++;
        }
        System.out.println(multiplicador);
    }
}
