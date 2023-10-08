package oo.java;
public class Aula02Ex08 {
    public static void main(String[] args) {
        // Operadores Aritiméticos
        // de Atribuição Reduzida
        float a = 10, b = 25, c = 40, d = 55;
        // Printa na Tela
        System.out.println(("\n---------- Operadores de Atribuição" + " Reduzida ----------\n").toUpperCase());
        System.out.println(a -= 1); // a = a - 1
        System.out.println(b += 1); // b = b + 1
        System.out.println(c *= 2); // c = c * 2
        a=10;System.out.println(d /= a); // d = d / a
        b=25;System.out.println(b %= a); // b = b % a
        System.out.println("\n---------- Fim ----------".toUpperCase());
    }
}