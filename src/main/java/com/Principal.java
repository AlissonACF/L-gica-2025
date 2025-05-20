package main.java.com;

public class Principal {
    public static void main(String[] args) {
        Integer primeiroNumero = 85;
        Integer segundoNumero = 48;
        Integer terceiroNumero = 29;
        Integer soma = primeiroNumero + segundoNumero + terceiroNumero;
        Integer subtracao = primeiroNumero - segundoNumero - terceiroNumero;
        Integer multiplicacao = primeiroNumero * segundoNumero * terceiroNumero;
        double divisao = (double) primeiroNumero / (double) segundoNumero / (double) terceiroNumero;

        System.out.println("Primeiro número: " + primeiroNumero);
        System.out.println("Segundo número: " + segundoNumero);
        System.out.println("Terceiro número: " + terceiroNumero);
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}
