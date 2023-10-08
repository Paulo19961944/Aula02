package oo.java;
import java.util.Scanner;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        // Instancia a Classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Captura o Nome
        System.out.println("\n---------- Capturar Nome ----------\n".toUpperCase());
        System.out.print("Digite o seu Nome: ");
        String nome = scanner.next();

        // Printa o Nome na Tela
        System.out.println("Seja bem Vindo ! " + nome);
        System.out.println("\n---------- Fim ----------".toUpperCase());

        // Captura um número
        System.out.println("\n---------- Capturar Numero ----------\n".toUpperCase());
        System.out.print("Digite um Número: ");
        int numero = scanner.nextInt();

        // Validação Numero
        if (numero > 0){
            System.out.println("O número " + numero + " é maior que zero.");
        } else if (numero < 0) {
            System.out.println("O Número " + numero + " é menor que zero.");
        }else{
            System.out.println("O Número é Zero.");
        }
        System.out.println("\n---------- Fim ----------".toUpperCase());
    }
}
