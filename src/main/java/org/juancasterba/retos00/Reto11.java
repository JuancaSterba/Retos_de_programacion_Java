package org.juancasterba.retos00;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Reto11 {

    /*
     * #11
     * EXPRESIONES EQUILIBRADAS
     * Crea un programa que comprueba si los paréntesis, llaves y corchetes
     * de una expresión están equilibrados.
     * - Equilibrado significa que estos delimitadores se abren y cieran
     *   en orden y de forma correcta.
     * - Paréntesis, llaves y corchetes son igual de prioritarios.
     *   No hay uno más importante que otro.
     * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
     * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
     */

    public static void main(String[] args) {

        System.out.println(esEquilibrado("()[]{}") ? "Es equilibrado" : "No es equilibrado");
        System.out.println(esEquilibrado("{ a * ( c + d ) ] - 5 }") ? "Es equilibrado" : "No es equilibrado");
        System.out.println(esEquilibrado("{ [ a * ( c + d ) ] - 5 }") ? "Es equilibrado" : "No es equilibrado");

    }

    private static boolean esEquilibrado(String expresion) {

        Map<Character, Character> simbolos = new HashMap<>();
        simbolos.put('(', ')');
        simbolos.put('[', ']');
        simbolos.put('{', '}');

        Stack<Character> pila = new Stack<>();

        for (char simbolo : expresion.toCharArray()) {
            if (simbolos.containsKey(simbolo)) {
                pila.push(simbolo);
            } else if (simbolos.containsValue(simbolo)) {
                if (pila.isEmpty() || simbolos.get(pila.pop()) != simbolo) {
                    return false;
                }
            }
        }

        return pila.isEmpty();

    }

}
