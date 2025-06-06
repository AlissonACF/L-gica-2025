package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção de refeição: 1 = Vegetariano; 2 = Peixe; 3 = Frango; ou 4 = Carne;");
        int refeicao = scanner.nextInt();
        System.out.println("Escolha uma sobremesa: 1 = Abacaxi; 2 = Sorvete; ou 3 = Mousse;");
        int sobremesa = scanner.nextInt();
        System.out.println("Escolha agora uma bebida: 1 = Suco; ou 2 = Refrigerante;");
        int bebida = scanner.nextInt();

        int calorias = 0;

        if (refeicao == 1) {
            calorias = 180;
        } else if (refeicao == 2) {
            calorias = 230;
        } else if (refeicao == 3) {
            calorias = 250;
        }else {
            calorias = 350;
        }
        if (sobremesa == 1) {
            calorias = calorias + 75;
        } else if (sobremesa == 2) {
            calorias = calorias + 110;
        }else {
            calorias = calorias + 200;
        }
        if (bebida == 1) {
            calorias = calorias + 80;
        }else {
            calorias = calorias + 200;
        }
        System.out.println("A quantia de calorias consumidas foi: " + calorias);
    }
}
