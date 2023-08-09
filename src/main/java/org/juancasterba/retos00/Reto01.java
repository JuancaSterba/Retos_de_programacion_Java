package org.juancasterba.retos00;

import java.util.Arrays;

public class Reto01 {

    /**
     * Reto #1: ¿ES UN ANAGRAMA?
     *
     * Escribe una función que reciba dos palabras (String) y retorne
     * verdadero o falso (Bool) según sean o no anagramas.
     * - Un Anagrama consiste en formar una palabra reordenando TODAS
     *   las letras de otra palabra inicial.
     * - NO hace falta comprobar que ambas palabras existan.
     * - Dos palabras exactamente iguales no son anagrama.
     */
    public static boolean anagrama(String palabra1, String palabra2){
        if (!palabra1.equalsIgnoreCase(palabra2)) {
            char[] letrasPalabra1 = palabra1.toLowerCase().toCharArray();
            char[] letrasPalabra2 = palabra2.toLowerCase().toCharArray();

            Arrays.sort(letrasPalabra1);
            Arrays.sort(letrasPalabra2);

            return Arrays.equals(letrasPalabra1, letrasPalabra2);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(anagrama("Anaconda","anaconda"));

    }

}
