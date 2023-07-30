import java.util.Arrays;

public class Retos00Inicial {
    public static void main(String[] args) {

        fizzBuzz(); // Reto # 0

        System.out.println(anagrama("Anaconda","anaconda")); // Reto # 1

    }

    /**
     * Reto #0: EL FAMOSO "FIZZ BUZZ”
     * Escribe un programa que muestre por consola (con un print) los
     * números de 1 a 100 (ambos incluidos y con un salto de línea entre
     * cada impresión), sustituyendo los siguientes:
     * - Múltiplos de 3 por la palabra "fizz".
     * - Múltiplos de 5 por la palabra "buzz".
     * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
     */
    private static void fizzBuzz() {
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    /**
     * Reto #1: ¿ES UN ANAGRAMA?
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

}
