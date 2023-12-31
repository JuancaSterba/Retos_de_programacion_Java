package org.juancasterba.retos00;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Reto10Bis {

    private static final HashMap<Character, String> MORSE_CODE_MAP = new HashMap<>();

    static {
        MORSE_CODE_MAP.put('A', "_._");
        MORSE_CODE_MAP.put('B', "_...");
        MORSE_CODE_MAP.put('C', "_._.");
        MORSE_CODE_MAP.put('D', "_..");
        MORSE_CODE_MAP.put('E', ".");
        MORSE_CODE_MAP.put('F', ".._.");
        MORSE_CODE_MAP.put('G', "__.");
        MORSE_CODE_MAP.put('H', "....");
        MORSE_CODE_MAP.put('I', "..");
        MORSE_CODE_MAP.put('J', ".___");
        MORSE_CODE_MAP.put('K', "_._");
        MORSE_CODE_MAP.put('L', "._..");
        MORSE_CODE_MAP.put('M', "__");
        MORSE_CODE_MAP.put('N', "_.");
        MORSE_CODE_MAP.put('O', "___");
        MORSE_CODE_MAP.put('P', ".__.");
        MORSE_CODE_MAP.put('Q', "__._");
        MORSE_CODE_MAP.put('R', "._.");
        MORSE_CODE_MAP.put('S', "...");
        MORSE_CODE_MAP.put('T', "_");
        MORSE_CODE_MAP.put('U', ".._");
        MORSE_CODE_MAP.put('V', "..._");
        MORSE_CODE_MAP.put('W', ".__");
        MORSE_CODE_MAP.put('X', "_.._");
        MORSE_CODE_MAP.put('Y', "_.__");
        MORSE_CODE_MAP.put('Z', "__..");
        MORSE_CODE_MAP.put('0', "_____");
        MORSE_CODE_MAP.put('1', ".____");
        MORSE_CODE_MAP.put('2', "..___");
        MORSE_CODE_MAP.put('3', "...__");
        MORSE_CODE_MAP.put('4', "...._");
        MORSE_CODE_MAP.put('5', ".....");
        MORSE_CODE_MAP.put('6', "_....");
        MORSE_CODE_MAP.put('7', "__...");
        MORSE_CODE_MAP.put('8', "___..");
        MORSE_CODE_MAP.put('9', "____.");
        MORSE_CODE_MAP.put('.', "._._._");
        MORSE_CODE_MAP.put(',', "__..__");
        MORSE_CODE_MAP.put('?', "..__..");
        MORSE_CODE_MAP.put('"', "._.._.");
        MORSE_CODE_MAP.put('/', "_.._.");
    }

    private static final Map<String, Character> INVERSE_MORSE_CODE_MAP = invertMap(MORSE_CODE_MAP);

    private static Map<String, Character> invertMap(Map<Character, String> map) {
        Map<String, Character> inverseMap = new HashMap<>();
        for (Map.Entry<Character, String> entry : map.entrySet()) {
            inverseMap.put(entry.getValue(), entry.getKey());
        }
        return inverseMap;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un texto: ");
        String texto = s.nextLine();

        // analizar si lo ingresado empieza con . o _
        if (texto.charAt(0) == '.' || texto.charAt(0) == '_') {
            String resultado = convertirATexto(texto);
            System.out.println("El codigo Morse ingresado es: " + resultado);
        } else {
            String resultado = convertirAMorse(texto.toUpperCase());
            System.out.println("El texto en código Morse es: " + resultado);
        }
    }

    private static String convertirAMorse(String texto) {
        StringBuilder morse = new StringBuilder();
        for (char c : texto.toCharArray()) {
            String morseChar = MORSE_CODE_MAP.getOrDefault(c, "");
            morse.append(morseChar).append(" ");
        }
        return morse.toString().trim();
    }

    private static String convertirATexto(String morse) {
        StringBuilder texto = new StringBuilder();
        String[] letrasMorse = morse.split(" ");
        for (String letraMorse : letrasMorse) {
            if (letraMorse.equals("")) {
                texto.append(" ");
            } else {
                char c = MORSE_CODE_MAP.entrySet().stream()
                        .filter(entry -> entry.getValue().equals(letraMorse))
                        .map(Map.Entry::getKey)
                        .findFirst()
                        .orElseThrow();
                texto.append(c);
            }
        }
        return texto.toString().trim();
    }
}
