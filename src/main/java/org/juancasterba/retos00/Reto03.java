package org.juancasterba.retos00;

public class Reto03 {

    /**
     * Reto #3: ¿ES UN NÚMERO PRIMO?
     *
     * Escribe un programa que se encargue de comprobar si un número es o no primo.
     * Hecho esto, imprime los números primos entre 1 y 100.
     */

    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) { // comprobando la raiz cuadrada optimizamos la función
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (isPrimo(i)) {
                System.out.println(i);
            }
        }

    }

}
