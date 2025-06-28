package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sair = 1;
        int quantidade1825 = 0;
        int quantidade2650 = 0;
        int quantidade5165 = 0;

        while (sair != 0) {
            System.out.println("Digite a idade:");
            int idade = scanner.nextInt();
            if (idade >= 18 && idade <= 25){
                quantidade1825++;
            } else if ((idade >= 26) && (idade <= 50)) {
                quantidade2650++;
            } else if ((idade >= 51) && (idade <= 65)) {
                quantidade5165++;
            }
            System.out.println("Digite '0' para sair");
            sair = scanner.nextInt();
        }
        System.out.println("A quantidade na faixa 18 - 25 é: " + quantidade1825);
        System.out.println("A quantidade na faixa 26 - 50 é: " + quantidade2650);
        System.out.println("A quantidade na faixa 51 - 65 é: " + quantidade5165);
    }
}
