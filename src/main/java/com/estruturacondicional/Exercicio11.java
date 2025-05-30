package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas cópias você precisa?");
        int copias = scanner.nextInt();

        if ((copias >= 1) && (copias <= 10)) {
            System.out.println("Valor das cópias: R$ 0.10");
        } else if ((copias >= 11) && (copias <= 50)) {
            System.out.println("Valor das cópias: R$ 0.08");
        } else if (copias > 50) {
            System.out.println("Valor das cópias: R$ 0.05");
        }
    }
}
