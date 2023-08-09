package org.juancasterba.retos00;

import java.util.Scanner;

/**
 * Reto #6: INVIRTIENDO CADENAS
 *
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */

public class Reto06 {

    public static String inversor(String texto){
        String invertido = "";
        for (int i = texto.length() -1; i >= 0; i--){
            char letra = texto.charAt(i);
            invertido += letra;
        }
        return invertido;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un texto: ");
        String texto = s.nextLine();
        String resultado = inversor(texto);
        System.out.println("El texto invertido es: " + resultado);

    }

}
