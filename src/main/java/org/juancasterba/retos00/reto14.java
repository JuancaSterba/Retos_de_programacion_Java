package org.juancasterba.retos00;

public class reto14 {

    /**
     * #14
     * FACTORIAL RECURSIVO
     * Escribe una función que calcule y retorne el factorial de un número dado de forma recursiva.
     */

    public static void main(String[] args) {

        System.out.println(factorial(5));

    }

    private static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
