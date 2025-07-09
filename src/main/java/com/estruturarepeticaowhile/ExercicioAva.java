package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class ExercicioAva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;
        int totalCategorias = 0;
        double precoTotal = 0.0;
        String sair = "N";

        while (!(sair.equals("S"))) {
            System.out.println("Selecione uma opção de categoria");
            System.out.println("1- Ação; 2- Comédia; 3- Terror; ou 4- Animação:");
            int categoria = scanner.nextInt();

            if ((categoria < 1) || (categoria > 4)) {
                System.out.println("Categoria inexistente.");
                break;
            }

            System.out.println("Agora digite o preço equivalente a categoria:");
            double preco = scanner.nextDouble();

            switch (categoria) {
                case 1:
                    System.out.println("Preço desta categoria: " + preco + "R$");
                    break;
                case 2:
                    System.out.println("Preço desta categoria: " + preco + "R$");
                    break;
                case 3:
                    System.out.println("Preço desta categoria: " + preco + "R$");
                    break;
                case 4:
                    System.out.println("Preço desta categoria: " + preco + "R$");
                    break;
            }

            precoTotal = precoTotal + preco;

            totalCategorias = totalCategorias + categoria;
            contador++;

            System.out.println("Digite 'S' para finalizar a compra.");
            sair = scanner.next();
        }
        System.out.println("Valor total da compra: " + precoTotal);
    }
}

