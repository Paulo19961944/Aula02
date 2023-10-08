package oo.java;
public class Aula02Ex09 {

    public static void main(String[] args) {
        // Declaracao de variaveis
        int a = 5;
        System.out.println("\n---------- Resultado ----------\n".toUpperCase());

        System.out.println("a = " + a);
        System.out.println("a + 1 = " + ++a);
        System.out.println(++a);
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(a++);

        a = 5;System.out.println(a++ * 2);System.out.println(a); // Pós Incremento
        a = 5;System.out.println(a-- *  2);System.out.println(a); // Pós Decremento
        a = 5;System.out.println(++a * 2);System.out.println(a); // Pré Incremento
        a = 5;System.out.println(--a * 2);System.out.println(a); // Pré Decremento
        System.out.println("\n---------- Fim ----------".toUpperCase());
    }
}