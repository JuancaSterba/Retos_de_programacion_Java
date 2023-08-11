package org.juancasterba.retos00;


import org.json.JSONObject;

import java.util.Map;

/**
 * Reto #7: CONTANDO PALABRAS
 *
 * Crea un programa que cuente cuantas veces se repite cada palabra
 * y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que
 *   lo resuelvan automáticamente.
 */

public class Reto07 {

    public static void cuentarPalabras(String texto) {

        texto = texto.toLowerCase();
        texto = texto.replace(".", "").replace(",", "").replace(";", "").replace("!:", "");

        String[] palabras = texto.split(" ");

        Map<String, Integer> map = new java.util.HashMap<>();

        for (String palabra : palabras) {
            if (map.containsKey(palabra)) {
                map.put(palabra, map.get(palabra) + 1);
            } else {
                map.put(palabra, 1);
            }
        }

        JSONObject json = new JSONObject(map);
        System.out.println(json.toString(4));  // El argumento 4 hace que la salida esté formateada con 4 espacios de indentación

    }

    public static void main(String[] args) {
        cuentarPalabras("Esto es una prueba de palabras, a ver si se repiten o no se repiten.");
    }

}
