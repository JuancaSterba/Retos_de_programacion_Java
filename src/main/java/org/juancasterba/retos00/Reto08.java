package org.juancasterba.retos00;

import java.util.Scanner;

/**
 * Reto #8: DECIMAL A BINARIO
 *
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */

public class Reto08 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un número decimal: ");
        int decimal = s.nextInt();
        String binario = decimalABinario(decimal);
        System.out.println("El número decimal " + decimal + " en binario es: " + binario);
    }

    public static String decimalABinario(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        String binario = "";
        while (decimal > 0) {
            String resto = decimal % 2 + "";
            binario = resto + binario;
            decimal = decimal / 2;
        }
        return binario;
    }

}
