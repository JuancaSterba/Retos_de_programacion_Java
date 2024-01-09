package org.juancasterba.retos00;

public class Reto12 {

    /*
     * #12
       CADENAS Y CARACTERES
     * Crea una función que reciba dos cadenas como parámetro (str1, str2)
     * e imprima otras dos cadenas como salida (out1, out2).
     * - out1 contendrá todos los caracteres presentes en la str1 pero NO
     *   estén presentes en str2.
     * - out2 contendrá todos los caracteres presentes en la str2 pero NO
     *   estén presentes en str1.
     */

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        String out1 = getUniqueCharacters(str1, str2);
        String out2 = getUniqueCharacters(str2, str1);

        System.out.println("out1: " + out1);
        System.out.println("out2: " + out2);
    }

    public static String getUniqueCharacters(String str1, String str2) {
        StringBuilder result = new StringBuilder();

        for (char c : str1.toCharArray()) {
            if (str2.indexOf(c) == -1) {
                result.append(c);
            }
        }

        return result.toString();
    }

}
