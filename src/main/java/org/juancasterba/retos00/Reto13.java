package org.juancasterba.retos00;

public class Reto13 {

    /**
     * #13
     * ¿ES UN PALÍNDROMO?
     * Escribe una función que reciba un texto y retorne verdadero o
     *  falso (Boolean) según sean o no palíndromos.
     * Un Palíndromo es una palabra o expresión que es igual si se lee
     *  de izquierda a derecha que de derecha a izquierda.
     * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
     * Ejemplo: Ana lleva al oso la avellana.
     */

    public static void main(String[] args) {

        String texto = "Ana lleva al oso la avellana.";

        System.out.println(esPalindromo(texto) ? "Es palindromo" : "No es palindromo");
        System.out.println(esPalindromo2(texto) ? "Es palindromo" : "No es palindromo");

    }

    private static boolean esPalindromo(String texto) {
        // limpiar el texto dejando solo los caracteres alfabeticos
        texto = texto.replaceAll("[^a-zA-Z]", "");
        // convertir el texto a minusculas
        texto = texto.toLowerCase();
        // invertir el texto
        String invertido = new StringBuilder(texto).reverse().toString();
        // comparar el texto invertido con el original
        return invertido.equals(texto);
    }

    // misma funcion pero sin utilizar funciones
    private static boolean esPalindromo2(String texto) {
        // limpiar el texto dejando solo los caracteres alfabeticos
        texto = texto.replaceAll("[^a-zA-Z]", "");
        // convertir el texto a minusculas
        texto = texto.toLowerCase();
        // invertir el texto
        StringBuilder invertido = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido.append(texto.charAt(i));
        }
        // comparar el texto invertido con el original
        return invertido.toString().equals(texto);
    }
}
