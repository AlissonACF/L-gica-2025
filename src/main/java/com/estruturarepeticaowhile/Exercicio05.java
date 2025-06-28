package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantiaNumeros = 0;
        int contador = 0;
        int sair = 0;

        while (sair >= 0) {
            System.out.println("Digite um número:");
            int numero = scanner.nextInt();
            quantiaNumeros = quantiaNumeros + numero;
            contador = contador + 1;
            System.out.println("Digite qualquer número negativo para sair:");
            sair = scanner.nextInt();
        }
        double media = quantiaNumeros / contador;
        System.out.println("A média é: " + media);
    }
}

     //modo alternativo:

        //{ //double quantiaNumeros = 0;
         //int contador = 0;

        //while (true) {
            //System.out.println("Digite um número:");
            //int numero = scanner.nextInt();

            //if (numero < 0) {
                //break;
            //}
              //contador++;
              //quantiaNumeros = quantiaNumeros + numero;
        //}
          //double media = quantiaNumeros / contador;
          //System.out.println("A média é: " + media); }