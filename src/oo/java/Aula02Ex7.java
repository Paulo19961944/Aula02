package oo.java;
public class Aula02Ex7 {
    public static void main(String[] args) {
        // Operadores Aritiméticos
        int a = 10, b = 25, c = 40, d = 55;
        // Soma
        int soma;
        soma = a + b;
        // Subtração
        int subtracao;
        subtracao = d - c;
        // Multiplicação
        int multiplicacao;
        multiplicacao = a * b;
        // Divisão
        double divisao;
        divisao = (double) d / a;
        // Módulo
        double modulo;
        modulo = b% a;

        // Printa na Tela
        System.out.println("\n---------- Operadores Aritiméticos ----------\n.".toUpperCase());
        System.out.println("\n---------- Resultado ----------\n".toUpperCase());
        System.out.println("\nA Soma é: " + soma + "\nA Subtração é: " + subtracao + "\nA Multiplicação é: " + multiplicacao  + "\nA Divisão é: " + divisao + "\nO Módulo é: " + modulo);
        System.out.println("\n---------- Fim ----------".toUpperCase());
    }
}