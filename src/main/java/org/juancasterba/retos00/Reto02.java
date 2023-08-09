package org.juancasterba.retos00;

public class Reto02 {

    /**
     * Reto #2: LA SUCESIÓN DE FIBONACCI
     *
     * Escribe un programa que imprima los 50 primeros números de la sucesión
     * de Fibonacci empezando en 0.
     * - La serie Fibonacci se compone por una sucesión de números en
     *   la que el siguiente siempre es la suma de los dos anteriores.
     *   0, 1, 1, 2, 3, 5, 8, 13...
     */

    public static void fibonacci(){
        long anterior = 0;
        long siguiente = 1;
        for (int i = 0; i < 50; i++){
            System.out.println(anterior);
            long suma = anterior + siguiente;
            anterior = siguiente;
            siguiente = suma;
        }
    }

    public static void main(String[] args) {

        fibonacci();

    }

}
