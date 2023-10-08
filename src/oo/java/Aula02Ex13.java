package oo.java;
public class Aula02Ex13 {
    public static void main(String[] args) {
        // Declaração de Variáveis
        int x = 16;
        // Controle de Fluxo
        if (x < 15){
            System.out.println("\n---------- Resultado ----------\n".toUpperCase());
            System.out.println("O x é menor que 15!");
        } else if (x == 15){
            System.out.println("\n---------- Resultado ----------\n".toUpperCase());
            System.out.println("O x é igual a 15!");
        } else {
            System.out.println("\n---------- Resultado ----------\n".toUpperCase());
            System.out.println("O x é maior que 15!");
        }
        System.out.println("\n--------- Fim ---------".toUpperCase());
    }
}