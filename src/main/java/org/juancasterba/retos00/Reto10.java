package org.juancasterba.retos00;

import java.util.Scanner;

public class Reto10 {
    /*
     * Crea un programa que sea capaz de transformar texto natural a código
     * morse y viceversa.
     * - Debe detectar automáticamente de qué tipo se trata y realizar
     *   la conversión.
     * - En morse se soporta raya "—", punto ".", un espacio " " entre letras
     *   o símbolos y dos espacios entre palabras "  ".
     * - El alfabeto morse soportado será el mostrado en
     *   https://es.wikipedia.org/wiki/Código_morse.
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un texto: ");
        String texto = s.nextLine().toLowerCase();
        String resultado = convertirAMorse(texto);
        System.out.println("El texto en código morse es: " + resultado);

    }

    private static String convertirAMorse(String texto) {

        String morse = "";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            switch (c) {
                case 'a':
                    morse += ".- ";
                    break;
                case 'b':
                    morse += "-... ";
                    break;
                case 'c':
                    morse += "-.-. ";
                    break;
                case 'd':
                    morse += "-.. ";
                    break;
                case 'e':
                    morse += ". ";
                    break;
                case 'f':
                    morse += "..-. ";
                    break;
                case 'g':
                    morse += "--. ";
                    break;
                case 'h':
                    morse += ".... ";
                    break;
                case 'i':
                    morse += ".. ";
                    break;
                case 'j':
                    morse += ".--- ";
                    break;
                case 'k':
                    morse += "-.- ";
                    break;
                case 'l':
                    morse += ".-.. ";
                    break;
                case 'm':
                    morse += "-- ";
                    break;
                case 'n':
                    morse += "-. ";
                    break;
                case 'o':
                    morse += "--- ";
                    break;
                case 'p':
                    morse += ".--. ";
                    break;
                case 'q':
                    morse += "--.- ";
                    break;
                case 'r':
                    morse += ".-. ";
                    break;
                case 's':
                    morse += "... ";
                    break;
                case 't':
                    morse += "- ";
                    break;
                case 'u':
                    morse += "..- ";
                    break;
                case 'v':
                    morse += "...- ";
                    break;
                case 'w':
                    morse += ".-- ";
                    break;
                case 'x':
                    morse += "-..- ";
                    break;
                case 'y':
                    morse += "-.-- ";
                    break;
                case 'z':
                    morse += "--.. ";
                    break;
                case ' ':
                    morse += " ";
                    break;
                case '.':
                    morse += ". ";
                    break;
                case ',':
                    morse += ", ";
                    break;
                case '?':
                    morse += ".. ";
                    break;
                case '!':
                    morse += "-.- ";
                    break;
                case '/':
                    morse += "-..- ";
                    break;
                case '(':
                    morse += "-.--. ";
                    break;
                case ')':
                    morse += "-.--.- ";
                    break;
                case '&':
                    morse += ".-... ";
                    break;
                case ':':
                    morse += "---... ";
                    break;
                case ';':
                    morse += "-.-.-. ";
                    break;
                case '=':
                    morse += "-...- ";
                    break;
                case '+':
                    morse += ".-.-. ";
                    break;
                case '-':
                    morse += "-....- ";
                    break;
                case '_':
                    morse += "..--.- ";
                    break;
                case '"':
                    morse += ".-..-. ";
                    break;
                case '0':
                    morse += "----- ";
                    break;
                case '1':
                    morse += ".---- ";
                    break;
                case '2':
                    morse += "..--- ";
                    break;
                case '3':
                    morse += "...-- ";
                    break;
                case '4':
                    morse += "....- ";
                    break;
                case '5':
                    morse += "..... ";
                    break;
                case '6':
                    morse += "-.... ";
                    break;
                case '7':
                    morse += "--... ";
                    break;
                case '8':
                    morse += "---.. ";
                    break;
                case '9':
                    morse += "----. ";
                    break;
                case '$':
                    morse += "...-..- ";
                    break;
                case '@':
                    morse += ".--.-. ";
                    break;
                default:
                    morse += "";
            }
        }

        return morse;

    }

}
