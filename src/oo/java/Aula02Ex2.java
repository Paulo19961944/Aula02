package oo.java;
import java.util.Scanner;

public class Aula02Ex2 {
    public static void main(String[] args) {
        // Instancia a Classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Captura o Número
        System.out.println();
        System.out.println("---------- DIVISÃO DE NÚMEROS ---------");
        System.out.println();
        System.out.print("Digite o Dividendo: ");
        int x = scanner.nextInt();
        System.out.print("Digite o Divisor: ");
        int y = scanner.nextInt();

        // Declaração de Variáveis
        float resultado = (float) x/y;

        // Printa na Tela
        System.out.println("\n---------- RESULTADO ----------\n");
        System.out.println("O resultado é: ".toUpperCase() + resultado);
        System.out.println("\n---------- fim ---------".toUpperCase());
    }
}