package oo.java;
public class Aula02Ex12 {
    public static void main(String[] args) {
        int a = 2, b = 4;
        // Operadores Ternarios
        String verdade = "Sim", falso = "Não";
        System.out.println("\n---------- Operadores Ternarios ----------\n".toUpperCase());
        System.out.println(a + b > b - a ? verdade : falso);
        System.out.println("\n---------- Fim ---------".toUpperCase());
    }
}